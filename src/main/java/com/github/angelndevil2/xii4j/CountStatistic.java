package com.github.angelndevil2.xii4j;

/**
 * javax.management.j2ee.statistics.CountStatistic
 *
 * @author k, Created on 16. 3. 13.
 */
public class CountStatistic extends Statistic {

    /**
     * interface name for this class implement
     */
    public static transient final String IMPLEMENTED_FOR = "javax.management.j2ee.statistics.CountStatistic";

    /**
     * The count since the last reset.
     */
    public long count;
}
