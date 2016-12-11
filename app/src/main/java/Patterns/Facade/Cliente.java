package Patterns.Facade;

/**
 * Created by JuanDavid on 26/10/16.
 */

public class Cliente {
    private final Calculadora calculadora = new Calculadora();

    public Cliente() {

    }

    public void calcular(){
        calculadora.getArea(53,85.3);
        calculadora.getVolumen(12,34.2,67.123);
    }

}
