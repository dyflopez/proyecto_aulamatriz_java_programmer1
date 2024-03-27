package herencia;

public class Circulo extends  Figura{

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    @Override
    public double calcularArea() {
        System.out.println("llamado desde circulo");
        return  Math.PI * Math.pow(radio,2)+2;
    }

    public int calcularRadio(){
        return (int) radio;
    }

    public int calcularRadio(int radioAuc){
        return (int) radio+radioAuc;
    }
}
