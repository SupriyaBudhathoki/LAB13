import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MathC extends UnicastRemoteObject implements Mathl {
    public MathC() throws RemoteException {
        super();
    }

    // public int add(int x, int y) throws RemoteException {
    //     return x + y;
    // }

    public int subtract(int x, int y) throws RemoteException {
        return x - y;
    }

    public int multiply(int x, int y) throws RemoteException {
        return x * y;
    }

    public float divide(float x, float y) throws RemoteException {
        if (y != 0) {
            return x / y;
        } else {
            throw new RemoteException("Zero divide problem.");
        }
    }

    public int factorial(int n) throws RemoteException {
        if (n < 0) {
            throw new RemoteException("Factorial can not be for negative number.");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

