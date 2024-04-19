package api.collection.colas;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeCollection {

    public static void main(String[] args) {

        Deque<String> names = new ArrayDeque<>();

        names.add("daniel");// Agrega a la cola
        names.add("yesid");// Agrega a la cola
        names.add("florez");// Agrega a la cola
        names.push("juan"); //Agrega a la pila
        names.addLast("Felipe");
        names.addLast("Jose"); //Agrega a la pila
        names.addFirst("Jose"); //Agrega a la pila


        names.removeFirst();

        //  juan daniel yesid  florez Felipe Jose


        names.forEach(System.out::println);






    }
}
