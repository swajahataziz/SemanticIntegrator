package com.sdi.data.util;

import java.util.HashMap;

/**
 * Created by USXA661 on 13/12/2014.
 */
public class Join {

    private Column primaryKey;
    private Column foreignKey;
    private enum JoinType {
        LJ("LEFT JOIN"),
        RJ("RIGHT JOIN"),
        IJ("INNER JOIN"),
        FJ("FULL OUTER JOIN");

        public final String sqlJoin;

         JoinType(String sqlJoin) {
            this.sqlJoin = sqlJoin;
        }
    }

    private HashMap<Column, Column> relation;


    public Column getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Column primaryKey) {
        this.primaryKey = primaryKey;
    }

    public Column getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(Column foreignKey) {
        this.foreignKey = foreignKey;
    }

    public HashMap<Column,Column> getRelation() {
        return relation;
    }

    public void setRelation(HashMap<Column,Column> relation) {
        this.relation = relation;
    }

}
