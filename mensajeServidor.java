// Sistermas Distribuidos 
// Giuseppe Carmigniani
// Tarea 04

import java.io.*;
import java.net.*;

// Esta clase utilizara el Servidor que recibira los numeros
public class mensajeServidor {

    // este puerto se utilizara para la comunicacion
    public static int puerto = 9999;

    public static void main(String[] args) {
        try {
            
            // El servidor se ejecutara 5 veces en total
            for (int veces = 5; veces > 0; veces--) {

                // Se crea un ServerSocket para esperar los mensajes
                ServerSocket ss = new ServerSocket(puerto);
                System.out.println("Esperando a recibir mensaje en el puerto: 9999");
                Socket s = ss.accept();

                // Se crea un data inputStream que espera el numero de parte del cliente
                DataInputStream dis = new DataInputStream(s.getInputStream());
                
                // Cuando llega el numero de formato Int, se lo lee y lo almacena
                int numeroAleatorio = (int) dis.readInt();

                String resultado = "";

                // Se agregan las X dependiendo del numero recibido
                for (int i = 0; i < numeroAleatorio; i++) {

                    resultado += "X";
                
                }

                // Se muestra el resultado1
                System.out.println("numero recibido: " + String.valueOf(numeroAleatorio));
                System.out.println(resultado);

                // Se cierra el puerto del servidor
                ss.close();

            }

            System.out.println("Fin de la ejecucion, cerrando el servidor");

        } catch (Exception e) {

            System.out.println("Hubo un error al crear el servidor");
            System.out.println(e);

        }
    }
}