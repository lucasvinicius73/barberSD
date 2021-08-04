import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.*;
public interface iBarber extends Remote{
    public void cortarCabelo(int id) throws InterruptedException,RemoteException;
    public void cortarBigode(int id) throws InterruptedException,RemoteException;
    public void cortarBarba(int id) throws InterruptedException,RemoteException;
}
