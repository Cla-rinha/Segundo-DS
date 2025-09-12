/*Criando a base de dados*/
CREATE DATABASE bd_Escola6;
CREATE DATABASE bd_Unidade;
 
/*Usando a base de dados*/
USE bd_Escola6;
 
/*Excluindo a base de dados*/
DROP DATABASE bd_Unidade;
 
 
create table Turma(
id_Turma int primary key auto_increment,
capacidade smallint not null check(capacidade < 41)
);
 
create table Professor(
id_Professor int primary key auto_increment,
nome varchar(150) not null
);
 
create table Telefone(
telefone int primary key,
id_Professor int,
foreign key (id_Professor) references Professor(id_Professor) 
);
 
create table Vinculo(
primary key(id_Turma, id_Professor),
id_Turma int,
id_Professor int,
foreign key (id_Turma) references Turma(id_Turma),
foreign key (id_Professor) references Professor(id_Professor)
);
 
/*Alterando dados das tabelas*/
alter table Turma add sala tinyint not null;
alter table Turma add curso varchar(100) not null;
alter table Professor add rg int not null;
alter table Professor add cpf varchar(14) unique not null;
alter table Professor add sede char(2) not null check (sede = 'SP' or sede = 'RJ' or sede = 'SC' or sede = 'ES');
 
select * from Vinculo;
 
alter table Professor
drop column sede;

select * from Professor; -- mostra tudo da tabela
select nome,rg from Professor; -- mostra coisas especificas da tabela

create table Aluno_(
matricula int primary key,
nome varchar(150) not null,
cpf bigint unique not null,
data_nasc date not null
);

/*Inicio da aula select e inserir na tabela*/
insert into Aluno_ (matricula, nome, cpf, data_nasc) values (1234 , "Caua" , 1234567891011, 2007-07-14);

insert into Aluno_ (matricula, nome, cpf, data_nasc) values (122333345 , "Nikolas" , 123467891011, 2007-07-14) ,
(12332456 , "Tamires" , 1234345678011, 2007-07-14) , (1232564 , "Fatima" , 12345685439111, '2007-07-14');

insert into Aluno_ (matricula, nome, cpf, data_nasc) values (12141618, "Marcos Vinicios", 5446678998764, 2009-01-01);

insert into Aluno_ (matricula, nome, cpf, data_nasc) values (1333345 , "Augusto" , 123467011, '2007-07-14') ,
(1233242356 , "Leticia" , 1234378011, '2007-07-14');

select * from Aluno_;

select * from Turma;

INSERT INTO Turma (capacidade, sala, curso) VALUES
(20, 10, 'Contabilidade'), (18, 4, 'Administração'), (40, 6, 'Segurança do Trabalho'), (25, 1, 'Informática'),
(12, 3, 'Recursos Humanos'),(16, 7, 'Logística'), (40, 5, 'Meio Ambiente'), (22, 2, 'Engenharia'),
(10, 8, 'Enfermagem');

INSERT INTO Professor (nome, rg, cpf) VALUES
("Maria cristina", 12345678, 124658457), ("Pedro barbosa", 12345679, 98563274825), ("Marcelo dos Santos", 12345677, 12487596317), ("Beatriz soares", 12345676, 24185941274),
("Camila costa", 12345675, 98547585241),("Joao victor", 12345674, 54196578584), ("Thiago da silva", 12345673, 25762783425), ("Leonardo pereira", 12345672, 23448195357),
("Luciano goncalves", 12345671, 54196578574) , ("Antonio da silva" , 12345610 , 41297532598);

INSERT INTO Vinculo (id_Turma, id_Professor) VALUES 
(4, 3), (2, 7), (6, 1), (1, 5), (5, 2), (4, 9), (7, 1), (3, 8), (1, 6), (9, 1), (5, 9), (3, 10);

INSERT INTO Telefone (id_professor, telefone) VALUES
(1, 58749645), (2, 47186574), (3, 68749582), (4, 63748129), (5, 45637287), (6, 32649764), (7, 53648923), (8, 82953746), (9, 83547592), (9, 74538254), (10, 24381907),
(4, 53749853), (3, 52736285), (7, 53648965), (6, 54673904), (3, 62437859);

select * from Professor;
/*Fim da aula select e inserir na tabela*/

/*Inicio da Aula update e delete*/
update Professor
set nome = "Marcela dos Santos"
where id_Professor = 3;

select * from Professor
where id_professor = 5;

select * from Professor
where nome = "Maria Cristina";

select * from Professor;

update Telefone
set telefone = 58749646
where id_professor = 1;

select * from Telefone;

delete from Telefone
where id_professor = 9;

select * from Telefone;

delete from Aluno_
where matricula = 1233242356;

delete from Telefone
where id_professor = 7;

select * from Vinculo
where id_turma = 4;

delete from Vinculo
where id_professor = 7;

delete from Professor
where id_professor = 7;

delete from Vinculo
where id_turma = 9;

delete from Turma 
where id_turma = 9;

select * from Professor
where id_professor < 5;

select * from Professor
where id_professor > 5;
/*Fim da Aula update e delete*/

/*Exercicio 1 - 12/09 */
select * from Aluno_
where matricula = 1234;

/*Exercicio 2 - 12/09 */
select * from Professor
where nome = "Leonardo pereira";

/*Exercicio 3 - 12/09 */
select * from Telefone
where id_professor = 4;

/*Exercicio 4 - 12/09 */
select * from Turma
where capacidade > 22;

/*Exercicio 5 - 12/09 */
select * from Vinculo
where id_professor = 3;

/*Exercicio 6 - 12/09 */
select * from Professor
where id_professor <= 6;

/*Exercicio 7 - 12/09 */
select capacidade from Turma
where curso = "Informática";

/*Exercicio 8 - 12/09 */
select * from Aluno_
where data_nasc > "1996 - 01 - 01";

/*Incio da aula and, or, not - 12/09*/
select * from Vinculo
where id_Professor = 3 and id_turma = 4;

select * from Telefone 
where telefone = 53749853 and id_Professor = 4;

select * from Vinculo
where id_Professor = 0 or id_turma = 4;

select * from Telefone 
where telefone = 53749859 or id_Professor = 4;

select * from Professor
where not id_professor = 5;

select * from Telefone
where not Telefone = 53749853 and not id_professor = 4;
/*Fim da aula and, or, not*/

/*Sintaxe LIKE*/

/*Sintaxe Inicio*/
select * from Professor
where nome like "C%";

/*Sintaxe fim*/
select * from Professor
where nome like "%or";

/*Sintaxe meio*/
select * from Aluno_
where nome like "%co%";