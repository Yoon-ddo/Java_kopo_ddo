-- 시스템상에서의 유저 정보

CREATE TABLE USERINFO(
    ID VARCHAR2(20) NOT NULL CONSTRAINT USER_ID_UK UNIQUE,
    PWD VARCHAR2(30) CONSTRAINT USER_PWD_NN NOT NULL,
    NAME VARCHAR2(20) NOT NULL,
    RES_CODE VARCHAR2(13) CONSTRAINT USER_RESCD_UK UNIQUE,
    GENDER CHAR(1) CONSTRAINT USER_GENDER_CK CHECK(GENDER IN ('M','F')),
    PHONE VARCHAR2(11) CONSTRAINT USER_PHONE_UK UNIQUE
);
INSERT INTO USERINFO(ID,PWD,NAME, RES_CODE, GENDER, PHONE) VALUES('admin','admin','관리자','0','F','00000000000');
INSERT INTO USERINFO(ID,PWD,NAME, RES_CODE, GENDER, PHONE) VALUES('kopo1234','kopo1234','윤부자','9512282123456','F','01012345678');
INSERT INTO USERINFO(ID,PWD,NAME, RES_CODE, GENDER, PHONE) VALUES('apple123','apple!','최서민','9904071123456','M','01098765432');
INSERT INTO USERINFO(ID,PWD,NAME, RES_CODE, GENDER, PHONE) VALUES('baba','baba','홍길동','7501091457998','M','01015417777');
SELECT * FROM USERINFO;
delete from userinfo where id = 'kk';
commit;

update userinfo set phone = '01015479884' where id = 'dd';

--은행별 DB 생성
CREATE TABLE ACCOUNTDB(
    NAME VARCHAR2(20) NOT NULL,
    PHONE VARCHAR2(11) NOT NULL,
    BANK_CODE CHAR(1) CONSTRAINT TRANHISTORY_BANKCD_CK CHECK(BANK_CODE IN ('H','S','K','I','W')),
    ACCOUNT VARCHAR2(14) CONSTRAINT ACCDB_ACCOUNT_PK PRIMARY KEY, --계좌번호 임의로 생성
    ACCPWD VARCHAR2(4) NOT NULL,
    ACCALIAS VARCHAR2(20),
    ENROLL_DT DATE DEFAULT SYSDATE,
    BALANCE NUMBER,
    RES_CODE VARCHAR2(13) NOT NULL
);
INSERT INTO ACCOUNTDB(NAME, PHONE, BANK_CODE, ACCPWD, ACCOUNT, ACCALIAS, ENROLL_DT, BALANCE, RES_CODE) 
VALUES('윤부자','01012345678','H', '1234','3333123456789', '저금통','20/03/15',1000, '9512282123456');
INSERT INTO ACCOUNTDB(NAME, PHONE,BANK_CODE, ACCPWD, ACCOUNT, ACCALIAS, ENROLL_DT, BALANCE, RES_CODE) 
VALUES('윤부자','01012345678','H', '1234','3333333333338', '저금통','20/03/15',24500, '9512282123456');
INSERT INTO ACCOUNTDB(NAME, PHONE,BANK_CODE, ACCPWD, ACCOUNT, ACCALIAS, ENROLL_DT, BALANCE, RES_CODE) 
VALUES('윤부자','01012345678','S', '1234','1111111111111', '뙈지','18/12/15', 1000, '9512282123456');
INSERT INTO ACCOUNTDB(NAME, PHONE,BANK_CODE, ACCPWD, ACCOUNT, ACCALIAS, ENROLL_DT, BALANCE, RES_CODE) 
VALUES('홍길동','01015417777','W','0000','2222222222222','떡국','15/01/15',200000,'7501091457998');
INSERT INTO ACCOUNTDB(NAME, PHONE,BANK_CODE, ACCPWD, ACCOUNT, ACCALIAS, ENROLL_DT, BALANCE, RES_CODE) 
VALUES('홍길동','01015417777','I','0000','7777000000000','그지','18/12/31',0,'7501091457998');
INSERT INTO ACCOUNTDB(NAME, PHONE,BANK_CODE, ACCPWD, ACCOUNT, ACCALIAS, ENROLL_DT, BALANCE, RES_CODE) 
VALUES('최서민','01098765432','H','0845','1111789656123','부자될래','21/01/04',20000,'9904071123456');
INSERT INTO ACCOUNTDB(NAME, PHONE,BANK_CODE, ACCPWD, ACCOUNT, ACCALIAS, ENROLL_DT, BALANCE, RES_CODE) 
VALUES('최서민','01098765432','I','0000','1234567890000','생활비',sysdate,24000,'9904071123456');
SELECT * FROM ACCOUNTDB;
update accountdb set account = '3333333333338' where account = '333333333333';
update accountdb set account = '7777000000000' where account = '77770000000000';
delete from accountdb where account = '0000000000001';
commit;
update accountdb set balance = 24500 where account = '1111111111111';

select enroll_dt , trunc(months_between(sysdate,enroll_dt),0)as enroll
from accountdb 
where res_code='9904071123456' and bank_code = 'W'
order by enroll_dt desc;

--은행별 거래코드 정보
CREATE TABLE TRANCODE(
    CODE CHAR(1) CONSTRAINT TRANCODE_TRCD_FK PRIMARY KEY,
    NAME VARCHAR2(20) CONSTRAINT TRANCODE_NM_UK UNIQUE
);
INSERT INTO TRANCODE(CODE,NAME) VALUES('1','입금');
INSERT INTO TRANCODE(CODE,NAME) VALUES('0','출금');
SELECT * FROM TRANCODE;

--은행별 거래정보 테이블
CREATE TABLE TRANHISTORY(
    FROMACC VARCHAR2(14) NOT NULL, -- 내계좌
     CONSTRAINT DB_fromacc_FK FOREIGN KEY(FROMACC) REFERENCES ACCOUNTDB(ACCOUNT),
    FROMBANK CHAR(1) CONSTRAINT TRANHISTORY_FROMBANK_CK CHECK(FROMBANK IN ('H','S','K','I','W')), -- 내 은행
    TRAN_DT DATE DEFAULT SYSDATE,
    TR_CODE CHAR(1),-- 입금/출금
    TRANSEQ NUMBER NOT NULL, -- 순차적 번호부여
    CONSTRAINT DB_TRANSEQ_FK FOREIGN KEY(TR_CODE) REFERENCES TRANCODE(CODE),
    BALANCE NUMBER, -- 금액
    TOSACC VARCHAR2(14), -- 상대계좌
    CONSTRAINT DB_toacc_FK FOREIGN KEY(TOSACC) REFERENCES ACCOUNTDB(ACCOUNT),
    TOBANK CHAR(1) CONSTRAINT TRANHISTORY_TOBANK_CK CHECK(TOBANK IN ('H','S','K','I','W')) -- 상대은행
);
drop table tranhistory;
INSERT INTO TRANHISTORY(FROMACC, FROMBANK, TRAN_DT, TR_CODE, BALANCE, TOSACC, TOBANK)
VALUES('3333333333338','H', SYSDATE , '0', 500, '1111111111111','H'); -- 출금
INSERT INTO TRANHISTORY(FROMACC, FROMBANK, TRAN_DT, TR_CODE, BALANCE, TOSACC, TOBANK)
VALUES('1111111111111','H', SYSDATE , '1', 500, '3333333333338','H'); -- +
SELECT * FROM TRANHISTORY;
truncate table tranhistory;

COMMIT;



