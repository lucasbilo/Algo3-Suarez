# Alquiler de bicicletas

## Objetivos

*   Practicar un ejercicio de modelado de dificultad similar a la del examen parcial de la semana que viene.

## Consigna

*   Descargar los archivos adjuntos, importarlos en Pharo y analizar el código.
*   Identificar los problemas de diseño de la solución que hace pasar las dos pruebas.
*   Proponer e implementar una mejora que resuelva los problemas anteriormente detectados.
*   <span style="font-size: 13px;">Confeccionar un diagrama de clases del modelo final.</span>  

*   Confeccionar dos diagramas de secuencia de los escenarios de las dos pruebas provistas.

## Aclaraciones

*   El entregable debe ser un archivo comprimido con el paquete de las nuevas pruebas, el del nuevo modelo y las imágenes de los diagramas. No debería ser necesario incluir ningún archivo de texto adicional.
*   Para todos los casos las pruebas pueden ser modificadas según consideren necesario siempre y cuando se siga respetando la funcionalidad descrita en sus nombres. También pueden (y deberían) agregar todas las pruebas nuevas que su modelo demande.
*   Los diagramas pueden realizarse a mano o a través de alguna herramienta digital. En cualquier caso se pide que sean subidos como imágenes (jpg o png) o como pdf. En el caso de realizar los diagramas a mano, por favor utilizar una hoja lisa para que sea más fácil su lectura posterior.
*   Los diagramas no deben estar 100% completos pero sí deben incluir los detalles suficientes como para que se logre comunicar efectivamente la responsabilidad de cada clase y es importante que no haya inconsistencia entre los diagramas y el código.
*   Si se traban con algún problema de sintaxis pueden saltearlo y dejar un comentario que empiece con "FIXME" y continuar con el modelo e intentar arreglarlo al final. Es más importante que el modelo esté completo que el perfecto uso de la sintaxis del lenguaje.

## Posible solución

## Problemas de diseño
1. Los nombres de las pruebas no revelan intencion
10. Faltan inicializadores.
20. Clase anémica (sin comportamiento): `Alquiler` y `Bici`.
30. Viola "tell dont ask": `Alquiler>>esDiario:` viola Tell don't ask.
40. `Cliente` multiples responsabilidades.
50. Ocultamiento/Encapsulamiento: `Alquiter>>obtenerPrecio,obtenerPeriodo:`.
60. Principios comprometidos:
   - [SRP](https://en.wikipedia.org/wiki/Single-responsibility_principle) (En el caso de `Cliente`)
   - [OCP](https://en.wikipedia.org/wiki/Open%E2%80%93closed_principle) (En el caso de `Cliente` y el mensaje `esDiario`)

#### Diagrama de clases

![dc](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/fiuba/algo3_simulacro_tn_alquiler_bici/solucion/202001C/media/diagrams/diagrama_clases.plantuml)

#### Diagrama de secuencia para varios alquileres

![dc](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/fiuba/algo3_simulacro_tn_alquiler_bici/solucion/202001C/media/diagrams/dc_alquiler_varios.plantuml)

#### Diagrama de secuencia para alquiler por un día

![dc](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/fiuba/algo3_simulacro_tn_alquiler_bici/solucion/202001C/media/diagrams/ds_alquiler_diario.plantuml)

#### Diagrama de secuencia para alquiler por varios días

![dc](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/fiuba/algo3_simulacro_tn_alquiler_bici/solucion/202001C/media/diagrams/ds_alquiler_por_dias.plantuml)



