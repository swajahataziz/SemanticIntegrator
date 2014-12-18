package com.sdi.data.r2rml;

import java.util.ArrayList;

/**
 * Created by USXA661 on 18/12/2014.
 */
public class LogicalRow {
    private ArrayList<LogicalColumn> columns;

    public ArrayList<LogicalColumn> getColumns() {
        return columns;
    }

    public void setColumns(ArrayList<LogicalColumn> columns) {
        this.columns = columns;
    }
}
