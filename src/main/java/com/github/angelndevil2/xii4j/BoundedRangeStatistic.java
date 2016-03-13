package com.github.angelndevil2.xii4j;

import com.github.angelndevil2.xii4j.util.ReflectionUtil;

import java.lang.reflect.InvocationTargetException;

/**
 * javax.management.j2ee.statistics.BoundedRangeStatistic
 *
 * @author k, Created on 16. 3. 13.
 */
public class BoundedRangeStatistic extends Statistic {

    /**
     * @since 0.0.2
     * interface name for this class implement
     */
    public static transient final String IMPLEMENTED_FOR = "javax.management.j2ee.statistics.BoundedRangeStatistic";

    /**
     * The lower limit of the value of this attribute.The upper limit of the value of this attribute.
     */
    public long lowerBound;
    /**
     * The upper limit of the value of this attribute.
     */
    public long upperBound;
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

    /**
     * {@inheritDoc}
     */
    @Override
    public void initializeFrom(Object stat)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        super.initializeFrom(stat);

        this.lowWaterMark = (Long) ReflectionUtil.invokeMethod(stat, "getLowWaterMark");
        this.highWaterMark = (Long) ReflectionUtil.invokeMethod(stat, "getHighWaterMark");
        this.current = (Long) ReflectionUtil.invokeMethod(stat, "getCurrent");
        this.lowerBound = (Long) ReflectionUtil.invokeMethod(stat, "getLowerBound");
        this.upperBound = (Long) ReflectionUtil.invokeMethod(stat, "getUpperBound");
    }
}
