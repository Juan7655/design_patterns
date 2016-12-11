package Patterns.Facade;

/**
 * Created by JuanDavid on 26/10/16.
 */

class Prisma {

    private Poligono base;
    private double altura;

    Prisma(Poligono base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double getVolumen(){
        return base.getArea() * altura;
    }
}
