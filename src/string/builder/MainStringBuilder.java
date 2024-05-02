package string.builder;

public class MainStringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("Daniel");
        sb.append("yesid")
                .append("florez")
                .append("lopez")
                .append("suarez");

        System.out.println(sb);

        String cadena = sb.toString();

        //StringBuilder
        /**
         * Es una clase que nos da JAva que el cual permite la concatenacion
         * de cadenas de forma dinamica y mutable ;
         */


        // String vs StringBuilder
        String name ="";

        name += "daniel";

        /**
         * StrngBuilder
         *  Mutabilidad =  Es mutable y se puede modificar su contenido sin crear
         *  objetos nuevos
         *  Eficiencia = Eficiencia en concatenacion y modificacion de cadenas
         *  Uso Recomendado =  Cuando se necesita contruir multiples cadenas o asignaciones
         *  Sincrono =
         *
         *  String
         *  Mutabilidad = No es mutable, Cada vez crea un objeto nuevo
         *  Eficiencia = Menos eficiente cuando se va a realzar modificaciones
         *  con frecuencia
         *  Uso Recomendado  =  Cuando se require realizar operaciones o validaciones con las cadenas
         *                      Cuando el texto son cortos
         *                      Cuando no se requiere una alta manipulacion
         *
         */
        System.out.println("--------------");
        System.out.println(sb);
        String c = sb.toString();
        sb.delete(0,6);
        sb.delete(0,6);
        System.out.println(sb);


        System.out.println("*********");
        String cadenaNueva = c.substring(0,6);
        System.out.println(cadenaNueva);//Daniel
        System.out.println(c);//Danielyesidflorezlopezsuarez
        System.out.println("*****************");
        cadenaNueva =  sb.substring(0,5);
        System.out.println(cadenaNueva);//lorez
        System.out.println(sb);//lorezlopezsuarez

        System.out.println("Ejemplo 2");
        //holamundo  String , StringBuilder
        String saludo = "holamundo";
        String  cadenaInicial = saludo.substring(0,4) + " "+saludo.substring(4,9);
        System.out.println(cadenaInicial);
        StringBuilder  saludoB = new StringBuilder("holamundo");
        System.out.println("Solucion 2 ");
        saludoB.insert(4 ," ");
        System.out.println(saludoB);








    }
}
