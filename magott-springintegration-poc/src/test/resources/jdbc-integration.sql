DROP TABLE POSTNUMMER IF EXISTS
CREATE TABLE PERSON  (
	ID BIGINT IDENTITY PRIMARY KEY ,    
	FIRSTNAME VARCHAR(100) NOT NULL, 
	LASTNAME VARCHAR(100) NOT NULL
) ;

INSERT INTO PERSON('Morten', 'Andersen-Gott');
INSERT INTO PERSON('Foo', 'Bar')