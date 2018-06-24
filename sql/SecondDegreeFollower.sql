/*

http://leet.work/post/165751683294/todo-614-second-degree-followersql

*/
SELECT a.follower,
       count(*)
FROM follow a
JOIN follow b ON (a.follower = b.followee)
GROUP BY a.follower;