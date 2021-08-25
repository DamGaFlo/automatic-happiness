# Taller consumir y generar un api - GIT

Este aplicativo consume un api desplegada en heroku para consultar el mercado de valores


## Prerequisitos

Conocimientos básicos en java, y manejo de URL.

## Comandos
Para compilar y correr las pruebas: ```mvn package```

Para ejecutar y utilizar el programa: ```mvn exec:java -Dexec.mainClass="co.escuelaing.arep.lab1.App```

Para ejecutar las pruebas: ```mvn test```

Para generar javadoc con maven: ```mvn javadoc:javadoc```

Para generar javadoc de las pruebas: ```mvn javadoc:test-javadoc```

**IMPORTANTE:** Para poder utilizar el aplicativo es necesario compilar primero el proyecto con **mvn package**.

# Despliegue Heroku de api a cosumir

https://taller1arep.herokuapp.com/

#####Parametros de la api a trabajar

st ```req```  indique el codigo de la compania de la que quiere buscar en el mercado de valores

fn ```req```  indique con que frecuencia buscar en el mercado de valores puede usar los parametros 

TIME_SERIES_INTRADAY

TIME_SERIES_DAILY

TIME_SERIES_WEEKLY

TIME_SERIES_MONTHLY


## Operaciones
consultar el valor de una accion con el parametro "st" y el periodo ya sea diario, semanal o mensual con el parametro "fn"
estas se deben manipular desde el codigo.



## Intalación
Si quieres saber como funciona el programa, tienes que seguir los siguientes pasos:
1. Abra el proyecto en el editor.
2. Corra el programa y verifique que no tiene errores.
3. Ingrese los parámetros deseados que desea ver para visualizar las funcionalidades del sistema.

## Instalación (Proyecto Maven)
Para tener una mejor experiencia con el programa, es recomendable tener instalado maven en el sistema operativo,
de esta forma se puede visualizar de una mejor manera las pruebas y ejecutarlas desde consola.
Para instalar maven seguimos los siguientes pasos:
1. En eclipse vamos al menu que dice help.
2. Ahí le damos a install new software.
3. Nos abrirá una nueva pestaña, allí le damos donde aparece "add".
4. En "Name" escribimos lo siguiente: M2Eclipse
5. En "Location" escribimos la siguiente dirección: http://download.eclipse.org/technology/m2e/releases
6. Le damos Add, señalamos los plugins que aparecieron.
7. Aceptamos los terminos y condiciones, y se instalará automáticamente.
8. Reiniciamos eclipse y ya está instalado maven en eclipse.




## ¿Cómo usar el aplicativo?
1. Copie el enlace proporcionado por el git del proyecto y clone el repositorio en el directorio de su preferencia.

    - git clone https://github.com/DamGaFlo/automatic-happiness.git
2. Entre a la carpeta **automatic-happiness**.
3. Compile el proyecto antes de comenzar a utilizar sus funcionalidades.
4. manipule el codigo desde el main para interactuar con los parametros "stock" y "funcion"

## Ejemplos de uso con maven
Para ello nos dirigimos a la carpeta principal del proyecto, dependiendo de lo que queramos hacer.

Si queremos compilar el proyecto y ver que no tiene fallos, utilizamos el comando **mvn package**.

Si queremos ejecutar las pruebas y ver que todo está perfecto, utilizamos el comando **mvn test**.

**NOTA:** El comando **mvn package** compila y ejecuta las pruebas al mismo tiempo.

## Construido
[IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/) Editor de JAVA donde se puede compilar el proyecto.

## Autor
Johan Damian Garrido - Trabajo Programación AREP 24/08/2021

## Licencia
Este programa es de uso libre, puede ser usado por cualquier persona.

