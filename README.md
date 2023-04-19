#
<h1 align="center">Prueba Técnica</h1>

<h3>Enunciado</h3>
<h6>1.    Introducción</h6>
En el presente proyecto del Bootcamp Full Stack correspondiente a la parte Spring Framework se espera que el alumno demuestre todos los conocimientos adquiridos en desarrollo de APIs.<br> 
<h6>2.    Descripción </h6>
La empresa quiere dar un impulso a la manera que tienen los trabajadores de relacionarse, permitiendo que contacten entre ellos creando grupos de interés. <br>

Una primera fase de este proyecto es crear una aplicación web LFG, que permita que los  empleados  puedan  contactar  con  otros  compañeros  para formar grupos para jugar a un videojuego, con el objetivo de poder compartir un rato de ocio afterwork. 

Los requisitos funcionales de la aplicación son los siguientes: 

RF.1   Los   usuarios  tienen  que  poder  crear  Partídas  (grupos)  para  un determinado videojuego.<br>
RF.2  Los  usuarios  tienen  que  poder  buscar  Partídas  seleccionando  un videojuego.<br>
RF.3  Los usuarios pueden entrar y salir de una Party. <br>
RF.4  Los  usuarios  tienen  que  poder  enviar  mensajes  a  la  Party. Estos mensajes tienen que poder ser editados y borrados por su usuario creador. <br>
RF.5  Los mensajes que existan en una Party se tienen que visualizar como un chat común. <br>
RF.6 Los usuarios pueden introducir y modiﬁcar sus datos de perﬁl, por ejemplo, su usuario de Steam. <br>

En esta primera fase de proyecto el alumno ha de realizar una  API REST completa,   con   Spring Framework,   que   cumpla   con   los   requisitos   anteriormente planteados. <br>

Deﬁne los endpoints necesarios para que el backend pueda cumplir con lo establecido, nutriendo las diferentes vistas de frontend. <br>

 Además de de lo mencionado anteriormente el alumno ha de incluir la siguiente funcionalidad: <br>

H2<br>
JPA<br><br>
Relaciones necesarias
CRUD de los diferentes modelos.<br>
Excelente Readme (IMPORTANTE)

#
<h3>Tecnologias Usadas</h3>

 <ul>
  <li>Java 17</li>
  <li>Spring Boot</li>
</ul> 

# 📁 Collection: Juego 


