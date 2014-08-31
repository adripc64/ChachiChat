package chachichat.server;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import com.esotericsoftware.kryonet.Server;

public class ServerListener extends Listener {
	
	private Server server;
	
	public ServerListener(Server server) {
		super();
		this.server = server;
	}

	@Override
	public void connected(Connection connection) {
		String ip = connection.getRemoteAddressTCP().getHostString();
		System.out.println("Nueva conexión desde: " + ip);
	}
	
	@Override
	public void disconnected(Connection connection) {
	}
	
	@Override
	public void received(Connection connection, Object object) {
		
		String ip = connection.getRemoteAddressTCP().getHostString();
		
		if (object instanceof String) {
			String msg = (String) object;
			System.out.println(ip + ": " + msg);
			for (Connection con : server.getConnections()) {
				con.sendTCP(ip + ": " + msg);
			}
			
		}
//		if (object instanceof PacketMessage) {
//			PacketMessage pck = (PacketMessage) object;
//			System.out.println(ip + ": " + pck.msg);
//		}
	}

}
