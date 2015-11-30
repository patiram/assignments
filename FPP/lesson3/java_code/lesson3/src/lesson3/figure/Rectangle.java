/*
 * FPP assignment lesson 3
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question 3.4 Figures for Date Assignment
 *
 */

package lesson3.figure;

class Rectangle {
	
	double width, height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height= height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double computeArea() {
		return width * height;
	}
}
