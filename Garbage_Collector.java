package Pack_01;

class Animal {

	void disp() {
		System.out.println("Parent Class");
	}

}

class Chiled extends Animal {
	void disp() {
		System.out.println("Chiled Class");
	}

}

public class Garbage_Collector {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.disp();
//		a1 = null;
		if (a1 instanceof Animal) {
			a1.disp();
		}
		Chiled c1 = new Chiled();
		c1.disp();

	}
}
