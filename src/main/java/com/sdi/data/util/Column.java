package com.sdi.data.util;

/**
 * Created by USXA661 on 13/12/2014.
 */
public class Column {

    private String columnName;
    private String columnType;
    private int columnSize;

    public String getColumnName()
    {
        return columnName;
    }

    public void setColumnName (String columnName)
    {
        this.columnName = columnName;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public int getColumnSize() {
        return columnSize;
    }

    public void setColumnSize(int columnSize) {
        this.columnSize = columnSize;
    }
}
