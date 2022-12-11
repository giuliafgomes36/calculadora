package br.com;

import java.rmi.Naming;

public class CalculadoraClient {
    public static void main(String[] args) {
        try {
            Calculadora c = (Calculadora) Naming.lookup("//localhost:8080/CalculadoraService");
            System.out.println("Adição : "+c.add(20, 15));
            System.out.println("Subtração : "+c.sub(20, 15));
         }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
