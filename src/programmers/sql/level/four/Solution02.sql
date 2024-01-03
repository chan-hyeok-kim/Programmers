SELECT CATEGORY, PRICE, PRODUCT_NAME
  FROM FOOD_PRODUCT
 WHERE CATEGORY IN ('과자','국','김치','식용유') AND (CATEGORY,PRICE) IN (SELECT CATEGORY,MAX(PRICE)
                                                                    FROM FOOD_PRODUCT
                                                                   GROUP BY CATEGORY)
 ORDER BY PRICE DESC;
-- 식품분류별 가장 비싼 식품의 정보 조회하기