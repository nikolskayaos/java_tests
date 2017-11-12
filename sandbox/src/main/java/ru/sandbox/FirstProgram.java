package ru.sandbox;

import static java.lang.Math.sqrt;

public class FirstProgram{
	public static void main (String[] args){
		System.out.println("Расстояние между точками:");

		Point p1 = new Point(6, 10);
		Point p2 = new Point(10, 10);


		System.out.println();
		System.out.println("Способ 1.");
		System.out.println("Точки:  p1(" + p1.x + "," + p1.y + ")" + "и p2(" + p2.x + "," + p2.y + ")");
		System.out.println("Расстояние между двумя точками p1 и p2 = "  + distance(p1, p2));
		System.out.println();
		System.out.println("Способ 2.");
		System.out.println("Точки:  p1(" + p1.x + "," + p1.y + ")" + "и p2(" + p2.x + "," + p2.y + ")");
		System.out.println("Расстояние между двумя точками p1 и p2 = "  + p1.distance(p1.x, p1.y, p2.x, p2.y ));
	}

	public static double distance(Point p1, Point p2){
		return sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
	}
}