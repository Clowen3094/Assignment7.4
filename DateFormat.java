package session7_assignment4;
import java.util.Arrays;
import java.util.Scanner;
/*program which accepts the date (date month year), separated by
  comma / space or both and print the date the format of YYYY-MM-DD*/

public class DateFormat {
	public static void main(String[] args) {
		/*scanner class object is used to take a date
		  as input form user*/
		Scanner s = new Scanner( System.in );
		
		System.out.println( "Please enter a date in day, month, and year order:" );
		String date = s.nextLine();
		//converting and printing date into yyyy-mm-dd format
		date = date.replace( " ", "" );
		date = date.replace( ",", "" );
		
		String day = date.substring( 0, 2 );
		date = date.substring( 2 );
		
		String year = date.substring( date.length() - 4 );
		String month = date.substring( 0, date.length() - 4 );
		
		System.out.println( year + "-" + month + "-" + day );
		s.close();
	}
}