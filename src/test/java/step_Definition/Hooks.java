package step_Definition;
import base.Mainclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Mainclass {
	//pre requisite 
		@Before
		public void loadbrowser() {
			initialization();
		}
		//	post requisite
		@After
		public void closebrowser () {
			teardown();
		}
}
