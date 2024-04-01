SELECT ID, 
IF(SIZE_OF_COLONY > 1000, "HIGH", 
   IF(SIZE_OF_COLONY > 100, "MEDIUM", 
      IF(SIZE_OF_COLONY <= 100, "LOW", 0))) AS SIZE 
FROM ECOLI_DATA
ORDER BY ID ASC;