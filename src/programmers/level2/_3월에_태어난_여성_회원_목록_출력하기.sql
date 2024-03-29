-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%main')AS DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE TLNO is not null
  AND GENDER = 'W'
  AND EXTRACT(MONTH FROM DATE_OF_BIRTH) = 3
ORDER BY MEMBER_ID;