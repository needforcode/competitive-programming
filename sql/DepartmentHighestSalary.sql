/*

https://leetcode.com/problems/department-highest-salary/description/

*/

SELECT d.NAME     AS Department, 
       emp.NAME   AS Employee, 
       emp.salary AS Salary 
FROM   employee emp 
       JOIN department d 
         ON ( emp.departmentid = d.id ) 
WHERE  ( emp.departmentid, emp.salary ) IN (SELECT e.departmentid, 
                                                   Max(salary) AS salary 
                                            FROM   employee e 
                                            GROUP  BY e.departmentid); 