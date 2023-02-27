DROP TABLE IF EXISTS QuizApp.quiz;
DROP TABLE IF EXISTS QuizApp.user;
create table QuizApp.user (id int auto_increment primary key, first_name varchar(50) null,last_name varchar(50) null, user_name varchar(25) null, password varchar(50) null, email varchar(100) null);
INSERT INTO QuizApp.user VALUES (1, 'Homer', 'Simpson', 'hsimpson', 'donuts1', 'hsimpson@email.com'),(2, 'Marge', 'Simpson', 'msimpson', 'donuts2', 'msimpson@email.com'), (3, 'Bart', 'Simpson', 'bsimpson', 'donuts3', 'bsimpson@email.com'), (4, 'Lisa', 'Simpson', 'lsimpson', 'donuts4', 'lsimpson@email.com');
create table QuizApp.quiz (id int auto_increment primary key, user_id int null, title varchar(25) null, summary varchar(255) null, type int null, score double(5, 2) null, constraint FK_user_ID  foreign key (user_id) references QuizApp.user (id));
insert into QuizApp.quiz VALUES (1, 3, 'QuizNo1', 'Summary of Quiz1', 1, 0.0), (2, 4, 'QuizNo2', 'Summary of Quiz2', 1, 100.0 );