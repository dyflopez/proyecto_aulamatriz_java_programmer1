package concurrencia.tradicional;

public class MultitareaMain {
    /**
     * corrency  , Multi tarea , La capacdad de correr varios proceso al tiempo ,
     *
     * (Thread)
     *  MultiTarea tradicional : existen dos formas de crear los hilos
     *
     *  extent de la clase Thread
     *  implement la interfaz runnable
     *
     *
     *
     */

    public static void main(String[] args) {
       for(int i = 0;i< 2;i++){
            ExambleHerenciaThread hilo = new ExambleHerenciaThread();

            hilo.start();
        }
       /*for(int i = 0;i< 2;i++){
            Thread hilo = new Thread(new ExampleIMlmentRunnbale());
            hilo.start();
        }*/
    }
}
