package com.sdi.data.util;

/**
 * Created by USXA661 on 16/12/2014.
 */
public enum Operator {
        EQUALS("="),
        NOTEQUALS("<>"),
        G_EQUALS(">="),
        L_EQUALS("<="),
        IS("IS"),
        BETWEEN("BETWEEN"),
        LIKE("LIKE"),
        IN("IN"),
        NOTIN("NOT IN"),
        AND("AND"),
        OR("OR");

        private final String sqlOperator;

        Operator(final String sqlOperator) {
            this.sqlOperator = sqlOperator;
        }

        public String getSQLOperator() {
            return sqlOperator;
        }
}