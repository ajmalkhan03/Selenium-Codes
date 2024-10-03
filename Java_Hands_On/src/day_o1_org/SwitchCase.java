package day_o1_org;

public class SwitchCase {
	
	String myhero="ironman";
	
	private void guessmyhero() {
		switch(myhero) {
		case "ironman":
			System.out.println("thor is not Super hero");
		break;
		case "captainamerica":
			System.out.println("Captain America Not a Super Hero");
		case "ironmane":
			System.out.println("This One is Super Hero");
		default:
			System.out.println("Every one Is Not Matching");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchCase obj=new SwitchCase();
		obj.guessmyhero();
	}

}
