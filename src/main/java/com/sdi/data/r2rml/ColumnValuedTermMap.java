package com.sdi.data.r2rml;

import com.sdi.data.util.Column;

/**
 * Created by USXA661 on 18/12/2014.
 */
public interface ColumnValuedTermMap extends TermMap {

    public Column getColumn();

    public void setColumn(Column column);

}
