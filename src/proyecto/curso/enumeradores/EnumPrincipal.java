package proyecto.curso.enumeradores;

import java.util.Arrays;

public class EnumPrincipal {
    public static void main(String[] args) {


        DaysOfWeek day = DaysOfWeek.LUNES;
              EnumPrincipal
                      .getDayOfWeek(DaysOfWeek.LUNES);


        for(DaysOfWeek da : DaysOfWeek.values()){
            System.out.println(da);
        }

        Arrays.stream(DaysOfWeek.values()).forEach(System.out::println);

        System.out.println( EstadoCivil.DIVORCIADO.getEstado());
    }

    public static  String getDayOfWeek( DaysOfWeek day){
       switch (day){
            case LUNES:
                return "hoy  es lunes";
           case MARTES:
               return "hoy  es lunes";
           case MIERCOLES:
               return "hoy  es lunes";
           default:
               return "es otro dia";
        }
    }
}
