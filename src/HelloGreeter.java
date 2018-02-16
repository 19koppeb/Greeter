
public class HelloGreeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeter bob = new Greeter();
		System.out.println(bob.toString());
		
		Greeter[] tim = new Greeter[10];
		for(int i = 0; i<tim.length;i++) {
			System.out.println(tim[i].toString());
		}
	
	
	
	}

}
