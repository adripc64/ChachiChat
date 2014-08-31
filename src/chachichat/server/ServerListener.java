package chachichat.server;


import chachichat.packets.Packets.*;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;

public class ServerListener extends Listener {

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
		System.out.println("asdfadfas");		
		String ip = connection.getRemoteAddressTCP().getHostString();
		
		if (object instanceof String) {
			String msg = (String) object;
			System.out.println(ip + ": " + msg);
		}
		if (object instanceof PacketMessage) {
			PacketMessage pck = (PacketMessage) object;
			System.out.println(ip + ": " + pck.msg);
		}
	}

}