## End-point: READ_ALL_Juego
### Method: GET
>```
>localhost:8181/api/juego
>```
### Response: 200
```json
[
    {
        "id": 1,
        "nombre": "Minecraft",
        "plataforma": "PC"
    },
    {
        "id": 2,
        "nombre": "Fortnite",
        "plataforma": "PC"
    },
    {
        "id": 3,
        "nombre": "League of Legends",
        "plataforma": "PC"
    },
    {
        "id": 4,
        "nombre": "Super Mario",
        "plataforma": "Nintendo Switch"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: READ_BY_ID_Juego
### Method: GET
>```
>localhost:8181/api/juego/2
>```
### Response: 200
```json
{
    "id": 2,
    "nombre": "Fortnite",
    "plataforma": "PC"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: DELETE_Juego
### Method: DELETE
>```
>localhost:8181/api/juego/2
>```
### Response: 200
```json
Without body
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Grupo 


## End-point: READ_ALL_Grupo
### Method: GET
>```
>localhost:8181/api/grupo
>```
### Response: 200
```json
[
    {
        "id": 1,
        "nombre": "Grupo 1 - Minecraft modificado",
        "descripcion": "Unete a nuestra partida de Minecraft",
        "juego": {
            "id": 1,
            "nombre": "Minecraft",
            "plataforma": "PC"
        },
        "creador": {
            "id": 1,
            "nombre": "usuario1",
            "contrasena": "contrasena1",
            "mail": "usuario1@example.com"
        }
    },
    {
        "id": 2,
        "nombre": "Grupo 2 - Fortnite",
        "descripcion": "Unete a nuestra partida de Fortnite",
        "juego": {
            "id": 2,
            "nombre": "Fortnite",
            "plataforma": "PC"
        },
        "creador": {
            "id": 1,
            "nombre": "usuario1",
            "contrasena": "contrasena1",
            "mail": "usuario1@example.com"
        }
    },
    {
        "id": 3,
        "nombre": "Grupo 3 - League of Legends",
        "descripcion": "Unete a nuestra partida de LOL",
        "juego": {
            "id": 3,
            "nombre": "League of Legends",
            "plataforma": "PC"
        },
        "creador": {
            "id": 2,
            "nombre": "usuario2",
            "contrasena": "contrasena2",
            "mail": "usuario2@example.com"
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: READ_BY_ID_Grupo
### Method: GET
>```
>localhost:8181/api/grupo/2
>```
### Response: 200
```json
{
    "id": 2,
    "nombre": "Grupo 2 - Fortnite",
    "descripcion": "Unete a nuestra partida de Fortnite",
    "juego": {
        "id": 2,
        "nombre": "Fortnite",
        "plataforma": "PC"
    },
    "creador": {
        "id": 1,
        "nombre": "usuario1",
        "contrasena": "contrasena1",
        "mail": "usuario1@example.com"
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CREATE_Grupo
### Method: POST
>```
>localhost:8181/api/grupo
>```
### Body (**raw**)

```json
    {
        "nombre": "Grupo 5 - Minecraft",
        "descripcion": "Unete a nuestra partida de Minecraft",
        "juego": {
            "id": 1,
            "nombre": "Minecraft",
            "plataforma": "PC"
        },
        "creador": {
            "id": 2,
            "nombre": "usuario2",
            "contrasena": "contrasena2",
            "mail": "usuario2@example.com"
        }
    }
```

### Response: 200
```json
{
    "id": 4,
    "nombre": "Grupo 5 - Minecraft",
    "descripcion": "Unete a nuestra partida de Minecraft",
    "juego": {
        "id": 1,
        "nombre": "Minecraft",
        "plataforma": "PC"
    },
    "creador": {
        "id": 2,
        "nombre": "usuario2",
        "contrasena": "contrasena2",
        "mail": "usuario2@example.com"
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: UPDATE_Grupo
### Method: PUT
>```
>localhost:8181/api/grupo/1
>```
### Body (**raw**)

```json
    {
        "id": 1,
        "nombre": "Grupo 1 - Minecraft modificado",
        "descripcion": "Unete a nuestra partida de Minecraft",
        "juego": {
            "id": 1,
            "nombre": "Minecraft",
            "plataforma": "PC"
        },
        "creador": {
            "id": 1,
            "nombre": "usuario1",
            "contrasena": "contrasena1",
            "mail": "usuario1@example.com"
        }
    }
```

### Response: 200
```json
{
    "id": 1,
    "nombre": "Grupo 1 - Minecraft modificado",
    "descripcion": "Unete a nuestra partida de Minecraft",
    "juego": {
        "id": 1,
        "nombre": "Minecraft",
        "plataforma": "PC"
    },
    "creador": {
        "id": 1,
        "nombre": "usuario1",
        "contrasena": "contrasena1",
        "mail": "usuario1@example.com"
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: DELETE_Grupo
### Method: DELETE
>```
>localhost:8181/api/grupo/4
>```
### Response: 200
```json
Without body
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GruposXID_Juego
### Method: GET
>```
>localhost:8181/api/grupo-by-juego?id=2
>```
### Query Params

|Param|value|
|---|---|
|id|2|


### Response: 200
```json
[
    {
        "id": 2,
        "nombre": "Grupo 2 - Fortnite",
        "descripcion": "Unete a nuestra partida de Fortnite",
        "juego": {
            "id": 2,
            "nombre": "Fortnite",
            "plataforma": "PC"
        },
        "creador": {
            "id": 1,
            "nombre": "usuario1",
            "contrasena": "contrasena1",
            "mail": "usuario1@example.com"
        }
    },
    {
        "id": 4,
        "nombre": "Grupo 4 - Fortnie-Lovers",
        "descripcion": "Ven a disfrutar",
        "juego": {
            "id": 2,
            "nombre": "Fortnite",
            "plataforma": "PC"
        },
        "creador": {
            "id": 2,
            "nombre": "usuario2",
            "contrasena": "contrasena2",
            "mail": "usuario2@example.com"
        }
    },
    {
        "id": 5,
        "nombre": "Grupo 5 - Forniters",
        "descripcion": "Niños rata",
        "juego": {
            "id": 2,
            "nombre": "Fortnite",
            "plataforma": "PC"
        },
        "creador": {
            "id": 1,
            "nombre": "usuario1",
            "contrasena": "contrasena1",
            "mail": "usuario1@example.com"
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GruposXNombre_Juego
### Method: GET
>```
>localhost:8181/api/grupo-by-nombre?nombre=Fortnite
>```
### Query Params

|Param|value|
|---|---|
|nombre|Fortnite|


### Response: 200
```json
[
    {
        "id": 2,
        "nombre": "Grupo 2 - Fortnite",
        "descripcion": "Unete a nuestra partida de Fortnite",
        "juego": {
            "id": 2,
            "nombre": "Fortnite",
            "plataforma": "PC"
        },
        "creador": {
            "id": 1,
            "nombre": "usuario1",
            "contrasena": "contrasena1",
            "mail": "usuario1@example.com"
        }
    },
    {
        "id": 4,
        "nombre": "Grupo 4 - Fortnie-Lovers",
        "descripcion": "Ven a disfrutar",
        "juego": {
            "id": 2,
            "nombre": "Fortnite",
            "plataforma": "PC"
        },
        "creador": {
            "id": 2,
            "nombre": "usuario2",
            "contrasena": "contrasena2",
            "mail": "usuario2@example.com"
        }
    },
    {
        "id": 5,
        "nombre": "Grupo 5 - Forniters",
        "descripcion": "Niños rata",
        "juego": {
            "id": 2,
            "nombre": "Fortnite",
            "plataforma": "PC"
        },
        "creador": {
            "id": 1,
            "nombre": "usuario1",
            "contrasena": "contrasena1",
            "mail": "usuario1@example.com"
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Usuario 


## End-point: READ_ALL_Usuario
### Method: GET
>```
>localhost:8181/api/usuario
>```
### Response: 200
```json
[
    {
        "id": 1,
        "nombre": "usuario1",
        "contrasena": "contrasena1",
        "mail": "usuario1@example.com"
    },
    {
        "id": 2,
        "nombre": "usuario2",
        "contrasena": "contrasena2",
        "mail": "usuario2@example.com"
    },
    {
        "id": 3,
        "nombre": "usuario3",
        "contrasena": "contrasena3",
        "mail": "usuario3@example.com"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: READ_BY_ID_Usuario
### Method: GET
>```
>localhost:8181/api/usuario/2
>```
### Response: 200
```json
{
    "id": 2,
    "nombre": "usuario2",
    "contrasena": "contrasena2",
    "mail": "usuario2@example.com"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CREATE_Usuario
### Method: POST
>```
>localhost:8181/api/usuario
>```
### Body (**raw**)

```json
    {
        "nombre": "usuario nuevo",
        "contrasena": "contrasena nueva",
        "mail": "usuario_nuevo@example.com"
    }
```

### Response: 200
```json
{
    "id": 4,
    "nombre": "usuario nuevo",
    "contrasena": "contrasena nueva",
    "mail": "usuario_nuevo@example.com"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: UPDATE_Usuario
### Method: PUT
>```
>localhost:8181/api/usuario/1
>```
### Body (**raw**)

```json
    {
        "nombre": "usuario_modificado",
        "contrasena": "contrasena_modificada",
        "mail": "usuario1@example.com"
    }
```

### Response: 200
```json
{
    "id": 1,
    "nombre": "usuario_modificado",
    "contrasena": "contrasena_modificada",
    "mail": "usuario1@example.com"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: DELETE_Usuario
### Method: DELETE
>```
>localhost:8181/api/usuario/4
>```
### Response: 200
```json
Without body
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Mensaje 


## End-point: READ_ALL_Mensaje
### Method: GET
>```
>localhost:8181/api/mensaje
>```
### Response: 200
```json
[
    {
        "id": 1,
        "contenido": "¡Hola a todos!",
        "fecha_hora": "2023-04-19 12:00:00",
        "usuario": {
            "id": 1,
            "nombre": "usuario1",
            "contrasena": "contrasena1",
            "mail": "usuario1@example.com"
        },
        "grupo": {
            "id": 1,
            "nombre": "Grupo 1 - Minecraft",
            "descripcion": "Unete a nuestra partida de Minecraft",
            "juego": {
                "id": 1,
                "nombre": "Minecraft",
                "plataforma": "PC"
            },
            "creador": {
                "id": 1,
                "nombre": "usuario1",
                "contrasena": "contrasena1",
                "mail": "usuario1@example.com"
            }
        }
    },
    {
        "id": 2,
        "contenido": "¿Alguien quiere jugar una partida?",
        "fecha_hora": "2023-04-19 12:10:00",
        "usuario": {
            "id": 2,
            "nombre": "usuario2",
            "contrasena": "contrasena2",
            "mail": "usuario2@example.com"
        },
        "grupo": {
            "id": 1,
            "nombre": "Grupo 1 - Minecraft",
            "descripcion": "Unete a nuestra partida de Minecraft",
            "juego": {
                "id": 1,
                "nombre": "Minecraft",
                "plataforma": "PC"
            },
            "creador": {
                "id": 1,
                "nombre": "usuario1",
                "contrasena": "contrasena1",
                "mail": "usuario1@example.com"
            }
        }
    },
    {
        "id": 3,
        "contenido": "¡Estoy buscando equipo para una partida!",
        "fecha_hora": "2023-04-19 12:30:00",
        "usuario": {
            "id": 3,
            "nombre": "usuario3",
            "contrasena": "contrasena3",
            "mail": "usuario3@example.com"
        },
        "grupo": {
            "id": 2,
            "nombre": "Grupo 2 - Fortnite",
            "descripcion": "Unete a nuestra partida de Fortnite",
            "juego": {
                "id": 2,
                "nombre": "Fortnite",
                "plataforma": "PC"
            },
            "creador": {
                "id": 1,
                "nombre": "usuario1",
                "contrasena": "contrasena1",
                "mail": "usuario1@example.com"
            }
        }
    },
    {
        "id": 4,
        "contenido": "¡Estoy disponible para jugar ahora mismo!",
        "fecha_hora": "2023-04-19 13:00:00",
        "usuario": {
            "id": 1,
            "nombre": "usuario1",
            "contrasena": "contrasena1",
            "mail": "usuario1@example.com"
        },
        "grupo": {
            "id": 3,
            "nombre": "Grupo 3 - League of Legends",
            "descripcion": "Unete a nuestra partida de LOL",
            "juego": {
                "id": 3,
                "nombre": "League of Legends",
                "plataforma": "PC"
            },
            "creador": {
                "id": 2,
                "nombre": "usuario2",
                "contrasena": "contrasena2",
                "mail": "usuario2@example.com"
            }
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: READ_BY_ID_Mensaje
### Method: GET
>```
>localhost:8181/api/mensaje/2
>```
### Response: 200
```json
{
    "id": 2,
    "contenido": "¿Alguien quiere jugar una partida?",
    "fecha_hora": "2023-04-19 12:10:00",
    "usuario": {
        "id": 2,
        "nombre": "usuario2",
        "contrasena": "contrasena2",
        "mail": "usuario2@example.com"
    },
    "grupo": {
        "id": 1,
        "nombre": "Grupo 1 - Minecraft",
        "descripcion": "Unete a nuestra partida de Minecraft",
        "juego": {
            "id": 1,
            "nombre": "Minecraft",
            "plataforma": "PC"
        },
        "creador": {
            "id": 1,
            "nombre": "usuario_modificado",
            "contrasena": "contrasena_modificada",
            "mail": "usuario1@example.com"
        }
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CREATE_Mensaje
### Method: POST
>```
>localhost:8181/api/mensaje
>```
### Body (**raw**)

```json
{

    "contenido": "¿Estoy solo alguien se une?",
    "fecha_hora": "2023-04-18 12:10:00",
    "usuario": {
        "id": 1,
        "nombre": "usuario1",
        "contrasena": "contrasena1",
        "mail": "usuario1@example.com"
    },
    "grupo": {
        "id": 1,
        "nombre": "Grupo 1 - Minecraft",
        "descripcion": "Unete a nuestra partida de Minecraft",
        "juego": {
            "id": 1,
            "nombre": "Minecraft",
            "plataforma": "PC"
        },
        "creador": {
            "id": 1,
            "nombre": "usuario1",
            "contrasena": "contrasena1",
            "mail": "usuario1@example.com"
        }
    }
}
```

### Response: 200
```json
{
    "id": 5,
    "contenido": "¿Estoy solo alguien se une?",
    "fecha_hora": "2023-04-18 12:10:00",
    "usuario": {
        "id": 1,
        "nombre": "usuario1",
        "contrasena": "contrasena1",
        "mail": "usuario1@example.com"
    },
    "grupo": {
        "id": 1,
        "nombre": "Grupo 1 - Minecraft",
        "descripcion": "Unete a nuestra partida de Minecraft",
        "juego": {
            "id": 1,
            "nombre": "Minecraft",
            "plataforma": "PC"
        },
        "creador": {
            "id": 1,
            "nombre": "usuario1",
            "contrasena": "contrasena1",
            "mail": "usuario1@example.com"
        }
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: UPDATE_Mensaje
### Method: PUT
>```
>localhost:8181/api/mensaje/2
>```
### Body (**raw**)

```json
{
    "contenido": "¿Alguien quiere jugar una partida, por favor que estoy muy soloooo",
    "fecha_hora": "2023-04-19 23:07:00",
    "usuario": {
        "id": 2,
        "nombre": "usuario2",
        "contrasena": "contrasena2",
        "mail": "usuario2@example.com"
    },
    "grupo": {
        "id": 1,
        "nombre": "Grupo 1 - Minecraft",
        "descripcion": "Unete a nuestra partida de Minecraft",
        "juego": {
            "id": 1,
            "nombre": "Minecraft",
            "plataforma": "PC"
        },
        "creador": {
            "id": 1,
            "nombre": "usuario_modificado",
            "contrasena": "contrasena_modificada",
            "mail": "usuario1@example.com"
        }
    }
}
```

### Response: 200
```json
{
    "id": 6,
    "contenido": "¿Alguien quiere jugar una partida, por favor que estoy muy soloooo",
    "fecha_hora": "2023-04-19 23:07:00",
    "usuario": {
        "id": 2,
        "nombre": "usuario2",
        "contrasena": "contrasena2",
        "mail": "usuario2@example.com"
    },
    "grupo": {
        "id": 1,
        "nombre": "Grupo 1 - Minecraft",
        "descripcion": "Unete a nuestra partida de Minecraft",
        "juego": {
            "id": 1,
            "nombre": "Minecraft",
            "plataforma": "PC"
        },
        "creador": {
            "id": 1,
            "nombre": "usuario_modificado",
            "contrasena": "contrasena_modificada",
            "mail": "usuario1@example.com"
        }
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: DELETE_Mensaje
### Method: DELETE
>```
>localhost:8181/api/mensaje/5
>```
### Response: 200
```json
Without body
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Participa 


## End-point: READ_ALL_Participa
### Method: GET
>```
>localhost:8181/api/participa
>```
### Response: 200
```json
[
    {
        "id": 1,
        "usuario": {
            "id": 1,
            "nombre": "usuario1",
            "contrasena": "contrasena1",
            "mail": "usuario1@example.com"
        },
        "grupo": {
            "id": 1,
            "nombre": "Grupo 1 - Minecraft",
            "descripcion": "Unete a nuestra partida de Minecraft",
            "juego": {
                "id": 1,
                "nombre": "Minecraft",
                "plataforma": "PC"
            },
            "creador": {
                "id": 1,
                "nombre": "usuario1",
                "contrasena": "contrasena1",
                "mail": "usuario1@example.com"
            }
        }
    },
    {
        "id": 2,
        "usuario": {
            "id": 1,
            "nombre": "usuario1",
            "contrasena": "contrasena1",
            "mail": "usuario1@example.com"
        },
        "grupo": {
            "id": 2,
            "nombre": "Grupo 2 - Fortnite",
            "descripcion": "Unete a nuestra partida de Fortnite",
            "juego": {
                "id": 2,
                "nombre": "Fortnite",
                "plataforma": "PC"
            },
            "creador": {
                "id": 1,
                "nombre": "usuario1",
                "contrasena": "contrasena1",
                "mail": "usuario1@example.com"
            }
        }
    },
    {
        "id": 3,
        "usuario": {
            "id": 2,
            "nombre": "usuario2",
            "contrasena": "contrasena2",
            "mail": "usuario2@example.com"
        },
        "grupo": {
            "id": 1,
            "nombre": "Grupo 1 - Minecraft",
            "descripcion": "Unete a nuestra partida de Minecraft",
            "juego": {
                "id": 1,
                "nombre": "Minecraft",
                "plataforma": "PC"
            },
            "creador": {
                "id": 1,
                "nombre": "usuario1",
                "contrasena": "contrasena1",
                "mail": "usuario1@example.com"
            }
        }
    },
    {
        "id": 4,
        "usuario": {
            "id": 2,
            "nombre": "usuario2",
            "contrasena": "contrasena2",
            "mail": "usuario2@example.com"
        },
        "grupo": {
            "id": 3,
            "nombre": "Grupo 3 - League of Legends",
            "descripcion": "Unete a nuestra partida de LOL",
            "juego": {
                "id": 3,
                "nombre": "League of Legends",
                "plataforma": "PC"
            },
            "creador": {
                "id": 2,
                "nombre": "usuario2",
                "contrasena": "contrasena2",
                "mail": "usuario2@example.com"
            }
        }
    },
    {
        "id": 5,
        "usuario": {
            "id": 3,
            "nombre": "usuario3",
            "contrasena": "contrasena3",
            "mail": "usuario3@example.com"
        },
        "grupo": {
            "id": 2,
            "nombre": "Grupo 2 - Fortnite",
            "descripcion": "Unete a nuestra partida de Fortnite",
            "juego": {
                "id": 2,
                "nombre": "Fortnite",
                "plataforma": "PC"
            },
            "creador": {
                "id": 1,
                "nombre": "usuario1",
                "contrasena": "contrasena1",
                "mail": "usuario1@example.com"
            }
        }
    },
    {
        "id": 6,
        "usuario": {
            "id": 3,
            "nombre": "usuario3",
            "contrasena": "contrasena3",
            "mail": "usuario3@example.com"
        },
        "grupo": {
            "id": 3,
            "nombre": "Grupo 3 - League of Legends",
            "descripcion": "Unete a nuestra partida de LOL",
            "juego": {
                "id": 3,
                "nombre": "League of Legends",
                "plataforma": "PC"
            },
            "creador": {
                "id": 2,
                "nombre": "usuario2",
                "contrasena": "contrasena2",
                "mail": "usuario2@example.com"
            }
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: READ_BY_ID_Participa
### Method: GET
>```
>localhost:8181/api/participa/3
>```
### Response: 200
```json
{
    "id": 3,
    "usuario": {
        "id": 2,
        "nombre": "usuario2",
        "contrasena": "contrasena2",
        "mail": "usuario2@example.com"
    },
    "grupo": {
        "id": 1,
        "nombre": "Grupo 1 - Minecraft",
        "descripcion": "Unete a nuestra partida de Minecraft",
        "juego": {
            "id": 1,
            "nombre": "Minecraft",
            "plataforma": "PC"
        },
        "creador": {
            "id": 1,
            "nombre": "usuario_modificado",
            "contrasena": "contrasena_modificada",
            "mail": "usuario1@example.com"
        }
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CREATE_Participa
### Method: POST
>```
>localhost:8181/api/participa
>```
### Body (**raw**)

```json
    {
        "usuario": {
            "id": 3,
            "nombre": "usuario3",
            "contrasena": "contrasena3",
            "mail": "usuario1@example.com"
        },
        "grupo": {
            "id": 2,
            "nombre": "Grupo 2 - Fortnite",
            "descripcion": "Unete a nuestra partida de Fortnite",
            "juego": {
            "id": 2,
            "nombre": "Fortnite",
            "plataforma": "PC"
        },
            "creador": {
                "id": 1,
                "nombre": "usuario1",
                "contrasena": "contrasena1",
                "mail": "usuario1@example.com"
            }
        }
    }
```

### Response: 200
```json
{
    "id": 7,
    "usuario": {
        "id": 3,
        "nombre": "usuario3",
        "contrasena": "contrasena3",
        "mail": "usuario1@example.com"
    },
    "grupo": {
        "id": 2,
        "nombre": "Grupo 2 - Fortnite",
        "descripcion": "Unete a nuestra partida de Fortnite",
        "juego": {
            "id": 2,
            "nombre": "Fortnite",
            "plataforma": "PC"
        },
        "creador": {
            "id": 1,
            "nombre": "usuario1",
            "contrasena": "contrasena1",
            "mail": "usuario1@example.com"
        }
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: UPDATE_Participa
### Method: PUT
>```
>localhost:8181/api/participa/1
>```
### Body (**raw**)

```json
{
    "usuario": {
        "id": 1,
        "nombre": "usuario_modificado",
        "contrasena": "contrasena_modificada",
        "mail": "usuario1@example.com"
    },
    "grupo": {
        "id": 2,
        "nombre": "Grupo 2 - Fortnite",
        "descripcion": "Unete a nuestra partida de Fortnite",
        "juego": {
            "id": 2,
            "nombre": "Fortnite",
            "plataforma": "PC"
        },
        "creador": {
            "id": 1,
            "nombre": "usuario1",
            "contrasena": "contrasena1",
            "mail": "usuario1@example.com"
        }
    }
}
```

### Response: 200
```json
{
    "id": 1,
    "usuario": {
        "id": 1,
        "nombre": "usuario_modificado",
        "contrasena": "contrasena_modificada",
        "mail": "usuario1@example.com"
    },
    "grupo": {
        "id": 2,
        "nombre": "Grupo 2 - Fortnite",
        "descripcion": "Unete a nuestra partida de Fortnite",
        "juego": {
            "id": 2,
            "nombre": "Fortnite",
            "plataforma": "PC"
        },
        "creador": {
            "id": 1,
            "nombre": "usuario1",
            "contrasena": "contrasena1",
            "mail": "usuario1@example.com"
        }
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: DELETE_Participa
### Method: DELETE
>```
>localhost:8181/api/participa/7
>```
### Response: 200
```json
Without body
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
_________________________________________________


