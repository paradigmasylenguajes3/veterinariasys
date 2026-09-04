# Parcial Práctico — Clínica Veterinaria Patitas

Proyecto base para el parcial práctico de **Paradigmas y Lenguajes III** (Unidades 2 y 3) — UNLaR, Licenciatura en Sistemas de Información.

Las consignas completas están en el **enunciado impreso** que le entregó la cátedra. Este archivo cubre únicamente cómo abrir y entregar el proyecto.

## Cómo abrir el proyecto

**NetBeans:** `File → Open Project` y seleccione la carpeta `veterinaria-parcial`. Es un proyecto Maven, se reconoce solo.

**Para ejecutar:** botón derecho sobre `Principal.java` → *Run File*. Es el único punto de entrada de la aplicación.

Requiere JDK 17 o superior. Si al compilar aparece `release version 17 not supported`, revise el JDK configurado en el proyecto.

## Qué contiene

```
src/main/java/ar/edu/unlar/veterinaria/
├── objects/          MODELO DE DOMINIO — NO MODIFICAR
│   ├── Persona.java        (abstracta)
│   ├── Cliente.java
│   ├── Veterinario.java
│   ├── Mascota.java
│   ├── Tratamiento.java
│   ├── Turno.java
│   ├── Especie.java        (enumeración)
│   ├── EstadoTurno.java    (enumeración)
│   └── Sistema.java        (singleton, ya cargado con datos de prueba)
└── ui/               AQUÍ TRABAJA USTED
    ├── Principal.java      ventana principal con el menú
    └── TurnoForm.java      registro de turnos
```

El `Sistema` viene con **un ejemplo de cada tipo** cargado. Completar el resto es parte del Punto 1.

## Dónde escribe usted

| Archivo | Qué completa |
|---|---|
| `objects/EstadoTurno.java` | Los valores de la enumeración (Punto 1a) |
| `objects/Sistema.java` | La carga inicial de datos (Punto 1b) |
| `ui/Principal.java` | Un único método: `jmiTurnosActionPerformed` (Punto 3) |
| `ui/TurnoForm.java` | El bloque de tratamientos y el código de la ventana (Puntos 2, 4 a 7) |

> **El proyecto entregado no compila.** `EstadoTurno` está vacía y `Turno` la usa. Completarla es el Punto 1a y es lo primero que hay que hacer.

## Reglas

- **Del paquete `objects` solo se tocan `EstadoTurno` y `Sistema`.** Las demás clases ya están completas y no deben modificarse.
- **No modifique el método `initComponents()`** de los formularios: las ventanas ya están diseñadas.
- Escriba únicamente en el constructor y en los métodos marcados con `// TODO`.

Cada `TODO` indica a qué punto del enunciado corresponde.

## Antes de entregar

1. Verifique que el proyecto **compila**: `Run → Clean and Build Project`.
2. Ejecute la aplicación y pruebe el flujo completo: abrir la ventana desde el menú, agregar tratamientos, guardar un turno, cerrar la ventana y volver a abrirla.
3. Comprima la carpeta completa del proyecto como `Apellido1_Apellido2.zip`.
4. Súbala al aula virtual.

> Un proyecto que no compila se corrige sólo por lectura del código y no puede superar el 50% del puntaje. Si un punto no le sale, deje ese método vacío y siga con los demás.
