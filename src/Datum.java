import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

/**
 * 
 * Dieses Interface bietet die Schnittstelle für getDate() an
 * 
 * @author Timo
 * 
 */

public interface Datum extends Remote {
	public String getDate() throws RemoteException;
}
