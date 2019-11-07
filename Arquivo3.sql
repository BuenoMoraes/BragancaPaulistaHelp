create database projeto;

use projeto;

CREATE TABLE usuario (
	nome varchar(40) NOT NULL,
	login varchar(40) NOT NULL,
    senha int  NOT NULL,
    idUser int NOT NULL,
    PRIMARY KEY (idUser)
) ENGINE InnoDB;

CREATE TABLE problema (
	idProblema int NOT NULL,
    tipo varchar(40) NOT NULL,
    descricao varchar(150) NOT NULL,
    data date DEFAULT NULL,
    PRIMARY KEY (idProblema)
) ENGINE InnoDB;

insert into usuario values
('Giovani','giovani.rojas',123,1),
('Matheus','Matheus.bueno',367,2),
('Lucca','Lucca.castro',765,3),
('Leonardo','paes.leo',902,4),
('Jady','jadoca.martins',074,5),
('Ariane','arianeatal',257,6),
('Thais','thais.rosario,231,8'),
('Giovanna', 'giovannata', 432,7);


insert into problema values
(1,'buraco','grande buraco encontrado na vila','2019-11-07'),
(2,'poste irregular','poste no meio na rua no lago do taboao','2019-10-17'),
(3,'falta de asfalto','falta de asfalto na rua Humberto de Alencar Castelo Branco','2019-05-23'),
(4,'buraco','varios buracos na rua da prefeitura','2019-07-11'),
(5,'poste irregular','poste irregular na frente do jardim publico','2019-08-20'),
(6,'falta de agua','falta de agua no bairro do guaripocaba','2019-09-02');

select * from usuario;

select * from problema;

select nome, idUser from usuario;
select senha from usuario where login = 'Lucca.castro';
select login from usuario where idUser > 4;
select idUser from usuario where senha = 367;

select tipo, descricao from problema;
select idPorblema from problema where tipo = 'buraco';
select descricao from problema where idProblema = '5';

