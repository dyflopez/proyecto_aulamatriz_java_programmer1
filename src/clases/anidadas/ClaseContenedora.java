package clases.anidadas;
//inner classes
public class ClaseContenedora {
    /**
     * Clase que esta declarada dentro de otra clase
     *
     * La clase principal tiene acceso a los la clase contenedora,
     * clase puede tener accecibilidad(oublic , private, protegido , defaul
     */
    private int datoExterno;

    public class ClaseInterna2{
        public void  mostrarDatoExterno(){
            System.out.println(datoExterno);
        }
    }

    public static void main(String[] args) {
        ClaseContenedora claseContenedora = new ClaseContenedora();

        ClaseContenedora.ClaseInterna2 inner = claseContenedora.new ClaseInterna2();
        //ClaseContenedora.ClaseInterna2 inner = new ClaseInterna2();
        ClaseInterna2 inner2 = claseContenedora.new ClaseInterna2();

        inner.mostrarDatoExterno();
        inner2.mostrarDatoExterno();
    }
}
