package com.github.angelndevil2.xii4j;

import org.junit.Test;

import java.util.Date;

/**
 * @author k, Created on 16. 3. 13.
 */
public class StatsTest {

    @Test
    public void testToJsonString() throws Exception {
        Stats stats = new Stats();

        CountStatistic countStatistic = new CountStatistic();
        countStatistic.unit = null;
        countStatistic.startTime = new Date().getTime();
        countStatistic.name = CountStatistic.IMPLEMENTED_FOR;
        countStatistic.lastSampleTime = new Date().getTime();
        countStatistic.count = 100L;
        countStatistic.description = "CountStatistic Test";

        BoundaryStatistic boundaryStatistic = new BoundaryStatistic();
        boundaryStatistic.description = "BoundaryStatistic Test";
        boundaryStatistic.lastSampleTime = new Date().getTime();
        boundaryStatistic.name = BoundaryStatistic.IMPLEMENTED_FOR;
        boundaryStatistic.startTime = new Date().getTime();
        boundaryStatistic.lowerBound = 100L;
        boundaryStatistic.upperBound = 1000L;
        boundaryStatistic.unit = null;

        stats.statistics.add(countStatistic);
        stats.statistics.add(boundaryStatistic);

        System.out.println(stats.toJsonString());
    }
}