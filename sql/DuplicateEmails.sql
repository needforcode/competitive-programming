/**

https://leetcode.com/problems/duplicate-emails/description/

*/
SELECT Email
FROM Person
GROUP BY Email HAVING count(*) > 1;