package Quest;
import java.io.IOException;

public class Q4 {
	public interface IQ4 {
		public void doThis() throws ClassNotFoundException;
	}
	
	public class CQ4 implements IQ4 {

		@Override
		public void doThis() throws ArrayIndexOutOfBoundsException{
			throw new ArrayIndexOutOfBoundsException();
			
		}
		
	}
}

/* A. Doesn't compile
 * B. Compile warning
 * C. Runtime Exception
 * D. Runs without output
 * 
 */
