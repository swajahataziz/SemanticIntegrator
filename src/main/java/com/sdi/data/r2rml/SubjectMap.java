package com.sdi.data.r2rml;

import com.sdi.data.util.Query;

import java.util.ArrayList;

/**
 * Created by USXA661 on 16/12/2014.
 */
public class SubjectMap {

    private Template template;
    private Query query;
    private ArrayList<String> iris;


    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public ArrayList<String> getIris() {
        return iris;
    }
}
