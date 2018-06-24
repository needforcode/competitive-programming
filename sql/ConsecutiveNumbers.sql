/*

https://leetcode.com/problems/consecutive-numbers/description/

*/
SELECT DISTINCT a1.Num AS ConsecutiveNums
FROM
  (SELECT s1.id,
          s1.Num
   FROM Logs s1
   JOIN Logs s2 ON(s1.id-s2.id=1
                   AND s1.Num = s2.Num)) a1
JOIN Logs s3 ON (a1.id-s3.id=2
                 AND a1.Num = s3.Num);