# API REST de Productos

Proyecto desarrollado con **Java y Spring Boot** para crear una API REST que permite consultar productos de una tienda.

## Tecnologías

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Maven

## ¿Qué tiene el proyecto?

La API cuenta con dos endpoints:

```text
GET /api/productos
```

Permite consultar todos los productos.

```text
GET /api/productos/{id}
```

Permite consultar un producto por su ID.

El proyecto utiliza una base de datos **H2 en memoria** y contiene 5 productos de prueba cargados mediante el archivo `data.sql`.

La estructura está organizada en capas:

```text
controller
service
repository
model
```

También cuenta con la consola de H2 para consultar la base de datos.

## Ejecución

### 1. Clonar el proyecto

```bash
git clone URL_DEL_REPOSITORIO
```

### 2. Entrar a la carpeta

```bash
cd demo
```

### 3. Ejecutar el proyecto

```bash
mvn spring-boot:run
```

También se puede ejecutar directamente desde Visual Studio Code utilizando el botón **Run**.

### 4. Probar la API

Para consultar todos los productos:

```text
http://localhost:8080/api/productos
```

Para consultar un producto específico:

```text
http://localhost:8080/api/productos/1
```

### Consola H2

La consola de H2 está disponible en:

```text
http://localhost:8080/h2-console
```

## Autor

Sebastian Gonzalez Campiño
