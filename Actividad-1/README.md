# Actividad 2 - Estructura de Datos
## Sistema de Gestión de Comandos y Procesos

Este proyecto implementa un sistema interactivo que utiliza estructuras de datos fundamentales Pila, Cola, Nodos y Listas enlazadas para gestionar comandos y procesos mediante una interfaz de menú.

### Funcionalidades Principales

1. **Ejecutar Comando** - Agregar comandos a la pila
2. **Agregar Proceso** - Agregar procesos a la cola
3. **Procesar Comando** - Ejecutar (eliminar) el último comando de la pila
4. **Realizar Procesos** - Procesar (eliminar) el primer proceso de la cola
5. **Mostrar Historial** - Visualizar todos los comandos en orden inverso (LIFO)
6. **Mostrar Ejecución** - Visualizar todos los procesos en orden directo (FIFO)
7. **Salir** - Terminar el programa

### Componentes

- **`Node<E>`**: Nodo genérico que almacena datos y referencias a otros nodos
- **`LinkedList`**: Lista enlazada que sirve como base para Stack y Queue
- **`Stack<E>`**: Pila genérica con operaciones LIFO (push, pop, peek)
- **`Queue<E>`**: Cola genérica con operaciones FIFO (enqueue, dequeue, peek)
- **`Mainact1`**: Clase principal que maneja la interfaz de usuario

## Compilación y Ejecución

### Prerrequisitos
- Java Development Kit (JDK) 8 o superior
- Terminal/Línea de comandos

### Pasos para Compilar

1. **Navegar al directorio del proyecto:**
   ```bash
   cd /ruta/a/Estructura-de-Datos/Actividad-1
   ```

2. **Compilar todos los archivos Java:**
   ```bash
   javac src/*.java
   ```

   O compilar individualmente:
   ```bash
   javac src/Node.java
   javac src/LinkedList.java
   javac src/Stack.java
   javac src/Queue.java
   javac src/Mainact1.java
   ```

### Pasos para Ejecutar

1. **Ejecutar el programa principal:**
   ```bash
   java -cp src Mainact1
   ```

2. **Usar el menú interactivo:**
   ```
   *----------* Menu *------------*
   | 1.- Ejecutar Comando         |
   | 2.- Agregar Proceso          |
   | 3.- Procesar Comando         |
   | 4.- Realizar Procesos        |
   | 5.- Mostrar Historial        |
   | 6.- Mostrar Ejecucion        |
   | 7.- Quit                     |
   *------------------------------*
   | Elija una Opcion:
   ```

## Guía de Uso

### Agregar Comandos (Opción 1)
```
| Para salir Introduzca exit
| [usuario@computadora:~]$ ls -la
| [usuario@computadora:~]$ mkdir
| [usuario@computadora:~]$ grep file.toml 
| [usuario@computadora:~]$ exit
```

### Agregar Procesos (Opción 2)
```
| Para salir Introduzca exit
| [usuario@computadora:~]$ vim
| [usuario@computadora:~]$ emacs
| [usuario@computadora:~]$ exit
```

### Ejecutar Comandos (Opción 3)
- Ejecuta y elimina el último comando agregado (LIFO)

### Procesar Procesos (Opción 4)
- Procesa y elimina el primer proceso agregado (FIFO)

### Visualizar Historial (Opción 5)
- Muestra comandos en orden inverso: `comando3 <-- comando2 <-- comando1`

### Visualizar Ejecución (Opción 6)
- Muestra procesos en orden directo: `proceso1 --> proceso2 --> proceso3`

# Características Técnicas

### Estructuras de Datos Implementadas

**Pila (Stack)**
- Operaciones: `push()`, `pop()`, `peek()`, `isEmpty()`, `size()`
- Principio: LIFO (Last In, First Out)
- Uso: Gestión de comandos

**Cola (Queue)**
- Operaciones: `enqueue()`, `dequeue()`, `peek()`, `isEmpty()`, `size()`
- Principio: FIFO (First In, First Out)
- Uso: Gestión de procesos

**Lista Enlazada (LinkedList)**
- Soporte para navegación bidireccional
- Métodos de impresión en ambas direcciones
- Base para Stack y Queue

### Manejo de Errores
- Validación de entrada del usuario
- Manejo de pilas/colas vacías
- Mensajes de error en español
