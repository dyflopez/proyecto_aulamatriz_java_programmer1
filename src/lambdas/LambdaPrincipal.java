package lambdas;

import java.beans.Customizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaPrincipal {
    public static void main(String[] args) {
        /**
         *  Interfaz funcional : Solo puede tener un metodo abstracto
         *
         *  Una exresion lambda , implementa una interfaz funcional
         *  Lambda busca reducir al minimo la implementacion de las interfaces
         *
         *  Sintaxis
         *
         *  (parametros )-> logica
         *  (valor1,valor2 )-> logica
         *  (int a,int b  )-> logica
         *
         *  Ventajas de Lambda
         *
         *  Codifo Corto  : en una linea se define su comportamiento  o solucion
         *  Programacion funcional:  se enfoca en programacion reactiva (WebFlux) (LuloBank)
         *  Mucho mas facil la concurrencia o manejo de hilosyo
         *  Mayor redimiento
         *
         *
         *
         * Interfaces funcionales con labnda
         *
         * Predicate
         * Function
         * Cusumer
         * Supplier
         */


        /**
         *
         * Crear un programa que agregue 10 numeros ramdoms ,
         * se limpie con solo numeros pares
         */
        List<Integer> numbers = new ArrayList<>();

        Supplier<Integer> generateNumbes = ()-> (int) (Math.random()*100);

        //Consumer<String> addToList1 = (texto) -> lista.add(texto);
        Consumer<Integer> addNumberToList = numbers::add;
        Predicate<Integer> isPair = n -> n%2==0;
        for(int i=0;i<10;i++){
            addNumberToList.accept(generateNumbes.get());
        }
        //TODO FALLA CODIGO
        for (int number : numbers) {
            if (isPair.test(number)) {
                addNumberToList.accept(number);
            }
        }

       // numbers.forEach(nu -> System.out.println(nu));
        numbers.forEach(System.out::println);
    }
}
