package genericos;

import java.util.List;

public class ImpersorLista {

    public  static <T> void imprimir(List<T> list){
        //list.forEach(System.out::println);
        for(T elemento : list){
            System.out.println(elemento);
        }
    }
}
