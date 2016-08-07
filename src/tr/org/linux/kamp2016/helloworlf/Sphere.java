package tr.org.linux.kamp2016.helloworlf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sphere {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kürenin yarıçapını giriniz:");
		try {
			//Sayı değilde başka bir şey girdiği zaman hata yememesi için  (hata yakalıyor)
		double yaricap = input.nextDouble(); //double biçiminde input aldı
		System.out.println("Hacim: " + kureHacmi(yaricap));
		}
		catch(InputMismatchException e) {
		   System.out.println("Başka birşey değil sayı gir!");
		}

	}
	
	public static double kureHacmi(double yaricap) {
		
		double hacim = (4.0 / 3.0) * Math.PI * Math.pow(yaricap,3);
		
	    return hacim;
	}

}
