/*

https://leetcode.com/articles/triangle-judgement/

*/
SELECT x AS x,
       y AS y,
       z AS z,
       CASE
           WHEN (x*x+y*y > z*z) THEN "YES"
           ELSE "NO"
       END AS triangle
FROM triangle;