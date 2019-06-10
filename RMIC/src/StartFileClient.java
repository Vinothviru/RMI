import java.rmi.Naming;
import java.util.Timer;
import java.util.TimerTask;
 
public class StartFileClient {

public static void task() throws Exception
{
	System.out.println("Listening....."); 
FileClient c=new FileClient("file.txt");	
FileServerInt server=(FileServerInt)Naming.lookup("rmi://10.51.5.123/abc"); //exception
server.setClient(c); 

}
public static void main(String[] args) {
	
	
try{
	task();//1
}catch(Exception e){
 e.printStackTrace();
	
	Timer timer = new Timer();
	TimerTask t=new TimerTask() { 
		
		
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				task();// 2
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
			}
		}
	};
    timer.schedule(t, 0, 10000);
//	final ScheduledExecutorService scheduler =
//		       Executors.newScheduledThreadPool(1);
//	final ScheduledFuture<?> beeperHandle =
//            scheduler.scheduleAtFixedRate((Runnable) server, 10, 10, SECONDS);
//        scheduler.schedule(new Runnable() {
//                public void run() { beeperHandle.cancel(true); }
//            }, 60 * 60, SECONDS);o
//    }
}
}	
 
}

