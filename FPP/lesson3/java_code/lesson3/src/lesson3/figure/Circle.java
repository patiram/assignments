/*
 * FPP assignment lesson 3
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question 3.4 Figures for Date Assignment
 *
 */

package lesson3.figure;

public class Circle {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double computeArea() {
		return Math.PI * radius * radius;
	}

}
