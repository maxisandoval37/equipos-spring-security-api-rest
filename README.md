# Equipos Spring Security API REST - Educación IT 2024 (Curso dictado por mi autoría)

Este proyecto es una API REST construida con Spring Boot que implementa seguridad con Spring Security y gestiona información sobre equipos, utilizando un servicio externo para obtener la imagen de la bandera de su país de origen.

## Tecnologías Utilizadas

- Java 17+
- Maven
- Spring Boot
- Lombok
- Spring Security
- Webflux
- Mockito
- GitHub Workflow
- Render

## Construcción y Ejecución

Utiliza el siguiente comando Maven:

```bash
mvn clean install
```

## Endpoint

• El endpoint principal de la aplicación se encuentra en:

#### `GET /equipos`

• Documentación (Swagger UI)
#### `GET /swagger-ui/index.html`

## Ejemplo response
#### Usuario: *admin*
#### Password: *1234*

```json
[
  {
    "nombre": "Bover",
    "banderaPaisOrigen": "https://flagcdn.com/w320/ar.png"
  },
  {
    "nombre": "Rica",
    "banderaPaisOrigen": "https://flagcdn.com/w320/ar.png"
  }
]
```

## Live Demo

[onrender.com](https://equipos-spring-security-api-rest.onrender.com/equipos)

## Información Adicional
Para cualquier información adicional o consultas: <maxisandoval98@gmail.com>

Muchas gracias!