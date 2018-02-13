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
	 }

	 @Test
	  public void test02()  throws Throwable  {

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
		 assertFalse(appt.getValid());
		 appt.setStartHour(2);
		// appt.setStartYear(-2);
		 //assertFalse(appt.getValid());
		 //appt.setStartYear(2);
		 appt.setStartMinute(-2);
		 assertFalse(appt.getValid());
		 appt.setStartMinute(2);
		 appt.setStartDay(-2);
		 assertFalse(appt.getValid());
		 appt.setStartDay(2);

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

		
		 /*appt.setStartDay(-1);
		 appt.setStartMinute(-45);
		 appt.setStartHour(-11);*/
	 }

	  @Test
	  public void test03()  throws Throwable  {
	  	 int startHour=21;
		 int startMinute=99;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		  Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	  }

	  @Test
	  public void test04()  throws Throwable  {
	  	 int startHour= -5;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		  Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertEquals(-5, appt.getStartHour());

		 Appt appt1 = new Appt(21,
		          -99 ,
		          15 ,
		           1,
		          2018 ,
		          title,
		         description);

		 Appt appt2 = new Appt(45,
		          30 ,
		          15 ,
		           1,
		          2018 ,
		          title,
		         description);
	  }
//add more unit tests as you needed
	
}
