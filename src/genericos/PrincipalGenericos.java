package genericos;

import api.collection.ejemplo1.model.Persona;
import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;

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


        System.out.println("**************************");

        List<String> nombres = new ArrayList<>();

        nombres.add("daniel");
        nombres.add("daniel");
        nombres.add("daniel");
        nombres.add("daniel");

        ListaGenerica.imprimir(nombres);

        List<Persona> empelados = new ArrayList<>();

        empelados.add(new Persona("String name", "String name", "String name", "String name", "String name"));

        ListaGenerica.imprimir(empelados);
    }
}
