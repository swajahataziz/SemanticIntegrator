package com.sdi.data.r2rml;

/**
 * Created by USXA661 on 18/12/2014.
 */
public class LogicalTable {

    // The base table or view name
    private String tableName;
    // The SQL Query to be used by the Logical table
    private String sqlQuery;
    // Optional: SQL Version used for the SQL Query
    private String sqlVersionIdentifier;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getSqlQuery() {
        return sqlQuery;
    }

    public void setSqlQuery(String sqlQuery) {
        this.sqlQuery = sqlQuery;
    }

    public String getSqlVersionIdentifier() {
        return sqlVersionIdentifier;
    }

    public void setSqlVersionIdentifier(String sqlVersionIdentifier) {
        this.sqlVersionIdentifier = sqlVersionIdentifier;
    }
}
