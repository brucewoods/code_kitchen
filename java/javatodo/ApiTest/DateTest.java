package ApiTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.stream;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;
public class DateTest {
  

     @Test
     void DateToString1(){
         final Date d = new Date();
         final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
         System.out.println(sdf.format(d));
         //2020
         assertEquals(2020-1900, d.getYear(), "year");
     
    
     }
     @Test
     void DateToString2(){
         final Date d = new Date();
         final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
         System.out.println(sdf.format(d));
         
         final Calendar cal=Calendar.getInstance();
         cal.setTime(d);
         final var year=cal.get(Calendar.YEAR);
         assertEquals(2020, year ,"year");
    
     }

     @Test
     void StringToDate() throws ParseException {
        
        final DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        final String str="2012-03-03";
       final Date  date=df.parse(str);
       
       assertEquals(2012-1900, date.getYear(), "year");
       
     }
     @Test
     void  DateToMath(){
       
        LocalDate myDate=LocalDate.parse("2013-04-04");
        myDate=myDate.plusDays(10);
        myDate=myDate.plusMonths(2);
      
         
       assertEquals(6,myDate.getMonthValue(), "ee");
        

     }
}