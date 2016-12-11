package Patterns.Facade;

/**
 * Created by JuanDavid on 26/10/16.
 */

class Poligono {

    private double radio;
    private int lados;

    Poligono(int lados, double radio) {
        this.lados = lados;
        this.radio = radio;
    }

    double getArea(){
        double result = this.radio*this.radio;

        if(lados==0)
            result *= Math.PI;
        else
            result *= this.lados*Math.sin(2*Math.PI/this.lados)/2;

        return result;
    }
}
