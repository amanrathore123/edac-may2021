
-- 1
select locations.location_id, street_address, city, state_province, countries.country_name
from departments,countries, locations
where departments.LOCATION_ID = locations.LOCATION_ID
And locations.COUNTRY_ID = countries.COUNTRY_ID;


-- 2
select CONCAT(first_name, CONCAT(' ', last_name)) AS NAME, DEPARTMENT_ID from employees ;


-- 3
select CONCAT(first_name, CONCAT(' ', last_name)) AS NAME,Jobs.job_title, employees.department_id 
from employees,jobs,departments,locations
where employees.JOB_ID = jobs.JOB_ID 
and employees.DEPARTMENT_ID = departments.DEPARTMENT_ID
and departments.LOCATION_ID = locations.LOCATION_ID 
and locations.CITY = 'London';


-- 4
SELECT EMPLOYEE_ID, FIRST_NAME, MANAGER_ID, LAST_NAME
FROM EMPLOYEES;


-- 5
select CONCAT(first_name, CONCAT(' ', last_name)) AS NAME, HIRE_DATE from employees 
where hire_date > ( select hire_date from employees where last_name = 'Jones' or First_name = 'Jones') 
order by hire_date;


-- 6
select department_name,  count(employees.employee_id) as 'count' from departments,employees 
where departments.DEPARTMENT_ID = employees.DEPARTMENT_ID
group by DEPARTMENT_NAME order by 1; 


-- 7
select employees.employee_id, jobs.job_title, datediff(end_date,start_date) as days 
from employees,jobs,job_history
where job_history.DEPARTMENT_ID = 90
and jobs.job_id = job_history.job_id
and employees.JOB_ID = job_history.JOB_ID;


-- 8
select  departments.department_id,first_name from departments,employees
where employees.EMPLOYEE_ID = departments.MANAGER_ID
AND employees.DEPARTMENT_ID = departments.DEPARTMENT_ID;
SELECT d.department_name, e.first_name, l.city 
FROM departments d 
JOIN employees e 
ON (d.manager_id = e.employee_id) 
JOIN locations l USING (location_id);

-- 9
 select department_name, first_name, last_name, city 
from employees, departments, locations
where employees.DEPARTMENT_ID = departments.DEPARTMENT_ID
and locations.LOCATION_ID = departments.LOCATION_ID
and employees.EMPLOYEE_ID = departments.MANAGER_ID;

-- 10
select job_title,avg(salary) FROM employees e,jobs j 
where e.job_id=j.job_id group by job_title;

-- 11
select job_title, first_name, salary-min_salary 'Salary - Min_Salary'  
FROM employees e,jobs j 
where e.job_id=j.job_id;

-- 12
select jh.* from job_history jh,employees e where salary>10000; 

-- 13.
select  department_name,first_name, last_name, hire_date, salary,datediff(curdate(),hire_date)/365>15 as experience 
from employees e,departments d
where d.department_id = e.department_id and e.department_id=20 and datediff(curdate(),hire_date)/365>15;