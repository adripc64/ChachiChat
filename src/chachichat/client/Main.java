package chachichat.client;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la ip a la que desea conectarse: ");
		String ip = sc.next();
		int puerto = 7778;
		
		ChatClient cliente;
		
		try {
			cliente = new ChatClient(ip, puerto);
			System.out.println("Connecting to ip " + ip);
			cliente.sendMessage("Holaaaaa");
			//running(cliente, sc);
		} catch (IOException e) {
			System.out.println("Unable to connect to "+ip);
		}
		System.out.println("Closing conection...");
		sc.close();
	}
	
	public static void running(ChatClient client, Scanner sc) {
		String line = sc.nextLine();
		while (!line.equals("exit")) {
			client.sendMessage(line);
		}
	}

}
