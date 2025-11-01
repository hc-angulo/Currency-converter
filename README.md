# 💱 Conversor de Monedas

## 🧠 Descripción  
Este proyecto fue desarrollado con el objetivo de **aprender a consumir APIs externas**, **manipular datos en formato JSON** y **realizar conversiones entre diferentes monedas** utilizando **Java**.  

A través de este desafío, se pone en práctica el uso de **HttpClient**, **HttpRequest**, **HttpResponse** y la biblioteca **Gson** para procesar datos JSON provenientes de una API de tasas de cambio.  

---

## ⚙️ Requisitos del Entorno  

Antes de ejecutar el proyecto, asegúrate de contar con las siguientes herramientas instaladas:

| Herramienta | Versión recomendada | Enlace de descarga |
|--------------|---------------------|--------------------|
| ☕ **Java JDK** | 11 o superior | [Descargar JDK](https://www.oracle.com/br/java/technologies/downloads/) |
| 🧩 **Biblioteca Gson** | 2.10.1 o superior | [Descargar Gson](https://search.maven.org/artifact/com.google.code.gson/gson) |
| 🔬 **Postman** | Última versión | [Descargar Postman](https://www.postman.com/downloads/) |
| 💻 **IntelliJ IDEA (opcional)** | Cualquier versión estable | [Descargar IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/download/?section=windows) |

---

## 🌍 API utilizada  

El proyecto utiliza una **API de tasas de cambio** para obtener datos actualizados sobre monedas:  

🔗 [Exchange Rate API](https://www.exchangerate-api.com/)  

> ⚠️ Es necesario **generar una clave de API** gratuita para realizar solicitudes.  

---

## 🧰 Instalación de la biblioteca Gson en IntelliJ IDEA  

1. Abrir proyecto en IntelliJ.  
2. Hacer clic derecho sobre la carpeta del proyecto → **Open Module Settings**.  
3. Ver a la pestaña **Dependencies**.  
4. Hacer clic en **“+” → Library → From Maven**.  
5. Buscar `gson` y seleccionar la versión deseada (≥ 2.10.1).  
6. Presionar **OK** para aplicar los cambios.  

---

## 🧩 Arquitectura del Proyecto  

El desarrollo del conversor se organiza en **10 fases principales**:

1. **Configuración del entorno Java**  
2. **Conexión con la API de tasas de cambio**  
3. **Importación de la biblioteca Gson**  
4. **Construcción del cliente HTTP (HttpClient)**  
5. **Creación de solicitudes (HttpRequest)**  
6. **Gestión de respuestas (HttpResponse)**  
7. **Análisis del JSON obtenido**  
8. **Filtrado de monedas específicas**  
9. **Implementación de la lógica de conversión**  
10. **Interacción con el usuario mediante consola (Scanner)**  

Cada paso contribuye al entendimiento completo del flujo de comunicación entre un programa Java y una API RESTful.

---

## 🧮 Ejecución del Programa  

1. Clonar este repositorio:  
   ```bash
   git clone https://github.com/hc-angulo/Currency-converter.git
   ```
2. Abri el proyecto en tu IDE preferido.
3. Configurar API Key en el código fuente.
4. Compilar y ejecutar el archivo principal (Main.java o similar).
5. Seguir las instrucciones en la consola para elegir las monedas y realizar la conversión.

---

## 🖥️ Ejemplo de Interacción
```java
===== Conversor de Monedas =====
1. Dólar → Euro
2. Euro → Peso Argentino
3. Peso Mexicano → Dólar
4. Salir

Seleccione una opción: 1
Ingrese el monto a convertir: 100
Resultado: 100 USD = 92.45 EUR
```

---

## 🧠 Conceptos Aprendidos

- Uso de HttpClient, HttpRequest y HttpResponse en Java 11+.
- Consumo de APIs RESTful y manejo de claves de autenticación.
- Manipulación de datos JSON mediante la biblioteca Gson.
- Diseño modular del código con métodos reutilizables.
- Interacción por consola con entrada de usuario (Scanner).

---

## 🚀 Tecnologías utilizadas

-Java SE 11+
- Gson (Google JSON library)
- Exchange Rate API
- IntelliJ IDEA (opcional)
- Postman (para pruebas de API)

---
