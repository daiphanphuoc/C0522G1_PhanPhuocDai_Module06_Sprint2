create database sprint2;

use sprint2;

create table if not exists user(
username varchar(30) primary key,
password varchar(300),
is_delete bit default 0
);

create table if not exists role(
id int auto_increment primary key,
name varchar(30) not null unique,
is_delete bit default 0
);

create table if not exists user_role(
username varchar(30),
role_id int,
foreign key(username) references user(username),
foreign key(role_id) references role(id),
primary key(username, role_id),
is_delete bit default 0
);

create table if not exists field (
id int auto_increment primary key,
name varchar(30) not null,
is_delete bit default 0
);

create table if not exists candidate(
id int auto_increment primary key,
name varchar(50) not null,
gender varchar(20),
date_of_birth date,
id_card varchar(15),
image text,
phone varchar(15) not null,
email varchar(40) not null,
adress varchar(200) not null,
username varchar(30),
foreign key(username) references user(username),
is_delete bit default 0
);

create table if not exists employer(
id int auto_increment primary key,
name varchar(50) not null,
phone varchar(15) not null,
email varchar(40) not null,
adress varchar(200) not null,
name_company varchar(50) not null,
tax_code varchar(30) not null,
address_company varchar(100) not null,
personnel_size varchar(30) not null,
username varchar(30),
foreign key(username) references user(username),
img varchar(255),
is_delete bit default 0
);

create table if  not exists employer_field(
id int auto_increment primary key,
employer_id int,
field_id int,
is_delete bit default 0,
foreign key(employer_id) references employer(id),
foreign key(field_id) references field(id)
);

create table if not exists experience(
id int auto_increment primary key,
content varchar(50),
is_delete bit default 0
);

create table if not exists recruitment(
id int auto_increment primary key,
title varchar(200),
wage varchar(50),
experience_id int,
foreign key(experience_id) references experience(id),
level varchar(50),
conscious varchar(100),
career varchar(200),
nature_of_work varchar(200),
working_form varchar(200),
probationary_period varchar(200),
gender_request varchar(50),
number_of_vacancies int,
is_delete bit default 0,
description text,
request text,
interest text,
time_create datetime default now(),
deadline date,
employer_id int,
foreign key(employer_id) references employer(id)
);

create table if not exists rank_level(
id int auto_increment primary key,
level varchar(50),
is_delete bit default 0
);

create table if not exists job_application(
id int auto_increment primary key,
time_create datetime default now(),
title varchar(250) not null,
academic_level varchar(50),
experience_id int,
foreign key(experience_id) references experience(id),
current_rank_id int references rank_level(id),
level_desired_id int references rank_level(id),
desire_minimum_wage double,
career_goals text,
workplace_desired text
);

create table if not exists price(
id int auto_increment primary key,
price double default 1,
begin_date datetime default now(),
end_date datetime ,
status bit default 1,
is_delete bit default 0
);

create table if not exists candidate_recruitment(
id int auto_increment  primary key,
time_recruitment datetime default now(),
candidate_id int,
recruitment_id int,
foreign key (candidate_id) references candidate(id),
foreign key (recruitment_id) references recruitment(id),
is_delete bit default 0,
status int default 1
);