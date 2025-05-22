¿Cómo lo pensé?
Al analizar el problema, observé que se requería un sistema de combate simple entre dos personajes con comportamiento común (vida, ataque, nombre), pero con posibilidad de representar distintos tipos de personajes como un guerrero o un mago. Inmediatamente identifiqué que podía usar herencia para evitar repetir código y facilitar la escalabilidad del programa si se quisieran añadir más clases de personajes (como arquero, asesino, etc.).

Análisis del problema
Características comunes entre personajes:
Todos tienen un nombre.
Todos tienen puntos de vida (HP).
Todos pueden atacar y recibir daño.
Todos pueden verificar si están vivos o muertos.

Necesidad de especialización:
Aunque todos los personajes comparten comportamiento, diferentes clases como Mago o Guerrero podrían tener estilos distintos de ataque más adelante, por lo tanto se diseñaron como clases hijas que extienden una clase base Personaje.

Flujo del juego por turnos:
Se requiere una lógica que permita a los personajes alternar turnos.
El juego debe finalizar cuando uno de los personajes pierde toda su vida.
Este comportamiento debe estar separado de los personajes para seguir el principio de responsabilidad única, por lo que se crea una clase llamada JuegoLucha.

Estructura pensada
Clase base Personaje:
Contiene toda la lógica común de los personajes.
Métodos: atacar(), estaVivo(), getNombre(), getPuntosDeVida().
Clases hijas Mago y Guerrero:
Heredan de Personaje.
Por ahora usan el mismo método de ataque, pero están preparadas para tener comportamientos únicos si el juego se amplía.
Clase JuegoLucha:
Administra los turnos y el combate.
Verifica cuándo un personaje pierde y declara al ganador.

Ventajas de este diseño
Modularidad: Separar la lógica del juego de la lógica de los personajes permite entender mejor cada parte.
Escalabilidad: Se pueden agregar más personajes o habilidades sin reescribir todo.
Reutilización de código: La herencia permite compartir funcionalidades sin duplicarlas.
Claridad visual (UML): El uso del diagrama de clases ayuda a visualizar la jerarquía y relaciones.