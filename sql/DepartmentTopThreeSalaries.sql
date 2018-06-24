/*

https://leetcode.com/problems/department-top-three-salaries/description/

*/

SELECT d.Name AS Department,
       e1.Name AS Employee,
       e1.salary AS salary
FROM employee e1
JOIN Department d ON (d.Id = e1.DepartmentId)
WHERE
    (SELECT count(DISTINCT salary)
     FROM employee e2
     WHERE e1.DepartmentId = e2.DepartmentId
       AND e2.salary > e1.salary) < 3
ORDER BY Department ASC,
         salary DESC;