package chachichat.client;

import java.io.IOException;

import chachichat.packets.Packets;
import chachichat.packets.Packets.*;

import com.esotericsoftware.kryonet.Client;

public class ChatClient {
	
	private Client client;
	
	public ChatClient(String ip, int port) throws IOException {
		
		client = new Client();
		Packets.registerPackets(client.getKryo());
		client.start();
		client.addListener(new ClientListener());
	    client.connect(5000, ip, port);
	    
	}

	public void sendMessage(String msg) {
		
		//PacketMessage pck = new PacketMessage(msg);
		//client.sendTCP(pck);
		client.sendTCP(msg);
		System.out.println("Se ha mandado el mensaje: " + msg);
		
	}
	
}
