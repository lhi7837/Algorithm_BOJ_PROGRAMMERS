SELECT COUNT(*) AS FISH_COUNT, N.FISH_NAME 
FROM FISH_INFO I
LEFT JOIN FISH_NAME_INFO N
ON I.FISH_TYPE = N.FISH_TYPE 
GROUP BY FISH_NAME
ORDER BY FISH_COUNT DESC;