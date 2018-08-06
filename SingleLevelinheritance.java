//Single level inheritance
class Fruit {
	Fruit() {
		System.out.println("Fruit");
	}

}

class Apple extends Fruit {
	Apple() {
		System.out.println("Apple");
	}
}

public class SingleLevelinheritance {
	public static void main(String args[]) {
		new Apple();
	}

}
