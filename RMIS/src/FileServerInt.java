import java.rmi.Remote;
import java.rmi.RemoteException;
 
//gud
public interface FileServerInt extends Remote{
 
public void sendData() throws RemoteException;
public void setClient(FileClientInt client) throws RemoteException;

}  