package com.sdi.data.r2rml;

import com.hp.hpl.jena.datatypes.BaseDatatype;
import com.sdi.data.util.Column;

/**
 * Created by USXA661 on 16/12/2014.
 */
public class ObjectMap {

    /* An object Map can either be template-valued, column-valued or constant-valued, which determines
    its term map type. A term map type of an object map cannot be changed.
     */
    /*Investigate to determine what role DataType playes in an object map and how to assign it */
    private BaseDatatype datatype;
    private final TermType termType;
    private final TermMapType termMapType;
    private Column column;
    private String constant;
    private Template template;

    //Constructor for Column-valued ObjectMap
    public ObjectMap (Column column)
    {
        termMapType = TermMapType.COLUMN_VALUED;
        if (column==null)
        {
            throw new NullPointerException("A column-valued Object Map must have a column defined");
        }
        this.column = column;
        this.termType = TermType.IRI;
    }

    //Constructor for Template-valued ObjectMap
    public ObjectMap (Template template)
    {
        termMapType = TermMapType.TEMPLATE_VALUED;
        if (template==null)
        {
            throw new NullPointerException("A template-valued Object Map must have a template defined");
        }
        this.template = template;
        this.termType = TermType.IRI;
    }

    //Constructor for constant-valued ObjectMap
    public ObjectMap (String constant)
    {
        termMapType = TermMapType.CONSTANT_VALUED;
        if (constant==null)
        {
            throw new NullPointerException("A constant-valued Object Map must have a constant defined");
        }
        this.constant= constant;
        this.termType = TermType.IRI;
    }

    public BaseDatatype getDatatype() {
        return datatype;
    }

    public void setDatatype(BaseDatatype datatype) {
        this.datatype = datatype;
    }

    public TermType getTermType() {
        return termType;
    }

    public TermMapType getTermMapType() {
        return termMapType;
    }

    public Column getColumn() {
        if (termMapType == TermMapType.COLUMN_VALUED) {
            return this.column;
        } else throw new IllegalStateException("A "+termMapType.toString()+" cannot contain a column");
    }
    public Template getTemplate() {
        if (termMapType == TermMapType.TEMPLATE_VALUED) {
            return this.template;
        } else throw new IllegalStateException("A "+termMapType.toString()+" cannot contain a template");
    }
    public String getConstant() {
        if (termMapType == TermMapType.CONSTANT_VALUED) {
            return this.constant;
        } else throw new IllegalStateException("A "+termMapType.toString()+" cannot contain a constant");
    }

}
