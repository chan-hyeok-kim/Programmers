SELECT DISTINCT USER_ID, NICKNAME,
CITY || ' ' || STREET_ADDRESS1 || ' ' || STREET_ADDRESS2 AS 전체주소,
SUBSTR(TLNO,0,3) || '-' || SUBSTR(TLNO,4,4) || '-' || SUBSTR(TLNO,8,4) AS 전화번호
  FROM USED_GOODS_BOARD UGB INNER JOIN USED_GOODS_USER UGU
    ON UGB.WRITER_ID=UGU.USER_ID
 WHERE USER_ID IN (SELECT WRITER_ID
                       FROM USED_GOODS_BOARD
                      GROUP BY WRITER_ID
                     HAVING COUNT(BOARD_ID)>=3)
 ORDER BY USER_ID DESC;
	 -- 조건에 맞는 사용자 정보 조회하기
 /*
  * USED_GOODS_BOARD와 USED_GOODS_USER 테이블에서 중고 거래 게시물을 3건 이상 등록한 
  * 사용자의 사용자 ID, 닉네임, 전체주소, 전화번호를 조회하는 SQL문을 작성해주세요. 
  * 이때, 전체 주소는 시, 도로명 주소, 상세 주소가 함께 출력되도록 해주시고, 
  * 전화번호의 경우 xxx-xxxx-xxxx 같은 형태로 하이픈 문자열(-)을 삽입하여 출력해주세요.
  * 
  */