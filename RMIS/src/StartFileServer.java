import java.rmi.Naming;
import java.util.Scanner;
 
public class StartFileServer  {
public static void main(String[] args) {
// TODO Auto-generated method stub
try{

java.rmi.registry.LocateRegistry.createRegistry(1099);
ProxyInternet fs=new ProxyInternet();
Naming.rebind("rmi://10.51.5.123/abc", fs);
System.out.println("File Server is Ready");
Scanner s=new Scanner(System.in);	
while(true){
	String line=s.nextLine(); 
	fs.setData(line); 
}
}catch(Exception e){
e.printStackTrace();
}
}	
}
