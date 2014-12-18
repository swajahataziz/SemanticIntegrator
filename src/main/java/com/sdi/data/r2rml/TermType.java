package com.sdi.data.r2rml;

/**
 * Created by USXA661 on 16/12/2014.
 */
public enum TermType {
    IRI("rr:IRI"),
    BLANK_NODE("rr:BlankNode"),
    LITERAL("rr:Literal");

    private final String r2rmlTermType;

    TermType(final String r2rmlTermType) {
        this.r2rmlTermType = r2rmlTermType;
    }

    public String getR2rmlTermType() {
        return r2rmlTermType;
    }


}
