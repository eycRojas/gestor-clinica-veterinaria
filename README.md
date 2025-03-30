El proyecto funsiona con una base de datos ya creada en MySQL, el script para la base de datos es el siguiente:
CREATE DATABASE DB_CentroVeterinarioIxtepec;

USE DB_CentroVeterinarioIxtepec;

CREATE TABLE USUARIO(
idUsuario INT AUTO_INCREMENT PRIMARY KEY,
usuario VARCHAR(255),
nombre VARCHAR(255),
contrasenia VARCHAR(255)
);

INSERT INTO USUARIO(usuario, nombre, contrasenia)
VALUES('admin', 'Administrador', '12345678');

CREATE TABLE CLIENTES(
idCliente INT AUTO_INCREMENT PRIMARY KEY,
clave VARCHAR(10),
nombre VARCHAR(50),
apePaterno VARCHAR(50),
apeMaterno VARCHAR(50),
direccion VARCHAR(60),
telefono CHAR(10)
);

CREATE TABLE MASCOTAS(
idMascota INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(50),
especie VARCHAR(50),
raza VARCHAR(50),
color VARCHAR(50),
sexo char(1),
senias VARCHAR(50),
fecha_nacimiento DATE,
cliente_idcliente INT,
FOREIGN KEY (cliente_idcliente) REFERENCES CLIENTES (idCliente) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE INGRESOS(
idIngreso INT AUTO_INCREMENT PRIMARY KEY,
cirugia VARCHAR(60),
fechaIngreso DATE,
horaIngreso TIME,
fechaEgreso DATE,
horaEgreso TIME,
estadoAlta CHAR(1),
costo DOUBLE,
estadoPagado CHAR(1),
mascota_idmascota INT,
FOREIGN KEY (mascota_idmascota) REFERENCES MASCOTAS(idMascota) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE VACUNAS(
idVacunacion INT AUTO_INCREMENT PRIMARY KEY,
nombreVacuna VARCHAR(30),
dosis DOUBLE,
peso DOUBLE,
temperatura DOUBLE,
fechaVacunacion DATE,
fechaProxVacunacion DATE,
mascota_idmascota INT,
FOREIGN KEY (mascota_idmascota) REFERENCES MASCOTAS(idMascota) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE DESPARASITACIONES(
idDesparasitante INT AUTO_INCREMENT PRIMARY KEY,
nombreDesparasitante VARCHAR(30),
dosis DOUBLE,
peso DOUBLE,
temperatura DOUBLE,
fechaDesparasitacion DATE,
fechaProxDesparasitacion DATE,
mascota_idmascota INT,
FOREIGN KEY (mascota_idmascota) REFERENCES MASCOTAS(idMascota) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE CITAS(
idCita INT AUTO_INCREMENT PRIMARY KEY,
asunto VARCHAR(50),
descripcion VARCHAR(200),
fecha DATE,
hora TIME,
estadoAtendida CHAR(1),
mascota_idmascota INT,
FOREIGN KEY (mascota_idmascota) REFERENCES MASCOTAS(idMascota) ON DELETE CASCADE ON UPDATE CASCADE
);
