public class Data {
	public static void main(String[] args) {
		int year, date;
		String month, day;
		year = 2026;
		date = 16;
		month = "July";
		day = "Thursday";
		System.out.println("American Formatting: " + day + ", " + month + " " + date + ", " + year);
		System.out.println("Europian Formatting: " + day + " "  + date  + " "+ month + " "  + year);
		System.out.println("Gcd of year and date: " + gcd(year, date));
	}
	
	public static int gcd(int a, int b) {
		// a = qb + r, GCD(a,b) = GCD(b,r)
		int r = 1;
		while (r != 0) { 
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
