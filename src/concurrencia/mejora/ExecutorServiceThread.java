package concurrencia.mejora;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.concurrent.*;

public class ExecutorServiceThread {

    /**
     * ExecutorService  : Proporciona metodos de lanzamiento y ejecuta las careas de forma concurrente
     *
     * newCachedThread :  ExecutorService.newCachedThread permite ejecutar hilos a demanda
     * newFixedThreadPool : ExecutorService.newFixedThreadPool crea un pool de hilos fijos
     * newSingleThreadExecutor : ExecutorService.newSingleThreadExecutor permite la ejecucion de un unico hilo
     * newShcaduledThreadPool : ExecutorService.newShcaduledThreadPool ejecuta tareas periodicas
     */

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(); // Permite ejecutar hilos a discrecion o dinamicamente
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2); //limite de hilos
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(); // solo permite un unico hilo de ejecucion
        //  solamente puede usar un hilo Single - crear solo un hilo

        Callable<Integer> sumValues = ()->{
            int sum=0;
            for (int i =0 ; i<2;i++){
                sum+=i;
                Thread.sleep(1000);
            }
            return  sum;
        };



        //
        ScheduledExecutorService thread = Executors.newSingleThreadScheduledExecutor();

        ScheduledExecutorService thread1 = Executors.newScheduledThreadPool(1);
        /*thread1.scheduleWithFixedDelay(new ThreadCount(),0 ,10,TimeUnit.SECONDS);
        thread1.scheduleWithFixedDelay(new ThreadCount(),1 ,10,TimeUnit.SECONDS);
        thread1.scheduleWithFixedDelay(new ThreadCount(),0 ,10,TimeUnit.SECONDS);*/


        ExecutorService hilo = Executors.newFixedThreadPool(1);

        FutureTask<Integer> task = new FutureTask<>(sumValues);


        Thread thread2 = new Thread(task);

        thread2.start();

        while (!task.isDone()){
            System.out.println("Esperando hilo");
        }
        System.out.println("suma*******");
        System.out.println(task.get());



        /*int i =0;
        while(i<10){
            System.out.println("ejecucion for oteracion " + i +" " + LocalDateTime.now());
            i++;
            Thread.sleep(2000);
        }*/

        /**
         * los hilos
         *
         *
         */

        //Callable
        //llamado al hilo Callable ----- demore n
        //Temrino --------
        //cocmo esta el hilo

    }
}
