import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
 
public class FileClient  extends UnicastRemoteObject implements FileClientInt {

private static final long serialVersionUID = 1L;
public String name;
        public File f;
public  FileClient(String n) throws IOException {
super();
name=n;
                this.f=new File(name);
                f.createNewFile();
}
 
public String getName() throws RemoteException{
return name;
}
    
        public boolean receiveData(String data) throws Exception{

        FileOutputStream out=new FileOutputStream(f,true);
        out.write(data.getBytes());
        out.write(10);
        out.flush();
        out.close();
        System.out.println("Done writing data...");
        
return true;
}
}
