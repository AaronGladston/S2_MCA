use university;

create table STUDENT (Name varchar(10),
Student_number int(2) primary key,
Class int(2),
Major varchar(20));

create table COURSE (Course_name varchar(30),
Course_number varchar(20) primary key,
Credit_hours int(2),
Department varchar(15));

create table SECTION (Section_identifier int(3) primary key,
Course_number varchar(20),
Semester varchar(10),
Year int(2),
Instructor varchar(15),
foreign key (Course_number) references COURSE(Course_number));

create table GRADE_REPORT (Student_number int(2),
Section_identifier int(3),
Grade varchar(2),
foreign key (Student_number) references STUDENT(Student_number),
foreign key (Section_identifier) references SECTION(Section_identifier),
primary key (Student_number,Section_identifier));

create table PREREQUISITE (Course_number varchar(20),
Prerequisite_number varchar(20),
foreign key (Course_number) references COURSE(Course_number),
foreign key (Prerequisite_number) references COURSE(Course_number),
primary key (Course_number,Prerequisite_number));

insert into STUDENT values("Smith",17,1,"CS"),
("Brown",8,2,"CS");

insert into COURSE values("Intro to Computer Science","CS1310",4,"CS"),
("Data Structures","CS3320",4,"CS"),
("Discrete Mathamatics","MATH2410",3,"MATH"),
("Database","CS3380",3,"CS");

insert into SECTION values (85,"MATH2410","Fall",07,"King"),
(92,"CS1310","Fall",07,"Anderson"),
(102,"CS3320","Spring",08,"Knuth"),
(112,"MATH2410","Fall",08,"Chang"),
(119,"CS1310","Fall",08,"Anderson"),
(135,"CS3380","Fall",08,"Stone");

insert into GRADE_REPORT values (17,112,"B"),
(17,119,"C"),
(8,85,"A"),
(8,92,"A"),
(8,102,"B"),
(8,135,"A");

insert into PREREQUISITE values ("CS3380","CS3320"),
("CS3380","MATH2410"),
("CS3320","CS1310");

-- #3
-- Retrieve the list of all courses and grades of "Smith".
select s.Name,c.Course_name,c.Course_number,g.Grade from student s
inner join grade_report g on g.Student_number = s.Student_number
inner join section sec on sec.Section_identifier = g.Section_identifier
inner join course c on c.Course_number = sec.Course_number
where s.Name = "Smith";

-- #4
/*List the names of students who took the section of ‘Database’ course offered in 
fall 2008 and their grades in that section.*/
select s.Name,g.Grade from course c
inner join section sec on c.Course_number = sec.Course_number
inner join grade_report g on sec.Section_identifier = g.Section_identifier
inner join student s on g.Student_number = s.Student_number
where c.Course_name = "Database" and sec.Semester = "Fall" and sec.Year = "8";

-- #5
-- List the prerequisites of the ‘Database’ course.
select pre.Course_name,p.prerequisite_number,c.Course_name from course c
join prerequisite p on p.Course_number = c.Course_number
join course pre on pre.Course_number = p.Prerequisite_number
where c.Course_name = "Database";

-- #6
-- Create a view to retrieve the names of all senior students majoring in ‘CS’(computer science).
create view seniors as select * from student where class = 2;
select Name from seniors;

-- #7
--  Retrieve the names of all courses taught by Professor King in 2007 and 2008.
select s.Course_name from section c
join course s on s.Course_number = c.Course_number
where c.Instructor = "King";

-- #8
/*For each section taught by Professor King, retrieve the course number,
semester, year, and number of students who tool the section.*/
select s.Course_number,s.Semester,s.Year,count(g.Student_number) as No_of_students from SECTION s 
join GRADE_REPORT g on s.Section_identifier = g.Section_identifier
where s.Instructor="King"
group by g.Section_identifier;
