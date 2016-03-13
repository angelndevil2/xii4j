package com.github.angelndevil2.xii4j;

import com.github.angelndevil2.xii4j.util.ReflectionUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * javax.management.j2ee.statistics.Stats
 *
 * @author k, Created on 16. 3. 13.
 */
public class Stats {

    /**
     * @since 0.0.2
     *
     * interface name for this class implement
     */
    public static transient final String IMPLEMENTED_FOR = "javax.management.j2ee.statistics.Stats";
    /**
     * statistic name and statistic itself
     */
    public final ArrayList<Object> statistics = new ArrayList<Object>();

    /**
     * @since 0.0.2
     * @return json string represents this object
     */
    public String toJsonString() {
        Gson gson = new GsonBuilder().serializeNulls().create();
        return gson.toJson(this);
    }

    /**
     * @since 0.0.2
     * @param stats
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    public void initializeFrom(Object stats)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        Object[] statistics = (Object[])stats.getClass().getMethod("getStatistics").invoke(stats);
        for (Object stat : statistics) {

            Class<?> statistic = stat.getClass();
            if (ReflectionUtil.isInterfaceInInterfaceArray(BoundedRangeStatistic.IMPLEMENTED_FOR, statistic.getInterfaces())) {

                BoundedRangeStatistic boundedRangeStatistic = new BoundedRangeStatistic();
                boundedRangeStatistic.initializeFrom(stat);
                this.statistics.add(boundedRangeStatistic);

            } else if (ReflectionUtil.isInterfaceInInterfaceArray(CountStatistic.IMPLEMENTED_FOR, statistic.getInterfaces())) {

                CountStatistic countStatistic = new CountStatistic();
                countStatistic.initializeFrom(stat);
                this.statistics.add(countStatistic);

            } else if (ReflectionUtil.isInterfaceInInterfaceArray(RangeStatistic.IMPLEMENTED_FOR, statistic.getInterfaces())) {

                RangeStatistic rangeStatistic = new RangeStatistic();
                rangeStatistic.initializeFrom(stat);
                this.statistics.add(rangeStatistic);

            } else if (ReflectionUtil.isInterfaceInInterfaceArray(BoundaryStatistic.IMPLEMENTED_FOR, statistic.getInterfaces())) {

                BoundaryStatistic boundaryStatistic = new BoundaryStatistic();
                boundaryStatistic.initializeFrom(stat);
                this.statistics.add(boundaryStatistic);

            } else if (ReflectionUtil.isInterfaceInInterfaceArray(TimeStatistic.IMPLEMENTED_FOR, statistic.getInterfaces())) {

                TimeStatistic timeStatistic = new TimeStatistic();
                timeStatistic.initializeFrom(stat);
                this.statistics.add(timeStatistic);

            } else if (ReflectionUtil.isInterfaceInInterfaceArray(Statistic.IMPLEMENTED_FOR, statistic.getInterfaces())) {
                Statistic sstat = new Statistic();
                sstat.initializeFrom(stat);
                this.statistics.add(sstat);
            }
        }
    }
}
