//Inheritance at multilevel
class Meal {
	Meal() {
		System.out.println("Meal");
	}

}

class lunch extends Meal {
	lunch() {
		System.out.println("Lunch");
	}
}

class PortableLunch extends lunch {
	PortableLunch() {
		System.out.println("ProtableLunch");
	}
}

public class Multilevelheritance {
	public static void main(String args[]) {
		PortableLunch port = new PortableLunch();
	}

}
