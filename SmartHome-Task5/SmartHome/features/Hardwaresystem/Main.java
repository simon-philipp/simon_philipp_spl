/**
 * TODO description
 */
public class Main {
	String hardwaresystem;
	
	Main() {
		hardwaresystem = "This is the Hardwaresystem you chose:";
	}
	
	void print() {
		System.out.println(hardwaresystem);
	}
	
	static Main me;
	
	public static void main(String[] args) {
		me = new Main();
		me.print();
	}
}