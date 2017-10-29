package ru.sandbox.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.sandbox.Point;

/**
 * Created by o.nikolskaya on 29.10.2017.
 */
public class PointTests {
    @Test
    public void pointDistanceTest(){
        Point points = new Point(6, 10, 10, 10);
        Assert.assertEquals(points.distance(), 4.0);
    }

    @Test
    public void pointDistanceZeroTest(){
        Point points = new Point(0, 0, 0, 0);
        Assert.assertEquals(points.distance(), 0.0);
    }
}
