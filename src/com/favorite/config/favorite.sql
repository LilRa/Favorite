

-- 지역 정보 생성
create table area(
area_id int primary key auto_increment,
area_name varchar(10)
)default charset utf8;
-- 업종 정보 생성
create table business(
business_id int primary key auto_increment,
business_name varchar(30)
)default charset utf8;

-- 위치정보
create table place(
place_id int primary key auto_increment,
place_x varchar(50),
place_y varchar(50)
)default charset utf8;



 -- 사용자 정보
create table user(
user_id int primary key auto_increment,
email varchar(100),
name varchar(20)
)default charset utf8;



 -- 가계정보
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




-- 즐겨 찾기
create table bookmark(
bookmark_id int primary key auto_increment,
user_id int,
market_id int,
FOREIGN KEY (user_id) REFERENCES user (user_id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (market_id) REFERENCES market (market_id) ON UPDATE CASCADE ON DELETE CASCADE
)default charset utf8;


-- 리플정보
create table reply(
reply_id  int primary key auto_increment,
content text,
grade int,
user_id int,
FOREIGN KEY (user_id) REFERENCES user (user_id) ON UPDATE CASCADE ON DELETE CASCADE
)default charset utf8;

-- 이미지 --
create table img(
img_id  int primary key auto_increment,
img_name varchar(100),
img_extension varchar(50),
market_id int,
FOREIGN KEY (market_id) REFERENCES market (market_id) ON UPDATE CASCADE ON DELETE CASCADE
)default charset utf8;




-- 지역 정보
--'1' : 서울, 
--'2' : 부산, 
--'3' : 대구, 
--'4' : 인천, 
--'5' : 광주, 
--'6' : 대전,
--'7' : 울산, 
--'8' : 세종, 
--'9' : 경기, 
--'10' : 강원, 
--'11' : 충북, 
--'12' : 충남,
--'13' : 전북, 
--'14' : 전남, 
--'15' : 경북, 
--'16' : 경남, 
--'17' : 제주

insert into area(area_name) values('서울');
insert into area(area_name) values('부산');
insert into area(area_name) values('대구');
insert into area(area_name) values('인천');
insert into area(area_name) values('광주');
insert into area(area_name) values('대전');
insert into area(area_name) values('울산');
insert into area(area_name) values('세종');
insert into area(area_name) values('경기');
insert into area(area_name) values('강원');
insert into area(area_name) values('충북');
insert into area(area_name) values('충남');
insert into area(area_name) values('전북');
insert into area(area_name) values('경남');
insert into area(area_name) values('제주');




-- 업종 분류
--1:한식
--2:중식
--3:일식
--4:고기
--5:회
--6:찌개,탕
--7:태국식
--8:베트남식
--9:멕시코식

insert into business(Business_name) values('한식');
insert into business(Business_name) values('중식');
insert into business(Business_name) values('일식');
insert into business(Business_name) values('고기');
insert into business(Business_name) values('회');
insert into business(Business_name) values('찌개,탕');
insert into business(Business_name) values('태국식');
insert into business(Business_name) values('베트남식');
insert into business(Business_name) values('멕시코식');



--위치정보
insert into place(place_x,place_y) values('37.500980', '127.038762');


-- 사용자 
insert into user(email,name) values('adxl007@gmail.com','김동우');


-- 가계정보
insert into market(market_title,phone,grade,business_id,area_id,place_id,agree,user_id)
 values('세븐일레븐','000-000-0000',5,1,1,1,1,1);
 insert into market(market_title,phone,grade,business_id,area_id,place_id,agree,user_id)
 values('세븐일레븐','000-000-0000',5,3,3,1,2,1);
 insert into market(market_title,phone,grade,business_id,area_id,place_id,agree,user_id)
 values('세븐일레븐','000-000-0000',5,2,2,1,2,1);
 
 
 -- 즐겨찾기
 insert into bookmark(user_id,market_id) values('1','1');
 
 
 -- 리플 정보
 insert into reply(content,grade,user_id) values('내용',5,1);
 
 -- 이미지
 insert into img(img_name,img_extension,market_id) values('이미지이름','.확장자',1);
 
 
 -- 검색어
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

