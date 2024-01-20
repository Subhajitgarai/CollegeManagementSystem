# College Management System

## Overview
**This project implements a College Management System using Spring Boot, providing functionalities for managing colleges, students, departments, and teachers. The system is designed with a layered architecture, utilizing Spring Boot for efficient development.**
---

## Tools and Versions
- **JDK:** `17`
- **Spring Boot:** `3.2.1`
- **Build Tool:** `Maven`
- **Idle:** `Spring Tool Suit`
---
## Entities
1. **College**
   - **Attributes:** collegeId, collegeName, collegeAddress
   - **Relationships:** One-to-Many with students, One-to-Many with departments

2. **Student**
   - **Attributes:** studentId, studentName, studentPh, studentAddress
   - **Relationships:** Many-to-One with college

3. **Department**
   - **Attributes:** departmentId, departmentName
   - **Relationships:** Many-to-One with college, One-to-Many with teachers

4. **Teacher**
   - **Attributes:** teacherId, teacherName, teacherAddress, teacherPh
   - **Relationships:** Many-to-One with department
---
## Tabular View
Table name in database | Attributes 
 ------------ | ------------- 
College | college_id, college_name 
College_stu | student_id, student_name, student_ph, student_address, college_id(Foreign Key from college tbale)
College_dept | department_id, department_name, college_id(Foreign_Key from college table)
College_tec | teacher_id, teacher_name, teacher_ph, teacher_address, department_id(Foreign_key from college_dept table) 




## Layers
1. **Controller**
   - Utilizes RestController for handling `JSON` format data.
   - Default Request Mapping: `/college`
   - Injects CollegeService interface and maps it using `@Autowired`.
   - Communicates with the Service layer.

2. **Service**
   - Defines the Collegeservice interface with business logic methods.
   - Implements business logic in the service layer.
   - Calls methods from the Controller.

3. **Dao**
   - Uses JpaRepository for College and Department entities.
   - Performs CRUD operations using JpaRepository.
   
4. **Entities**
   - Contains entity classes: College, Student, Department, Teacher.
   - Defines default attributes for each entity.
   - Establishes relationships between entities.
---
## Technologies Used
- Spring Boot for rapid development.
- JPA and Hibernate for data persistence.
- Maven as the build tool.
---
## Application Properites
-- spring.datasource.name=test
-- spring.datasource.url=jdbc:mysql://localhost:3306/test
-- spring.datasource.username=root
-- spring.datasource.password=Subhajit@123
-- spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
-- spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
-- #ForAuto Table Creation
-- spring.jpa.hibernate.ddl-auto=create

---
## How to Run
1. Ensure `JDK 17` is installed.
2. Clone the repository.
3. Navigate to the project directory.
4. Download `Spring Tools Suit` and run it as a SpringBoot Project
