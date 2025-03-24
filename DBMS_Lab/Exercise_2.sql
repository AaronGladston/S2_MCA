create database student;
use student;

create table student(name varchar(20),
student_number smallint(10) primary key,
class smallint(10),
major varchar(10));

create table course(course_name varchar(50),
course_number varchar(10) primary key,
credit_hours smallint(10),
department varchar(10));

create table section(section_identifier smallint(10) primary key,
course_number varchar(10),
semester varchar(10),
year_year smallint(10),
instructor varchar(10),
foreign key (course_number) references course(course_number));

create table grade_report(student_number smallint(10),
section_identifier smallint(10),
grade varchar(5),
foreign key (student_number) references student(student_number),
foreign key (section_identifier) references section(section_identifier));

create table prerequisite(course_number varchar(10),
prerequisite_number varchar(10),
foreign key (course_number) references course(course_number),
foreign key (prerequisite_number) references course(course_number));

insert into student(name,student_number,class,major) values
('Smith','17','1','CS'),
('Brown','8','2','CS');

insert into course(course_name,course_number,credit_hours,department) values
('Intro to Computer Science','CS1310','4','CS'),
('Data Structure','CS3320','4','CS'),
('Discrete Mathematics','MATH2410','3','MATH'),
('Database','CS3380','3','CS');

insert into section(section_identifier,course_number,semester,year_year,instructor) values
('85','MATH2410','Fall','07','King'),
('92','CS1310','Fall','07','Anderson'),
('102','CS3320','Spring','08','Kruth'),
('112','MATH2410','Fall','08','Chang'),
('119','CS1310','Fall','08','Anderson'),
('135','CS3380','Fall','08','Stone');

insert into grade_report values
('17','112','B'),
('17','119','C'),
('8','85','A'),
('8','92','A'),
('8','102','B'),
('8','135','A');

insert into prerequisite values
('CS3380','CS3320'),
('CS3380','MATH2410'),
('CS3380','CS1310');

-- #1
select course.course_name, grade_report.grade, student.name from student 
join grade_report on grade_report.student_number = student.student_number
join section on grade_report.section_identifier = section.section_identifier
join course on section.course_number = course.course_number where  student.name = "Smith";

-- #2
select student.name, section.semester, course.course_name, grade_report.grade from course 
join section on course.course_number = section.course_number 
join grade_report on section.section_identifier = grade_report.section_identifier
join student on grade_report.student_number = student.student_number
where course.course_name = "Database" and section.semester = "fall";
