package com.github.angelndevil2.xii4j;

import com.github.angelndevil2.xii4j.util.ReflectionUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.InvocationTargetException;

/**
 * javax.management.j2ee.statistics.Statistic
 *
 * @author k, Created on 16. 3. 13.
 */
public class Statistic {

    /**
     * @since 0.0.2
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
     * @param stat
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    public void initializeFrom(Object stat)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        this.name = (String) ReflectionUtil.invokeMethod(stat, "getName");
        this.description = (String)ReflectionUtil.invokeMethod(stat, "getDescription");
        this.lastSampleTime = (Long)ReflectionUtil.invokeMethod(stat, "getLastSampleTime");
        this.startTime = (Long)ReflectionUtil.invokeMethod(stat, "getStartTime");
        this.unit = (String)ReflectionUtil.invokeMethod(stat, "getUnit");
    }
}
