# Registro XP - Equipo Echo
Repositorio: https://github.com/karolSalazar03/ECHO_RESERVAS.git
Integrantes y usuarios GitHub: 
- Rommel Rivera (RommelRAM)
- Isabel Farinango (Aizel-Shadow)
- Kevin Alvear (kevin-Alvear)
- karolina Salazar (karolSalazar03)

## Cliente y objetivo de valor
Evitar conflictos al reservar una única sala de estudio mediante la gestión automatizada en memoria de tres bloques horarios (A, B y C) asociados al código del estudiante, garantizando exclusividad y capacidad de cancelación.

## Valores XP observables
1. **Comunicación y retroalimentación:** Coordinación constante entre las parejas para definir la estructura de las clases `BookingPolicy` y `CancellationPolicy` sin alterar el contrato base de `Reservations`.
2. **Simplicidad:** Enfoque estricto en resolver únicamente las historias de usuario solicitadas en memoria, evitando sobreingeniería, bases de datos o frameworks adicionales innecesarios.

## Responsabilidades flexibles
Pareja 1 (HU-01): Integrante 1 / Integrante 2 | Pareja 2 (HU-02): Rommel Rivera / Aizel Salazar
Facilitación: Integrante 1 | Seguimiento: Rommel Rivera | Consulta al cliente: Kevin Alvear
Las responsabilidades pueden cambiar durante el examen.

## Historias, aceptación y estimaciones
| Historia | Prioridad | Estimación relativa | Criterios de aceptación | Tareas |
|---|---|---|---|---|
| HU-01 | Alta | 26 pts | Reserva válida devuelve true y bloquea el slot; segundo intento en mismo bloque devuelve false; bloque inválido o estudiante nulo/vacío devuelve false. | 1. Escribir test JUnit para reserva exitosa.<br>2. Implementar lógica en BookingPolicy.<br>3. Verificar pruebas en verde. |
| HU-02 | Media | 17 pts | Cancelar con titular y bloque correcto devuelve true y libera el slot; cancelar bloque libre o por otro usuario devuelve false. | 1. Escribir test JUnit para cancelación.<br>2. Implementar lógica en CancellationPolicy.<br>3. Validar integración. |

## Tablero mínimo
| Por hacer | En curso | Terminado |
|---|---|---|
| Ninguna tarea pendiente. | Ajustes finales y verificación de PRs. | - Configuración de repositorio base<br>- Implementación HU-01 y pruebas<br>- Implementación HU-02 y pruebas<br>- Documentación en XP_REGISTRO.md |

## Prácticas técnicas
Evidencia RED (prueba inicial que falla, momento o commit): Pruebas JUnit iniciales diseñadas para fallar antes de codificar la lógica de políticas de reserva y cancelación.
Evidencia GREEN (prueba que pasa después, momento o commit): Ejecución exitosa de `mvn test` posterior a la implementación del código mínimo requerido.
Refactorización o decisión de simplicidad: Separación de responsabilidades en `BookingPolicy.java` y `CancellationPolicy.java` para evitar conflictos de mezcla en Git.

## Git / revisión / CI
PR HU-01: https://github.com/karolSalazar03/ECHO_RESERVAS/pull/... | Revisor distinto del autor: Rommel Rivera / Kevin Alvear
PR HU-02: https://github.com/karolSalazar03/ECHO_RESERVAS/pull/... | Revisor distinto del autor: Compañero de Pareja 1
Resultado Actions (éxito/fallo/no disponible): Exitoso | URL de ejecución: https://github.com/karolSalazar03/ECHO_RESERVAS/actions

## Cambio del cliente (completar SOLO cuando se anuncie)
ID: N/A | Nueva regla: No se anunció cambio adicional por parte del docente cliente.
Impacto en pruebas/código: Sin impacto | Prioridad revisada: Mantener alcance original.
Decisión del equipo y estado final: Cobertura completa de HU-01 y HU-02 aprobada local y remotamente.

## Cierre
Historias aceptadas, pendientes conocidos y siguiente mejora concreta (máx. 3 líneas):
- Se completaron y aprobaron las dos historias de usuario principales (HU-01 y HU-02) con sus respectivas pruebas unitarias en verde.
- No quedaron pendientes funcionales dentro del alcance del tiempo de evaluación.
- Mejora para iteraciones futuras: agilizar el proceso de revisión cruzada de Pull Requests mediante comunicación más directa al inicio del desarrollo.

# Respuesta individual 
Equipo: ECHO

