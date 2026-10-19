
public class Exp16_1 {

	public static void main(String[] args) {
		Member member1=new Member();
		Member member2=new Member("あおい");
		Member member3=new Member("はると",500);
		
		member1.showInfo();
		System.out.println();
		member2.showInfo();
		System.out.println();
		member3.showInfo();
		
	}

}
