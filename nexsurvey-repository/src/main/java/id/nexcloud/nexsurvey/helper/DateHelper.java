package id.nexcloud.nexsurvey.helper;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Date related helper class
 * @author Reza
 */
public class DateHelper
{

    private static Log log = LogFactory.getLog(DateHelper.class);
    /**
     * default date pattern dd/MM/yyyy
     */
    public static final String DEFAULT_DATE_PATTERN = "dd/MM/yyyy";
    /**
     * date pattern dd-MM-yyyy
     */
    public static final String DATE_PATTERN_DASH = "dd-MM-yyyy";
    /**
     * default time pattern hh:mm:ss
     */
    public static final String DEFAULT_TIME_PATTERN = "hh:mm:ss";
    /**
     * default date time pattern dd/MM/yyyy hh:mm:ss
     */
    public static final String DEFAULT_DATETIME_PATTERN = "dd/MM/yyyy hh:mm:ss";
    
    public static final String DATE_PATTERN_YYYYMMDD = "yyyyMMdd";
    
    public static final String DATE_PATTERN_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    
    public static final String DATE_PATTERN_DDMMYYYY = "ddMMyyyy";
    
    
    private DateHelper()
    {
    }

    /**
     * Get now time as long
     * @return
     */
    public static long nowAsLong()
    {
        return System.currentTimeMillis();
    }

    /**
     * Get now time as date
     * @return time object
     */
    public static Date nowAsDate()
    {
        return new Date(nowAsLong());
    }

    /**
     * Get now time as timestamp
     * @return timestamp object
     */
    public static Timestamp nowAsTimestamp()
    {
        return new Timestamp(nowAsLong());
    }

    /**
     * Get now time as calendar
     * @return
     */
    public static Calendar nowAsCalendar()
    {
        return Calendar.getInstance();
    }

    /**
     * Convert date to timestamp
     * @param date
     * @return
     */
    public static Timestamp dateToTimestamp(Date date)
    {
        return date == null ? null : new Timestamp(date.getTime());
    }

    /**
     * Convert string to date
     * @param dateString string to convert
     * @return date
     */
    public static Date stringToDate(String dateString)
    {
        return stringToDate(DEFAULT_DATE_PATTERN, dateString);
    }

    /**
     * Convert string to date
     * @param pattern date pattern
     * @param dateString string to convert
     * @return date
     */
    public static Date stringToDate(String pattern, String dateString)
    {
        if (!StringHelper.nullOrEmpty(pattern) && !StringHelper.nullOrEmpty(dateString))
        {
            try
            {
                return new SimpleDateFormat(pattern).parse(dateString);
            }
            catch (ParseException ex)
            {
                String message = "DateHelper.stringToDate -> Pattern: %s, dateString: %s, exception message: %s";
                message = String.format(message, pattern, dateString, ex.getMessage());
                log.error(message);
            }
        }

        return null;
    }

    /**
     * Convert date to string
     * @param date date to convert
     * @return string
     */
    public static String dateToString(Date date)
    {
        return dateToString(DEFAULT_DATE_PATTERN, date);
    }

    /**
     * Convert date to string
     * @param pattern date pattern
     * @param date date to convert
     * @return string
     */
    public static String dateToString(String pattern, Date date)
    {
        if (!StringHelper.nullOrEmpty(pattern) && date != null)
        {
            return new SimpleDateFormat(pattern).format(date);
        }
        return null;
    }
    
    /**
     * convert timestamp to sql string date format
     * @param dateTime
     * @param withTime
     * @return
     */
    public static String convertTimestampToString(Timestamp dateTime, boolean withTime) {
        String s = "";
        java.text.SimpleDateFormat ft = null;
        if (withTime) {
          ft = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        } else {
          ft = new java.text.SimpleDateFormat("yyyy-MM-dd");
        }
        s = ft.format(dateTime);
        return s;
    }
    
    /**
     * convert timestamp to format yyyyMMdd
     * @param dateTime
     * @return
     */
    public static String convertTimestampToString(Timestamp dateTime, String dateFormat) {
        String s = "";
        java.text.SimpleDateFormat ft = null;
        ft = new java.text.SimpleDateFormat(dateFormat);
        s = ft.format(dateTime);
        return s;
    }
    
    
    /**
     * convert timestamp to format dd MMMM yyyy
     * @param dateTime
     * @return
     */
    public static String convertTimestampToDDMMMMYYYY(Timestamp dateTime) {
        String s = "";
        java.text.SimpleDateFormat ft = null;
        ft = new java.text.SimpleDateFormat("dd MMMM yyyy");
        s = ft.format(dateTime);
        if (s.indexOf("Jan") > -1) {
            s = s.replace("January", "Januari");
        } else if (s.indexOf("Feb") > -1) {
            s = s.replace("February", "Februari");
        } else if (s.indexOf("Mar") > -1) {
            s = s.replace("March", "Maret");
        } else if (s.indexOf("May") > -1) {
            s = s.replace("May", "Mei");
        } else if (s.indexOf("Jun") > -1) {
            s = s.replace("June", "Juni");
        } else if (s.indexOf("Jul") > -1) {
            s = s.replace("July", "Juli");
        } else if (s.indexOf("Aug") > -1) {
            s = s.replace("August", "Agustus");
        } else if (s.indexOf("Oct") > -1) {
            s = s.replace("October", "Oktober");
        } else if (s.indexOf("Feb") > -1) {
            s = s.replace("November", "Nopember");
        } else if (s.indexOf("Dec") > -1) {
            s = s.replace("December", "Desember");
        }
        return s;
    }
    
