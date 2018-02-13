package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {

	  	GregorianCalendar newDay = new GregorianCalendar();
	  	CalDay today = new CalDay(newDay); 
	  	assertTrue(today.isValid());
	  	today.getSizeAppts();
	  	today.getDay();
	  	today.getMonth();
	  	today.getYear();
	  	 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt0 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 today.addAppt(appt0);
		 
		 startHour=21;
		 startMinute=30;
		 startDay=45;
		 startMonth=1;
		 startYear=2018;
		 title="hello";
		 description="This is my NOT birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 today.addAppt(appt1);
		 
		 startHour=19;
		 startMinute=35;
		 startDay=4;
		 startMonth=12;
		 startYear=2018;
		 title="Hello There";
		 description="Lets try that again";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt2 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 today.addAppt(appt2);
		 today.getSizeAppts();

		//LinkedList<Appt> appts = new LinkedList<Appt>();

		 //today.setAppts(appts);

		 String day = today.toString();

		 CalDay notToday = new CalDay(newDay);
		 notToday.addAppt(appt0);
		 notToday.addAppt(appt1);
		 notToday.addAppt(appt2);
		 day = notToday.toString();
		

	 }
	 @Test
	  public void test02()  throws Throwable  {
		 
	 }
//add more unit tests as you needed	
}
