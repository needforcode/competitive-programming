/**

https://leetcode.com/problems/duplicate-emails/description/

*/

select Email from Person group by Email HAVING count(*) > 1;