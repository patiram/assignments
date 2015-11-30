/*
 * FPP assignment lesson 3
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question 3 for Date Assignment extra credit
 *
 */
//Your return flight leaves Frankfurt at 14:05 and arrives in Los Angeles at 16:40. 
//How long is the flight? Write a program that can handle calculations like this

package lesson3;

//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateAssignment3ForFlight {
	public static void main(String[] args) {
		System.out.println(TimeZone.getDefault()); //checking for default time zone
		TimeZone.setDefault(TimeZone.getTimeZone("CET")); // setting to Frankfurt Germany
		System.out.println(TimeZone.getDefault()); //verifying
		Calendar cet = new GregorianCalendar(); //need to set departure date and time at Frankfurt Germany
		cet.set(2015, 11, 27, 14, 05, 00); // setting departure date and time
		Date departureTimeFrankfurt = cet.getTime(); // verifying getting departure time
		System.out.println(departureTimeFrankfurt);
		//System.out.println(TimeZone.getTimeZone("PST")); // 
		TimeZone.setDefault(TimeZone.getTimeZone("PST")); // converting departure CET time zone to departure local i.e.  Los Angeles, California time zone
		System.out.println(TimeZone.getDefault()); // verifying the departure time according to  Los Angeles, California
		//System.out.println(TimeZone.getAvailableIDs().toString()); 
		Date departureTimeAngeles = cet.getTime(); // departureTimeAngeles is departure time according to Los Angeles time zone
		System.out.println(departureTimeAngeles);
		Calendar pst = new GregorianCalendar(); // net to set arrival date and time at Los Angeles, California
		pst.set(2015, 11, 28, 16, 33, 23); // setting arrival time according to Los Angeles time zone
		Date arrivalTimeAngeles = pst.getTime(); // getting date time for arrival at Los Angeles
		System.out.println(arrivalTimeAngeles); // verifying
		long sec = (arrivalTimeAngeles.getTime()-departureTimeAngeles.getTime())/1000; // converting into sec
		System.out.println("Flight duration in second:"+sec);
		
		//trying different approaches
//		System.out.println();
//		Calendar d = new GregorianCalendar();
//		Calendar e = new GregorianCalendar();
//		d.setTime(date3);
//		e.setTime(date2);
//		Date diff = new Date(d.getTimeInMillis()-e.getTimeInMillis());
//		Calendar f = new GregorianCalendar();
//		System.out.println(f.);
//		//System.out.println();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");
//		LocalDate departure = LocalDate.parse(date2, formatter);
//		LocalDate arrival = LocalDate.parse((CharSequence) date3, formatter);
//		System.out.println(arrival.toEpochDay() - departure.toEpochDay());
		
		System.out.println("Total flight duration:");
		if(sec>=24*60*60){ //Converting into days
			System.out.print("Days:"+sec/(24*60*60)+" ");
			sec = sec%(24*60*60);
		}
		else{
			System.out.print("Dyas:00 ");
		}
		if(sec>=60*60){ //converting into hours
			System.out.print("Time: "+sec/(60*60)+":");
			sec = sec%(60*60);
		}
		else{
			System.out.print("00:");
		}
		if(sec>=60){ // converting into minute
			System.out.print(sec/(60)+":");
			sec = sec%60;
		}
		else{
			System.out.print("00:");
		}
		System.out.print(sec); //finally second value
	}
}