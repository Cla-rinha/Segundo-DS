CREATE DATABASE usuariopw2;
use usuariopw2;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARI KEY,
    nome VARCHAR(50),
    email VARCHAR(100),
    senha VARCHAR(32)
)