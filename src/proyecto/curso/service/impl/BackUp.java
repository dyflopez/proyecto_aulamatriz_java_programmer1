package proyecto.curso.service.impl;

import java.io.*;

public class BackUp {

    public static void main(String[] args) {
        BackUp.create("names.txt");//Crear el archivo
        BackUp.readFile("names.txt");//Crear el archivo

    }



    //Manejo de archivos en java - IO
    /**
     * es importante trabajar con la escritura y lectura de archivos
     * para N actividades.
     *
     * En el manejo de arcivos tenemos los siguientes metodos
     *
     * FileWrite : Crear el objeto con el nombre del archivo
     * BufferedWrite : es objeto para escribir en el archivo
     *
     * metodos del BufferedWrite
     *
     * bufferedWrite.write : escribe en el arhivo
     * bufferedWriter.newLine : agrega una nueva linea
     * bufferedWriter.close : cerrar el BufferedWrite
     *
     *
     *
     */

    public static void create(String nombreArchivo){
        try {
            // se crea
            FileWriter fileWriter = new FileWriter(nombreArchivo);
            // se crea el buffer , todo lo que es buffer es de lectura o escritura
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Hola mundo\n");
            bufferedWriter.write("desde\n");
            bufferedWriter.write("mi consola\n");

            bufferedWriter.close();

            System.out.println("se creo el archivo");
        }catch (IOException e){
            System.out.println();
        }
    }

    /**
     *  tiene 3 metodos conocidos o elementales
     *
     *  FileReader : Cargar en memoria el archivo
     *  BufferReadrer: objeto que permite leer el archivo+
     *  buffedReader.readLine() : leer una linea
     */
    public static void readFile(String file){
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);

            String linea ;

            while ( (linea= br.readLine())  != null){
                System.out.println(linea);
            }
            br.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
