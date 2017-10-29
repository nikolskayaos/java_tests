package ru.sandbox;

import static java.lang.Math.sqrt;

public class FirstProgram{
	public static void main (String[] args){
		System.out.println("Расстояние между точками:");

		Point points = new Point(6, 10, 10, 10);
		System.out.println();
		System.out.println("Способ 1.");
		System.out.println("Точки:  p1(" + points.x1 + "," + points.y1 + ")" + "и p2(" + points.x2 + "," + points.y2 + ")");
		System.out.println("Расстояние между двумя точками p1 и p2 = "  + distance(points));
		System.out.println();
		System.out.println("Способ 2.");
		System.out.println("Точки:  p1(" + points.x1 + "," + points.y1 + ")" + "и p2(" + points.x2 + "," + points.y2 + ")");
		System.out.println("Расстояние между двумя точками p1 и p2 = "  + points.distance());
	}

	public static double distance(Point points){
		return sqrt((points.x1 - points.x2)*(points.x1 - points.x2) + (points.y1 - points.y2)*(points.y1 - points.y2));
	}
}