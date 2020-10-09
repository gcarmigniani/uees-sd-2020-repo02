# uees-sd-2020-repo02
# Giuseppe Carmigniani

## Instalacion

Para ejectuar el programa, es necesario tener el Java JRE y JDK, para lo cual se puede usar los siguientes comandos

```
sudo apt install default-jre
sudo apt install default-jdk
```
## Compilacion

En la maquina del servidor, se debe compilar el archivo mensajeServidor.java usando el commndo

```
javac mensajeServidor.java
```

Para el cliente, se compila el archivo mensajeCliente.java usando el comando
```
javac mensajeCliente.java
```

De ser necesario, el mensajeCliente.java debe ser modificado ingresando el puerto y la ip del servidor

## Ejecucion

Una vez compilados los archivos java, primero se inicia la maquina del servidor usando el comando
```
java mensajeServidor
```

Ahora se ejecuta el programa del lado del cliente, usando el comando
```
java mensajeCliente
```

Automaticamente el cliente enviara los mensajes al servidor, y este mostrara el resultado.
