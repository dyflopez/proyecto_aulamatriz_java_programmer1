package api.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listasDinamicas {

    public static void main(String[] args) {
        //ArrayList  = Lista infinita de registros o es una lista dinamica
        //Mutable = > Puede cambiar
        //Inmutable =>  no cambia o no puede ser modificado
        //List<?> nombreLista = new ArrayList<>();
        List<Integer> numberList = new ArrayList<>();
        //Agregacion
        numberList.add(1);
        //Recuperar
        numberList.get(0);
        //tamaño del arreglo
        var tamano = numberList.size();
        System.out.println(tamano);
        //eliminar un elemento o posicion
        numberList.remove(0);
        // validar un registro
        boolean isFound = numberList.contains(10);
        //Eliminar la lsita
        numberList.clear();
        //Inicializar lista
        List<String> frutas= new ArrayList<>(Arrays.asList("apple","bannana","orange"));
        for(String fruta : frutas){
            System.out.println(fruta);
        }
        System.out.println("**********Segundo recorrido*********");

        numberList.add(10);
        //segunda forma
        for(int i =0; i<numberList.size();i++){
            System.out.println(numberList.get(i));
        }
        //forma avanzada 1
        numberList.forEach(variable -> System.out.println(variable));
        //forma avanzada 2
        numberList.forEach(System.out::println);
        //forma avanzada 3
        numberList
                .forEach(variable -> {
                    System.out.println("recorriendo numeros");
                    System.out.println(variable);
                });
        //Exreciones lambda
        // () -> {}
        // (valor,valor) -> {}
        // valor -> proceso


    }
}
