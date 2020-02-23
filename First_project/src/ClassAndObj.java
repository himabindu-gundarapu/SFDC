
public class ClassAndObj {

	public static void main(String[] args) {
		Test a = new Test();
		Test b = new Test();
		
		System.out.println(Test.numHands);
		System.out.println(Test.numHands);
		Test.numHands = 10;
		
		System.out.println(Test.numHands);
		System.out.println(Test.numHands);
		
		Test.numHands = 20;
		System.out.println(Test.numHands);
		System.out.println(Test.numHands);

	}

}
