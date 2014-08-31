package chachichat.client;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;

public class ClientListener extends Listener {
	
	@Override
	public void connected(Connection connection) {
	}
	
	@Override
	public void disconnected(Connection connection) {
	}
	
	@Override
	public void received(Connection connection, Object object) {
	}

}
