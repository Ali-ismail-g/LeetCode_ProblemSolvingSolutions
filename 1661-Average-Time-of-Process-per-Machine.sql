# Write your MySQL query statement below
select a.machine_id,Round(AVG(e.timestamp -a.timestamp ),3) AS processing_time from Activity a join Activity e on a.machine_id = e.machine_id and 
a.process_id = e.process_id and a.activity_type ='start' and e.activity_type = 'end'
GROUP BY a.machine_id;