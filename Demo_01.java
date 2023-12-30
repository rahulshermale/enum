package Pack_01;


enum Beer{
	Sun,Mon,Tue,Wed,Thur,Fri,Sat;
	
}
class Abc {
}
public class Demo_01 {
public static void main(String[] args) {
	
	Abc ob= new Abc();
	Beer obj=Beer.Tue;
	
//String	day[]= {"Sun","Mon","Friday"};
	switch(obj) {
	
	case Sun:
		System.out.println("sunday");
		break;
	case Mon:
		System.out.println("Monday");
		break;
	case Tue:
		System.out.println("Tuesday");
		break;
	case Wed:
		System.out.println("Wednesday");
		break;
	case Thur:
		System.out.println("Thursday");
		break;
	case Fri:
		System.out.println("Friday");
		break;
	case Sat:
		System.out.println("Saturday");
		break;
		
	default :
			System.out.println("Default");
	}
}
}
