package chachichat.client;

import java.io.IOException;

import chachichat.packets.PacketMessage;
import chachichat.packets.PacketUtils;

import com.esotericsoftware.kryonet.Client;

public class ChatClient {
	
	private Client client;
	
	public ChatClient(String ip, int port) throws IOException {
		
		client = new Client();
	    client.start();
		PacketUtils.registerPackets(client.getKryo());
	    client.connect(5000, ip, port);
	    
	    sendMessage("jelouuuu!");
		
	}

	private void sendMessage(String msg) {
		
		PacketMessage pck = new PacketMessage(msg);
		client.sendTCP(pck);
		
	}
	
}
