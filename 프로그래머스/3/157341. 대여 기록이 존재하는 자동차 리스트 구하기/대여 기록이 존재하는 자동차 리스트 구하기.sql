-- 코드를 입력하세요
SELECT H.CAR_ID FROM CAR_RENTAL_COMPANY_CAR AS C
RIGHT JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY AS H
ON C.CAR_ID = H.CAR_ID
WHERE H.START_DATE LIKE "%-10-%"
AND C.CAR_TYPE LIKE "세단"
GROUP BY C. CAR_ID
ORDER BY H.CAR_ID DESC;