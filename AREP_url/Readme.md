# Taller 1 AREP

Aplicacion que permite consultar la informacion de peliculas.

## Empezando

Con el paso a paso se obtendra una copia de esta aplicacion y podra ser utilizada

### Pre requisitos

1. Git: Descarga y administracion versiones repositorio.
2. Java: Lenguaje utilizado.
3. Maven: Controlador del proyecto.


### Installing

Clonamos el repositorio

```
git clone https://github.com/cisfjulian/AREP_Lab1.git
```

Entramos a la ubicacion donde se clono el repositorio y a traves del cmd ejecutamos el siguiente comando
(Tener en cuenta que se debe tener configurado maven)

```
mvn clean package exec:java -D "exec.mainClass"="org.example.HTTPServer"
```

Luego de ejecutar y que el maven compile, en nuestro navegador preferido colocaremos en la barra de busqueda
*localhost:35000*
Veremos que debemos introducir el titulo de la pelicula por lo cual lo introducimos y veremos que la pagina nos
trae la informacion de dicha pelicula.

Si quisieramos consultar otra pelicula damos enter en el cmd, recargamos la pagina y nuevamente en el cmd introducimos
la pelicula de la cual queremos informacion.

## Javadoc

Para generar el javadoc ejecutamos el siguiente comando

```
mvn javadoc:javadoc
```

Posterior a ello debemos ir a la carpeta target -> site -> apidocs y alli encontraremos toda la informacion relacionada.

## Test

Pendiente a implementar

```
Pendiente a implementar
```


## Construido con

* Maven - Manejo de dependencias y proyecto en general.

## Version

1.0

## Autor

* **Julian Largo**

## Diseño y Extension

En primera instancia para consultar el recurso se recurre primero a un cache que se va a encargar de recibir primero la solicitud
reduciendo asi el uso del API. Uso de un servidor fachada.

Si se quisiera consultar otro tipo de recurso que tenga uso de mensaje JSON tambien se podria extender y ser usado este servidor.

En cuanto a diseño, hay una parte que se encarga de consultar el API o el recurso. Otra que se encarga de montar o poner en marcha el servidor
con la consulta que hace al Cache y finalmente un Cache que revisa dentro de si si puede responder la solicitud o debe acudir al API.

Se hace uso de funciones sencillas, en cuanto a HTML el json es transformado a una tabla para ser visualizado de una mejor manera.

Se utiliza maven para controlar el ciclo de vida del proyecto, ejecutarlo, compilarlo.

El codigo se encuentra organizado y es legible para entender que hace cada clase y cada metodo, del mismo modo se encuentra documentado.
