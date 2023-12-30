package Pack_01;

enum Day {
	Sun, Mon, Tue, Wed, Thur, Fri, Sat,;
	int num;
Day(){
	
	num++;
	System.out.println("Enum Constructor  "+num);
}
}

public class Enum_Demo {
	public static void main(String[] args) {

		Abc ob = new Abc();
//		Beer [] b1=Beer.values();
		Day obj = Day.Sun;

		
		System.out.println(obj);
//		for (Day ab : obj) {
//			
//			System.out.println(ab );
////		}
	}
}
