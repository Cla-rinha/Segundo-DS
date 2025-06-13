create table Turma(
id_turma int primary key auto_increment,
capacidade smallint not null check(capacidade < 41)
);

create table Professor(
id_professor int primary key auto_increment,
nome varchar(150) not null
);

create table Telefone(
telefone int primary key,
id_professor int,
foreign key (id_professor) references Professor (id_professor)
);

create table Vinculo(
primary key (id_turma, id_professor),
id_turma int,
id_professor int,
foreign key (id_turma) references Turma(id_turma),
foreign key (id_professor) references professor(id_professor)
);

alter table Turma add sala tinyint not null;
alter table Turma add curso varchar(100) not null;

alter table professor add rg bigint not null;
alter table professor add cpf varchar(14) unique;
alter table professor add sede varchar(2) not null;