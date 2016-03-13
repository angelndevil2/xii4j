package com.github.angelndevil2.xii4j;

/**
 * @author k, Created on 16. 3. 13.
 */
public class TimeStatistic extends Statistic {

    /**
     * Number of times the operation was invoked since the beginning of this measurement.
     */
    public long count;
    /**
     * The maximum amount of time taken to complete one invocation of this operation since the beginning of this measurement.
     */
    public long maxTime;
    /**
     * The minimum amount of time taken to complete one invocation of this operation since the beginning of this measurement.
     */
    public long minTime;
    /**
     * This is the sum total of time taken to complete every invocation of this operation since the beginning of this measurement.
     */
    public long totalTime;

}
