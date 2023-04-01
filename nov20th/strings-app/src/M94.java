import java.util.Date;
import java.util.Calendar;
class M94
{
	public static void main(String[] args) 
	{
		Calendar cal  = Calendar.getInstance();
		cal.add(Calendar.DATE,1);
		System.out.println(cal);
		Date d1 = cal.getTime();
		System.out.println(d1);
	}
}

/*
java.util.GregorianCalendar[time=1543141006516,
areFieldsSet=true,areAllFieldsSet=true,lenient=true,
zone=sun.util.calendar.ZoneInfo[id="Asia/Calcutta",
offset=19800000,dstSavings=0,useDaylight=false,
transitions=6,lastRule=null],firstDayOfWeek=1,
minimalDaysInFirstWeek=1,ERA=1,YEAR=2018,
MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=5,
DAY_OF_MONTH=25,DAY_OF_YEAR=329,DAY_OF_WEEK=1,
DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,
MINUTE=46,SECOND=46,MILLISECOND=516,ZONE_OFFSET=19800000,
DST_OFFSET=0]
Sun Nov 25 15:46:46 IST 2018
*/