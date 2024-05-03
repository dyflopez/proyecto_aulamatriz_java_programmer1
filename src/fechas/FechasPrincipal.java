package fechas;

import javax.swing.text.DateFormatter;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class FechasPrincipal {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        LocalDateTime tomorrow = now.plusDays(1).plusMinutes(1);

        LocalDateTime fechaEspesifci = LocalDateTime.of(2023,11,10,14,32,12);


       Duration  salida = Duration.between(now,fechaEspesifci );

        System.out.println(salida.toHours());

        System.out.println(fechaEspesifci);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss" );
        String fecha = now.format(formatter);

        System.out.println(fecha);




    }

}
