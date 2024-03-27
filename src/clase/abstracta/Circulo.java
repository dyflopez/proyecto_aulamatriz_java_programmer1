package clase.abstracta;



public class Circulo extends FiguraAbstract {

    private double radio;

    @Override
    double calcularArea() {
        System.out.println("llamado desde circulo");
        return  Math.PI * Math.pow(radio,2)+2;
    }

    @Override
    double calcularPerimetro() {
        return 0;
    }



    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
