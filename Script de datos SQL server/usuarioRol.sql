INSERT INTO usuario( nombre, clave, estado) values ( 'administrador@gmail.com', '$2a$10$cB8JJORcgwg9kHX2IK15FuAK/B/pMh9yV13apbS0W0LsFK78u6dOe', '1');
INSERT INTO usuario( nombre, clave, estado) values ( 'medico@gmail.com', '$2a$10$cB8JJORcgwg9kHX2IK15FuAK/B/pMh9yV13apbS0W0LsFK78u6dOe'1');
 //La contraseña es 1234
INSERT INTO rol(nombre, descripcion) VALUES ( 'ADMIN', 'Administrador');
INSERT INTO Rol ( nombre, descripcion) VALUES ( 'USER', 'Usuario');
INSERT INTO Rol ( nombre, descripcion) VALUES ( 'DBA', 'Admin de bd');
 
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (1, 1);
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (1, 3);
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (2, 2);