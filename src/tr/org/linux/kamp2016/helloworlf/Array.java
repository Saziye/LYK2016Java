package tr.org.linux.kamp2016.helloworlf;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
	public static void main (String args[]) {
//		int a=1;
//		int b=5;
//		int c=6;
//		int total = a+b+c;
//		int[] erey = new int[3];
//		erey[0]=a;
//		erey[1]=b;
//		erey[2]=c;
//		int total2= erey[0]+erey[1]+erey[2];
//		System.out.println("Total2: " + total2);
//		System.out.println("Total1: " + total);
//		
//		int[] erey2 = new int[]{1,5,6};
//		int total3= erey2[0]+erey2[1]+erey2[2];
//		System.out.println("Total3: " + total3);
//		
//		int total4=0;
//		for(int i=0; i<erey.length; i++) {
//			total4= total4 + erey[i];
//		}
//		System.out.println("Total4: " + total4);
//		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz:");
		int inputNumber = input.nextInt();
		ArrayList ereylist5= new ArrayList();
		int counter=0;
		while(inputNumber != -1) {
			System.out.println("Bir sayi giriniz:");
			//int[] errey6 = new int [counter+1];
			//System.arraycopy(erey5, 0, errey6, 0, erey5.length+1);
			
			if(inputNumber != -1) {
				//erey5[counter] = inputNumber;
	//			ereyList5.add(inputNumber);
			}
			inputNumber = input.nextInt();
			
			counter++;
		}
	//	for(int i=0; i< ereyList5.size();i++) {
	//		System.out.println("Array Listin " + i + ".elemanı " + erreyList.get(i));
		}
//		for(int i=0; i<erey5.length; i++) {
//			System.out.println("Array'in " + i + ". elemanı: " + erey5[i]);
//		}
//		
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Bir değer giriniz:");
//		String inputString = input.next();
//		String[] erey5 = new String[5];
//		int counter=0;
//		while(!inputString.equals("çıkış")) {
//			System.out.println("Bir değer giriniz:");
//			if(!inputString.equals("çıkış")) {
//				erey5[counter] = inputString;
//			}
//			inputString = input.next();
//			
//			counter++;
//		}
//		for(int i=0; i<erey5.length; i++) {
//			System.out.println("Array'in " + i + ". elemanı: " + erey5[i]);
//		}
//		
//		
	}

//}
