#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------

DROP DATABASE if exists BDD_MedicPlante;
CREATE DATABASE BDD_MedicPlante;
USE BDD_MedicPlante;

#------------------------------------------------------------
# Table: Plante
#------------------------------------------------------------

CREATE TABLE Plante(
                       idPlante      Int NOT NULL ,
                       Nom           Varchar (250) NOT NULL ,
                       Description   Varchar (250) NOT NULL ,
                       Bienfait      Text NOT NULL ,
                       Photo         Varchar (250) NOT NULL ,
                       Posologie     Text NOT NULL ,
                       Avertissement Text NOT NULL
    ,CONSTRAINT Plante_PK PRIMARY KEY (idPlante)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Symptome
#------------------------------------------------------------

CREATE TABLE Symptome(
                         idSymptome  Int NOT NULL ,
                         nomSymptome Varchar (250) NOT NULL
    ,CONSTRAINT Symptome_PK PRIMARY KEY (idSymptome)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Corps
#------------------------------------------------------------

CREATE TABLE Corps(
                      idCorps   Int NOT NULL ,
                      NomPartie Varchar (250) NOT NULL
    ,CONSTRAINT Corps_PK PRIMARY KEY (idCorps)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: MotClef
#------------------------------------------------------------

CREATE TABLE MotClef(
                        idMotClef  Int NOT NULL ,
                        nomMotClef Varchar (250) NOT NULL
    ,CONSTRAINT MotClef_PK PRIMARY KEY (idMotClef)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Guérie
#------------------------------------------------------------

CREATE TABLE Guerie(
                       idSymptome Int NOT NULL ,
                       idPlante   Int NOT NULL
    ,CONSTRAINT Guerie_PK PRIMARY KEY (idSymptome,idPlante)

    ,CONSTRAINT Guerie_Symptome_FK FOREIGN KEY (idSymptome) REFERENCES Symptome(idSymptome)
    ,CONSTRAINT Guerie_Plante0_FK FOREIGN KEY (idPlante) REFERENCES Plante(idPlante)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Possede
#------------------------------------------------------------

CREATE TABLE Possede(
                        idSymptome Int NOT NULL ,
                        idCorps    Int NOT NULL
    ,CONSTRAINT Possede_PK PRIMARY KEY (idSymptome,idCorps)

    ,CONSTRAINT Possede_Symptome_FK FOREIGN KEY (idSymptome) REFERENCES Symptome(idSymptome)
    ,CONSTRAINT Possede_Corps0_FK FOREIGN KEY (idCorps) REFERENCES Corps(idCorps)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Avoir
#------------------------------------------------------------

CREATE TABLE Avoir(
                      idMotClef  Int NOT NULL ,
                      idSymptome Int NOT NULL
    ,CONSTRAINT Avoir_PK PRIMARY KEY (idMotClef,idSymptome)

    ,CONSTRAINT Avoir_MotClef_FK FOREIGN KEY (idMotClef) REFERENCES MotClef(idMotClef)
    ,CONSTRAINT Avoir_Symptome0_FK FOREIGN KEY (idSymptome) REFERENCES Symptome(idSymptome)
)ENGINE=InnoDB;
