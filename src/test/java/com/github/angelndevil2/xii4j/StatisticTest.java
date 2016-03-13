package com.github.angelndevil2.xii4j;

import org.junit.Test;

import java.util.Date;

/**
 * @author k, Created on 16. 3. 13.
 */
public class StatisticTest {

    @Test
    public void testToJsonString() throws Exception {

        Statistic statistic = new Statistic();

        statistic.description = "test statistic";
        statistic.lastSampleTime = new Date().getTime();
        statistic.name = "unit test statistic";
        statistic.startTime = new Date().getTime();
        statistic.unit = null;

        System.out.println(statistic.toJsonString());
    }
}