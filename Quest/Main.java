package Quest;
import java.util.ArrayList;

import Quest.Q4.*;
import Quest.Q6.CQ6;

public class Main {

	public static void main(String... args) {
		Q1.doThat();
		Q2.doThat();
		Q3.doThat();
		CQ4 q4 = new Q4().new CQ4();
		//q4.doThis();
		CQ6 q6 = new Q6().new CQ6();
		q6.doThis();
		Q7.doThis();
		Q8.doThis();
	}

}
