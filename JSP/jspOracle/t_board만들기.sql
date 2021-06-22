create table t_board(
no number(5) primary key,
title varchar2(300) not null,
writer varchar2(100) not null,
content varchar2(2000) not null,
view_cnt number(5) default 0,
reg_date date default sysdate);

create sequence seq_t_board_no;

insert into t_board(no,title,writer,content)
values(seq_t_board_no.nextval,'제목입니다','홍길동', '내용입니다');

insert into t_board(no,title,writer,content)
values(seq_t_board_no.nextval,'안녕하세요','미스터lee', '눈이간지러워요');
commit;
alter sequence seq_t_board_no nocache;
select *from t_board;

Truncate table t_board;
drop sequence seq_t_board_no;

select * from t_board;