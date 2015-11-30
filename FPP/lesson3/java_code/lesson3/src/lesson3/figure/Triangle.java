/*
 * FPP assignment lesson 3
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question 3.4 Figures for Date Assignment
 *
 */

package lesson3.figure;

public class Triangle {
	
	double base, height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}


	public double computeArea(){
		return 0.5 * base * height;
	}
}
