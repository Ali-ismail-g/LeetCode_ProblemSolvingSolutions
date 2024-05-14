# Write your MySQL query statement below
select s.student_id , s.student_name , su.subject_name , COUNT(e.subject_name) AS attended_exams
from Students s cross join Subjects su left join Examinations e 
on s.student_id = e.student_id and su.subject_name = e.subject_name 
group by s.student_id,su.subject_name 
order by s.student_id,su.subject_name;