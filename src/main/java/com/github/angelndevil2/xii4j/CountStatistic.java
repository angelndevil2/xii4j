package com.github.angelndevil2.xii4j;

import com.github.angelndevil2.xii4j.util.ReflectionUtil;

import java.lang.reflect.InvocationTargetException;

/**
 * javax.management.j2ee.statistics.CountStatistic
 *
 * @author k, Created on 16. 3. 13.
 */
public class CountStatistic extends Statistic {

    /**
     * @since 0.0.2
     * interface name for this class implement
     */
    public static transient final String IMPLEMENTED_FOR = "javax.management.j2ee.statistics.CountStatistic";

    /**
     * The count since the last reset.
     */
    public long count;

    /**
     * {@inheritDoc}
     */
    @Override
    public void initializeFrom(Object stat)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        super.initializeFrom(stat);

        this.count = (Long) ReflectionUtil.invokeMethod(stat, "getCount");
    }
}
