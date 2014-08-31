package chachichat.client;

import java.io.IOException;
import java.util.Scanner;

import com.sun.xml.internal.ws.resources.SenderMessages;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la ip a la que desea conectarse: ");
		String ip = sc.next();
		int puerto = 7778;
		
		ChatClient cliente = new ChatClient(ip, port);
		
		try {
			cliente = new ChatClient(ip, puerto);
			System.out.println("Conectando a la ip " + ip);
		} catch (IOException e) {
			System.out.println("Unable to connect to "+ip);
		}

		String texto = sc.next();
		while (texto != "exit"){
			cliente.sendMessage(texto);
		}
		
		
		sc.close();
	}

}
