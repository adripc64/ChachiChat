package chachichat.server;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;

public class ServerListener extends Listener {

	@Override
	public void connected(Connection connection) {
		super.connected(connection);
		String ip = connection.getRemoteAddressTCP().getHostString();
		System.out.println("Nueva conexión desde: " + ip);
	}
	
	@Override
	public void disconnected(Connection connection) {
		super.disconnected(connection);
	}
	
	@Override
	public void received(Connection connection, Object object) {
		super.received(connection, object);
	}

}
