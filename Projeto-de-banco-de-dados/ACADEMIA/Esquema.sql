create table academia(
    cnpj int not null primary key,
    nome varchar(100) not null check(length(nome)> 2)
);

create table aluno (
	matricula int auto_increment primary key,
    cpf int unique,
    cnpj int,
	nome varchar(100) not null check(length(nome) >2),
    constraint pk_academia foreign key(cnpj) references academia
);


create table matricula(
	idMatricula int not null primary key auto_increment,
    matricula int not null,
    situacao enum("A","I"),
    dataMatricula date,
    constraint pk_aluno foreign key (matricula) references aluno
);

create table modalidade(
	idModalidade int not null primary key auto_increment,
    quantidadeVagas int,
    descricao varchar(100),
    constraint pk_modalidade_descricao check(length(descricao) >2)
);

create table itemMatricula(
	iditem int not null primary key auto_increment,
    idMatricula int,
    idModalidade int,
    constraint pk_matricula foreign key (idMatricula) references matricula,
    constraint pk_modalidade foreign key (idModalidade)references modalidade
);

insert into academia values('123456','Marajó Academy');
insert into academia values('442145', 'Top forma'); 

alter table aluno add constraint pk_aluno unique(cnpj,cpf);

insert into modalidade values(default,'20',' Natação'), (default,'20','Futebol'),(default,'20','Corrida'),
(default,'20','Vôlei'),(default,'20','Luta');

insert into aluno values('04041884','1443456','123456','André Lucas Barbosa Salvador'),('1019823','15156456','123456','Igor da Silva Soares'),
('8979175','12312441','123456','Andrei Victor Leao'),('01862818','1142556','123456','Diogo Felipe'),('10101927','91973556','442145','Isabela Lima'),
('10282734','1949376','442145','Kevin Sarges'),('22356312','129398656','442145','Erick Lima'),('19198265','1148636','442145','Daniel Henriques'),
('10109275','1937455','123456','Wagner Barbalho'),('1277853','19394556','123456','Caio Rafael');

insert into matricula values (default,'04041884','A','2020-03-19'),(default,'1019823','A','2020-03-19'),
(default,'8979175','A','2020-03-19'),(default,'01862818','A','2020-03-19'),(default,'10101927','A','2020-03-19'),
(default,'10282734','A','2020-03-19'),(default,'22356312','A','2020-03-19'),(default,'19198265','A','2020-03-19'),
(default,'10109275','A','2020-03-19'),(default,'1277853','A','2020-03-19');












