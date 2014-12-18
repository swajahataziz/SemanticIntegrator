package com.sdi.data.util;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;

/**
 * Created by USXA661 on 13/12/2014.
 */
public class View {

    private ArrayList<Table> tables;
    private ArrayList<Column> columns;
    private String query;


    public ArrayList<Column> getColumns() {
        return columns;
    }

    public void setColumns(ArrayList<Column> columns) {
        this.columns = columns;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public ArrayList<String> selectColumnNames(String query) {

        ArrayList<String> columns = new ArrayList<String>();
        int columnNameStart = query.toUpperCase().indexOf("SELECT") + 7;
        int columnNameEnd = query.toUpperCase().indexOf("FROM");

        char[] columnChars = query.substring(columnNameStart,columnNameEnd).toCharArray();
        String column = "";
        for (int i = 0; i < columnChars.length; i++) {
            if (columnChars[i] == ',') {
                columns.add(column);
                column = "";
            }
            else {
                column += columnChars[i];
            }
        }
        columns.add(column);

        return columns;
    }

    public ArrayList<String> selectTableNames(String query) {
        ArrayList<String> tables = new ArrayList<String>();
        int tableNameStart = query.toUpperCase().indexOf("FROM") + 5;

        String queryEnd="";
        int tableNameEnd=0;

        //Check for additional query clauses
        if (StringUtils.containsIgnoreCase(query, "WHERE")) {
            tableNameEnd = query.toUpperCase().indexOf("WHERE");
        }
        else if (StringUtils.containsIgnoreCase(query, "GROUP BY")) {
            tableNameEnd = query.toUpperCase().indexOf("GROUP BY");
        }
        else if (StringUtils.containsIgnoreCase(query,"HAVING")) {
            tableNameEnd = query.toUpperCase().indexOf("HAVING");
        }
        else if (StringUtils.containsIgnoreCase(query,";")) {
            tableNameEnd = query.toUpperCase().indexOf(":");
        }


        String[] tph = query.substring(tableNameStart, tableNameEnd).split("\\s+");

        //Check for aliases
        if (StringUtils.containsIgnoreCase(query, "AS")) {
            for (int i = 0; i < tph.length; i++) {


            }

        }

        return tables;
    }


}
