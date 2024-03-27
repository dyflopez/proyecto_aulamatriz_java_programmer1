package clase.abstracta;

public class PrincipalAbstract {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        circulo.setRadio(2);

        System.out.println(circulo.calcularArea());

        circulo.mensaje();

    }
}
