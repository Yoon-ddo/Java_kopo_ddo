CREATE TABLE �μ�(
    �μ�ID VARCHAR2(2) CONSTRAINT DEPARTMENT_�μ�ID_PK PRIMARY KEY,
    �μ��� VARCHAR2(10)
    );

CREATE TABLE EMPLEE(
    EMPID VARCHAR2(8),
    �μ�ID VARCHAR2(2),
    CONSTRAINT EMPLEE_�μ�_�μ�ID_FK FOREIGN KEY(�μ�ID) REFERENCES �μ�(�μ�ID)
);

DESC �μ�;
DESC EMPLEE;