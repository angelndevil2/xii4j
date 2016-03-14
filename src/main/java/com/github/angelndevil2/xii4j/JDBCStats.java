package com.github.angelndevil2.xii4j;

import java.lang.reflect.InvocationTargetException;

/**
 * @since 0.1.0
 * @author k, Created on 16. 3. 15.
 */
public class JDBCStats extends Stats {

    /**
     * interface name for this class implement
     */
    public static final transient String IMPLEMENTED_FOR = "javax.management.j2ee.statistics.JDBCStats";

    public JDBCConnectionPoolStats[] jdbcConnectionPoolStats;
    public JDBCConnectionStats[] jdbcConnectionStats;

    /**
     * @param stats
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    @Override
    public void initializeFrom(final Object stats) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        super.initializeFrom(stats);

        Object[] cpStats = (Object[])stats.getClass().getMethod("getConnectionPools").invoke(stats);

        jdbcConnectionPoolStats = new JDBCConnectionPoolStats[cpStats.length];
        for (int idx = 0; idx < cpStats.length; idx++) {
            JDBCConnectionPoolStats cpStat = new JDBCConnectionPoolStats();
            cpStat.initializeFrom(cpStats[idx]);
            jdbcConnectionPoolStats[idx] = cpStat;
        }

        Object[] cStats = (Object[])stats.getClass().getMethod("getConnections").invoke(stats);

        jdbcConnectionStats = new JDBCConnectionStats[cStats.length];
        for (int idx = 0; idx < cStats.length; idx++) {
            JDBCConnectionStats cStat = new JDBCConnectionStats();
            cStat.initializeFrom(cStats[idx]);
            jdbcConnectionStats[idx] = cStat;
        }
    }

}
