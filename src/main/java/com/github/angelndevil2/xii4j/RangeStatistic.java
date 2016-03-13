package com.github.angelndevil2.xii4j;

/**
 * javax.management.j2ee.statistics.RangeStatistic
 *
 * @author k, Created on 16. 3. 13.
 */
public class RangeStatistic extends Statistic {

    /**
     * interface name for this class implement
     */
    public static transient final String IMPLEMENTED_FOR = "javax.management.j2ee.statistics.RangeStatistic";

    /**
     * The current value of this attribute.
     */
    public long current;
    /**
     *  The highest value this attribute has held since the beginning of the measurement.
     */
    public long highWaterMark;
    /**
     * The lowest value this attribute has held since the beginning of the measurement.
     */
    public long lowWaterMark;
}
