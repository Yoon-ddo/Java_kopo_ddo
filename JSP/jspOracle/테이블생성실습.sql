�Ʒ��� ���ǵ� �������� ���̺��� �����ϼ���

-----------------------------------------------------------
���̺�� : T_MEMBER
-----------------------------------------------------------
�÷���		    ������Ÿ��         ũ��       ��������
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
            values('kopo', '���ҿ�','1234','kopo','@naver.com','010','1234','5678',
            '1234567', '��� ���ν� ������', '������30-6 000�� 0000ȣ');
            
insert into t_member(id, name, password, email_id, email_domain, tel1, tel2, tel3,
                    post, basic_addr, detail_addr)
            values('amy', '������','1234','amy','@gmail.com','010','7777','7777',
            '1234567', '��� ���� �ϻ굿��', '�ִϰ��7-27 000�� 0000ȣ');
            
insert into t_member(id, name, password, email_id, email_domain, tel1, tel2, tel3,
                    post, basic_addr, detail_addr)
            values('dhkim', '�赵��','0000','dhkim123','@nate.com','010','4321','7890',
            '1234567', '��� �Ⱦ�� ���ȱ�', '��õ��10-4 000�� 0000ȣ');
commit;


select id, name, tel1||'-'||tel2||'-'||tel3, email_id||email_domain, to_char(reg_date,'YYYY-MM-DD')
from t_member;