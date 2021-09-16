create database maternity_leave;
use maternity_leave;

desc employee_details;
desc maternity_details;

create view all_details as
select t1.employee_number, t1.employee_name, t1.date_of_joining, t1.department, t1.skills, t1.experience, t1.location, t1.start_project, t2.end_project, t2.maternity_start_date,
	t2.maternity_end_date, t2.maternity_confirmed_end_date, t2.ctc_rs, t2.ctc_d, t2.remark, t2.is_active from employee_details t1 join maternity_details t2
	 where t1.employee_number = t2.employee_no;
	
drop view all_details;
	
desc all_details;

insert into employee_details(employee_number, employee_name, date_of_joining, department, skills, experience, location, start_project, created_by, created_at) 
	values ('ENC1', 'Yash Korla', '2021-08-02', 'CO', 'Java', 0, 'Mum', 'Encora 1', 'Yash Korla', now());
    
insert into employee_details(employee_number, employee_name, date_of_joining, department, skills, experience, location, start_project, created_by, created_at) 
	values ('ENC2', 'Khushboo Rathod', '2021-08-02', 'CO', 'Java', 0, 'Mum', 'Encora 1', 'Khushboo Rathod', now());
    
insert into employee_details(employee_number, employee_name, date_of_joining, department, skills, experience, location, start_project, created_by, created_at) 
	values ('ENC3', 'Raj Motta', '2021-08-02', 'CO', 'Java', 0, 'Mum', 'Encora 1', 'Raj Motta', now());
    
insert into employee_details(employee_number, employee_name, date_of_joining, department, skills, experience, location, start_project, created_by, created_at) 
	values ('ENC4', 'Niyati Darekar', '2021-08-02', 'CO', 'Java', 0, 'Mum', 'Encora 1', 'Niyati Darekar', now());
    
insert into employee_details(employee_number, employee_name, date_of_joining, department, skills, experience, location, start_project, created_by, created_at) 
	values ('ENC5', 'Deepak Bansal', '2021-08-02', 'Director', 'Java', 0, 'Mum', 'Encora 1', 'Deepak Bansal', now());

insert into employee_details(employee_number, employee_name, date_of_joining, department, skills, experience, location, start_project, created_by, created_at) 
	values ('ENC6', 'Saravana Rajiah', '2021-08-02', 'SVP', 'Java', 0, 'Mum', 'Encora 1', 'Saravana Rajiah', now());
    
insert into employee_details(employee_number, employee_name, date_of_joining, department, skills, experience, location, start_project, created_by, created_at) 
	values ('ENC7', 'Urvashi Nair', '2021-08-02', 'HR', 'Java', 0, 'Mum', 'Encora 1', 'Urvashi Nair', now());
    
insert into employee_details(employee_number, employee_name, date_of_joining, department, skills, experience, location, start_project, created_by, created_at) 
	values ('ENC8', 'Anitha Sarathy', '2021-08-02', 'HR', 'Java', 0, 'Mum', 'Encora 1', 'Anitha Sarathy', now());
    
insert into employee_details(employee_number, employee_name, date_of_joining, department, skills, experience, location, start_project, created_by, created_at) 
	values ('ENC9', 'Summet Sharma', '2021-08-02', 'PM', 'Java', 0, 'Mum', 'Encora 1', 'Summet Sharma', now());
    
insert into employee_details(employee_number, employee_name, date_of_joining, department, skills, experience, location, start_project, created_by, created_at) 
	values ('ENC10', 'Shweta Sharma', '2021-08-02', 'SE', 'Java', 0, 'Mum', 'Encora 1', 'Shweta Sharma', now());
    
select employee_number, employee_name, date_of_joining, department, skills, experience, location, start_project, created_by, created_at from employee_details;
select employee_no, end_project, maternity_start_date, maternity_end_date, maternity_confirmed_end_date, ctc_rs, ctc_d, remark, created_by, created_at, updated_by, updated_at, is_active 
		from maternity_details;
select * from all_details;

drop table maternity_details;
drop table employee_details;

truncate table maternity_details;
truncate table employee_details;