package pkg;
import java. util.Date;
import java.sql.Timestamp;

public class Myutils {
	static Date TimeStampToDate(long ts_value )
	{
		 Timestamp ts1 =new Timestamp(ts_value);  
		 Date dt=ts1;
		 
	return(dt);
	
	}

}
