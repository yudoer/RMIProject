package example.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloInterface extends Remote {
	/**
	 * 远程调用的方法要抛出远程调用异常
	 * @return
	 * @throws RemoteException
	 */
	public String sayHello(String msg) throws RemoteException;
}
