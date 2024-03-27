package clase.abstracta;

public abstract class FiguraAbstract {

    abstract double calcularArea();
    abstract double calcularPerimetro();

    public  final void mensaje(){
        System.out.println("mensaje");
    }

}
