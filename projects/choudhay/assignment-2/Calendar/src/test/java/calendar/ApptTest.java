package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
		 appt.setStartHour(-2);
		 
		 appt.getRecurNumber();
		 appt.getRecurBy();
		 appt.getRecurDays();
		 appt.toString();
		 appt.isRecurring();

		 appt.setStartMonth(10);
		 appt.setStartDay(5);
		 appt.setStartMinute(45);
		 appt.setStartHour(11);
		 appt.setStartYear(2019);
		 appt.setTitle(null);
		 appt.setDescription(null);
		 appt.getRecurNumber();
		 appt.getRecurBy();
		 appt.getRecurDays();
		 appt.toString();

		
		 boolean recur = appt.isRecurring();
		 appt.getRecurIncrement();
		 //appt.representationApp();
		 //appt.getValid();
		
		 //assertTrue(appt.getValid());
		 //assertEquals(11, appt.getStartHour());
		 //assertEquals(45, appt.getStartMinute());
		 //assertEquals(5, appt.getStartDay());
		 //assertEquals(10, appt.getStartMonth());
		 //assertEquals(2019, appt.getStartYear());
		 //assertEquals("", appt.getTitle());
		 //assertEquals("", appt.getDescription());

		 appt.setStartMonth(0);
		 appt.setStartDay(-1);
		 appt.setStartMinute(-45);
		 appt.setStartHour(-11);
		
	 }

	 @Test
	  public void test02()  throws Throwable  {
	  	/*
	  	 int startHour=21;
		 int startMinute=30;
		 int startDay=29;
		 int startMonth=15;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		
	// assertions
		 assertFalse(appt.getValid());
	 	 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
		 */
	 }
//add more unit tests as you needed
	
}
