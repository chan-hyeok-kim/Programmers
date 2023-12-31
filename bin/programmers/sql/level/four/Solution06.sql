SELECT RI.REST_ID, REST_NAME,FOOD_TYPE,FAVORITES,ADDRESS,ROUND(AVG(RR.REVIEW_SCORE),2) AS SCORE
  FROM REST_INFO RI INNER JOIN REST_REVIEW RR
    ON RI.REST_ID=RR.REST_ID
 WHERE SUBSTR(ADDRESS,0,2)='서울'
 GROUP BY RI.REST_ID, REST_NAME,FOOD_TYPE,FAVORITES,ADDRESS
 ORDER BY SCORE DESC, FAVORITES DESC;
-- 서울에 위치한 식당 목록 출력하기