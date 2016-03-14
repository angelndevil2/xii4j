package com.github.angelndevil2.xii4j;

import com.github.angelndevil2.xii4j.util.ReflectionUtil;

import java.lang.reflect.InvocationTargetException;

/**
 * @since 0.1.0
 * @author k, Created on 16. 3. 15.
 */
public class JDBCConnectionPoolStats extends JDBCConnectionStats {

    /**
     * interface name for this class implement
     */
    public static final transient String IMPLEMENTED_FOR = "javax.management.j2ee.statistics.JDBCConnectionPoolStats";

    /**
     * Number of connections closed.
     */
    public CountStatistic closeCount = new CountStatistic();
    /**
     * Number of connections created.
     */
    public CountStatistic createCount = new CountStatistic();
    /**
     * Number of free connections in the pool.
     */
    public BoundedRangeStatistic freePoolSize = new BoundedRangeStatistic();
    /**
     * Size of the connection pool.
     */
    public BoundedRangeStatistic poolSize = new BoundedRangeStatistic();
    /**
     * Number of threads waiting for a connection.
     */
    public RangeStatistic waitingThreadCount = new RangeStatistic();

    /**
     * @param stats
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    @Override
    public void initializeFrom(Object stats) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        super.initializeFrom(stats);

        this.closeCount.initializeFrom(ReflectionUtil.invokeMethod(stats, "getCloseCount"));
        this.createCount.initializeFrom(ReflectionUtil.invokeMethod(stats, "getCreateCount"));
        this.freePoolSize.initializeFrom(ReflectionUtil.invokeMethod(stats, "getFreePoolSize"));
        this.poolSize.initializeFrom(ReflectionUtil.invokeMethod(stats, "getPoolSize"));
        this.waitingThreadCount.initializeFrom(ReflectionUtil.invokeMethod(stats, "getWaitingThreadCount"));
    }
}
