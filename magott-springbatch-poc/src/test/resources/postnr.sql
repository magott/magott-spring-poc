DROP TABLE POSTNUMMER IF EXISTS
CREATE TABLE POSTNUMMER  (
	ID BIGINT IDENTITY PRIMARY KEY ,    
	POSTNUMMER VARCHAR(4) NOT NULL, 
	POSTSTED VARCHAR(100) NOT NULL
) ;

DROP TABLE POSTNR_REVERSE IF EXISTS
CREATE TABLE POSTNR_REVERSE  (
	ID BIGINT IDENTITY PRIMARY KEY ,    
	POSTNUMMER VARCHAR(4) NOT NULL, 
	POSTSTED VARCHAR(100) NOT NULL
) ;