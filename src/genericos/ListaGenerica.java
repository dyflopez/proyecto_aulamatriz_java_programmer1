package genericos;

import java.util.ArrayList;
import java.util.List;

//List<String>
//List<Integer>
//List<T>
public class ListaGenerica<T> {


    private List<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }

    public T getElement(int index){
        return list.get(index);
    }

    public  static <T> void imprimir(List<T> list){
        //list.forEach(System.out::println);
        for(T elemento : list){
            System.out.println(elemento);
        }
    }



}
