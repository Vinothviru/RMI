import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
 
public class ProxyInternet  extends UnicastRemoteObject implements FileServerInt{
	String data;
	private static final long serialVersionUID = 1L;
	StringBuilder sb = new StringBuilder();
	FileClientInt c;
protected ProxyInternet() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
public void sendData() { 
	        	sb.append(data);
	        	sb.append('\n');
            	try {
					c.receiveData(sb.toString()); 
					sb.setLength(0);  
				} catch (Exception e) {
					
				}// the method will throw exception and stop..so we continuously add data till..the client comes online
	}

public void setData(String data) throws RemoteException
{
	this.data=data; 
	sendData();
}
//public String getData()
//{
//	return data;
//}

public void setClient(FileClientInt client)
{
	this.c=client;
}
}