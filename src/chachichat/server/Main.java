package chachichat.server;

import java.io.IOException;

public class Main {
	public static void main(String[] args){
		int puerto = 7778;
		try {
			new ChatServer(puerto);
		} catch (IOException e) {
			System.out.println("Error conecting to port: "+ puerto);
		}
	}
}
