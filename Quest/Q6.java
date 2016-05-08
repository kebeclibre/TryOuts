package Quest;

import Quest.Q6.CQ6;

public class Q6 {
	private abstract class AQ6 {
		public void doThis() {
			System.out.println("DoneIFace");
		}
	}
	
	private interface IQ6 {
		void doThis();
	}
	
	public class CQ6 extends AQ6 implements IQ6 {
		public CQ6() {super();}
		public void doThis() {
			System.out.println("DoneClass");
		}
	
	}
}



/* MAIN = CQ6 q6 = new Q6().new CQ6();
			q6.doThis();
			
 * A. Compile Error
 * B. Prints DoneIFace
 * C. Prints DoneClass
 * D. Prints B and C
 * E. Runtime Error
 */


