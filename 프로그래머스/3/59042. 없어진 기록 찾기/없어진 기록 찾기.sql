SELECT O.ANIMAL_ID, O.NAME FROM ANIMAL_INS AS I
RIGHT JOIN ANIMAL_OUTS AS O
ON O.ANIMAL_ID = I.ANIMAL_ID
WHERE I.ANIMAL_ID IS NULL
ORDER BY O.ANIMAL_ID;