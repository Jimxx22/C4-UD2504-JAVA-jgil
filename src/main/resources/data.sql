DROP table IF EXISTS Salas;
DROP table IF EXISTS Peliculas;

create table Peliculas(
    codigo int auto_increment,
    nombre varchar(100),
    calificacion_Edad int,
    PRIMARY KEY (codigo)
);

create table Salas(
    codigo int auto_increment,
    nombre varchar(100),
    codigo_Pelicula int,
    PRIMARY KEY (codigo),
    FOREIGN KEY (codigo_Pelicula) REFERENCES Peliculas(codigo)
);

insert into Peliculas (nombre, calificacion_Edad)values('Pelicula1', 12);
insert into Peliculas (nombre, calificacion_Edad)values('Pelicula2', 16);
insert into Peliculas (nombre, calificacion_Edad)values('Pelicula3', 18);

insert into Salas (nombre, codigo_Pelicula)values('sala1', 1);
insert into Salas (nombre, codigo_Pelicula)values('sala2', 1);
insert into Salas (nombre, codigo_Pelicula)values('sala3', 3);