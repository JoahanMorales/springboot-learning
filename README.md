# Spring Boot Learning

Proyecto de aprendizaje para familiarizarse con Spring Boot usando Java 17 y Gradle.

Este repositorio contiene una aplicación base de **Spring Boot** creada como entorno de práctica para aprender a estructurar, compilar y ejecutar proyectos con este framework. La idea es experimentar con controladores, servicios, modelos, persistencia, endpoints REST y más conforme avances en tu entrenamiento.

---

## ¿Qué es este proyecto?

Este proyecto es un punto de partida para aprender a usar **Spring Boot** con **Java 17**, aprovechando el poder de este framework para construir aplicaciones web y APIs de forma rápida y sencilla.

---

## Tecnologías utilizadas

- **Java 17**
- **Spring Boot**
- **Gradle**
- Posibles dependencias comunes en *Spring Boot* (Web, JPA, Validation, etc.)
- Estructura MVC típica de aplicaciones RESTful

---

## Requisitos previos

Antes de ejecutar este proyecto en tu máquina, asegúrate de tener instalados:

- **Java 17** o superior
- **Git**
- Un IDE como **IntelliJ IDEA**, **VSCode** o **Eclipse**
- Opcional: una base de datos si agregas persistencia

---

## Cómo ejecutar el proyecto

1. **Clona el repositorio**
   ```bash
   git clone https://github.com/JoahanMorales/springboot-learning.git
Entra al directorio

bash
Copiar código
cd springboot-learning
Ejecuta con Gradle

En Linux / macOS:

bash
Copiar código
./gradlew bootRun
En Windows:

bash
Copiar código
gradlew.bat bootRun
Abre el navegador en

arduino
Copiar código
http://localhost:8080
Estructura del proyecto
La estructura principal que verás es algo como:

css
Copiar código
springboot-learning/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
├── build.gradle
├── gradlew
├── gradlew.bat
└── settings.gradle
src/main/java → Código Java de la aplicación

src/main/resources → Configuraciones, propiedades, recursos

build.gradle → Archivo de configuración de Gradle

Endpoints (ejemplos)
Aquí agrega los endpoints que tengas en tu proyecto con una breve descripción

Ruta	Método	Descripción
/api/ejemplo	GET	Retorna un mensaje de prueba
/api/usuarios	POST	Crea un nuevo usuario
/api/usuarios/{id}	GET	Obtiene un usuario por ID

Pruebas
Si agregas tests más adelante, explica cómo ejecutarlos:

bash
Copiar código
./gradlew test
Contribuciones
Este repositorio es para uso personal de aprendizaje, pero si deseas colaborar:

Haz un fork del proyecto

Crea una rama (feature/nueva-funcionalidad)

Haz tu commit

Envía un pull request

