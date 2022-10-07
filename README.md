# Singleton Design Pattern In Java With All Scenarios
Tutorial tomado de [javatechonline](https://javatechonline.com/singleton-design-pattern-in-java-with-all-scenarios/?fbclid=IwAR3lrUm4gzFV7EVwVBBMvPYF5baaXnjcRc5iYBSp8EscJsIULxjsAkcCYig)

# Definición de un patrón de diseño singleton

```
1) Debe haber solo una instancia permitida para una clase
2) Deberíamos permitir un punto de acceso global a esa única instancia
```

# ¿Cómo implmentar el patrón de diseño singleton?
Para implementar un patrón Singleton, tenemos diferentes escenarios, 
pero cada uno de ellos tienen el siguiente enfoque común.

```
- Constructor privado para restringir la creación de instancias de la clase desde otras clases.

- Variable estática privada de la misma clase que es la única instancia de la clase.

- Método estático público que devuelve la instancia de la clase, este es el punto de acceso global 
  para que el mundo exterior obtenga la instancia de la clase singleton.

```

 # ¿Qué es una clase Singleton en Java?
Una clase que sólo puede tener una instancia (objeto) a la vez es una clase Singleton. 
Si intentamos crear una instancia de la clase Singleton por segunda vez, 
la nueva variable también apunta a la instancia creada anteriormente. 
Por lo tanto, cualquier modificación que hagamos a cualquier variable dentro de la clase 
a través de cualquier instancia, afecta a la variable de la instancia única creada. 
Por ejemplo, La clase Runtime, Action Servlet, Service Locator son algunas de las 
clases Singleton. Los constructores privados y los métodos de fábrica también se 
incluyen en el ejemplo de la clase singleton.

# ¿Cuál es el propósito de crear una clase Singleton?
El objetivo principal de crear una clase Singleton es restringir la creación de número de 
objetos. Además, al usar la clase Singleton, el objeto no se creará cada vez que se realice 
una nueva solicitud. En su lugar, un solo objeto se usará repetidamente. Esta es la razón 
por la que el patrón Singleton en Java se utiliza principalmente con aplicaciones 
multiproceso y de base de datos. Por ejemplo, utilizamos el concepto de clase singleton 
al crear una conexión de base de datos. En este caso, restringimos el desperdicio de 
memoria al no crear varias conexiones de base de datos.

