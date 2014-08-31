package chachichat.server;

import java.io.IOException;

import chachichat.packets.Packets;

import com.esotericsoftware.kryonet.Server;

public class ChatServer {
	
	private int port;
	private Server server;
	
	public ChatServer(int port) throws IOException {
		
		this.port = port;
		
		server = new Server();
		Packets.registerPackets(server.getKryo());
		server.start();
		server.addListener(new ServerListener());
		server.bind(port);
		
		
		System.out.println("Server running at port " + port + "...");
		
	}
		
}
