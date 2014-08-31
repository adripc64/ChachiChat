package chachichat.server;

import java.io.IOException;

import chachichat.packets.PacketUtils;

import com.esotericsoftware.kryonet.Server;

public class ChatServer {
	
	private int port;
	private Server server;
	
	public ChatServer(int port) throws IOException {
		
		this.port = port;
		
		server = new Server();
		server.start();
		PacketUtils.registerPackets(server.getKryo());
		server.bind(port);
		server.addListener(new ServerListener());
		
		System.out.println("Server running at port " + port + "...");
		
	}
		
}
