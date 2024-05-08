package management.dates;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class MainManagmentDates {

    //ZonaId
    public static void main(String[] args) {

        // hora actual
        LocalDateTime ahora = LocalDateTime.now();

        //Definir la zonaActual
        ZoneId zonaActual = ZoneId.systemDefault();

        /// Definiendo la zona de Tokio
        ZoneId zonaTokio = ZoneId.of("Pacific/Apia");

        //Parsear  localDate time a ZonaDateTime COL
        ZonedDateTime zonaTime = ahora.atZone(zonaActual);

        //Convertir la fecha actual a la zona tokio
        ZonedDateTime zonaTimeTokio = zonaTime.withZoneSameInstant(zonaTokio);

        //Crear formato de fecha y hora

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaColombia = formato.format(zonaTime);
        String fechaTokio = formato.format(zonaTimeTokio);

        System.out.println(fechaColombia);
        System.out.println(fechaTokio);


        ZoneId ny = ZoneId.of("America/New_York");
        ZonedDateTime currentTime = ZonedDateTime.now(ny);
        System.out.println(ny + " " + currentTime);


    }
}
