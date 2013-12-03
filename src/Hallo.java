import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class Hallo extends UnicastRemoteObject implements Datum {

	private static final long serialVersionUID = 1L;

	protected Hallo() throws RemoteException {
		super();
	}

	
	
	@Override
	public String getDate() throws RemoteException {
		return "dies ist bloﬂ ein Test..cool es funktioniert :)";
	}

	public static void main(String arg[]) throws RemoteException {

		Datum test = new Hallo();

		// Namensdienst Starten
		LocateRegistry.createRegistry(1099);

		// Objekt beim Namensdienst registrieren
		Registry reg = LocateRegistry.getRegistry();
		reg.rebind("TestServer", test);

		System.out.println("Server wird Initialisiert");

	}

}
