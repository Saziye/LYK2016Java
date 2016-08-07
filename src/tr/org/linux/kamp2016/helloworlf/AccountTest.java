package tr.org.linux.kamp2016.helloworlf;

import java.util.Scanner;

public class AccountTest {

	public static void main(String args[]) {

		Account account1 = new Account("Ali Veli", 50.000);

		System.out.println(account1.getName() + " 'nin bakiyesi:" + account1.getBalance());

		Scanner input = new Scanner(System.in);

		System.out.println("Yatırmak istediğiniz para miktarını giriniz:");

		double depositAmount = input.nextDouble();

		System.out.println(depositAmount + "TL" + account1.getName() + "kişinin hesabına ekleniyor...");

		account1.deposit(depositAmount);

		System.out.println(account1.getName() + " 'nin bakiyesi:" + account1.getBalance());

	}
}
