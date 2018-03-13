package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import org.junit.Test;
import java.util.LinkedList;
import java.util.List;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
	
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {

	  	 LinkedList<Appt> appts = new LinkedList<Appt>();
	  	 GregorianCalendar newDay1 = new GregorianCalendar(2018, 1, 1);
	  	 GregorianCalendar newDay2 = new GregorianCalendar(2018, 1, 27);
	  	 

	  	 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		 System.out.println("Start testing...");

		 try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				 long randomseed =System.currentTimeMillis();
				 Random random = new Random(randomseed);
				 int startHour=ValuesGenerator.RandInt(random);
				 int startMinute=ValuesGenerator.RandInt(random);
				 int startDay=ValuesGenerator.RandInt(random);;
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear=ValuesGenerator.RandInt(random);
				 String title="Birthday Party";
				 String description="This is my birthday party.";
			 
				 Appt appt = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
				 if(!appt.getValid()) {

				 	
				 } else {
				 for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = ApptRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setTitle")){
						   String newTitle=(String) ValuesGenerator.getString(random);
						   appt.setTitle(newTitle);						   
						}
					   else if (methodName.equals("setRecurrence")){
						   int sizeArray=ValuesGenerator.getRandomIntBetween(random, 0, 8);
						   int[] recurDays=ValuesGenerator.generateRandomArray(random, sizeArray);
						   int recur=ApptRandomTest.RandomSelectRecur(random);
						   int recurIncrement=ValuesGenerator.RandInt(random);
						   int recurNumber=ApptRandomTest.RandomSelectRecurForEverNever(random);
						   appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);
						}				
				} 
			}

				 appts.add(appt);
				 TimeTable table = new TimeTable();
				 table.getApptRange(appts, newDay1, newDay2);
				 table.deleteAppt(appts, appt);

				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			}

			
			TimeTable table = new TimeTable();
			//for(i = 0; i < appts.size(); i++) {

				table.deleteAppt(null, appts.get(0));
				table.deleteAppt(appts, null);
			//}
			//table.getApptRange(appts, newDay1, newDay2);

		}catch(NullPointerException e){
			
		}

	  	 /*int startHour=21;
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

		 GregorianCalendar newDay2 = new GregorianCalendar(2018, 1, 27);
	
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
		 table.deleteAppt(appts, appt2);
		 appts = table.permute(appts, num);*/

	 }


	
}
