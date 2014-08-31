package chachichat.packets;

import com.esotericsoftware.kryo.Kryo;

public class Packets {
	
	public static void registerPackets(Kryo kryo) {
		
		kryo.register(String.class);
	    kryo.register(PacketMessage.class);
		
	}
	
	public static class PacketMessage {

		public String msg;
		
		public PacketMessage(String msg) {
			this.msg = msg;
		}

	}

}
