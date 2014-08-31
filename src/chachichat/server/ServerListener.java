package chachichat.server;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;

public class ServerListener extends Listener {

	@Override
	public void connected(Connection connection) {
		super.connected(connection);
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
