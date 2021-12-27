package InheritanceConcept;

public class C implements A, B {

	public static void main(String[] args) 
	{
		C a=new C();
		a.M1();

	}

	@Override
	public void M1() {
		System.out.println("Handling Multiple inheritance");
		
	}

}
