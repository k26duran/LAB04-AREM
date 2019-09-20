# Transformación Digital y a Arquitectura Empresarial.
## Proyecto AREM - Primer Tercio

### Construcción de un servidor web en Java

El servidor **No** concurrente capaz de entregar páginas html e imágenes tipo JPG. Igualmente el servidor provee un framework IoC para la construcción de aplicaciones web a partir de POJOS.  aplicación Web desplegada en Heroku.

### Prerequisitos

* Java 1.8
* Maven 3.6.0 

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