package Patterns;

import Patterns.Decorator.Empresa;
import Patterns.Singleton.Cliente;

/**
 * Created by JuanDavid on 27/10/16.
 */

public class CienteGeneral {

    public CienteGeneral() {
        Patterns.Singleton.Cliente clienteSingleton = new Cliente();
        Patterns.Facade.Cliente clienteFacade = new Patterns.Facade.Cliente();
        Patterns.Flyweight.Cliente clienteFlyweight = new Patterns.Flyweight.Cliente();
        Empresa clienteDecorator = new Empresa("Empresa1");

        clienteDecorator.metodo();
        clienteFacade.calcular();

    }
}
