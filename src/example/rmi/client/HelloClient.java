package example.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import example.rmi.server.HelloInterface;

public class HelloClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloInterface hello;
		try {
			hello = (HelloInterface)Naming.lookup("rmi://127.0.0.1:1099/HelloService");
			String msg=hello.sayHello("Hello World!");
			System.out.println(msg);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
