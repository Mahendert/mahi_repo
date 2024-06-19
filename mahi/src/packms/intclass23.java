package packms;

public class intclass23 implements int22{

	private static intclass23 ref;
	@Override
	public void pubg() {
		System.out.println("battle");
		
	}

	@Override
	public void race() {
		System.out.println("fifa");
		
	}

	@Override
	public void bike() {
	System.out.println("Hybusa");
		
	}

	@Override
	public void car() {
	System.out.println("Jaguar");
		
	}
	public static void main(String[] args) {
		intclass23.ref=new intclass23();
		ref.bike();
		ref.car();
		ref.pubg();
		ref.race();
	}
}

