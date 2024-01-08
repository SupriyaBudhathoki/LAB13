
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Mathl extends Remote {
    
    //int add(int x, int y) throws RemoteException;
    int subtract(int x, int y) throws RemoteException;
    int multiply(int x, int y) throws RemoteException;
    float divide(float x, float y) throws RemoteException;
    int factorial(int n) throws RemoteException;
}
