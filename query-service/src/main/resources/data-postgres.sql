INSERT INTO STUDENTS(ID, FIRST_NAME, LAST_NAME)
VALUES 
(1, 'Ricardo', 'Arrobo'), 
(2, 'Bruno', 'Esparza');


INSERT INTO COURSES(ID, INSTITUTION_NAME,TITLE ,DURATION)
VALUES 
(1, 'UTPL', 'Arquitectura de Aplicaciones', 120),
(2, 'MIT', 'Blockchain development basics', 60),
(3, 'Tecnologico de Monterrey', 'Web development', 180);

INSERT INTO CERTIFICATES
(ID, VALIDATION_CODE, STUDENT_ID, COURSE_ID, CREATED_DATE)
VALUES
(1, 'b1730097-584a-434f-9443-a804cb3276d2', 1, 1, '2021/01/01'),
(2, '663f4b7a-81be-4360-827e-8ca956564863', 1, 2, '2021/01/11'),
(3, 'd2a5a2c4-c3cd-463a-a312-c94a7343656a', 1, 3, '2021/01/15'),
(4, 'e3f649a8-48a7-4ec6-9df2-d02368868e43', 2, 1, '2021/01/01'),
(5, 'f44fee62-3929-48c7-88c0-db7db4b0c37c', 2, 2, '2021/02/07'),
(6, 'd3b0759d-767e-446c-b63a-766ae3c23091', 2, 3, '2021/02/13');
