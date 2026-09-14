public class Time {
	
	public static void main(String[] args){
		int phour,psec,pmin, hour, sec, min, midnight, start;
		phour = 13;
		pmin = 22;
		psec = 51;
		hour = 13;
		min = 32;
		sec = 58;
		start = psec + 60 * pmin + phour * 60 * 60;
		midnight = sec + 60 * min + hour * 60 * 60;
		System.out.println("Seconds since midnight: " + midnight);
		System.out.println("Seconds Remaining in the day: " + (86400 - midnight));
		System.out.println("Percentage of day remaining: " + Math.round(100 * midnight / 86400.0) + "%");
	    System.out.println("Seconds since started: " + (midnight-start)); 
	}
}
