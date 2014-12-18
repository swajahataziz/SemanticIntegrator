package com.sdi.data.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by usxa661 on 08/12/2014.
 */
public class msSQLServerJDBC {

    private static Logger logger = LoggerFactory.getLogger(msSQLServerJDBC.class);

    static final String DRIVER =
            "net.sourceforge.jtds.jdbc.Driver";

    static final String CONNECT_STRING_TEMPLATE =
            "jdbc:jtds:sqlserver://host:port;databaseName=dbname;user=username;password=pwd;";

    public String getConnectionString (String host,
                                       int port, String username, String password, String dbName) {
        return "jdbc:jtds:sqlserver://"+host+":"+port+";databaseName="+dbName+";user="+username+";password="+password;
    }

    }
