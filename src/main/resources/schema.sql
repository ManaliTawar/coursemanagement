CREATE TABLE IF NOT EXISTS student1 (
    id LONG AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    program VARCHAR(30) NOT NULL,
    credits VARCHAR(20) NOT NULL,
    course VARCHAR(50) NOT NULL,
    gpa VARCHAR(50) NOT NULL,
    primary key(id)
    );

--INSERT INTO Content(title,desc,status,content_type,date_created)
--VALUES('MY SPRING REST API','ALL ABOUT SPRING DATA JDBC','IDEA','ARTICLE',CURRENT_TIME)