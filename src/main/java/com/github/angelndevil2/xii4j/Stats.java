package com.github.angelndevil2.xii4j;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;

/**
 * javax.management.j2ee.statistics.Stats
 *
 * @author k, Created on 16. 3. 13.
 */
public class Stats {

    /**
     * interface name for this class implement
     */
    public static transient final String IMPLEMENTED_FOR = "javax.management.j2ee.statistics.Stats";
    /**
     * statistic name and statistic itself
     */
    public final HashMap<String, Object> statistics = new HashMap<String, Object>();

    /**
     *
     * @return json string represents this object
     */
    public String toJsonString() {
        Gson gson = new GsonBuilder().serializeNulls().create();
        return gson.toJson(this);
    }
}
