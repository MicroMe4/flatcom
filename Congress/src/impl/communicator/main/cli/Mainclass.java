package impl.communicator.main.cli;

import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import impl.communicator.essential.NetworkInstance;
public class Mainclass {
	/*Test Code To Generate IPs in differnet NIC.*/
	public static void main(String args[]) throws UnknownHostException, SocketException {
		NetworkInstance ni=new NetworkInstance();
		InetAddress[] nis=ni.getAllIP();
		for(int i=0;i<nis.length;i++) {
			System.out.println("Address " + (i + 1) + ":" + nis[i].getHostAddress());
		}
	}
}
