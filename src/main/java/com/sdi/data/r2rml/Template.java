package com.sdi.data.r2rml;

import java.util.ArrayList;

import com.sdi.data.util.Column;
import com.sdi.data.util.Query;

/**
 * Created by USXA661 on 16/12/2014.
 */
public class Template {

    private String iri;

    private ArrayList<Column> columns;


    public String getIri() {
        return iri;
    }

    public void setIri(String iri) {
        this.iri = iri;
    }

    public ArrayList<Column> getColumns() {
        return columns;
    }

    public void setColumns(ArrayList<Column> columns) {
        this.columns = columns;
    }


    public void setColumns(Query query) {
        setColumns(query.getColumns());
    }


}
