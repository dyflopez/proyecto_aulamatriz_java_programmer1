package lambdas.interfaz.funcional;

import java.util.function.Function;

public class IFunction {
    public static void main(String[] args) {
        /**
         * tiene una interfas funcional llamada apply
         * Recibe una valor , lo procesa y retorna
         */
        Function<String,String> showHello = name -> "Hola rey " + name;

        System.out.println(showHello.apply("daniel"));

        Function<String,String> upperCase = String::toUpperCase;




    }
}
