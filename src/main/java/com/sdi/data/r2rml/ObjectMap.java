package com.sdi.data.r2rml;

import com.hp.hpl.jena.datatypes.BaseDatatype;

/**
 * Created by USXA661 on 16/12/2014.
 */
public class ObjectMap {

    private BaseDatatype datatype;
    private TermType termType;

    public BaseDatatype getDatatype() {
        return datatype;
    }

    public void setDatatype(BaseDatatype datatype) {
        this.datatype = datatype;
    }

    public TermType getTermType() {
        return termType;
    }

    public void setTermType(TermType termType) {
        this.termType = termType;
    }
}
