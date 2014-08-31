package chachichat.packets;

import com.esotericsoftware.kryo.Kryo;

public class PacketUtils {
	
	public static void registerPackets(Kryo kryo) {
		
	    kryo.register(PacketMessage.class);
		
	}

}
