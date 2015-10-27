package example.rmi.server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class HelloServer {

	/**
	 * 启动注册服务 注册对象
	 * @param args
	 */
	public static void main(String args[]){
		
		final int port=1099;
		try {
			LocateRegistry.createRegistry(port);
			
			HelloInterface hello=new HelloImpl("Hello World");
			
			try {
				Naming.rebind("rmi://127.0.0.1:"+port+"/HelloService",hello);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hello service starts");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
