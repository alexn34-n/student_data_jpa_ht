CREATE TABLE students (
  id        bigserial PRIMARY KEY,
  name      VARCHAR(255),
  age       INT
);

INSERT INTO students (name, age) VALUES
('Helena', 18),
('Sam', 22),
('Bob', 24),
('Orlando', 32),
('Frank', 28),
('Danniel', 25),
('Adrian', 34),
('John', 21),
('Jack', 20),
('Berty', 19);