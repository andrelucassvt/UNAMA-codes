create table academia(
    cnpj int not null primary key,
    nome varchar(100) not null check(length(nome)> 2)
);

create table aluno (
	matricula int primary key,
    cpf int,
	nome varchar(100) not null check(length(nome) >2)
);

create table matricula(
	idMatricula int not null primary key auto_increment,
    matricula int not null,
    cnpj int,
    idModalidade int not null,
    situacao enum("A","I"),
    dataMatricula date,
    constraint pk_aluno foreign key (matricula) references aluno,
    constraint pk_modalidade foreign key (idModalidade) references modalidade,
    constraint pk_academia foreign key (cnpj) references academia
);

create table modalidade(
	idModalidade int not null primary key auto_increment,
    quantidadeVagas int,
    descricao varchar(100),
    preco float not null,
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

insert into modalidade values(default,'20',' Natação','60.0'), (default,'20','Futebol','100'),(default,'20','Corrida','30.0'),
(default,'20','Vôlei','80.0'),(default,'20','Luta','100.0');

insert into aluno values('04041884','1443456','André Lucas Barbosa Salvador'),('1019823','15156456','Igor da Silva Soares'),
('8979175','12312441','Andrei Victor Leao'),('01862818','1142556','Diogo Felipe'),('10101927','91973556','Isabela Lima'),
('10282734','1949376','Kevin Sarges'),('22356312','129398656','Erick Lima'),('19198265','1148636','Daniel Henriques'),
('10109275','1937455','Wagner Barbalho'),('1277853','19394556','Caio Rafael');

insert into matricula values (default,'04041884','123456','4','A','2020-03-19'),(default,'1019823','123456','2','A','2020-03-19'),
(default,'8979175','123456','1','A','2020-03-19'),(default,'01862818','123456','3','A','2020-03-19'),
(default,'10101927','123456','5','A','2020-03-19'),
(default,'10282734','123456','4','A','2020-03-19'),(default,'22356312','123456','2','A','2020-03-19'),
(default,'19198265','123456','5','A','2020-03-19'),
(default,'10109275','442145','1','A','2020-03-19'),(default,'1277853','442145','3','A','2020-03-19');








