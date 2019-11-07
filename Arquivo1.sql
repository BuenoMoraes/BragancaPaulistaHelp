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
('Lucaa','Lucca.castro',765,3),
('Leonardo','paes.leo',902,4),
('Jady','jadoca.martins',074,5),
('Ariane','arianeatal',257,6);

insert into problema values
(1,'buraco','grande buraco encontrado na vila','2019-11-07'),
(2,'poste irregular','poste no meio na rua no lago do taboao','2019-10-17'),
(3,'falta de asfalto','falta de asfalto na rua Humberto de Alencar Castelo Branco','2019-05-23');

select * from usuario;

select * from problema;

update usuario set senha = 678 where nome='Matheus';
update usuario set login = 'giovanirojas.gsr' where nome='Giovani';
update usuario set nome='Thais' where idUser=3;
update usuario set idUser = 7 where nome='Ariane';
update usuario set senha=464 where login='paes.leo';
update usuario set login='jady.martins' where idUser=5;

update problema set idProblema = 4 where tipo = 'buraco';
update problema set descricao = 'poste irregular proximo ao lago' where idProblema =2;
update problema set data = '2019-05-25' where tipo = 'falta de asfalto';
