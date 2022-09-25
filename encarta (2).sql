-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 05, 2018 at 09:28 AM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `encarta`
--

-- --------------------------------------------------------

--
-- Table structure for table `agriculture`
--

CREATE TABLE IF NOT EXISTS `agriculture` (
  `info_id` varchar(30) NOT NULL,
  `agricultureinformation` text NOT NULL,
  `emp_id` int(11) NOT NULL,
  PRIMARY KEY (`info_id`),
  KEY `emp_id` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `agriculture`
--

INSERT INTO `agriculture` (`info_id`, `agricultureinformation`, `emp_id`) VALUES
('44', '&#4843;&#4621;&#4720;&#4752;&#4872;&#4648;&#4619;&#4728;&#4813; &#4773;&#4661;&#4648;&#4766;&#4733; &#4704;&#4781;&#4621;&#4621; &#4773;&#4755; &#4704;&#4940;&#4848;&#4651;&#4621; &#4635;&#4648;&#4634;&#4843; &#4708;&#4726;&#4733;. &#4707;&#4616;&#4937;&#4725; &#4901;&#4674;&#4725; &#4874;&#4828;&#4843;&#4725; &#4704;&#4653;&#4779;&#4723; &#4840;&#4950;&#4616;&#4722;&#4779; &#4768;&#4632;&#4651;&#4654;&#4733; &#4776;&#4773;&#4661;&#4653; &#4720;&#4616;&#4672;&#4811;&#4621;&#4962; &#4840;&#4720;&#4616;&#4843;&#4841; &#4808;&#4872;&#4758;&#4733; &#4877;&#4757; &#4768;&#4609;&#4757;&#4637; &#4704;&#4773;&#4661;&#4653; &#4843;&#4617; ...', 44),
('45', 'Ethio encarta mobile based system\r\nUplod Information About Ethiopia Agriculture', 45);

-- --------------------------------------------------------

--
-- Table structure for table `culture`
--

CREATE TABLE IF NOT EXISTS `culture` (
  `cultureinformation` text NOT NULL,
  `emp_id` int(11) NOT NULL,
  `info_id` varchar(30) NOT NULL,
  PRIMARY KEY (`info_id`),
  KEY `emp_id` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `culture`
--

INSERT INTO `culture` (`cultureinformation`, `emp_id`, `info_id`) VALUES
('You can update the following musical History Information by changing the input fields!', 45, '34'),
('&#4843;&#4621;&#4720;&#4752;&#4872;&#4648;&#4619;&#4728;&#4813; &#4773;&#4661;&#4648;&#4766;&#4733; &#4704;&#4781;&#4621;&#4621; &#4773;&#4755; &#4704;&#4940;&#4848;&#4651;&#4621; &#4635;&#4648;&#4634;&#4843; &#4708;&#4726;&#4733;. &#4707;&#4616;&#4937;&#4725; &#4901;&#4674;&#4725; &#4874;&#4828;&#4843;&#4725; &#4704;&#4653;&#4779;&#4723; &#4840;&#4950;&#4616;&#4722;&#4779; &#4768;&#4632;&#4651;&#4654;&#4733; &#4776;&#4773;&#4661;&#4653; &#4720;&#4616;&#4672;&#4811;&#4621;&#4962; &#4840;&#4720;&#4616;&#4843;&#4841; &#4808;&#4872;&#4758;&#4733; &#4877;&#4757; &#4768;&#4609;&#4757;&#4637; &#4704;&#4773;&#4661;&#4653; &#4843;&#4617; ...', 45, '45'),
('Ethio encarta mobile based system\r\nUplod Information About Ethiopia Culture', 45, '554');

-- --------------------------------------------------------

--
-- Table structure for table `education`
--

CREATE TABLE IF NOT EXISTS `education` (
  `eduinformation` text NOT NULL,
  `emp_id` int(11) NOT NULL,
  `info_id` varchar(30) NOT NULL,
  PRIMARY KEY (`info_id`),
  KEY `emp_id` (`emp_id`),
  KEY `emp_id_2` (`emp_id`),
  KEY `emp_id_3` (`emp_id`),
  KEY `emp_id_4` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `education`
--

INSERT INTO `education` (`eduinformation`, `emp_id`, `info_id`) VALUES
('You can update the following musical History Information by changing the input fields!', 45, '3');

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE IF NOT EXISTS `employees` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` int(15) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`emp_id`),
  KEY `user_id` (`user_id`),
  KEY `emp_id` (`emp_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=59 ;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`emp_id`, `first_name`, `last_name`, `address`, `phone`, `user_id`) VALUES
(44, 'aber', 'abrh', 'abe', 9877566, 50),
(45, 'am', 'as', 'gojam', 9877566, 51),
(46, 'am', 'be', 'gojam', 9877566, 52),
(48, 'asnake', 'yilak', 'gojam', 9877566, 57),
(51, 'asnake', 'yilak', 'gojam', 9877566, 60),
(52, 'wondmu', 'be', 'gojam', 9877566, 61),
(53, 'balem', 'tilahun', 'gojam', 9877566, 62),
(54, 'tizta', 'endr', 'gojam', 9877566, 63),
(55, 'am', 'be', 'gojam', 9877566, 64),
(56, 'aa', 'bb', 'cc', 9877566, 65),
(57, 'defs', 'defas', 'gojam', 9877566, 66),
(58, 'yy', 'uu', 'gojam', 911700609, 67);

-- --------------------------------------------------------

--
-- Table structure for table `envaroment`
--

CREATE TABLE IF NOT EXISTS `envaroment` (
  `info_id` varchar(30) NOT NULL,
  `envinformation` text NOT NULL,
  `emp_id` int(11) NOT NULL,
  PRIMARY KEY (`info_id`),
  KEY `emp_id` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `ethiohistory`
--

CREATE TABLE IF NOT EXISTS `ethiohistory` (
  `info_id` varchar(30) NOT NULL,
  `envinformation` text NOT NULL,
  `emp_id` int(11) NOT NULL,
  PRIMARY KEY (`info_id`),
  KEY `emp_id` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ethiohistory`
--

INSERT INTO `ethiohistory` (`info_id`, `envinformation`, `emp_id`) VALUES
('1', 'Ethio encarta mobile based system\r\nUplod Information About Ethiopia Fumes peopleEthio encarta mobile based system\r\nUplod Information About Ethiopia Fumes peopleEthio encarta mobile based system\r\nUplod Information About Ethiopia Fumes peopleEthio encarta mobile based system\r\nUplod Information About Ethiopia Fumes peopleEthio encarta mobile based system\r\nUplod Information About Ethiopia Fumes people', 45),
('2', 'Ethio encarta mobile based system\r\nUplod Information About Ethiopia Fumes peopleEthio encarta mobile based system\r\nUplod Information About Ethiopia Fumes peopleEthio encarta mobile based system\r\nUplod Information About Ethiopia Fumes peopleEthio encarta mobile based system\r\nUplod Information About Ethiopia Fumes peopleEthio encarta mobile based system\r\nUplod Information About Ethiopia Fumes people\r\n			', 45),
('4', 'amksbjhggdkjrhgiuhkjgyutrfgt7f', 51),
('et65', 'the ', 48),
('ethio123', 'the\r\n			', 57),
('fumes34', 'tyuuu', 51);

-- --------------------------------------------------------

--
-- Table structure for table `ethiopiajokes`
--

CREATE TABLE IF NOT EXISTS `ethiopiajokes` (
  `info_id` varchar(30) NOT NULL,
  `jokinformation` text NOT NULL,
  `emp_id` int(11) NOT NULL,
  PRIMARY KEY (`info_id`),
  KEY `emp_id` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ethiopiajokes`
--

INSERT INTO `ethiopiajokes` (`info_id`, `jokinformation`, `emp_id`) VALUES
('1', 'Ethio encarta mobile based system\r\nUplod Information About Ethiopia Jokes', 45),
('5', 'alkagbrhal', 51),
('78', 'Ethio encarta mobile based system\r\nUplod Information About Ethiopia Jokes', 45);

-- --------------------------------------------------------

--
-- Table structure for table `famouspeople`
--

CREATE TABLE IF NOT EXISTS `famouspeople` (
  `info_id` varchar(30) NOT NULL,
  `faminformation` text NOT NULL,
  `emp_id` int(11) NOT NULL,
  PRIMARY KEY (`info_id`),
  KEY `emp_id` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `famouspeople`
--

INSERT INTO `famouspeople` (`info_id`, `faminformation`, `emp_id`) VALUES
('34', 'Ethio encarta mobile based system\r\nUplod Information About Ethiopia Fumes people', 45),
('45', 'Ethio encarta mobile based system\r\nUplod Information About Ethiopia Fumes people', 45),
('5', 'Ethio encarta mobile based system\r\nUplod Information About Ethiopia Fumes people', 44),
('fumes35', 'abebe', 51);

-- --------------------------------------------------------

--
-- Table structure for table `heritage`
--

CREATE TABLE IF NOT EXISTS `heritage` (
  `info_id` varchar(30) NOT NULL,
  `herinformation` text NOT NULL,
  `emp_id` int(11) NOT NULL,
  PRIMARY KEY (`info_id`),
  KEY `emp_id` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `lawgovt`
--

CREATE TABLE IF NOT EXISTS `lawgovt` (
  `info_id` varchar(30) NOT NULL,
  `lawinformation` text NOT NULL,
  `emp_id` int(11) NOT NULL,
  PRIMARY KEY (`info_id`),
  KEY `emp_id` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `musicalinformation`
--

CREATE TABLE IF NOT EXISTS `musicalinformation` (
  `info_id` varchar(30) NOT NULL,
  `musinformation` text NOT NULL,
  `emp_id` int(11) NOT NULL,
  PRIMARY KEY (`info_id`),
  KEY `emp_id` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `musicalinformation`
--

INSERT INTO `musicalinformation` (`info_id`, `musinformation`, `emp_id`) VALUES
('3', 'You can update the following musical Instrument Information by changing the input fields\r\nYou can update the following musical Instrument Information by changing the input fieldsYou can update the following musical Instrument Information by changing the input fieldsYou can update the following musical Instrument Information by changing the input fieldsYou can update the following musical Instrument Information by changing the input fields			', 45),
('5', 'You can update the following musical Instrument Information by changing the input fields\r\n			\r\n	You can update the following musical Instrument Information by changing the input fields\r\n			You can update the following musical Instrument Information by changing the input fields\r\n			You can update the following musical Instrument Information by changing the input fields\r\n			You can update the following musical Instrument Information by changing the input fields\r\n			You can update the following musical Instrument Information by changing the input fields\r\n			You can update the following musical Instrument Information by changing the input fields\r\n			You can update the following musical Instrument Information by changing the input fields\r\n			You can update the following musical Instrument Information by changing the input fields\r\n			You can update the following musical Instrument Information by changing the input fields\r\n			You can update the following musical Instrument Information by changing the input fields\r\n			You can update the following musical Instrument Information by changing the input fields\r\n			You can update the following musical Instrument Information by changing the input fields\r\n			You can update the following musical Instrument Information by changing the input fields\r\n			You can update the following musical Instrument Information by changing the input fields\r\n					', 44);

-- --------------------------------------------------------

--
-- Table structure for table `sport`
--

CREATE TABLE IF NOT EXISTS `sport` (
  `info_id` varchar(30) NOT NULL,
  `spoinformation` text NOT NULL,
  `emp_id` int(11) NOT NULL,
  PRIMARY KEY (`info_id`),
  KEY `emp_id` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sport`
--

INSERT INTO `sport` (`info_id`, `spoinformation`, `emp_id`) VALUES
('etspo', 'Uplod Information About Ethiopia Sport', 44);

-- --------------------------------------------------------

--
-- Table structure for table `technology`
--

CREATE TABLE IF NOT EXISTS `technology` (
  `info_id` varchar(30) NOT NULL,
  `tecinformation` text NOT NULL,
  `emp_id` int(11) NOT NULL,
  PRIMARY KEY (`info_id`),
  KEY `emp_id` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(100) NOT NULL,
  `role` varchar(255) NOT NULL,
  `status` varchar(30) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=68 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `password`, `role`, `status`) VALUES
(10, 'bek', '123', 'admin', ''),
(50, 'abr', 'abr', 'admin', 'blocked'),
(51, 'mu', 'mu', 'admin', 'blocked'),
(52, 'wlm', 'wlm', 'officer', 'unblocked'),
(57, 'as', '', 'admin', 'unblocked'),
(60, 'asn', 'c0b1c7977ce2f9890950ba9099afbf99', 'officer', 'unblocked'),
(61, 'jaa', '9996535e07258a7bbfd8b132435c5962', 'admin', 'unblocked'),
(62, 'balem', '8c9dc2bf64d8cb0086d4ace246263ea4', 'admin', 'unblocked'),
(63, 'tiz', 'b455ede106ac55608c6b121f80f24532', 'officer', 'unblocked'),
(64, 'c', '92eb5ffee6ae2fec3ad71c777531578f', 'admin', 'unblocked'),
(65, 'aa', '4124bc0a9335c27f086f24ba207a4912', 'officer', 'unblocked'),
(66, 'dve', '39f5f573fa1692bf558d4af3b6590ed7', 'officer', 'blocked'),
(67, 'ja', '202cb962ac59075b964b07152d234b70', 'admin', 'blocked');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `agriculture`
--
ALTER TABLE `agriculture`
  ADD CONSTRAINT `agriculture_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employees` (`emp_id`) ON DELETE CASCADE;

--
-- Constraints for table `culture`
--
ALTER TABLE `culture`
  ADD CONSTRAINT `culture_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employees` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `education`
--
ALTER TABLE `education`
  ADD CONSTRAINT `education_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employees` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `employees`
--
ALTER TABLE `employees`
  ADD CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `envaroment`
--
ALTER TABLE `envaroment`
  ADD CONSTRAINT `envaroment_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employees` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ethiohistory`
--
ALTER TABLE `ethiohistory`
  ADD CONSTRAINT `ethiohistory_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employees` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ethiopiajokes`
--
ALTER TABLE `ethiopiajokes`
  ADD CONSTRAINT `ethiopiajokes_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employees` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `famouspeople`
--
ALTER TABLE `famouspeople`
  ADD CONSTRAINT `famouspeople_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employees` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `heritage`
--
ALTER TABLE `heritage`
  ADD CONSTRAINT `heritage_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employees` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `lawgovt`
--
ALTER TABLE `lawgovt`
  ADD CONSTRAINT `lawgovt_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employees` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `musicalinformation`
--
ALTER TABLE `musicalinformation`
  ADD CONSTRAINT `musicalinformation_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employees` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sport`
--
ALTER TABLE `sport`
  ADD CONSTRAINT `sport_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employees` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `technology`
--
ALTER TABLE `technology`
  ADD CONSTRAINT `technology_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employees` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
