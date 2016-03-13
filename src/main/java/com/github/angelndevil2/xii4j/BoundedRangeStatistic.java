package com.github.angelndevil2.xii4j;

/**
 * javax.management.j2ee.statistics.BoundedRangeStatistic
 *
 * @author k, Created on 16. 3. 13.
 */
public class BoundedRangeStatistic extends Statistic {

    /**
     * The lower limit of the value of this attribute.The upper limit of the value of this attribute.
     */
    public long lowerBound;
    /**
     * The upper limit of the value of this attribute.
     */
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
