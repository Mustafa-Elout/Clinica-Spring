INSERT INTO menu(id_menu, nombre, icono, url) VALUES (1, 'Inicio', 'home', '/pages/inicio');
INSERT INTO menu(id_menu, nombre, icono, url) VALUES (2, 'Buscar', 'search', '/pages/buscar');
INSERT INTO menu(id_menu, nombre, icono, url) VALUES (3, 'Registrar', 'insert_drive_file', '/pages/consulta');
INSERT INTO menu(id_menu, nombre, icono, url) VALUES (4, 'Registrar E.', 'insert_drive_file', '/pages/consulta-especial');
INSERT INTO menu(id_menu, nombre, icono, url) VALUES (5, 'Registrar W.', 'view_carousel', '/pages/consulta-wizard');
INSERT INTO menu(id_menu, nombre, icono, url) VALUES (6, 'Especialiades', 'star_rate', '/pages/especialidad');
INSERT INTO menu(id_menu, nombre, icono, url) VALUES (7, 'Médicos', 'healing', '/pages/medico');
INSERT INTO menu(id_menu, nombre, icono, url) VALUES (8, 'Analíticas', 'assignment', '/pages/analitica');
INSERT INTO menu(id_menu, nombre, icono, url) VALUES (9, 'Pacientes', 'accessibility', '/pages/paciente');
INSERT INTO menu(id_menu, nombre, icono, url) VALUES (10, 'Reportes', 'assessment', '/pages/reporte');

select m.* from menu_rol mr inner join usuario_rol ur on ur.id_rol = mr.id_rol inner join menu m on m.id_menu = mr.id_menu inner join usuario u on u.id_usuario = ur.id_usuario where u.nombre = 'administrador@gmail.com'