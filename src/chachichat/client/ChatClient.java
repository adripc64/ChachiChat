package chachichat.client;

import java.io.IOException;

import com.esotericsoftware.kryonet.Client;

public class ChatClient {
	
	private Client client;
	
	public ChatClient(String ip, int port) throws IOException {
		
		client = new Client();
	    client.start();
	    client.connect(5000, ip, port);
		
	}
	
	private void registerPackets() {
		
	}

}
