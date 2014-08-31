package chachichat.server;

import java.io.IOException;

import chachichat.packets.Packets;

import com.esotericsoftware.kryonet.Server;

public class ChatServer {
	
	private Server server;
	
	public ChatServer(int port) throws IOException {
				
		server = new Server();
		Packets.registerPackets(server.getKryo());
		server.start();
		server.addListener(new ServerListener(server));
		server.bind(port);
		
		System.out.println("Server running at port " + port + "...");
		
	}
		
}
