package impl.communicator.essential;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class NetworkInstance {
	public NetworkInstance() {
		
	}
	public InetAddress[] getAllIP() throws SocketException {
		List<InetAddress> allIP=new ArrayList<InetAddress>();
		InetAddress singIP=null;
		for(Enumeration<NetworkInterface> netInterfaces=NetworkInterface.getNetworkInterfaces();netInterfaces.hasMoreElements();) {
			// Get Interfaces with lo/ethernet/wireless;
			NetworkInterface cur=netInterfaces.nextElement();
			for(Enumeration<InetAddress> curadd=cur.getInetAddresses();curadd.hasMoreElements();) {
				singIP=curadd.nextElement();
				allIP.add(singIP);
			}
		}
		return (InetAddress[])allIP.toArray(new InetAddress[0]);
	}
}
