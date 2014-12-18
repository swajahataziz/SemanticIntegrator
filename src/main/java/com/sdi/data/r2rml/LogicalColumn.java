package com.sdi.data.r2rml;

/**
 * Created by USXA661 on 18/12/2014.
 */
public class LogicalColumn {
    private int columnIndex;
    private String columnName;
    private String columnType;

    public int getColumnIndex() {
        return columnIndex;
    }

    public void setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }
}
