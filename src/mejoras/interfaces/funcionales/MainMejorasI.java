package mejoras.interfaces.funcionales;

import java.util.Random;
import java.util.function.Supplier;

public class MainMejorasI {
    public static void main(String[] args) {
        /**
         *  Las interfaces pueden tener un metodo default
         *  Las interfaces pueden tener metodos estaticicos
         *  que se pueden invocar utilizando el nombre de la interfaz
         *   (estos metoso no son implementados solo se usan)
         */

        //las exprecines lambda son identificadas con ->
        //Estructura de lambda
        /**
         * ()-> ...;
         * (valor, valor) -> ...;
         * (valor, valor) -> {....};
         */

        ICalculadora suma = (valor1, valor2) ->  valor1+valor2;
        ICalculadora resta = (valor1, valor2) ->  valor1-valor2;

        int restSum = suma.operacion(10,10);
        int restResta = resta.operacion(10,10);

        ICalculadora.showMessageStatic(restSum);
        Supplier<Integer>  generateRandomNumber = () -> new  Random().nextInt(100);

        System.out.println(generateRandomNumber.get());




    }

}
