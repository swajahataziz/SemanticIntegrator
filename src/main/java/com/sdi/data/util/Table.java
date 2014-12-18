package com.sdi.data.util;

import java.util.ArrayList;

/**
 * Created by USXA661 on 13/12/2014.
 */
public class Table {

    private String tableName;
    protected ArrayList<Column> columns = new ArrayList<Column>();

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ArrayList<Column> getColumns() {
        return columns;
    }

    public void addColumn(Column column) {
        if (columns == null)
            throw new IllegalStateException("Error in Table: Column Names list doesn't exist");
        else {
            this.columns.add(column);
        }
    }

    public Column getColumnByName (String columnName) {
        for (Column column: columns){
            if (column.getColumnName().equals(columnName)){
                return column;
            }

        }

        return null;
    }

}
