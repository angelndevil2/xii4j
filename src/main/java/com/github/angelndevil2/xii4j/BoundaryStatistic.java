package com.github.angelndevil2.xii4j;

/**
 * javax.management.j2ee.statistics.BoundaryStatistic
 *
 * @author k, Created on 16. 3. 13.
 */
public class BoundaryStatistic extends Statistic {

    /**
     * interface name for this class implement
     */
    public static transient final String IMPLEMENTED_FOR = "javax.management.j2ee.statistics.BoundaryStatistic";

    /**
     * The lower limit of the value of this attribute.The upper limit of the value of this attribute.
     */
    public long lowerBound;
    /**
     * The upper limit of the value of this attribute.
     */
    public long upperBound;
}
