package Quest;

import java.io.IOException;


public class Q5 {
	public interface IQ5 {
		public void doThis();
	}
	
	public class CQ5 implements IQ5 {

		@Override
		public void doThis() throws IOException{
			throw new IOException();
			
		}
		
	}
}

/* A. Doesn't compile
 * B. Compile warning
 * C. Runtime Exception
 * D. Runs without output
 * 
 */