    public static  String convertIntegerToMMM(int month){
        String a = "";
        if (month==1) {
            a="Jan";
        } else if (month==2) {
            a="Feb";
        } else if (month==3) {
            a="Mar";
        } else if (month==4) {
            a="Apr";
        } else if (month==5) {
            a="May";
        } else if (month==6) {
            a="Jun";
        } else if (month==7) {
            a="Jul";
        } else if (month==8) {
            a="Aug";
        } else if (month==9) {
            a="Sep";
        } else if (month==10) {
            a="Oct";
        } else if (month==11) {
            a="Nov";
        } else if (month==12) {
            a="Dec";
        }
        return a;
    }
    
    public static Timestamp convertDateStringToTimestamp(String dateString, String format) {
        String day = "";
        String month = "";
        String year = "";
        String hour = "";
        String minute = "";
        String second = "";
        StringTokenizer st;
        Timestamp dateTime = null;
        try {
          if (format.equalsIgnoreCase("dd/mm/yy")) {
            day = dateString.substring(0, 2);
            month = dateString.substring(3, 5);
            year = "20" + dateString.substring(6, 8);
            hour = "00";
            minute = "00";
            second = "00";
          }
          else if (format.equalsIgnoreCase("dd/mm/yyyy")) {
//            st = new StringTokenizer(dateString, "/");
//            day = st.nextToken(); //dateString.substring(0, 2);
//            month = st.nextToken(); //dateString.substring(3, 5);
//            year = st.nextToken(); //dateString.substring(6, 10);
            day = dateString.substring(0, 2);
            month = dateString.substring(3, 5);
            year = dateString.substring(6, 10);
            if (day.length()==1) day = "0" + day;
            if (month.length()==1) month = "0" + month;
            hour = "00";
            minute = "00";
            second = "00";
          }
          else if (format.equalsIgnoreCase("yyyy-mm-dd")) {
            day = dateString.substring(8, 10);
            month = dateString.substring(5, 7);
            year = dateString.substring(0, 4);
            hour = "00";
            minute = "00";
            second = "00";
          }
          else if (format.equalsIgnoreCase("yyyy-mm-dd hh:mm:ss")) {
            day = dateString.substring(8, 10);
            month = dateString.substring(5, 7);
            year = dateString.substring(0, 4);
            hour = dateString.substring(11, 13);
            minute = dateString.substring(14, 16);
            second = dateString.substring(17, 19);
          }
          else if (format.equalsIgnoreCase("yyyymmdd")) {
            day = dateString.substring(6, 8);
            month = dateString.substring(4, 6);
            year = dateString.substring(0, 4);
            hour = "00";
            minute = "00";
            second = "00";
          }
          
          String currTime = year + "-" + month + "-" + day + " " + hour + ":" +
              minute + ":" + second + ".000000000";
          dateTime = Timestamp.valueOf(currTime);
        } catch(Exception e) {
          e.printStackTrace();
          dateTime = null;
        }
        return dateTime;
      }

    
    public static int getDayDiff(String d1, String m1, String y1, 
            String d2, String m2, String y2) {
        int q = 0;
        Date dt = null;
        //converts dates to m/d/y format
        String date1 = m1+"/"+d1+"/"+y1;
        String date2 = m2+"/"+d2+"/"+y2;
        long j = dt.parse(date1); //converts date into milliseconds
        long k = dt.parse(date2);
        q = (int)Math.abs((j-k)/24/60/60/1000);
        q++;
        return q;
    }
	
	public static int getDayBit(Date date){
        int week = 0;
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek=c.get(Calendar.DAY_OF_WEEK);

        if(dayOfWeek == 0)
        {
            week = 7;
        }else{
            week = dayOfWeek - 1;
        }
        
        return week;
    }
	
	public static String getDayName(String date){
         String rValue="";
            try{
                SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd");
                Date dt1=format1.parse(date);
                DateFormat format2=new SimpleDateFormat("EEEE");
                rValue=format2.format(dt1);
            }catch(ParseException e){
                System.out.println(e);
            }
        return rValue;
    }
    
	
	public static int getDayOfWeek(String dateName){
        int rValue = 0;
        if(dateName.equalsIgnoreCase("Monday")){
            rValue=1;
        }
        if(dateName.equalsIgnoreCase("Tuesday")){
            rValue=2;
        }
        if(dateName.equalsIgnoreCase("Wednesday")){
            rValue=3;
        }
        if(dateName.equalsIgnoreCase("Thursday")){
            rValue=4;
        }
        if(dateName.equalsIgnoreCase("Friday")){
            rValue=5;
        }
        if(dateName.equalsIgnoreCase("Saturday")){
            rValue=6;
        }
        if(dateName.equalsIgnoreCase("Sunday")){
            rValue=7;
        }
        
        return rValue;
    }
    
    public static Timestamp plusDays(Timestamp odate, int days) {
        // will return the day of given day plus n days
        Timestamp result = null;
        Calendar cal = Calendar.getInstance();
        cal.setTime(odate);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        cal.add(Calendar.DATE, days);
        result = new Timestamp(cal.getTimeInMillis());
        return result;
    }

    public static Timestamp nextMonth(Timestamp odate) {
        // will return the first day of given date
        Timestamp result = null;
        Calendar cal = Calendar.getInstance();
        cal.setTime(odate);
        cal.set(Calendar.DATE, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        cal.add(Calendar.DATE, 35);
        cal.set(Calendar.DATE, 1);
        cal.add(Calendar.DATE, -1);
        result = new Timestamp(cal.getTimeInMillis());
        return result;
    }  
	
}
