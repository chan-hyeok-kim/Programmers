SELECT A.APNT_NO, P.PT_NAME, A.PT_NO, A.MCDP_CD, D.DR_NAME, A.APNT_YMD
  FROM PATIENT P INNER JOIN APPOINTMENT A
    ON P.PT_NO=A.PT_NO INNER JOIN DOCTOR D
    ON A.MDDR_ID=D.DR_ID
 WHERE TO_CHAR(APNT_YMD,'YYYY-MM-DD')='2022-04-13' AND APNT_CNCL_YN='N'
 ORDER BY APNT_YMD;
-- 취소되지 않은 진료 예약 조회하기