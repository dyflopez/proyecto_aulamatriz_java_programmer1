package lambdas.interfaz.funcional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ICustomer {
    public static void main(String[] args) {
        /**
         *
         *
         * Dispone de un metodo abstracto llamado accept
         * Se utiliza para el procesamiento de datos
         * Recobe un parametro y lo procesa
         *
         *
         */

        List<String> lista = new ArrayList<>();
        Consumer<String> addToList = lista::add;
        Consumer<String> addToList1 = (texto) -> lista.add(texto);
        Consumer<Integer> removeToList = lista::remove;
        Consumer<String> showMessage = System.out::println;

        addToList.accept("daniel");

        lista.forEach(System.out::println);
    }
}
