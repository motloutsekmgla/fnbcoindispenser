package co.za.fnb.coin.constants;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtils {


    public static long getSystemTime() {
        return System.currentTimeMillis();
    }

    public static long getSystemTimeInSeconds() {
        return (getSystemTime() / 1000L);
    }
 
    
    public static void main(String [] args) {
    	
//      DateUtils.convertStringToNiceDate("2017/06/01");
    	
    	System.out.println("the easter is " + DateUtils.getEasterSundayDate(2019).getTime());
  
    	
  }

    public static String getDayFromDate(Date date) {
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        return simpleDateformat.format(date);

    }

    public static String getTimeFromDate(Date date) {

        DateFormat dateFormat = new SimpleDateFormat("HH:mm a");
        String time=dateFormat.format(date);
        System.out.println(time);
        return time;

    }


    public static Date addDays(Date date, int days)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }

    /**
     Make an int Month from a date
     */
    public static int getMonthInt(Date date) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM");
        return Integer.parseInt(dateFormat.format(date));
    }

    public static int getYearInt(Date date) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        return Integer.parseInt(dateFormat.format(date));
    }

    public static String convertDateToString(Date dateToConvert){

        /*
         * To convert java.util.Date to String, use SimpleDateFormat class.
         */

        /*
         * crate new SimpleDateFormat instance with desired date format.
         * We are going to use yyyy-mm-dd hh:mm:ss here.
         */
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

        //to convert Date to String, use format method of SimpleDateFormat class.
        String strDate = dateFormat.format(dateToConvert);

        //         System.out.println("Date converted to String: " + strDate);
        return strDate;

    }
    
    
    public static String convertDateToString1(Date dateToConvert){

        /*
         * To convert java.util.Date to String, use SimpleDateFormat class.
         */

        /*
         * crate new SimpleDateFormat instance with desired date format.
         * We are going to use yyyy-mm-dd hh:mm:ss here.
         */
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmssSSS'Z'");

        //to convert Date to String, use format method of SimpleDateFormat class.
        String strDate = dateFormat.format(dateToConvert);

        //         System.out.println("Date converted to String: " + strDate);
        return strDate;

    }

    public static String convertDateToStringTwo(Date dateToConvert, String dateformat){

        /*
         * To convert java.util.Date to String, use SimpleDateFormat class.
         */

        /*
         * crate new SimpleDateFormat instance with desired date format.
         * We are going to use yyyy-mm-dd hh:mm:ss here.
         */
        DateFormat dateFormat = new SimpleDateFormat(dateformat);

        //to convert Date to String, use format method of SimpleDateFormat class.
        String strDate = dateFormat.format(dateToConvert);

        //         System.out.println("Date converted to String: " + strDate);
        return strDate;

    }

    // We can move the dateFormat to be a method param so the method can be reused.
    public static Date convertStringToDate(String dateToConvert){

        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy/MM/dd").parse(dateToConvert);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;

    }
    
    
    
 

    // We can move the dateFormat to be a method param so the method can be reused.
    public static Date convertStringToDateFormat(String dateToConvert){

        Date date = null;
        try {
            date = new SimpleDateFormat("dd-MM-yyyy").parse(dateToConvert);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;

    }

    // We can move the dateFormat to be a method param so the method can be reused.
    public static Date formatDate(Date dateToConvert, String format){

        Date date = null;
        try {
            date = new SimpleDateFormat(format).parse(convertDateToString(dateToConvert));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;

    }


    // We can move the dateFormat to be a method param so the method can be reused.
    public static Date convertStringToNiceDate(String dateToConvert, String pattern){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH);
        LocalDate ld = LocalDate.parse(dateToConvert, dtf);
        String month_name = dtf2.format(ld);
        System.out.println(month_name);
        return convertToLocalDateViaInstant(ld);
    }

    // We can move the dateFormat to be a method param so the method can be reused.
    public static Date convertStringToNiceDateTime(String dateToConvert, String pattern){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH);
        LocalDateTime ld = LocalDateTime.parse(dateToConvert, dtf);
        String month_name = dtf2.format(ld);
        System.out.println(month_name);
        return convertToLocalDateTimeViaInstant(ld);
    }

    public static Date buildDateTime(Date sourceD, Date sourceTime){

        LocalDateTime localDateTime =  convertToLocalDateTimeViaInstant(sourceTime);
        LocalDate localDate = convertToLocalDateViaInstant(sourceD);

        LocalDateTime resultD = LocalDateTime.of(localDate.getYear(), localDate.getMonth(), localDate.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute());
        return convertToLocalDateTimeViaInstant(resultD);
    }

    

    public static  LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    public static  LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

    public static  LocalDateTime convertStringToLocalDateTime(String dateToConvert, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        LocalDateTime localDateTime = LocalDateTime.parse(dateToConvert, formatter);

        return localDateTime;
    }

    public static  Date convertToLocalDateTimeViaInstant(LocalDateTime dateToConvert) {
        return  Date.from(dateToConvert.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static  Date convertToLocalDateViaInstant(LocalDate dateToConvert) {
        return  Date.from(dateToConvert.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /**
     * Calculated the financial period that the date is in
     * <p>
     * CCYY(FINACCT.EFFDFINACC) * 12 + number of month in year(FINACCT.EFFDFINACC)
     * (see NSW-SSB-MVS-043.doc)
     * <p/>
     * @param date
     * @return System generated financial period.
     */
    public static int calculateFinancialPeriod(LocalDate date) {
        return date.getYear()*12+date.getMonthValue();
    }


    public static long getDifferenceInDays(Date subtratingfrom , Date beingsubtracted){
  

   long diff = subtratingfrom.getTime() - beingsubtracted.getTime();
	
    	
    	return diff / (1000 * 60 * 60 * 24);
    }
    
    public static Calendar getEasterSundayDate(int year)
    {
        int a = year % 19,
            b = year / 100,
            c = year % 100,
            d = b / 4,
            e = b % 4,
            g = (8 * b + 13) / 25,
            h = (19 * a + b - d - g + 15) % 30,
            j = c / 4,
            k = c % 4,
            m = (a + 11 * h) / 319,
            r = (2 * e + 2 * j - k - h + m + 32) % 7,
            n = (h - m + r + 90) / 25,
            p = (h - m + r + n + 19) % 32;

        /*String result;
        switch(n)
        {
            case 1:
                result = "January ";
                break;
            case 2:
                result = "February ";
                break;
            case 3:
                result = "March ";
                break;
            case 4:
                result = "April ";
                break;
            case 5:
                result = "May ";
                break;
            case 6:
                result = "June ";
                break;
            case 7:
                result = "July ";
                break;
            case 8:
                result = "August ";
                break;
            case 9:
                result = "September ";
                break;
            case 10:
                result = "October ";
                break;
            case 11:
                result = "November ";
                break;
            case 12:
                result = "December ";
                break;
            default:
                result = "error";
        }*/
        
    Calendar cal = Calendar.getInstance();
    
    cal.set(Calendar.YEAR, year);
    cal.set(Calendar.MONTH, --n);
    cal.set(Calendar.DAY_OF_MONTH, p);
    
        return cal;
    }
    
    public  static Calendar  addBusinessDay(final Calendar cal, final int numBusinessDays)
	 {
	     if (cal == null  || numBusinessDays == 0)
	     {
	         return cal;
	     }
	     final int numDays = Math.abs(numBusinessDays);
	     final int dateAddition = numBusinessDays < 0 ? -1 : 1;//if numBusinessDays is negative
	     int businessDayCount = 0;
	     while (businessDayCount < numDays)
	     {
	    	 cal.add(Calendar.DATE, dateAddition);

	         //check weekend
	         if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
	         {
	             continue;//adds another day
	         }

	         //check holiday
	         if (isHoliday(cal))
	         {
	             continue;//adds another day
	         }
	         // THIS check if the previos day was a holiday on a SUNDAY....THEN SKIP THE MONDAY
	         if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY )
	         {
	        	 Calendar skip = cal;
	        	 skip.add(Calendar.DAY_OF_MONTH, dateAddition < 0 ? -1 : 1);
	        	 if(isHoliday(skip))
	        	 {
	        		 continue;//adds another day 
	        	 }
	        	 }
	         
	         
	        
	         businessDayCount++;
	     }
	     return cal;
	 }
    
    public static Calendar getWeekday(Calendar cal)
    {

    	if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY ){
    		cal.add(Calendar.DAY_OF_MONTH, 2);
    	}else
    		if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ){
   
    			cal.add(Calendar.DAY_OF_MONTH,  1);
    	}
    		
    		
    	 if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY )
         {
        	 
        	 if(isHoliday(cal))
        	 {
        		 cal.add(Calendar.DAY_OF_MONTH,  1);
        	 }
        	 }
    	
    	
    	return cal;
    }
    
    public static boolean isHoliday(Calendar cal)
	 {
		 if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
				return false;
			}
			
			// check if New Year's Day
			if (cal.get(Calendar.MONTH) == Calendar.JANUARY
				&& cal.get(Calendar.DAY_OF_MONTH) == 1) {
				return false;
			}
			
			// check if Christmas
			if (cal.get(Calendar.MONTH) == Calendar.DECEMBER
				&& cal.get(Calendar.DAY_OF_MONTH) == 25) {
				return false;
			}
			
		//	Human Rights Day
			if (cal.get(Calendar.MONTH) == Calendar.MARCH
				&& cal.get(Calendar.DAY_OF_MONTH) == 21) {
				return false;
			}
			
			
		
			
			// Freedom Day 
			if (cal.get(Calendar.MONTH) == Calendar.APRIL
					&& cal.get(Calendar.DAY_OF_MONTH) == 27) {
				return false;
			}
			
			//  Workers Day
			if (cal.get(Calendar.MONTH) == Calendar.MAY
				&& cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 1) {
				return false;
			}
			
		//  YOUTH Day
			if (cal.get(Calendar.MONTH) == Calendar.JUNE
						&& cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 16) {
						return false;
		  }
			
			
		//  National Women’s Day
				if (cal.get(Calendar.MONTH) == Calendar.AUGUST
								&& cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 9) {
								return false;
				  }	
				
			//  Heritage Day
			if (cal.get(Calendar.MONTH) == Calendar.SEPTEMBER
											&& cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 24) {
											return false;
							  }			
			
			
		//  Day OF reconciliation
					if (cal.get(Calendar.MONTH) == Calendar.DECEMBER
													&& cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 16) {
													return false;
									  }			
			
					
					//  Day of Goodwill
					if (cal.get(Calendar.MONTH) == Calendar.DECEMBER
													&& cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 26) {
													return false;
									  }			
					
				// Good Friday
					Calendar good = getEasterSundayDate(cal.get(Calendar.YEAR));
					
					
					if (cal.get(Calendar.MONTH) == good.get(Calendar.MONTH)
						&& cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) == (good.get(Calendar.DAY_OF_WEEK_IN_MONTH) + 1)
						|| cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) == (good.get(Calendar.DAY_OF_WEEK_IN_MONTH) - 2)) 
					{
						return false;
					}	
			
			return true;
	 }

    public boolean isSameDay(Calendar cal1, Calendar cal2) {
        if (cal1 == null || cal2 == null)
            return false;
        return (cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA)
                && cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) 
                && cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR));
    }
}
