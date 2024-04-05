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



}
