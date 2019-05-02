# Web-Development-tools

Projects

Online NEU Coop Application Portal
Feb 2019 – Apr 2019

Project description
Implemented Northeastern Coop portal and deployed the web application on Apache Tomcat server. I used following technologies in the project-
Servlets
Spring MVC
Hibernate
Java Mail API
Filter, Interceptor and Controller
Authorization and Authentication 
Validator methods
HTML, CSS, Bootstrap

Implemented the portal where employers can post jobs for their company and update the jobs respectively. Employer can view the uploaded resume by the candidate and change their status to selected or rejected from the process. Candidate can apply for the job and share their proficiency and customized resume with the employer. Designed Mail API to receive emails for the applied jobs.

There are 3 user roles-
1)	Admin- Checking the predefined admin role entry I made in Hibernate table. Only admin can register and delete a Company on Coop portal. 
The companies added will appear on the new user registration form page after that step. Before that nobody can even register in the system.

2)	Employer- Now the respective company of Employer appears for him to register in the portal. After submitting the form and getting registered, employer can post job on the website. The employer can post jobs for the affiliated company only and can view all jobs posted by his colleagues on the portal and can update them.

3)	Employee- New candidate can see the jobs listed on portal without even signing in and then select the company he is interested to apply for. Now the candidate can create account and register on the portal and is authenticated to apply for the companies.
Candidate is allowed to view all the jobs he has applied for and also, he can search respective jobs posted on the portal with help of search queries for company name and job name to fetch respective data.
After applying to a job, Mail is sent to the candidate for successful application.

Irrespective of the role and whether registered on the system or not, all users can view as many jobs are posted on the portal.


