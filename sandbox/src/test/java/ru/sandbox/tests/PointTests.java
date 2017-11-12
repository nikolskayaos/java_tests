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
        Point p1 = new Point(6, 10);
        Point p2 = new Point(10, 10);
        Assert.assertEquals(p1.distance(p1.x, p1.y, p2.x, p2.y ), 4.0);
    }

    @Test
    public void pointDistanceZeroTest(){
        Point p1 = new Point(6, 10);
        Point p2 = new Point(10, 10);
        Assert.assertEquals(p1.distance(p1.x, p1.y, p2.x, p2.y ), 4.0);
    }
}
