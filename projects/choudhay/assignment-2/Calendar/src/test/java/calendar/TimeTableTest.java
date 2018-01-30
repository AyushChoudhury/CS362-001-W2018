package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {

	  	GregorianCalendar newDay1 = new GregorianCalendar(2018, 1, 1);
	  	/*
	  	 CalDay day1 = new CalDay(newDay);
	  	*/ 
	  	 int startHour=21;
		 int startMinute=30;
		 int startDay=1;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 Appt appt0 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 //day1.addAppt(appt0);

		 GregorianCalendar newDay2 = new GregorianCalendar(2018, 1, 27);
	  	/*
	  	 CalDay day2 = new CalDay(newDay2);
	  	*/ 
	  	 startHour=21;
		 startMinute=30;
		 startDay=27;
		 startMonth=01;
		 startYear=2018;
		 title="UNBirthday Party";
		 description="This is my UNbirthday party.";
		 Appt appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 //day2.addAppt(appt1);

		 LinkedList<Appt> appts = new LinkedList<Appt>();
		 appts.add(appt0);
		 appts.add(appt1);

		 TimeTable table = new TimeTable();
		 table.getApptRange(appts, newDay1, newDay2);

		 startHour=17;
		 startMinute=38;
		 startDay=10;
		 startMonth=01;
		 startYear=2018;
		 title="OUT OF RANGE";
		 description="This is my UNbirthday party.";
		 Appt appt2 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 int[] num = new int[10];
		 num[0] = 3; num[1] = 2; num[2] = 1; num[3] = 7; num[4] = 5; num[5] = 6; num[6] = 4; num[7] = 8; num[8] = 9; num[9] = 10;
		 appt2.setRecurrence(num, 2, 1, 100);
		 appts.add(appt2);
		 table.getApptRange(appts, newDay2, newDay1);
		 
		 startHour=99;
		 startMinute=99;
		 startDay=99;
		 startMonth=99;
		 startYear=2018;
		 title="INVALID appt";
		 description="This is my UNbirthday party.";
		 Appt appt3 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 appts.add(appt3);
		 table.getApptRange(appts, newDay2, newDay1);
		 //assertTrue(appt2.isRecurring());
		 table.deleteAppt(appts, appt2);
		 appts = table.permute(appts, num);
		 //table.getNextApptOccurrence(appt2, newDay1);
		 //appt2.setRecurDays(num);
		 //table.getApptOcurrences(appts, newDay1, newDay2);
		 //
		 //table.getApptRange(appts, newDay1, newDay2);
		
		 //table.getApptRange(appts, newDay2, newDay1);

		 
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 
	 }
//add more unit tests as you needed
}
