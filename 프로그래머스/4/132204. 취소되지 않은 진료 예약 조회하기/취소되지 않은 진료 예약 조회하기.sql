-- 코드를 입력하세요
SELECT 
    A.APNT_NO, P.PT_NAME, A.PT_NO, A.MCDP_CD, D.DR_NAME, A.APNT_YMD
FROM APPOINTMENT AS A
LEFT OUTER JOIN DOCTOR AS D
    ON A.MDDR_ID = D.DR_ID
LEFT OUTER JOIN PATIENT AS P
    ON A.PT_NO = P.PT_NO

WHERE A.MCDP_CD = "CS" 
    AND A.APNT_CNCL_YN = "N" 
    AND DATE_FORMAT(A.APNT_YMD, "%Y-%m-%d") LIKE "2022-04-13"
ORDER BY APNT_YMD ASC;

/* 2022년 4월 13일에 취소되지 않은 CS 진료 예약 내역 조회



PATIENT 테이블
PT_NO      PT_NAME,  GEND_CD,  AGE,  TLNO 
환자번호    환자이름,   성별코드,  나이  전화번호

DOCTOR 테이블
DR_NAME, DR_ID, LCNS_NO, HIRE_YMD, MCDP_CD, TLNO
의사이름, 의사ID, 면허번호, 고용일자, 진료과코드, 전화번호

APPOINTMENT 테이블
APNT_YMD, APNT_NO, PT_NO, MCDP_CD, MDDR_ID, APNT_CNCL_YN, APNT_CNCL_YMD
예약일시, 진료예약번호, 환자번호, 진료과코드, 의사ID, 예약취소여부, 예약취소날짜

*/