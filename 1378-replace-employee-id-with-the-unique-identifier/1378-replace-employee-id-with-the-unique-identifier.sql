# Write your MySQL query statement below
SELECT e.unique_id, n.name
FROM Employees n
LEFT JOIN EmployeeUNI e
ON n.id = e.id;
