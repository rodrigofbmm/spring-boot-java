🎮 Spring Boot Java – Implementación Visual del Juego

Este proyecto es una aplicación web interactiva desarrollada con Spring Boot que implementa un juego visual utilizando tecnologías modernas de Java, HTML, CSS y JavaScript.

🧱 Estructura del Proyecto
spring-boot-java/
│
├── .mvn/                   # Wrapper de Maven
├── mvnw, mvnw.cmd           # Scripts para ejecutar Maven sin instalarlo globalmente
├── pom.xml                  # Archivo de configuración del proyecto Maven
├── src/                     # Código fuente Java, recursos estáticos y vistas HTML
│   ├── main/
│   │   ├── java/            # Código backend del juego (controladores, servicios, etc.)
│   │   ├── resources/       # Archivos de configuración y plantillas HTML
│   └── test/                # Pruebas unitarias o de integración
├── .gitignore               # Archivos y carpetas ignorados por Git
└── .gitattributes           # Configuración adicional de Git

🛠️ Tecnologías Utilizadas
Tecnología	Descripción
☕ Java 17+	Lenguaje principal del backend
🌱 Spring Boot	Framework para crear aplicaciones Java rápidas y estructuradas
🧩 Maven	Sistema de construcción y gestión de dependencias
💻 HTML / CSS / JavaScript	Tecnologías para la parte visual e interactiva del juego
🚀 Cómo Ejecutar el Proyecto
1️⃣ Clona el repositorio
git clone https://github.com/rodrigofbmm/spring-boot-java.git

2️⃣ Entra al directorio del proyecto
cd spring-boot-java

3️⃣ Compila y ejecuta con Maven
./mvnw clean package
./mvnw spring-boot:run


🪟 En Windows:

mvnw.cmd spring-boot:run

4️⃣ Abre tu navegador

👉 http://localhost:8080

(o el puerto configurado en tu aplicación)

🧩 Funcionalidades

✅ Interfaz web para interactuar con el juego
✅ Lógica del juego implementada completamente en Java
✅ Controladores gestionados por Spring Boot
✅ Fácil integración de nuevas vistas o reglas de juego
✅ Diseño modular y extensible

💡 (Puedes añadir aquí detalles específicos del juego, sus reglas o instrucciones para jugar.)

🧪 Ejecución de Tests

Si el proyecto incluye pruebas unitarias o de integración, ejecútalas con:

./mvnw test

⚙️ Configuración

Las propiedades de la aplicación (como el puerto, nombre de la app, perfiles, etc.) se encuentran en:

src/main/resources/application.properties


Asegúrate de tener instalados correctamente:

Java 17+

Maven 3.8+ (o usa el wrapper incluido)
