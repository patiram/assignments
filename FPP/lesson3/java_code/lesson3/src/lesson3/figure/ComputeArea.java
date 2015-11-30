/*
 * FPP assignment lesson 3
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question 3.4 Figures for Date Assignment
 *
 */
package lesson3.figure;

public class ComputeArea {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(5, 4);
		System.out.println("Area of Rectangle is " + rec.computeArea());
		Triangle trngle = new Triangle(2, 4);
		System.out.println("Area of Triangle is " + trngle.computeArea());
		Circle circle = new Circle(10);
		System.out.printf("Area of Circle is %.2f", circle.computeArea());

	}
}
