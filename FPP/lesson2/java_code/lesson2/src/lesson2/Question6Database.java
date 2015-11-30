/*
 * FPP assignment lesson 2
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question6
 *
 */
//Write a program (called Prog6) that creates and outputs an SQL statement based on user 
//input. The program prompts the user for the following pieces of information: 
//table name number of column names column name (as many occurrences as 
//there are column names) salary value For this exercise, 
//the table name will refer to an imaginary database table that stores customer 
//information, including name, zip, salary, and other columns that you may invent. 
//The SQL statement that your program will output will be of the form SELECT 
//<column names> FROM <table name> WHERE salary > <salary value> 
//For example, if the user types in these values: table name = Customer number 
//of column names = 5 column name = firstname column name = lastname column name = 
//salary column name = state column name = zip salary value = 55000 then your program 
//would produce the following output: SELECT firstname,lastname,salary,state,zip 
//FROM Customer WHERE salary > 55000.0 IMPORTANT: The output of your program is 
//simply the sql query – just a String – printed to the console window. 
//You will not run your query against a real database in this exercise. 
//The exercise is simply to create an sql query (not to run it). 

package lesson2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Question6Database {

	public static void main(String[] args) {
		String tableName;
		int noOfColumnName;
		List<String> columnName = new ArrayList<>();
		String query="";
		long salary;
		//String query1="";
		System.out.println("Please enter following information:");
		System.out.println("table name =");
		Scanner in = new Scanner(System.in);
		tableName = in.next();
		System.out.println("number of column names");
		noOfColumnName = in.nextInt();
		for(int i=1;i<=noOfColumnName;i++){
			System.out.println("column name =");
			columnName.add(in.next());
		}
		System.out.println("salary value =");
		salary = in.nextLong();
		for (Iterator<String> column = columnName.iterator(); column.hasNext();) {
	        query += column.next() + (column.hasNext() ? "," : "");
	    }
		System.out.print("The query is: SELECT "+query+" FROM "+tableName+" WHERE salary > "+salary);
		in.close();
	}

}
