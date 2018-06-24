/*
https://leetcode.com/problems/rank-scores/description/
*/

SELECT s1.Id,
  (SELECT count(DISTINCT s2.Score)
   FROM Scores s2
   WHERE s2.Score >= s1.Score) AS rank
FROM Scores s1
ORDER BY rank;

