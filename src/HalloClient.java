import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HalloClient {
	Registry reg;
	private Datum hello;

	public HalloClient() throws RemoteException, NotBoundException {

		// Referenz auf den Namensdienst. in diesem Fall default localhost
		reg = LocateRegistry.getRegistry();

		// objektrefferenz hohlen
		hello = (Datum) reg.lookup("TestServer");

		// remote Methoden Aufruf
		System.out.println(hello.getDate());
	}

	public static void main(String[] args) throws RemoteException,
			NotBoundException {
		new HalloClient();

	}

}
