import java.util.concurrent.TimeUnit;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class Barber implements iBarber {
    public static void main(String[] args) {
        try {
			System.out.println("Iniciando Barbeiro...");
			Barber server = new Barber();
			iBarber stub = (iBarber) UnicastRemoteObject.exportObject(server, 0);
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("Barber", stub);
			System.out.println("Barbeiro pronto");

		} catch (Exception e) {
			// TODO: handle exception
		}
        
    }
    public void cortarCabelo(int id) throws InterruptedException,RemoteException {
        System.out.println("Cortando cabelo do cliente: ");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Corte do cliente " + "Finalizado");
        
        
    }
    public void cortarBarba(int id) throws InterruptedException,RemoteException {
        System.out.println("Cortando barba do cliente: ");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("Corte de barba do cliente " + "Finalizado");
        
    }
    public void cortarBigode(int id) throws InterruptedException,RemoteException {
        System.out.println("Cortando bigode do cliente: ");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Corte de bigode do cliente " + "Finalizado");
    }
}
