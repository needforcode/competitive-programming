/*

https://leetcode.com/problems/second-highest-salary/description/

*/

select max(salary) as SecondHighestSalary from Employee where salary not in (select max(salary) from Employee);