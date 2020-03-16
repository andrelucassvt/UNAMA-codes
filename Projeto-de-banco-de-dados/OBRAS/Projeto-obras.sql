
create table profissional(
	idpessoa int not null auto_increment primary key,
    nome varchar(50)
);

create table profissao(
	idprof int not null auto_increment primary key,
    nome varchar(100)
);

create table obra(
	idobra int not null auto_increment primary key,
    descricao varchar(120)
);

create table trabalha(
	idtrabalha int not null primary key auto_increment,
	idpessoa int,
    idprof int,
    idobra int,
	datafim date,
    datainicio date,
    constraint pk_profiss foreign key (idpessoa) references profissional,
    constraint pk_Prof foreign key (idprof) references profissao,
    constraint pk_obra foreign key(idobra) references obra

);





INSERT INTO profissional (nome) VALUES ('Sandra Regina Quadros')
 ,('Archimino Lara Rezende'),('Agenor Navarro Aguiar'),
 ('Agripino Furtado das Neves') ,('João Pimenta de Oliveira')
 ,('Adamastor Capistrano');

--
INSERT INTO obra (descricao) VALUES ('Ed. Torre Eiffel'),('Pavimentação da rodovia PA-140'),('Praça Antônio Carlos');


INSERT INTO profissao (nome) VALUES ('Arquiteto'),('Eng. Civil'),('Mestre de Obras');

select * from profissional;
select * from obra;
select * from profissao;
