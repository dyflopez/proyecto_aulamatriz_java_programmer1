package streams;

import api.collection.ejemplo1.model.Persona;


import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrincipalStreams {

    /**
     * Streams
     *
     *    Objeto que permite realizar de forma rapida y sensilla operaciones ;
     *      1) Busqueda
     *      2)  Fltrado
     *      3) Calculos
     *      4) Operaciones con el Collections
     *
     *      Para manipular un Stream se utiliza la interfaz Stream java.util.stream
     *      Stream : Recorre los datos desde el principio hasta el fin
     *      ***Una vez se cierra el Stream no se puede volver a usar***
     *
     *      Ventajas
     *
     *      1) Programacion declarativa : Permite escribir el odigo con un estilo mas comprensible y claro
     *      2) Operaciones funcionales : uso de interfaces funcionales ,
     *      3) Paralelismo :
     *      4) NO es mutable
     *      5) Tiene el manejo de altos volumenes de datos de una forma mas rapida
     *
     *
     *
     *    Streams tienen dos tipos de metodos
     *    1) Metodos intermedios :  Resuelven una operacion y develven un nuevo Stream
     *    2) Metodos finales:  Generan un resultado
     */
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(90);
        numeros.add(20);
        numeros.add(15);
        numeros.add(2);

        numeros.add(10);
        numeros.add(14);


        /**
         *  Dado un ArrayList , contar cuntos elementos tiene el arreglo
         */



        // Eliminen todos los elementos duplicados  / Muestren todos los elementos que no esten duplicados


        System.out.println(" impresion SET");
        Set<Integer> integerSet = new HashSet<>(numeros);

        integerSet.forEach(System.out::println);

        // STREAM
        System.out.println("******distinct*****");
        Stream<Integer>  noDuplicados= numeros.stream();

        // Forma 1
        noDuplicados
                .distinct()  // intermedio
                .forEach(System.out::println); // FINAL


        noDuplicados= numeros.stream();
        //Forma 2
        var listNotDuplicate = noDuplicados
                                .distinct()
                                .toList();

        System.out.println(listNotDuplicate);
        //Forma 3
        numeros
                .stream()
                .distinct()
                .forEach(System.out::println);

        // Crear un predicate
        Predicate<Integer> validateMayorEdad =n -> n > 18;
        //anyMatch:  Devuelve true si algun elemento cumple la condicion del predicado
        boolean existeMayoresEdad = numeros
                .stream()
                .anyMatch(validateMayorEdad);

        System.out.println(existeMayoresEdad);
        //allMatch: Devuelve true si todos los elementos cumplen con el predicado
        boolean todosSonMayorEdad = numeros
                .stream()
                .allMatch(validateMayorEdad);
        System.out.println(todosSonMayorEdad);

        // nonMatch  = Devuelve true si ninguno cumple con la condicion
        boolean todosSonMenores  = numeros
                .stream()
                .noneMatch(validateMayorEdad);
        System.out.println(todosSonMenores);

        // Quiero todos los registros que sean mayores de edad (>18)
       List<Integer> mayores = numeros
                .stream()
                .filter(validateMayorEdad)
               // .collect(Collectors.toList());
                .toList();

       // find Buscar    -  findFirst
         numeros
                .stream()
                .filter(validateMayorEdad)
                .findFirst();
        System.out.println("**********************");
        var dato= numeros
                .stream()
                .filter(validateMayorEdad)
                .findAny();

        System.out.println("*****************" +dato.get());

        //Metodo llamado mapToInt
        List<String> nombres = new ArrayList<>();
        nombres.add("daniel");  //6
        nombres.add("yesid"); // 5
        nombres.add("florez"); // 6
        nombres.add("lo"); //2

        System.out.println("******* mapToInt");
        nombres
                .stream()
                .mapToInt(String::length)
                .forEach(System.out::println);

        //Metodo MAP  crear un nuevo tipo de Stream dato por dato

        nombres
                .stream()
                .map(nombre -> nombre+" "+ nombre.length())
                .forEach(System.out::println);


        System.out.println("*************MAP************");
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto(1,20,"Samsumng",1000000,true));
        productos.add(new Producto(1,90,"Iphone",20000,true));
        productos.add(new Producto(1,70,"MAc book",20000,true));
        productos.add(new Producto(1,34134,"Tablet",20000,true));
        productos.add(new Producto(1,1,"motorola",1000000,false));

        productos
                .stream()
                .filter(Producto::isActive)
                .filter(producto -> producto.getStock() >10)
                .limit(2) // Dos primeros
                .skip(1)//Ignore el primero
                .map(producto -> new InformeProductos(producto.getName(),producto.getStock()))
                .peek(System.out::println)
                .mapToInt(InformeProductos::getStock)
                .sum();


       String productosString =  productos
                .stream()
                .filter(Producto::isActive)
                .map(producto -> new InformeProductos(producto.getName(),producto.getStock()))
                .peek(System.out::println)
                .map(InformeProductos::getProductName)
                .collect(Collectors.joining(","));
        ;

        System.out.println(productosString);


        productos
                .stream()
                .filter(Producto::isActive)
                .filter(producto -> producto.getStock() >10)
                .map(producto -> new InformeProductos(producto.getName(),producto.getStock()))
                .peek(System.out::println)
                .mapToInt(InformeProductos::getStock)
                .max();



        // Ejercicios

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num * num;
            }
        }
/// Dada una lista de nombres, encuentra el nombre más largo. si no retornar , ninguno
    }

    public static List<Persona> countStatus (List<Persona> personas , String estado){

        return  personas
                .stream()
                .filter(persona -> persona.getEstado().equalsIgnoreCase(estado))
                .toList();
    }
}
