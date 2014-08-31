package chachichat.client;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca la ip a la que desea conectarse: ");
		String ip = sc.next();
		System.out.println("Conectando a la ip " + ip);
		sc.close();
	}

}
