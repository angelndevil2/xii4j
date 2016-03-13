package com.github.angelndevil2.xii4j;

/**
 * javax.management.j2ee.statistics.Statistic
 *
 * @author k, Created on 16. 3. 13.
 */
public class Statistic {

    /**
     * interface name for this class implement
     */
    public static transient final String IMPLEMENTED_FOR = "javax.management.j2ee.statistics.Statistic";

    /**
     * A human-readable description of the Statistic.
     */
    public String description;
    /**
     * The time of the last measurement represented as a long, whose value is the number of milliseconds since January 1, 1970, 00:00:00.
     */
    public long lastSampleTime;
    /**
     * The name of this Statistic.
     */
    public String name;
    /**
     * The time of the first measurement represented as a long, whose value is the number of milliseconds since January 1, 1970, 00:00:00.
     */
    public long startTime;
    /**
     * The unit of measurement for this Statistic.
     */
    public String unit;
}
