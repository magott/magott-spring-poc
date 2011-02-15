DROP TABLE POSTNUMMER IF EXISTS
CREATE TABLE PERSON  (
	ID BIGINT IDENTITY PRIMARY KEY ,    
	FIRSTNAME VARCHAR(100) NOT NULL, 
	LASTNAME VARCHAR(100) NOT NULL
) ;

INSERT INTO PERSON(firstname, lastname) values('Morten', 'Andersen-Gott');
INSERT INTO PERSON(firstname, lastname) values('Foo', 'Bar')

--CREATE ALIAS sp_selectPerson FOR "my.class.DaoTester.random"