WITH hasSkill AS (
SELECT *,
    CASE WHEN CATEGORY = 'Front End' THEN 1 ELSE 0 END as FE,
    CASE WHEN NAME = 'Python' THEN 1 ELSE 0 END as PY,
    CASE WHEN NAME = 'C#' THEN 1 ELSE 0 END as CS
    FROM DEVELOPERS D
LEFT JOIN (SELECT * FROM SKILLCODES) S
ON D.SKILL_CODE & S.CODE = S.CODE)

# 가장 문제는 grade -> 매칭을 어떻게 시킬 것인가?
SELECT
    IF(SUM(FE) >= 1 AND SUM(PY) >= 1, 'A', 
       IF(SUM(CS) >= 1, 'B', 
          IF(SUM(FE) >= 1, 'C', 'D'))) as GRADE,
ID, EMAIL FROM hasSkill
GROUP BY ID, EMAIL
HAVING GRADE != 'D'
ORDER BY GRADE ASC, ID ASC;
