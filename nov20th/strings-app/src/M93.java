import java.util.Date;
import java.util.Calendar;
class M93
{
	public static void main(String[] args) 
	{
		Calendar cal  = Calendar.getInstance();
		System.out.println(cal);
		Date d1 = cal.getTime();
		System.out.println(d1);
	}
}

/*
-Calendar is a abstract class.


G:\nov20th\strings-app\src>java -cp ../classes M93
java.util.GregorianCalendar[time=1543054466753,areFieldsSet=true,
areAllFieldsSet=true,lenient=true,
zone=sun.util.calendar.ZoneInfo[id="Asia/Calcutta",
offset=19800000,dstSavings=0,useDaylight=false,
transitions=6,lastRule=null],firstDayOfWeek=1,
minimalDaysInFirstWeek=1,ERA=1,YEAR=2018,MONTH=10,
WEEK_OF_YEAR=47,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,
DAY_OF_YEAR=328,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,
AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=44,SECOND=26,
MILLISECOND=753,ZONE_OFFSET=19800000,DST_OFFSET=0]
Sat Nov 24 15:44:26 IST 2018

*/