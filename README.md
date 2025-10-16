Spring Boot Java – Implementación visual del juego

Este proyecto es una aplicación desarrollada con Spring Boot que implementa un juego visual utilizando tecnologías web y Java.

📂 Estructura del proyecto

El repositorio contiene los siguientes elementos principales:

.mvn/, mvnw, mvnw.cmd — Wrapper de Maven

pom.xml — Archivo de configuración del proyecto Maven

src/ — Código fuente Java, recursos estáticos y vistas HTML

.gitignore, .gitattributes — Archivos de configuración de Git

🛠️ Tecnologías utilizadas

Java 17+

Spring Boot

Maven

HTML / CSS / JavaScript (para la parte visual)

🚀 Cómo ejecutar el proyecto

Clona el repositorio:

git clone https://github.com/rodrigofbmm/spring-boot-java.git


Entra al directorio del proyecto:

cd spring-boot-java


Compila y ejecuta el proyecto con Maven:

./mvnw clean package
./mvnw spring-boot:run


En Windows, usa:
mvnw.cmd spring-boot:run

Abre el navegador en:

http://localhost:8080


(o el puerto configurado en tu aplicación)

🧩 Funcionalidades

Interfaz web para interactuar con el juego

Lógica del juego desarrollada completamente en Java

Integración con Spring Boot para gestionar controladores, vistas y dependencias

Posibilidad de ampliar el juego con más vistas o lógica personalizada

(Aquí puedes añadir detalles específicos del juego, sus reglas o cómo se juega.)

🧪 Ejecución de tests

Si el proyecto incluye pruebas unitarias o de integración, puedes ejecutarlas con:

./mvnw test

⚙️ Configuración

Las propiedades del proyecto (puerto, perfiles, etc.) pueden configurarse en:
src/main/resources/application.properties

Asegúrate de tener instalado Java y Maven correctamente antes de ejecutar.
