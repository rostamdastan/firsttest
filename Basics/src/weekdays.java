
public class weekdays {
	public enum Day {
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	    THURSDAY, FRIDAY, SATURDAY 
	}
	Day day;
	    
	public weekdays(Day day) {
	    this.day = day;
	}
	    
	public void tellItLikeItIs() {
	    switch (day) {
	        case MONDAY:
	            System.out.println("Mondays are bad.");
	            System.out.println(Day.MONDAY);
	            break;
	                    
	        case FRIDAY:
	            System.out.println("Fridays are better.");
	            break;
	                         
	        case SATURDAY: case SUNDAY:
	            System.out.println("Weekends are best.");
	            break;
	                        
	        default:
	            System.out.println("Midweek days are so-so.");
	            break;
	        }
	    }
	    
	    public static void main(String[] args) {
	        weekdays firstDay = new weekdays(Day.MONDAY);
	        firstDay.tellItLikeItIs();
	        weekdays thirdDay = new weekdays(Day.WEDNESDAY);
	        thirdDay.tellItLikeItIs();
	        weekdays fifthDay = new weekdays(Day.FRIDAY);
	        fifthDay.tellItLikeItIs();
	        weekdays sixthDay = new weekdays(Day.SATURDAY);
	        sixthDay.tellItLikeItIs();
	        weekdays seventhDay = new weekdays(Day.SUNDAY);
	        seventhDay.tellItLikeItIs();
	    }
	}
