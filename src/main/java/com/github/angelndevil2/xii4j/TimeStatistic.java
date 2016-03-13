package com.github.angelndevil2.xii4j;

import com.github.angelndevil2.xii4j.util.ReflectionUtil;

import java.lang.reflect.InvocationTargetException;

/**
 * javax.management.j2ee.statistics.TimeStatistic
 *
 * @author k, Created on 16. 3. 13.
 */
public class TimeStatistic extends Statistic {

    /**
     * interface name for this class implement
     */
    public static transient final String IMPLEMENTED_FOR = "javax.management.j2ee.statistics.TimeStatistic";

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

    /**
     * {@inheritDoc}
     */
    @Override
    public void initializeFrom(Object stat)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        super.initializeFrom(stat);

        this.count = (Long) ReflectionUtil.invokeMethod(stat, "getCount");
        this.maxTime = (Long) ReflectionUtil.invokeMethod(stat, "getMaxTime");
        this.minTime = (Long) ReflectionUtil.invokeMethod(stat, "getMinTime");
        this.totalTime = (Long) ReflectionUtil.invokeMethod(stat, "getTotalTime");
    }
}
