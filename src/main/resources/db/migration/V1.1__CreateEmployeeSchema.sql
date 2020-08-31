CREATE TABLE employees (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  profession VARCHAR(255) NOT NULL,
  city VARCHAR(255) NOT NULL,
  branch VARCHAR(255) NOT NULL
);

INSERT INTO employees (id, first_name, last_name, profession, city, branch) values (1, 'Melania', 'Cotelard', 'Digital Marketing', 'Dublin', 'Main Office'),
(2, 'Larissa', 'Evaldt', 'Bartender', 'Dublin', 'Dundrum'),
(3, 'Quintilla', 'Labbati', 'Senior Developer', 'Dublin', 'Main Office'),
(4, 'Mariana', 'Labbati', 'Web Developer', 'Branch', 'Main Office');
