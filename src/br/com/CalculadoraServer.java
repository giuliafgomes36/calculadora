package br.com;

import java.rmi.Naming;

public class CalculadoraServer {
    CalculadoraServer() {
        try {
            Calculadora c = new CalculadoraImple();
            Naming.rebind("RMI://localhost:8080/CalculadoraService",c);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new CalculadoraServer();
    }
}
