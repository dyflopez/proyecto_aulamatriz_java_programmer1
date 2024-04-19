package lambdas.interfaz.funcional;

import api.collection.ejemplo1.model.Persona;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class IPredicate {

    /**
     * Tiene un metodo abstracto llamado test
     * Recibe un parametro y devuelve una comparacion boolean (true/false)
     */
    public static void main(String[] args) {

        Persona daniel = new Persona();

        daniel.edad=10;

        //Persona
        Predicate<Persona> validadAge = persona -> persona.edad < 18;
        if(!validadAge.test(daniel)){
            System.out.println("Se da tarjeta de credito");
        }else{
            System.out.println("denegado");
        }

        System.out.println("************");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0,10);

        Predicate<Integer> validateNumberPair =  n -> n%2==0;

        for(int numero :numbers){
            if(validateNumberPair.test(numero)){
                System.out.println(numero);
            }
        }



    }
}
