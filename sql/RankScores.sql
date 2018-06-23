/*
https://leetcode.com/problems/rank-scores/description/
*/

select s1.Id, (select count(distinct s2.Score) from Scores s2 where s2.Score >= s1.Score) as rank 
from Scores s1 order by rank;
