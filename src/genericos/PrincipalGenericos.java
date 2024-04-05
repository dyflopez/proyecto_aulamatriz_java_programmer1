package genericos;

import com.sun.tools.javac.Main;

public class PrincipalGenericos {

    /**
     * Genericos
     *
     * Caracteristica del lenguaje que permite a los dev  crear clases, interfaces y
     * metodos que operan en tipos de datos sin espesificar el tipo.
     *
     * Los genericos permiten la creacion de codigo flexible y reutilizable  ya que
     * pueden trabajar con cualquier tipo de dato
     *
     *  Permite que una clase pueda operar con cualuiqe tipo de objeto
     *  Se emplea una letra para hcer referencia a una forma generica  T
     *  cuando se define un parametro generico se debe usar un operadorcomodin ?
     *
     *
     *  Ventajas
     *
     *  Codigo es mucho mas reutilable
     *  Legible
     *  Evita Casting
     *  Menor probabilidad de errores
     */


    public static void main(String[] args) {
        ListaGenerica<String>  stringListaGenerica= new ListaGenerica<>();
        stringListaGenerica.addElement("daniel");
        stringListaGenerica.addElement("yesid");
        System.out.println(stringListaGenerica.getElement(1));

        ListaGenerica<Integer>  integer= new ListaGenerica<>();
        integer.addElement(1);
        integer.addElement(2);
        System.out.println(integer.getElement(1));

    }
}
