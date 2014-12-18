package com.sdi.data.r2rml;

import java.util.ArrayList;
import com.hp.hpl.jena.datatypes.BaseDatatype;
import com.sdi.data.util.Column;

/**
 * Created by USXA661 on 16/12/2014.
 */

public class PredicateObjectMap {
    private ArrayList<String> predicates;
    private Template template;
    private Column column;

    private BaseDatatype datatype;

    private RefObjectMap refObjectMap;

    private PredicateMap predicateMap;

    private ObjectMap objectMap;

}
