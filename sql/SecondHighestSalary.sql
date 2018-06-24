/*

https://leetcode.com/problems/second-highest-salary/description/

*/
SELECT max(salary) AS SecondHighestSalary
FROM Employee
WHERE salary NOT IN
    (SELECT max(salary)
     FROM Employee);