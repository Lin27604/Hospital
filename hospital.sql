-- noinspection SqlNoDataSourceInspectionForFile

-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Jun 28, 2022 at 10:34 PM
-- Server version: 5.7.34
-- PHP Version: 7.4.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `ambulance`
--

CREATE TABLE `ambulance` (
  `ambulance_id` BIGINT NOT NULL,
  `status` BIGINT NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `ambulanceOrder`
--

CREATE TABLE `ambulanceOrder` (
  `ambulance_order_id` BIGINT NOT NULL,
  `emergency_id` BIGINT NOT NULL,
  `ambulance_id` BIGINT NOT NULL,
  `patient_id` BIGINT NOT NULL,
  `reason` varchar(500) NOT NULL,
  `price` DECIMAL NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `appointments`
--

CREATE TABLE `appointments` (
  `appointment_id` BIGINT NOT NULL,
  `patient_id` BIGINT NOT NULL,
  `staff_id` BIGINT NOT NULL,
  `department_id` BIGINT NOT NULL,
  `reason` varchar(500) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `bills`
--

CREATE TABLE `bills` (
  `bill_id` BIGINT NOT NULL,
  `patient_id` BIGINT NOT NULL,
  `record_id` BIGINT NOT NULL,
  `doctor_advice_id` BIGINT NOT NULL,
  `lab_result_id` BIGINT NOT NULL DEFAULT -1,
  `med_order_id` BIGINT NOT NULL,
  `ambulance_order_id` BIGINT NOT NULL DEFAULT -1,
  `price` DECIMAL NOT NULL,
  `date` date NOT NULL,
  `status` BIGINT NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `branches`
--

CREATE TABLE `branches` (
  `branch_id` BIGINT NOT NULL,
  `name` varchar(15) NOT NULL,
  `address` varchar(100) NOT NULL,
  `phone` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `buildings`
--

CREATE TABLE `buildings` (
  `building_id` BIGINT NOT NULL,
  `name` varchar(15) NOT NULL,
  `status` BIGINT NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `departments`
--

CREATE TABLE `departments` (
  `department_id` BIGINT NOT NULL,
  `department` varchar(20) NOT NULL,
  `building_id` BIGINT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `doctorAdvice`
--

CREATE TABLE `doctorAdvice` (
  `doctor_advice_id` BIGINT NOT NULL,
  `doctor_id` BIGINT NOT NULL,
  `patient_id` BIGINT NOT NULL,
  `description` varchar(500) NOT NULL,
  `med_advice` varchar(500) NOT NULL,
  `price` DECIMAL NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `insurance`
--

CREATE TABLE `insurance` (
  `insurance_id` BIGINT NOT NULL,
  `name` varchar(255) NOT NULL,
  `cover` DECIMAL NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `labResult`
--

CREATE TABLE `labResult` (
  `lab_result_id` BIGINT NOT NULL,
  `sample_id` BIGINT NOT NULL,
  `patient_id` BIGINT NOT NULL,
  `description` varchar(500) NOT NULL,
  `price` DECIMAL NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `medicine`
--

CREATE TABLE `medicine` (
  `medicine_id` BIGINT NOT NULL,
  `name` varchar(15) NOT NULL,
  `category` varchar(15) NOT NULL,
  `price` DECIMAL NOT NULL,
  `quantity` BIGINT NOT NULL,
  `supplier` varchar(15) NOT NULL,
  `produce_date` date NOT NULL,
  `valid_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `medOrder`
--

CREATE TABLE `medOrder` (
  `med_order_id` BIGINT NOT NULL,
  `pharmacy_id` BIGINT NOT NULL,
  `patient_id` BIGINT NOT NULL,
  `price` DECIMAL NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `operators`
--

CREATE TABLE `operators` (
  `operator_id` BIGINT NOT NULL,
  `operator` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `operators`
--

INSERT INTO `operators` (`operator_id`, `operator`) VALUES
(-1, 'admin'),
(0, 'patient'),
(1, 'doctor'),
(2, 'nurse'),
(3, 'lab'),
(4, 'pharmacy'),
(5, 'emergency'),
(6, 'cleaner'),
(7, 'security');

-- --------------------------------------------------------

--
-- Table structure for table `orderItem`
--

CREATE TABLE `orderItem` (
  `order_item_id` BIGINT NOT NULL,
  `medicine_id` BIGINT NOT NULL,
  `quantity` BIGINT NOT NULL,
  `med_order_id` BIGINT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `patient_id` BIGINT NOT NULL,
  `register_id` BIGINT NOT NULL,
  `record_id` BIGINT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `records`
--

CREATE TABLE `records` (
  `record_id` BIGINT NOT NULL,
  `patient_id` BIGINT NOT NULL,
  `description` varchar(500) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `register_id` BIGINT NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(16) NOT NULL,
  `email` varchar(20) NOT NULL,
  `operator` BIGINT NOT NULL,
  `first_name` varchar(15) DEFAULT NULL,
  `last_name` varchar(15) DEFAULT NULL,
  `birthday` varchar(15) DEFAULT NULL,
  `gender` varchar(8) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

CREATE TABLE `report` (
  `report_id` BIGINT NOT NULL,
  `description` varchar(200) NOT NULL,
  `date` date NOT NULL,
  `building_id` BIGINT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `service`
--

CREATE TABLE `service` (
  `service_id` BIGINT NOT NULL,
  `name` varchar(15) NOT NULL,
  `description` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `shift`
--

CREATE TABLE `shift` (
  `shift_id` BIGINT NOT NULL,
  `staff_id` BIGINT NOT NULL,
  `shift_date_id` BIGINT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `shift_date`
--

CREATE TABLE `shift_date` (
  `shift_date_id` BIGINT NOT NULL,
  `day_week` varchar(15) NOT NULL,
  `start_time` varchar(6) NOT NULL,
  `finish_time` varchar(6) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `staff_id` BIGINT NOT NULL,
  `register_id` BIGINT NOT NULL,
  `position` VARCHAR(255) NOT NULL,
  `salary` DECIMAL DEFAULT NULL,
  `department_id` BIGINT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ambulance`
--
ALTER TABLE `ambulance`
  ADD PRIMARY KEY (`ambulance_id`);

--
-- Indexes for table `ambulanceOrder`
--
ALTER TABLE `ambulanceOrder`
  ADD PRIMARY KEY (`ambulance_order_id`),
  ADD KEY `emergency_id` (`emergency_id`),
  ADD KEY `ambulance_id` (`ambulance_id`),
  ADD KEY `patient_id` (`patient_id`);

--
-- Indexes for table `appointments`
--
ALTER TABLE `appointments`
  ADD PRIMARY KEY (`appointment_id`),
  ADD KEY `patient_id` (`patient_id`),
  ADD KEY `staff_id` (`staff_id`);

--
-- Indexes for table `bills`
--
ALTER TABLE `bills`
  ADD PRIMARY KEY (`bill_id`),
  ADD KEY `patient_id` (`patient_id`),
  ADD KEY `record_id` (`record_id`),
  ADD KEY `doctor_advice_id` (`doctor_advice_id`),
  ADD KEY `lab_result_Id` (`lab_result_id`),
  ADD KEY `med_order_id` (`med_order_id`),
  ADD KEY `ambulance_order_id` (`ambulance_order_id`);

--
-- Indexes for table `branches`
--
ALTER TABLE `branches`
  ADD PRIMARY KEY (`branch_id`);

--
-- Indexes for table `buildings`
--
ALTER TABLE `buildings`
  ADD PRIMARY KEY (`building_id`);

--
-- Indexes for table `departments`
--
ALTER TABLE `departments`
  ADD PRIMARY KEY (`department_id`),
  ADD KEY `building_id` (`building_id`);

--
-- Indexes for table `doctorAdvice`
--
ALTER TABLE `doctorAdvice`
  ADD PRIMARY KEY (`doctor_advice_id`),
  ADD KEY `doctor_id` (`doctor_id`),
  ADD KEY `patient_id` (`patient_id`);

--
-- Indexes for table `insurance`
--
ALTER TABLE `insurance`
  ADD PRIMARY KEY (`insurance_id`);

--
-- Indexes for table `labResult`
--
ALTER TABLE `labResult`
  ADD PRIMARY KEY (`lab_result_id`),
  ADD KEY `sample_id` (`sample_id`),
  ADD KEY `patient_id` (`patient_id`);

--
-- Indexes for table `medicine`
--
ALTER TABLE `medicine`
  ADD PRIMARY KEY (`medicine_id`);

--
-- Indexes for table `medOrder`
--
ALTER TABLE `medOrder`
  ADD PRIMARY KEY (`med_order_id`),
  ADD KEY `pharmacy_id` (`pharmacy_id`),
  ADD KEY `patient_id` (`patient_id`);

--
-- Indexes for table `operators`
--
ALTER TABLE `operators`
  ADD PRIMARY KEY (`operator_id`);

--
-- Indexes for table `orderItem`
--
ALTER TABLE `orderItem`
  ADD PRIMARY KEY (`order_item_id`),
  ADD KEY `medicine_id` (`medicine_id`),
  ADD KEY `med_order_id` (`med_order_id`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`patient_id`),
  ADD KEY `record_id` (`record_id`);

--
-- Indexes for table `records`
--
ALTER TABLE `records`
  ADD PRIMARY KEY (`record_id`),
  ADD KEY `patient_id` (`patient_id`);

--
-- Indexes for table `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`register_id`),
  ADD KEY `operator` (`operator`);

--
-- Indexes for table `report`
--
ALTER TABLE `report`
  ADD PRIMARY KEY (`report_id`),
  ADD KEY `building_id` (`building_id`);

--
-- Indexes for table `service`
--
ALTER TABLE `service`
  ADD PRIMARY KEY (`service_id`);

--
-- Indexes for table `shift`
--
ALTER TABLE `shift`
  ADD PRIMARY KEY (`shift_id`),
  ADD KEY `staff_id` (`staff_id`),
  ADD KEY `shift_date_id` (`shift_date_id`);

--
-- Indexes for table `shift_date`
--
ALTER TABLE `shift_date`
  ADD PRIMARY KEY (`shift_date_id`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`staff_id`),
  ADD KEY `department_id` (`department_id`),
  ADD KEY `position` (`position`),
  ADD KEY `register_id` (`register_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ambulance`
--
ALTER TABLE `ambulance`
  MODIFY `ambulance_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `ambulanceOrder`
--
ALTER TABLE `ambulanceOrder`
  MODIFY `ambulance_order_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `appointments`
--
ALTER TABLE `appointments`
  MODIFY `appointment_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `bills`
--
ALTER TABLE `bills`
  MODIFY `bill_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `branches`
--
ALTER TABLE `branches`
  MODIFY `branch_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `buildings`
--
ALTER TABLE `buildings`
  MODIFY `building_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `departments`
--
ALTER TABLE `departments`
  MODIFY `department_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `doctorAdvice`
--
ALTER TABLE `doctorAdvice`
  MODIFY `doctor_advice_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `insurance`
--
ALTER TABLE `insurance`
  MODIFY `insurance_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `labResult`
--
ALTER TABLE `labResult`
  MODIFY `lab_result_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `medicine`
--
ALTER TABLE `medicine`
  MODIFY `medicine_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `medOrder`
--
ALTER TABLE `medOrder`
  MODIFY `med_order_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `orderItem`
--
ALTER TABLE `orderItem`
  MODIFY `order_item_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `patient_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `records`
--
ALTER TABLE `records`
  MODIFY `record_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `register`
--
ALTER TABLE `register`
  MODIFY `register_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `report`
--
ALTER TABLE `report`
  MODIFY `report_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `service`
--
ALTER TABLE `service`
  MODIFY `service_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `shift`
--
ALTER TABLE `shift`
  MODIFY `shift_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `staff_id` BIGINT NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `ambulanceOrder`
--
ALTER TABLE `ambulanceOrder`
  ADD CONSTRAINT `ambulance_order_fk_1` FOREIGN KEY (`emergency_id`) REFERENCES `staff` (`staff_id`),
  ADD CONSTRAINT `ambulance_order_fk_2` FOREIGN KEY (`ambulance_id`) REFERENCES `ambulance` (`ambulance_id`),
  ADD CONSTRAINT `ambulance_order_fk_3` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`);

--
-- Constraints for table `appointments`
--
ALTER TABLE `appointments`
  ADD CONSTRAINT `appointments_fk_1` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`),
  ADD CONSTRAINT `appointments_fk_2` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`);

--
-- Constraints for table `bills`
--
ALTER TABLE `bills`
  ADD CONSTRAINT `bills_fk_1` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`),
  ADD CONSTRAINT `bills_fk_2` FOREIGN KEY (`record_id`) REFERENCES `records` (`record_id`),
  ADD CONSTRAINT `bills_fk_3` FOREIGN KEY (`doctor_advice_id`) REFERENCES `doctorAdvice` (`doctor_advice_id`),
  ADD CONSTRAINT `bills_fk_4` FOREIGN KEY (`lab_result_id`) REFERENCES `labResult` (`lab_result_id`),
  ADD CONSTRAINT `bills_fk_5` FOREIGN KEY (`med_order_id`) REFERENCES `medOrder` (`med_order_id`),
  ADD CONSTRAINT `bills_fk_6` FOREIGN KEY (`ambulance_order_id`) REFERENCES `ambulanceOrder` (`ambulance_order_id`);

--
-- Constraints for table `departments`
--
ALTER TABLE `departments`
  ADD CONSTRAINT `departments_fk_1` FOREIGN KEY (`building_id`) REFERENCES `buildings` (`building_id`);

--
-- Constraints for table `doctorAdvice`
--
ALTER TABLE `doctorAdvice`
  ADD CONSTRAINT `doctor_advice_fk_1` FOREIGN KEY (`doctor_id`) REFERENCES `staff` (`staff_id`),
  ADD CONSTRAINT `doctor_advice_fk_2` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`);

--
-- Constraints for table `labResult`
--
ALTER TABLE `labResult`
  ADD CONSTRAINT `lab_result_fk_1` FOREIGN KEY (`sample_id`) REFERENCES `staff` (`staff_id`),
  ADD CONSTRAINT `lab_result_fk_2` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`);

--
-- Constraints for table `medOrder`
--
ALTER TABLE `medOrder`
  ADD CONSTRAINT `medorder_ibfk_1` FOREIGN KEY (`pharmacy_id`) REFERENCES `staff` (`staff_id`),
  ADD CONSTRAINT `medorder_ibfk_2` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`);

--
-- Constraints for table `orderItem`
--
ALTER TABLE `orderItem`
  ADD CONSTRAINT `orderitem_ibfk_1` FOREIGN KEY (`medicine_id`) REFERENCES `medicine` (`medicine_id`),
  ADD CONSTRAINT `orderitem_ibfk_2` FOREIGN KEY (`med_order_id`) REFERENCES `medOrder` (`med_order_id`);

--
-- Constraints for table `patient`
--
ALTER TABLE `patient`
  ADD CONSTRAINT `patient_ibfk_1` FOREIGN KEY (`record_id`) REFERENCES `records` (`record_id`);

--
-- Constraints for table `records`
--
ALTER TABLE `records`
  ADD CONSTRAINT `records_ibfk_1` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`);

--
-- Constraints for table `register`
--
ALTER TABLE `register`
  ADD CONSTRAINT `register_ibfk_1` FOREIGN KEY (`operator`) REFERENCES `operators` (`operator_id`);

--
-- Constraints for table `report`
--
ALTER TABLE `report`
  ADD CONSTRAINT `report_ibfk_1` FOREIGN KEY (`building_id`) REFERENCES `buildings` (`building_id`),
  ADD CONSTRAINT `report_ibfk_2` FOREIGN KEY (`building_id`) REFERENCES `buildings` (`building_id`);

--
-- Constraints for table `shift`
--
ALTER TABLE `shift`
  ADD CONSTRAINT `shift_ibfk_1` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`),
  ADD CONSTRAINT `shift_ibfk_2` FOREIGN KEY (`shift_date_id`) REFERENCES `shift_date` (`shift_date_id`);

--
-- Constraints for table `staff`
--
ALTER TABLE `staff`
  ADD CONSTRAINT `staff_ibfk_1` FOREIGN KEY (`department_id`) REFERENCES `departments` (`department_id`),
  ADD CONSTRAINT `staff_ibfk_2` FOREIGN KEY (`position`) REFERENCES `operators` (`operator_id`),
  ADD CONSTRAINT `staff_ibfk_3` FOREIGN KEY (`register_id`) REFERENCES `register` (`register_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
