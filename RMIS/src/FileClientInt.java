import java.rmi.Remote;
import java.rmi.RemoteException;
 //gud
public interface FileClientInt extends Remote{
 
public boolean receiveData(String line) throws Exception;

public String getName() throws RemoteException;
}

//public interface FileServerInt extends Remote{
// 
//public void sendData(String line) throws RemoteException;
//
//}  