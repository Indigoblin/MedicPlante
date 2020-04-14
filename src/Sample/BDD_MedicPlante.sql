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
                       Avertissement Text NOT NULL
);


CREATE TABLE bdd_medicplant.Symptome(
                         idSymptome  Int Auto_increment NOT NULL PRIMARY KEY,
                         nomSymptome Varchar (250) NOT NULL
);


CREATE TABLE bdd_medicplant.Corps(
                      idCorps   Int Auto_increment NOT NULL PRIMARY KEY,
                      NomPartie Varchar (250) NOT NULL
);


CREATE TABLE bdd_medicplant.MotClef(
                        idMotClef  Int Auto_increment NOT NULL PRIMARY KEY,
                        nomMotClef Varchar (250) NOT NULL
);


CREATE TABLE bdd_medicplant.Guerie(
                       idGuerie   Int NOT NULL PRIMARY KEY,
                       idSymptome Int NOT NULL,
                       idPlante   Int NOT NULL
    ,CONSTRAINT Guerie_Symptome_FK FOREIGN KEY (idSymptome) REFERENCES bdd_medicplant.Symptome(idSymptome)
    ,CONSTRAINT Guerie_Plante0_FK FOREIGN KEY (idPlante) REFERENCES bdd_medicplant.Plante(idPlante)
);


CREATE TABLE bdd_medicplant.Possede(
                        idPossede Int NOT NULL PRIMARY KEY,
                        idSymptome Int NOT NULL,
                        idCorps    Int NOT NULL
    ,CONSTRAINT Possede_Symptome_FK FOREIGN KEY (idSymptome) REFERENCES bdd_medicplant.Symptome(idSymptome)
    ,CONSTRAINT Possede_Corps0_FK FOREIGN KEY (idCorps) REFERENCES bdd_medicplant.Corps(idCorps)
);

CREATE TABLE bdd_medicplant.Avoir(
                      idAvoir  Int NOT NULL PRIMARY KEY,
                      idMotClef  Int NOT NULL,
                      idSymptome Int NOT NULL
    ,CONSTRAINT Avoir_MotClef_FK FOREIGN KEY (idMotClef) REFERENCES bdd_medicplant.MotClef(idMotClef)
    ,CONSTRAINT Avoir_Symptome0_FK FOREIGN KEY (idSymptome) REFERENCES bdd_medicplant.Symptome(idSymptome)
);
