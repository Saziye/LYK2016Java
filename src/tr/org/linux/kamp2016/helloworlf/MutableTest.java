package tr.org.linux.kamp2016.helloworlf;

public class MutableTest {
	public static void main(String[] args) {
		
		Mutable mut= new Mutable(30); 
		Immutable immut = new Immutable(55);
		
		System.out.println(mut.getValue());
		
		mut.setValue(20);
		
		System.out.println(mut.getValue());
		System.out.println(immut.getValue());
		
		immut = new Immutable(11); //referans sabit tutularak yeni bir obje yarattık
		
		System.out.println(immut.getValue());
		
	}

}
