package interfaces;

/**
 *
 *Principios SOLID
 *
 *  S = Single Responsability = Responsabilidad Unica
 *  O = Abierto y cerrado = abierta para su extencion y cerrada para su modificacion
 * L =listkov =
 * I = Interface Segregations  = una clase no debe utilizar metodos que no necesite
 * D =  Arquitectura y Sprint boot
 */
public class CalculadoraBasica implements ICalculadora{

    @Override
    public double sumar(int valor1, int valor2) {
        return 0;
    }

    @Override
    public double resta(int valor1, int valor2) {
        return 0;
    }

    @Override
    public double multiplicacion(int valor1, int valor2) {
        System.out.println("ejemlo commit");
        return 0;
    }

    @Override
    public double division(int valor1, int valor2) {
        return 0;
    }

}
