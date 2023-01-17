package university1_2;
class SingleA {
	private static SingleA myobj;

	private SingleA() {
		System.out.println("A");
	}

	static SingleA getObject() {
		if (myobj == null) {
			return myobj = new SingleA();
		}
		return myobj;
	}
}

public class SingletonClass {

	public static void main(String[] args) {

		SingleA.getObject();

	}

}