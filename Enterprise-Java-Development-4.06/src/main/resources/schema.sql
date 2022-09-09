DROP TABLE IF EXISTS patient;
DROP TABLE IF EXISTS doctor;

CREATE TABLE `doctor` (
  `employee_id` varchar(255) NOT NULL,
  `department` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
);

CREATE TABLE `patient` (
  `patient_id` int NOT NULL AUTO_INCREMENT,
  `date_of_birth` datetime(6) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `admitted_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`patient_id`),
  FOREIGN KEY (`admitted_by`) REFERENCES `doctor` (`employee_id`)
);
