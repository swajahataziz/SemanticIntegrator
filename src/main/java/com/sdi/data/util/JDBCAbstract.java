package com.sdi.data.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by usxa661 on 06/12/2014.
 */
public abstract class JDBCAbstract {

    private static Logger logger = LoggerFactory
            .getLogger(JDBCAbstract.class);

    protected abstract String getDBConnectionString();
    public abstract String escapeTablename(String name);

    /**
     * Enclose input string between escape chars specific for each type of DB.
     * @param name
     * @return
     */
    public abstract String prepareName(String name);

    public abstract ArrayList<ArrayList<String>> getTopNRows(String dbType,
                                                                       String host, int port, String username, String password,
                                                                       String tableName, String dbName, int rowNum) throws SQLException;

    public List<String> getTableList(Connection conn)
            throws SQLException, ClassNotFoundException {

        List<String> tableList = new ArrayList<String>();

        DatabaseMetaData dbMetaData = conn.getMetaData();
        String   catalog          = null;
        String   schemaPattern    = null;
        String   tableNamePattern = null;
        String[] objectTypes = {"TABLE", "VIEW"};

        ResultSet resultSet = dbMetaData.getTables(catalog,schemaPattern,tableNamePattern,objectTypes);

        while (resultSet.next())
            tableList.add(resultSet.getString(3));

        resultSet.getString(3);

        return tableList;
    }

    public Connection getConnection(String driver, String host,
                                    int port, String username, String password, String dbName)
            throws SQLException, ClassNotFoundException {
        String connectionString = getConnectionString(host, port, username, password, dbName);

        Class.forName(driver);

        Connection conn = DriverManager.getConnection(connectionString);
        return conn;
    }

    public abstract String getConnectionString (String host, int port, String username, String password, String dbName);


    public ArrayList<ArrayList<String>> getData(Connection conn, String tableName) throws SQLException {
        String query = "SELECT * FROM " + tableName;
        PreparedStatement statement = conn.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet == null) {
            statement.close();
            return null;
        }

        ArrayList<ArrayList<String>> result = parseData(resultSet);

        resultSet.close();
        statement.close();
        return result;
    }



    /*
     * Only warn about SQL exception once. //Pedro
     */
    private static boolean warnedSqlException = false;


    public ArrayList<String> getColumns(ResultSet resultSet) throws SQLException {

        ArrayList<String> columnList = new ArrayList<String>();

        ResultSetMetaData metaData = resultSet.getMetaData();


        for (int i = 1; i <= metaData.getColumnCount(); i++) {
            columnList.add(metaData.getColumnName(i));
        }


        return columnList;
    }

    public ArrayList<String> getRow(ResultSet resultSet) throws SQLException {

        ArrayList<String> rowList = new ArrayList<String>();

        if(resultSet.next()) {

            ResultSetMetaData metaData = resultSet.getMetaData();

            for (int i = 1; i <= metaData.getColumnCount(); i++) {

                String cell;
                try {
                    cell = resultSet.getString(i);
                } catch (SQLException e) {
                        logger.warn(e.getMessage());
                        cell = "SQL Error";
                }

                rowList.add(cell);
            }
        }
        return rowList;
    }

    protected ArrayList<ArrayList<String>> parseData(ResultSet resultSet) throws SQLException {
        ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();

        table.add(getColumns(resultSet));

        ArrayList<String> row = null;
        while ((row = getRow(resultSet)) != null) {
            table.add(row);
        }

        return table;
    }

}
