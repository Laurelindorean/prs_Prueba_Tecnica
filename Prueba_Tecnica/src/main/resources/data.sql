DROP TABLE IF EXISTS juego;
DROP TABLE IF EXISTS grupo;
DROP TABLE IF EXISTS mensaje;
DROP TABLE IF EXISTS usuario;
DROP TABLE IF EXISTS participa;


CREATE TABLE juego (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(255),
  plataforma VARCHAR(255)
);

CREATE TABLE usuario (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(255)NOT NULL,
  contrasena VARCHAR(255) NOT NULL,
  mail VARCHAR(300) NOT NULL
);


CREATE TABLE grupo (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(255),
  descripcion VARCHAR(255),
  juego_id INT,
  creador_id INT,
  FOREIGN KEY (juego_id) REFERENCES juego(id)
  ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY(creador_id) REFERENCES usuario(id)
  ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE participa (
  id INT AUTO_INCREMENT PRIMARY KEY, 
  usuario_id VARCHAR,
  grupo_id INT,
  FOREIGN KEY (usuario_id) REFERENCES usuario(id)
  ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (grupo_id) REFERENCES grupo(id)
  ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE mensaje (
  id INT AUTO_INCREMENT PRIMARY KEY,
  contenido VARCHAR(255) NOT NULL,
  fecha_hora TIMESTAMP NOT NULL,
  usuario_id INT,
  grupo_id INT,
  FOREIGN KEY (usuario_id) REFERENCES usuario(id)
  ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (grupo_id) REFERENCES grupo(id)
  ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO juego (nombre, plataforma) VALUES
('Minecraft', 'PC'),
('Fortnite', 'PC'),
('League of Legends', 'PC'),
('Super Mario', 'Nintendo Switch');

INSERT INTO usuario (nombre, contrasena, mail) VALUES
('usuario1', 'contrasena1', 'usuario1@example.com'),
('usuario2', 'contrasena2', 'usuario2@example.com'),
('usuario3', 'contrasena3', 'usuario3@example.com');

INSERT INTO grupo (nombre, descripcion, juego_id, creador_id) VALUES
('Grupo 1 - Minecraft', 'Unete a nuestra partida de Minecraft', 1, 1),
('Grupo 2 - Fortnite', 'Unete a nuestra partida de Fortnite', 2, 1),
('Grupo 3 - League of Legends','Unete a nuestra partida de LOL', 3, 2);

INSERT INTO participa (usuario_id, grupo_id) VALUES
(1, 1),
(1, 2),
(2, 1),
(2, 3),
(3, 2),
(3, 3);

INSERT INTO mensaje (contenido, fecha_hora, usuario_id, grupo_id) VALUES
('¡Hola a todos!', '2023-04-19 12:00:00', 1, 1),
('¿Alguien quiere jugar una partida?', '2023-04-19 12:10:00', 2, 1),
('¡Estoy buscando equipo para una partida!', '2023-04-19 12:30:00', 3, 2),
('¡Estoy disponible para jugar ahora mismo!', '2023-04-19 13:00:00', 1, 3);
