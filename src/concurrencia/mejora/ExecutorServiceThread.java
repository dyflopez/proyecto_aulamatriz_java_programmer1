package concurrencia.mejora;

import java.sql.Time;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceThread {

    /**
     * ExecutorService  : Proporciona metodos de lanzamiento y ejecuta las careas de forma concurrente
     *
     * newCachedThread :  ExecutorService.newCachedThread permite ejecutar hilos a demanda
     * newFixedThreadPool : ExecutorService.newFixedThreadPool crea un pool de hilos fijos
     * newSingleThreadExecutor : ExecutorService.newSingleThreadExecutor permite la ejecucion de un unico hilo
     * newShcaduledThreadPool : ExecutorService.newShcaduledThreadPool ejecuta tareas periodicas
     */

    public static void main(String[] args) {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(); // Permite ejecutar hilos a discrecion o dinamicamente
        ExecutorService newFixedThreadPool =  Executors.newFixedThreadPool(2); //limite de hilos
        ExecutorService newSingleThreadExecutor =  Executors.newSingleThreadExecutor(); // solo permite un unico hilo de ejecucion
        //  solamente puede usar un hilo Single - crear solo un hilo
        ScheduledExecutorService thread =  Executors.newSingleThreadScheduledExecutor();

        ScheduledExecutorService thread1 =  Executors.newScheduledThreadPool(1);
        thread1.scheduleWithFixedDelay(new ThreadCount(),5 ,10,TimeUnit.SECONDS);
        thread1.scheduleWithFixedDelay(new ThreadCount(),1 ,10,TimeUnit.SECONDS);
        thread1.scheduleWithFixedDelay(new ThreadCount(),0 ,10,TimeUnit.SECONDS);
       //Callable

    }
}
