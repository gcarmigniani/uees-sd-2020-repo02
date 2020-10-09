
// Sistermas Distribuidos 
// Giuseppe Carmigniani
// Tarea 04

import java.io.*;
import java.net.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

// Esta clase utilizara el cliente para enviar los numeros al servidor
public class mensajeCliente {

    // este puerto se utilizara para la comunicacion
    public static int puerto = 9999;

    public static void main(String[] args) {

        try {

            // El cliente le enviara 5 numeros en total al servidor
            for (int veces = 5; veces > 0; veces--) {

                // Se crea un Socket, con la IP local del servidor, y el puerto
                Socket s = new Socket("10.0.2.4", puerto);

                // Se crea un Stream que enviara la informacion al servidor
                DataOutputStream dout = new DataOutputStream(s.getOutputStream());

                // Utilizamos Random para crear un numero al azar
                Random random = new Random();

                // la funcion .nextInt(10) crea un numero del 0 al 9, por lo que sumamos 1 al
                // final
                int numeroAleatorio = random.nextInt(10) + 1;

                dout.writeInt(numeroAleatorio);

                System.out.println("Enviando numero: " + numeroAleatorio);
                dout.flush();

                // Se cierra el Stream
                dout.close();

                // Se cierra el puerto
                s.close();

                // Se espera por 1 segundo antes de volver a enviar otro numero al servidor
                TimeUnit.SECONDS.sleep(1);

            }

            System.out.println("Fin de la ejecucion, cerrando el cliente");

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}