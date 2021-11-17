
class WeeksAndDays{
    
	public static void main(String n[]){
	
	   String[] weeks={"Week1","Week2","Week3","Week4"};
	   String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	   String[] time={"Early Morning","Morning","Noon","After Noon","Evening","Late Evening","Night"};
	   
	    int weekIndex=0;
		int dayIndex=0;
		int timeIndex=0;
		
		while(weekIndex<weeks.length)
		{
			System.out.println(weeks[weekIndex]);
			System.out.println("--------------------------------------------------------");
			dayIndex=0;
			while(dayIndex<days.length){
				System.out.println("<<<<<<<<<<<<<<<     "+days[dayIndex]+"     >>>>>>>>>>>>>>>");
			    timeIndex=0;
				while(timeIndex<time.length)
				{
					System.out.println("       {{{{  "+time[timeIndex]+"     }}}}");
					timeIndex++;
				}
				dayIndex++;
			}
			weekIndex++;
			
		}
	
	}

}