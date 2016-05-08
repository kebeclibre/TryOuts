package Quest;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import javax.swing.text.NumberFormatter;

public class Q7 {
	public Q7() {
	
	}
	
	public static void doThis() {
		String num1 = "1209.34,656";
		String num2 = "4543,435.234";
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("fr"));
		
		try {
			System.out.println(nf.parse(num2));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
/* A. Prints 1209.34
 * B. Prints 4543435.234
 * C. Prints 4543.435
 * D. Prints 4543.435234
 * E. Runtime Exception
 */