Nombre: Rommel Rivera | Usuario GitHub: RommelRam
1. Mi contribución y evidencia (archivo, PR, prueba, revisión): 
Yo me encargué de todo lo que viene siendo la documentación y registro de lo que se ha estado haciendo en esta actividad, así mismo colaboré con la elaboración de la historia 2 y la validación de las pruebas asociadas en el repositorio.
   
2. Valor XP aplicado y ejemplo concreto:
Retroalimentación y comunicación: Rápidamente identifiqué la falla en que nadie estaba documentando el tablero de tareas, por lo que decidí encargarme de escribir y ayudar a mis compañeros con la redacción y alineación del XP_REGISTRO.md.

3. Qué verifica GitHub Actions y qué significa un resultado fallido?: 
GitHub Actions ejecuta de forma automatizada la compilación del proyecto en Java 17 y la ejecución de las pruebas unitarias mediante Maven en cada commit o Pull Request. Que falle significa que el código introducido rompió alguna regla de compilación o falló al menos una prueba JUnit, impidiendo dar por seguro el funcionamiento actual.

4. Mejora del equipo para la siguiente iteración: 
La coordinación que tuvimos a la hora de organizarnos fue deficiente al principio; para próximas iteraciones recomiendo tener roles y parejas planeados de antemano para evitar demoras en el arranque.


# Respuesta individual

Nombre: Isabel Farinango  | Usuario GitHub: Aizel-Shadow
1. Mi contribución y evidencia (archivo, PR, prueba, revisión): 
Me encargué del desarrollo de la historia de usuario HU-01 y su lógica principal en BookingPolicy.java, además de implementar las pruebas unitarias iniciales siguiendo TDD y abrir el Pull Request correspondiente hacia main.
   
1. Valor XP aplicado y ejemplo concreto:
Simplicidad y coraje: Aplicamos el principio de implementar únicamente el código estrictamente necesario para que las pruebas pasaran, evitando sobreingeniería en los bloques de reserva.

1. Qué verifica GitHub Actions y qué significa un resultado fallido?: 
Verifica la integridad del código fuente, asegurando que el build de Maven y los tests pasen exitosamente en un entorno limpio. Un resultado fallido indica errores de compilación o pruebas rotas en el código integrado.

1. Mejora del equipo para la siguiente iteración: 
Establecer tiempos de revisión cruzada más ágiles para evitar cuellos de botella antes de hacer el merge a la rama principal.

# Respuesta individual 


Nombre: Kevin Alvear | Usuario GitHub: kevin-Alvear

1. Mi contribución y evidencia (archivo, PR, prueba, revisión): 
Colaboré directamente en la implementación de la HU-02 en CancellationPolicy.java, diseñando las pruebas de negocio para validar la cancelación correcta de los bloques reservados y revisando el código de los compañeros.
   
1. Valor XP aplicado y ejemplo concreto:
Programación en parejas: Trabajamos codo a codo en la misma máquina/sesión debugeando la lógica de cancelación y resolviendo de inmediato los fallos en las pruebas JUnit.

1. Qué verifica GitHub Actions y qué significa un resultado fallido?: 
Comprueba automáticamente que el proyecto compile con Java 17 y que la suite de pruebas Maven pase sin errores. Un pipeline fallido nos alerta de discrepancias o fallos lógicos antes de fusionar los cambios a main.

1. Mejora del equipo para la siguiente iteración: 
Mejorar la sincronización frecuente con git pull antes de empezar a programar para reducir la probabilidad de conflictos al integrar ramas.

# Respuesta individual 


Nombre: karolina Salazar | Usuario GitHub: karolSalazar03
1. Mi contribución y evidencia (archivo, PR, prueba, revisión): 
Me enfoqué en la revisión cruzada de los Pull Requests de ambas parejas, verificando el cumplimiento de las reglas del negocio, la calidad de las pruebas JUnit y validando el estado del pipeline en GitHub Actions antes del merge.
   
1. Valor XP aplicado y ejemplo concreto:
Respeto y retroalimentación: Al realizar la revisión cruzada de los PR de la otra pareja, aporté observaciones constructivas sobre las condiciones de frontera sin alterar el enfoque del equipo.

1. Qué verifica GitHub Actions y qué significa un resultado fallido?: 
Verifica mediante integración continua que el proyecto compile y ejecute los tests con éxito en un entorno remoto idéntico. Un resultado fallido significa que hay un error latente en el código subido que debe corregirse de inmediato.

1. Mejora del equipo para la siguiente iteración: 
Definir un checklist más claro para la revisión cruzada de código para agilizar la aprobación de los PR.
