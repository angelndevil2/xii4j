package com.github.angelndevil2.xii4j;

import com.github.angelndevil2.xii4j.util.ReflectionUtil;

import java.lang.reflect.InvocationTargetException;

/**
 * @since 0.1.0
 * @author k, Created on 16. 3. 15.
 */
public class JDBCConnectionStats extends Stats {

    /**
     * interface name for this class implement
     */
    public static final transient String IMPLEMENTED_FOR = "javax.management.j2ee.statistics.JDBCConnectionStats";

    /**
     * Identifies the JDBC driver for the corresponding JDBCConnection.
     */
    public String jdbcDataSource;
    /**
     * Time spent using a connection.
     */
    public final TimeStatistic useTime = new TimeStatistic();
    /**
     * Time spent waiting for a connection to be available.
     */
    public final TimeStatistic waitTime = new TimeStatistic();

    /**
     * @param stats
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    @Override
    public void initializeFrom(final Object stats) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        super.initializeFrom(stats);

        this.jdbcDataSource = (String) ReflectionUtil.invokeMethod(stats, "getJdbcDataSource");

        this.useTime.initializeFrom(ReflectionUtil.invokeMethod(stats, "getUseTime"));
        this.waitTime.initializeFrom(ReflectionUtil.invokeMethod(stats, "getWaitTime"));
    }
}
