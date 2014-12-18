package com.sdi.data.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by usxa661 on 06/12/2014.
 */
public class mySQLJDBC {

    private static Logger logger = LoggerFactory.getLogger(mySQLJDBC.class);

    static final String DRIVER =
            "com.mysql.jdbc.Driver";

    public String getConnectionString (String host,
                                       int port, String username, String password, String dbName) {

        return "jdbc:mysql://"+host+":"+port+"/"+dbName+"?user="+username+"&password="+password;
    }


}
