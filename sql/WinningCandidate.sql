/*

https://leetcode.com/articles/winning-candidate/

*/

SELECT a.Name
FROM Candidate a
JOIN
  (SELECT CandidateId,
          count(*) AS cnt
   FROM Vote
   GROUP BY CandidateId LIMIT 1) b ON (a.id = b.CandidateId);