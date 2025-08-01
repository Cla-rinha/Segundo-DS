CREATE DATABASE etimpwiicontato;
USE etimpwiicontato;
Create Table contato(
    id int primary key auto_increment,
    nome varchar(100),
    email varchar(150),
    senha varchar(32)
);

INSERT INTO contato SET nome = "Admin", email = "admin@g,ail.com", senha = "123";
