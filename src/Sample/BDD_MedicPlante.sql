DROP DATABASE if exists bdd_medicplant;
CREATE DATABASE bdd_medicplant;

CREATE TABLE bdd_medicplant.Plante
(
                       idPlante      Int Auto_increment NOT NULL PRIMARY KEY,
                       Nom           Varchar (250) NOT NULL ,
                       Description   Varchar (250) NOT NULL ,
                       Bienfait      Text NOT NULL ,
                       Photo         Varchar (250) NOT NULL ,
                       Posologie     Text NOT NULL ,
                       Avertissement Text NOT NULL ,
                       id_Symptome   Int NOT NULL
    ,CONSTRAINT Symptome_FK FOREIGN KEY (id_Symptome) REFERENCES bdd_medicplant.Symptome(idSymptome)
);


CREATE TABLE bdd_medicplant.Symptome(
                         idSymptome  Int Auto_increment NOT NULL PRIMARY KEY,
                         nomSymptome Varchar (250) NOT NULL,
                         id_Corps   Int NOT NULL
    ,CONSTRAINT Corps_FK FOREIGN KEY (id_Corps) REFERENCES bdd_medicplant.Corps(idCorps)
);


CREATE TABLE bdd_medicplant.Corps(
                      idCorps   Int Auto_increment NOT NULL PRIMARY KEY,
                      NomPartie Varchar (250) NOT NULL
);
