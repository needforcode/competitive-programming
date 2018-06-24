/*

https://leetcode.com/articles/managers-with-at-least-5-direct-reports/

*/
SELECT Name
FROM Manager
WHERE Id IN
    (SELECT ManagerId
     FROM Manager
     GROUP BY ManagerId HAVING count(*) >= 5);