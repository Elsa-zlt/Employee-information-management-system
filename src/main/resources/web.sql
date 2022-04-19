create database springbootweb;

use springbootweb;

drop table if exists department;

create table department
(
    id    int primary key,
    dname varchar(20) not null
);

drop table if exists employee;

create table employee
(
    id       int primary key auto_increment,
    ename    varchar(50) not null,
    email    varchar(50),
    gender   int,
    birthday datetime,
    did      int references department (id)
);

insert into department(id, dname)
values (101, '教学部'),
       (102, '市场部'),
       (103, '教研部'),
       (104, '运营部'),
       (105, '后勤部');

insert into employee (ename, email, gender, birthday, did)
VALUES ('AA', '1234567@qq.com', 1, now(), 101),
       ('BB', '1234567@163.com', 0, now(), 102),
       ('CC', '4234335@qq.com', 1, now(), 103),
       ('DD', '4343343@qq.com', 0, now(), 104),
       ('EE', '6768554@qq.com', 1, now(), 105);

select e.id, e.ename, e.email, e.gender, e.birthday, dname
from employee e
         left join department d on d.id = e.did;

select *
from department;