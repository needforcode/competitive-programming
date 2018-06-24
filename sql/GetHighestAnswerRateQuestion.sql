/*

https://leetcode.com/articles/get-highest-answer-rate-question/

*/

SELECT b.question_id AS survey_log from
  (SELECT question_id, sum(CASE WHEN answer_id IS NOT NULL THEN 1 ELSE 0 END)/count(*) AS rate
   FROM survey_log
   GROUP BY question_id
   ORDER BY rate DESC LIMIT 1) b;

