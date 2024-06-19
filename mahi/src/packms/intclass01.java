package packms;

public class intclass01 implements int11 {

	@Override
	public void phase1() {
		System.out.println("01");
		
	}

	@Override
	public void phase2() {
		System.out.println("02");
		
	}

	@Override
	public void phase3() {
		System.out.println("03");
		
	}

	@Override
	public void phase4() {
		System.out.println("04");
		
	}
	public static void main(String[] args) {
		intclass01 m=new intclass01();
		m.phase1();
		m.phase2();
		m.phase3();
		m.phase4();
	}

	

	

}
