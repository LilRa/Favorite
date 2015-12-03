

-- ���� ���� ����
create table area(
area_id int primary key auto_increment,
area_name varchar(10)
)default charset utf8;
-- ���� ���� ����
create table business(
business_id int primary key auto_increment,
business_name varchar(30)
)default charset utf8;

-- ��ġ����
create table place(
place_id int primary key auto_increment,
place_x varchar(50),
place_y varchar(50)
)default charset utf8;



 -- ����� ����
create table user(
user_id int primary key auto_increment,
email varchar(100),
name varchar(20),
block_flag int DEFAULT 0
)default charset utf8;



 -- ��������
create table market(
market_id int primary key auto_increment,
market_title varchar(50),
phone varchar(30),
grade int(6),
agree int,
business_id int,
area_id int,
place_id int,
user_id int,
FOREIGN KEY (user_id) REFERENCES user (user_id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (business_id) REFERENCES business (business_id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (area_id) REFERENCES area (area_id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (place_id) REFERENCES place (place_id) ON UPDATE CASCADE ON DELETE CASCADE
)default charset utf8;




-- ��� ã��
create table bookmark(
bookmark_id int primary key auto_increment,
user_id int,
market_id int,
bookmark_flag int DEFAULT 0,
FOREIGN KEY (user_id) REFERENCES user (user_id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (market_id) REFERENCES market (market_id) ON UPDATE CASCADE ON DELETE CASCADE
)default charset utf8;


-- ��������
create table reply(
reply_id  int primary key auto_increment,
content text,
grade int,
user_id int,
market_id int,
FOREIGN KEY (user_id) REFERENCES user (user_id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (market_id) REFERENCES market (market_id) ON UPDATE CASCADE ON DELETE CASCADE
)default charset utf8;

-- �̹��� --
create table img(
img_id  int primary key auto_increment,
img_name varchar(100),
img_extension varchar(50),
market_id int,
FOREIGN KEY (market_id) REFERENCES market (market_id) ON UPDATE CASCADE ON DELETE CASCADE
)default charset utf8;




-- ���� ����
--'1' : ����, 
--'2' : �λ�, 
--'3' : �뱸, 
--'4' : ��õ, 
--'5' : ����, 
--'6' : ����,
--'7' : ���, 
--'8' : ����, 
--'9' : ���, 
--'10' : ����, 
--'11' : ���, 
--'12' : �泲,
--'13' : ����, 
--'14' : ����, 
--'15' : ���, 
--'16' : �泲, 
--'17' : ����

insert into area(area_name) values('����');
insert into area(area_name) values('�λ�');
insert into area(area_name) values('�뱸');
insert into area(area_name) values('��õ');
insert into area(area_name) values('����');
insert into area(area_name) values('����');
insert into area(area_name) values('���');
insert into area(area_name) values('����');
insert into area(area_name) values('���');
insert into area(area_name) values('����');
insert into area(area_name) values('���');
insert into area(area_name) values('�泲');
insert into area(area_name) values('����');
insert into area(area_name) values('�泲');
insert into area(area_name) values('����');




-- ���� �з�
--1:�ѽ�
--2:�߽�
--3:�Ͻ�
--4:���
--5:ȸ
--6:�,��
--7:�±���
--8:��Ʈ����
--9:�߽��ڽ�

insert into business(Business_name) values('�ѽ�');
insert into business(Business_name) values('�߽�');
insert into business(Business_name) values('�Ͻ�');
insert into business(Business_name) values('���');
insert into business(Business_name) values('ȸ');
insert into business(Business_name) values('�,��');
insert into business(Business_name) values('�±���');
insert into business(Business_name) values('��Ʈ����');
insert into business(Business_name) values('�߽��ڽ�');



--��ġ����
insert into place(place_x,place_y) values('37.500980', '127.038762');


-- ����� 
insert into user(email,name) values('adxl007@gmail.com','�赿��');


-- ��������
insert into market(market_title,phone,grade,business_id,area_id,place_id,agree,user_id)
 values('�����Ϸ���','000-000-0000',5,1,1,1,1,1);
 insert into market(market_title,phone,grade,business_id,area_id,place_id,agree,user_id)
 values('�����Ϸ���','000-000-0000',5,3,3,1,2,1);
 insert into market(market_title,phone,grade,business_id,area_id,place_id,agree,user_id)
 values('�����Ϸ���','000-000-0000',5,2,2,1,2,1);
 
 
 -- ���ã��
 insert into bookmark(user_id,market_id) values('1','1');
 
 
 -- ���� ����
 insert into reply(content,grade,user_id,market_id) values('����',5,1,1);
 
 -- �̹���
 insert into img(img_name,img_extension,market_id) values('�̹����̸�','.Ȯ����',1);
 
 
 -- �˻���
select m.market_id,market_title,phone,grade,agree,m.business_id,m.area_id,m.place_id,
b.business_name,
a.area_name,
p.place_x,p.place_y,
i.img_name,i.img_extension
from market m 
inner join business b on m.business_id = b.business_id 
inner join area a on m.area_id = a.area_id
inner join place p on m.place_id = p.place_id 
inner join img i on m.market_id = i.market_id
where agree = 1

