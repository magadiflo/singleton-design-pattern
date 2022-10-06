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