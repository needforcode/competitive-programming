/*

https://leetcode.com/problems/consecutive-numbers/description/

*/

select distinct a1.Num as ConsecutiveNums from (Select s1.id, s1.Num from Logs s1 JOIN Logs s2 ON(s1.id-s2.id=1 and s1.Num = s2.Num)) a1 JOIN Logs s3 ON ( a1.id-s3.id=2 and a1.Num = s3.Num);