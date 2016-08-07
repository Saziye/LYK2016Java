package tr.org.linux.kamp2016.helloworlf;

import java.util.ArrayList;

public class AnimallTest {

	public static void main(String[] args) {

		Animall bird = new Animall("Maviş", 2 , "kuş");
		Animall dog = new Animall("Çomar", 3 , "kopek");
		Animall human = new Animall("Mahmut", 5 , "insan");
		
		Animall bird1 = new Animall("Maviş", 2 , "kuş");
		Animall dog1 = new Animall("Çomar", 3 , "kopek");
		Animall human1 = new Animall("Mahmut", 5 , "insan");
		
		Animall bird2 = new Animall("Maviş", 2 , "kuş");
		Animall dog2 = new Animall("Çomar", 3 , "kopek");
		Animall human2 = new Animall("Mahmut", 5 , "insan");
		
		ArrayList erreyList = new ArrayList();
		erreyList.add(bird);
		erreyList.add(dog);
		erreyList.add(human);
		
		erreyList.add(bird1);
		erreyList.add(dog1);
		erreyList.add(human1);
		
		erreyList.add(bird2);
		erreyList.add(dog2);
		erreyList.add(human2);
		
		for(int i=0; i<erreyList.size();i++) {
			System.out.println(erreyList.get(i));
		}
		
		System.out.println(bird.toString());
		System.out.println(dog.toString());
		System.out.println(human.toString());
		
		human.setAge(6);
		System.out.println(human.toString());
		
	}

}
