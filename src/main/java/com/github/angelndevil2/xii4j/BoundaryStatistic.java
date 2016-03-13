package com.github.angelndevil2.xii4j;

import com.github.angelndevil2.xii4j.util.ReflectionUtil;

import java.lang.reflect.InvocationTargetException;

/**
 * javax.management.j2ee.statistics.BoundaryStatistic
 *
 * @author k, Created on 16. 3. 13.
 */
public class BoundaryStatistic extends Statistic {

    /**
     * @since 0.0.2
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

    /**
     * {@inheritDoc}
     */
    @Override
    public void initializeFrom(Object stat)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        super.initializeFrom(stat);

        this.lowerBound = (Long) ReflectionUtil.invokeMethod(stat, "getLowerBound");
        this.upperBound = (Long) ReflectionUtil.invokeMethod(stat, "getUpperBound");
    }
}
