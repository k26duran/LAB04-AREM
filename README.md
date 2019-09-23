# Taller de introducción a AWS y modularización por virtualización.

### Construcción de un servidor web en Java

El servidor concurrente capaz de entregar páginas html e imágenes tipo JPG. Igualmente el servidor provee un framework IoC para la construcción de aplicaciones web a partir de POJOS.  aplicación Web desplegada en Heroku.

En este laboratorio hice un servidor concurrente usando ThreadPoolExecutor y un cliente AWS. Para poder observar la diferencia entre el uso de la cantidad de hilos que soporta el servidor las pruebas se realizaron cambiando esta cantidad de hilos y realizando múltiples solicitudes en paralelo al servidor web.
### Prerequisitos

* Java 1.8
* Maven 3.6.0 

### Resultados Obtenidos
El objetivo de las siguientes pruebas es medir el desempeño del servidor web variando el número de peticiones y el número de hilos que soporta solicitando tanto recursos estáticos como dinámicos.

La siguiente gráfica muestra los resultados obtenidos haciendo solicitudes a un contenido estático, variando la cantidad de hilos, primero con 1 hilo, luego 10 hilos, y por último 50 hilos.

![](https://github.com/k26duran/LAB04-AREM/blob/master/img/tablaEstatico.PNG)

![](https://github.com/k26duran/LAB04-AREM/blob/master/img/contenidoEstatico.PNG)

En una escala más grande, es decir no haciendo peticiones de 1 a 10 en paralelo, sino de 10 en 10, los resultados obtenidos fueron los evidenciados en la siguiente tabla.

![](https://github.com/k26duran/LAB04-AREM/blob/master/img/tablaEstatico2.PNG)

![](https://github.com/k26duran/LAB04-AREM/blob/master/img/contenidoEstatico2.PNG)

La siguiente gráfica muestra los resultados obtenidos haciendo solicitudes a un contenido dinámico, variando la cantidad de hilos, primero con 1 hilo, luego 10 hilos, y por último 50 hilos.

![](https://github.com/k26duran/LAB04-AREM/blob/master/img/tablaDinamico.PNG)

![](https://github.com/k26duran/LAB04-AREM/blob/master/img/contenidoDinamico.PNG)

En una escala más grande, es decir no haciendo peticiones de 1 a 10 en paralelo, sino de 10 en 10, los resultados obtenidos fueron los evidenciados en la siguiente tabla.

![](https://github.com/k26duran/LAB04-AREM/blob/master/img/tablaDinamico2.PNG)

![](https://github.com/k26duran/LAB04-AREM/blob/master/img/contenidoDinamico2.PNG)

En los resultados podems observar que no importa que se haga la solicitud hacia un recurso estático o dinámico, el tiempo de respuesta es casi el mismo. En ambas gráficas se puede observar que la tendencia es a demorarse más tiempo entre más peticiones en paralelo se hagan.

## Ejecutar
### Descagar proyecto, sus dependencias y compilar
```console
proyect@proyect:~$ git https://github.com/k26duran/LAB04-AREM.git
proyect@proyect:~$ cd LAB04-AREM 
proyect@proyect:~$ mvn package
proyect@proyect:~$ mvn compile
```

### Ejecutar app Local con heroku 
```console
proyect@proyect:~$ Heroku local web
```

### Generar documentación
```console
proyect@proyect:~$ mvn javadoc:jar
```

### Despliegue
Para ver la página web, [Click aqui](https://secret-badlands-10428.herokuapp.com/)

* Responde a los siguientes links:
  * https://gentle-sea-64562.herokuapp.com/image1.png
  * https://gentle-sea-64562.herokuapp.com/index.html
  
* Responde a la siguientes apps:
  * https://gentle-sea-64562.herokuapp.com/app/cuadrado 
  * https://gentle-sea-64562.herokuapp.com/app/example  

### Licencia

Proyecto1-AREM está licenciado  por GNU General Public License v3.0, ver [licencia](https://github.com/k26duran/LAB04-AREM/blob/master/LICENSE) para más detalles.

### Autor

Karen Paola Duran Vivas - [k26duran](https://github.com/k26duran)

Estudiante de la Escuela colombiana de ingeniería Julio Garavito. 