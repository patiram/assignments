package lesson3demo.demo;

import java.util.Date;

public class Main {

	
	public static void main(String[] args) {
		Employee e = new Employee("Bob", "Bob", 100000, 2001, 10, 10);
		Date d = e.getHireDay();
		System.out.printf("%tD", d);
		
		d.setTime(0);
		System.out.printf("\n%tD", e.getHireDay());

	}

}
