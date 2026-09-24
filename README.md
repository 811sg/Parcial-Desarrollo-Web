# API REST de Productos

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
git clone [URL_DEL_REPOSITORIO](https://github.com/811sg/Parcial-Desarrollo-Web)
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

<img width="1742" height="251" alt="image" src="https://github.com/user-attachments/assets/8448045f-969d-4ef2-b66e-0e1436269d05" />


Para consultar un producto específico:

```text
http://localhost:8080/api/productos/1
```

<img width="1227" height="210" alt="image" src="https://github.com/user-attachments/assets/3a295fcc-c613-40f4-a68e-cb29321574bd" />


## Autor

Sebastian Gonzalez Campiño
