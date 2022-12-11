package br.com;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImple extends UnicastRemoteObject implements Calculadora {
    protected CalculadoraImple() throws RemoteException {
        super();
    }

    @Override
    public long add(long a, long b) throws RemoteException {
        return a+b;
    }

    @Override
    public long sub(long a, long b) throws RemoteException {
        return a-b;
    }
}
