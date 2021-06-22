아래에 정의된 내용으로 테이블을 생성하세요

-----------------------------------------------------------
테이블명 : T_MEMBER
-----------------------------------------------------------
컬럼명		    데이터타입         크기       제약조건
-----------------------------------------------------------
ID 				VARCHAR2        20       PRIMARY KEY
NAME 			VARCHAR2        20       NOT NULL
PASSWORD 		VARCHAR2        20       NOT NULL
EMAIL_ID 		VARCHAR2        30
EMAIL_DOMAIN 	VARCHAR2        20
TEL1 			CHAR            3
TEL2 			CHAR            4
TEL3 			CHAR			4
POST 			CHAR			7
BASIC_ADDR 		VARCHAR2		200
DETAIL_ADDR 	VARCHAR2		200
TYPE            CHAR			1  		 default 'U',
REG_DATE 		DATE 					 default sysdate
-----------------------------------------------------------



create table t_member(
    ID 				VARCHAR2(20) PRIMARY KEY,
    NAME 			VARCHAR2(20) NOT NULL,
    PASSWORD 		VARCHAR2(20) NOT NULL,
    EMAIL_ID 		VARCHAR2(30),
    EMAIL_DOMAIN 	VARCHAR2(20),
    TEL1 			CHAR(3),
    TEL2 			CHAR(4),
    TEL3 			CHAR(4),
    POST 			CHAR(7),
    BASIC_ADDR 		VARCHAR2(200),
    DETAIL_ADDR 	VARCHAR2(200),
    TYPE            CHAR(1) default 'U',
    REG_DATE 		DATE default sysdate);
    
select * from t_member;
truncate table t_member;
insert into t_member(id, name, password, email_id, email_domain, tel1, tel2, tel3,
                    post, basic_addr, detail_addr)
            values('kopo', '윤소영','1234','kopo','@naver.com','010','1234','5678',
            '1234567', '경기 용인시 수지구', '상현로30-6 000동 0000호');
            
insert into t_member(id, name, password, email_id, email_domain, tel1, tel2, tel3,
                    post, basic_addr, detail_addr)
            values('amy', '한주희','1234','amy','@gmail.com','010','7777','7777',
            '1234567', '경기 고양시 일산동구', '애니골길7-27 000동 0000호');
            
insert into t_member(id, name, password, email_id, email_domain, tel1, tel2, tel3,
                    post, basic_addr, detail_addr)
            values('dhkim', '김도희','0000','dhkim123','@nate.com','010','4321','7890',
            '1234567', '경기 안양시 만안구', '덕천로10-4 000동 0000호');
commit;


select id, name, tel1||'-'||tel2||'-'||tel3, email_id||email_domain, to_char(reg_date,'YYYY-MM-DD')
from t_member;