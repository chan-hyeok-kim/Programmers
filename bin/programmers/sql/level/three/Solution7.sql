SELECT DISTINCT CRCC.CAR_ID
  FROM CAR_RENTAL_COMPANY_CAR CRCC INNER JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY CRCRH
    ON CRCC.CAR_ID=CRCRH.CAR_ID
 WHERE CRCC.CAR_TYPE='세단' 
   AND CRCRH.START_DATE BETWEEN TO_DATE('2022-10-01','YYYY-MM-DD') 
   AND TO_DATE('2022-10-31','YYYY-MM-DD')
 ORDER BY CRCC.CAR_ID DESC;
	 -- 대여 기록이 존재하는 자동차 리스트 구하기