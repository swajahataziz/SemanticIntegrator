package com.sdi.data.util;

import java.util.ArrayList;

/**
 * Created by USXA661 on 16/12/2014.
 */
public class Query {
    private ArrayList<Table> tables;
    private ArrayList<Column> columns;
    private ArrayList<Join> joins;


    Query(ArrayList<Table> tables) {
        this.tables = tables;
        columns = new ArrayList<Column>();
        joins = new ArrayList<Join>();
    }

    public ArrayList<Table> getTables() {
        return tables;
    }

    public void setTables(ArrayList<Table> tables) {
        this.tables = tables;

    }

    public ArrayList<Column> getColumns() {
        return columns;
    }

    public void setColumns(ArrayList<Column> columns) {
        this.columns = columns;
    }

    public ArrayList<Join> getJoins() {
        return joins;
    }

    public void setJoins(ArrayList<Join> joins) {
        this.joins = joins;
    }


}
