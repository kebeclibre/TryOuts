package Quest;

public class Q2 {
	public static void doThis (int nume, Object...numbers) {
		for (Object num : numbers) {
			System.out.println(num);
		}
	}
	
	
	public static void doThat () {
		Number[] arr = {34, 76, 56};
		doThis(43,(Object)arr);
	}
	
}
/* One or More
 * A. Doesn't compile
 * B. Prints something of the form Number[]@XXXXXXX
 * C. Prints 34, 76, 56
 * D. Compile Warning
 *
 */


