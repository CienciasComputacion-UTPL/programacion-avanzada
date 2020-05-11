# Programación avanzada

## Taller Nro. 1
Implementar el código que se mostró en clases (ambos programas) y medir su tiempo, a través del comando *time* (disponible en *nix). En caso de ser usuario windows, se recomendia instalar una máquina virtual o un contenedor de docker. Otra alternativa es agregar varias sentencias a su código, estas las puede revisar [aquí](https://www.dariawan.com/tutorials/java/calculate-elapsed-time-java/). Como última instancia, debe usuar un cronómetro para medir el tiempo


## Taller Nro. 2
Implemente un programa concurrente que una vez calculada la suma de los elementos de cada fila, sume esos resultados y calcule un único valor. Utilice únicamento los elementos (clases, interfaces) estudiados hasta el momento. El código que usará como base, está disponible en la carpeta *taller2*

## Taller Nro. 3

En este nuevo taller deberás utilizar el API [PCDPlib](https://github.com/habanero-rice/PCDP), para desarrollar el siguiente ejercicio: desarrolle un programa Java que utilizando esa librería permita obtener la suma total de los elementos de una matriz, siguiendo las siguientes instrucciones:
1. Calcular la suma de los elementos de una columna en forma paralela.
2. Calcular el total de la suma de los elementos, sumando los resultados parciales de cada columna.

No olvides que necesitas Maven para manejar las dependencias de tu proyecto. Te recomiendo que instales la última versión que la puedes encontrar [aquí](https://maven.apache.org). Una vez que lo instales, configura tú IDE para que apunte a directorio de Maven.

En la carpeta *code-taller3*, encontraran el proyecto maven que necesitan para empezar, este incluye las dependencias para PCDPlib. Debo comentarte que el proyecto está configurado para Java 14, si tienes una versión diferente, debes cambiar las propiedades:
```xml
<maven.compiler.target>
<maven.compiler.source>
```
Esa configuración se encuentra en el archivo pom.xml dentro de la carpeta code-taller3.