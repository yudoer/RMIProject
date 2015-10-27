package example.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements HelloInterface {
	private String msg;
	public HelloImpl(String msg) throws RemoteException{
		this.msg=msg;
	}
	@Override
	public String sayHello(String msg) throws RemoteException {
		// TODO Auto-generated method stub
		this.msg=msg;
		return  this.msg;
	}

}
