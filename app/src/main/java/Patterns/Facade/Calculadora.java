package Patterns.Facade;

/**
 * Created by JuanDavid on 26/10/16.
 */

class Calculadora {

    Calculadora() {
    }

    double getArea(int lados, double radio) {
        Poligono p = new Poligono(lados, radio);

        return p.getArea();
    }

    public double getVolumen(int lados, double radio, double altura) {
        Poligono p = new Poligono(lados, radio);
        Prisma prism = new Prisma(p, altura);

        return prism.getVolumen();
    }
}
