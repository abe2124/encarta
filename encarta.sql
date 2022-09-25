-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 02, 2018 at 07:35 AM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `hmm`
--

-- --------------------------------------------------------

--
-- Table structure for table `agriculture`
--

CREATE TABLE IF NOT EXISTS `agriculture` (
  `aglicultureid` varchar(15) NOT NULL,
  `agricultureinformation` text NOT NULL,
  PRIMARY KEY (`aglicultureid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `agriculture`
--

INSERT INTO `agriculture` (`aglicultureid`, `agricultureinformation`) VALUES
('hg', 'fddsfd');

-- --------------------------------------------------------

--
-- Table structure for table `culture`
--

CREATE TABLE IF NOT EXISTS `culture` (
  `cultureid` varchar(15) NOT NULL,
  `culturename` varchar(15) NOT NULL,
  `cultureinformation` text NOT NULL,
  `photos` blob NOT NULL,
  PRIMARY KEY (`cultureid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `culture`
--

INSERT INTO `culture` (`cultureid`, `culturename`, `cultureinformation`, `photos`) VALUES
('gjfgjkh', 'efbjkbig', 'gdfgugr', 0x6472617765722e706e67);

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
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=24 ;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`emp_id`, `first_name`, `last_name`, `address`, `phone`, `user_id`) VALUES
(23, 'yodit', 'teshome', 'bdr', 9333, 26);

-- --------------------------------------------------------

--
-- Table structure for table `ethiohistory`
--

CREATE TABLE IF NOT EXISTS `ethiohistory` (
  `historyid` varchar(15) NOT NULL,
  `Information` text NOT NULL,
  `photo` blob NOT NULL,
  PRIMARY KEY (`historyid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ethiohistory`
--

INSERT INTO `ethiohistory` (`historyid`, `Information`, `photo`) VALUES
('123', 'the ethiopia', 0x686f6d652e68746d6c),
('445', 'sreredr', 0x686d6d2831292e73716c),
('rwfghfsd', 'saad', 0x61646d696e5f706167652e706870);

-- --------------------------------------------------------

--
-- Table structure for table `famouspeople`
--

CREATE TABLE IF NOT EXISTS `famouspeople` (
  `Fumesid` varchar(15) NOT NULL,
  `Famesname` int(11) NOT NULL,
  `Famesinformation` int(11) NOT NULL,
  `famousphoto` blob NOT NULL,
  PRIMARY KEY (`Fumesid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `famouspeople`
--

INSERT INTO `famouspeople` (`Fumesid`, `Famesname`, `Famesinformation`, `famousphoto`) VALUES
('dfx', 0, 0, 0x696d616765735f6f66662e626d70);

-- --------------------------------------------------------

--
-- Table structure for table `govtlaws`
--

CREATE TABLE IF NOT EXISTS `govtlaws` (
  `govtlawid` varchar(15) NOT NULL,
  `govtlawidinformation` text NOT NULL,
  PRIMARY KEY (`govtlawid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `govtlaws`
--

INSERT INTO `govtlaws` (`govtlawid`, `govtlawidinformation`) VALUES
('989iuk', 'kukiu');

-- --------------------------------------------------------

--
-- Table structure for table `parents`
--

CREATE TABLE IF NOT EXISTS `parents` (
  `parent_id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_photo` blob NOT NULL,
  `parent_fullname` varchar(255) NOT NULL,
  `occupation` varchar(255) NOT NULL,
  `work_address` varchar(255) NOT NULL,
  `parent_address` varchar(255) NOT NULL,
  `parent_kebele` varchar(255) NOT NULL,
  `parent_houseno` varchar(255) NOT NULL,
  `phoneno` int(15) NOT NULL,
  `work_id` varchar(255) NOT NULL,
  `kebele_id` varchar(255) NOT NULL,
  PRIMARY KEY (`parent_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `parents`
--

INSERT INTO `parents` (`parent_id`, `parent_photo`, `parent_fullname`, `occupation`, `work_address`, `parent_address`, `parent_kebele`, `parent_houseno`, `phoneno`, `work_id`, `kebele_id`) VALUES
(5, 0x313236323635383733313031322e6a7067, 'Belachew', 'Teacher', 'db', 'db', '07', '443', 911121316, '113', '456'),
(6, 0x323031323039353731302e4a5047, 'getenet', 'manager', 'molale', 'baht', '23', '23', 908798767, '4567', '349'),
(7, 0x64736330303634352e6a7067, 'graw', 'teacher', 'dbu', 'dddd', '34', '343', 454656, 'sfs', '545'),
(8, 0x323031323039353731312e4a5047, 'graw', 'teacher', 'dbu', 'dddd', '07', '343', 454656, 'sfs', '545'),
(9, 0x64736330303634352e6a7067, 'graw', 'teacher', 'dbu', 'db', '34', '12', 0, '464', '456'),
(10, 0x64736330303634352e6a7067, 'graw', 'teacher', 'dbu', 'db', '34', '12', 0, '464', '456');

-- --------------------------------------------------------

--
-- Table structure for table `populartalks`
--

CREATE TABLE IF NOT EXISTS `populartalks` (
  `talkid` varchar(15) NOT NULL,
  `Information` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `populartalks`
--

INSERT INTO `populartalks` (`talkid`, `Information`) VALUES
('gfdhs', 'fdhgd');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE IF NOT EXISTS `students` (
  `stud_id` int(11) NOT NULL AUTO_INCREMENT,
  `stud_photo` blob NOT NULL,
  `fullname` varchar(255) NOT NULL,
  `grade` varchar(255) NOT NULL,
  `age` int(2) NOT NULL,
  `sex` char(1) NOT NULL,
  `address` varchar(255) NOT NULL,
  `kebele` varchar(255) NOT NULL,
  `houseno` varchar(255) NOT NULL,
  `phone` int(15) NOT NULL,
  `prev_school` varchar(255) NOT NULL,
  `matric_result` varchar(255) NOT NULL,
  `choice` varchar(255) NOT NULL,
  `comment` varchar(255) NOT NULL,
  `officer` varchar(255) NOT NULL,
  `parent_id` int(11) NOT NULL,
  PRIMARY KEY (`stud_id`),
  KEY `parent_id` (`parent_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=19 ;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`stud_id`, `stud_photo`, `fullname`, `grade`, `age`, `sex`, `address`, `kebele`, `houseno`, `phone`, `prev_school`, `matric_result`, `choice`, `comment`, `officer`, `parent_id`) VALUES
(13, 0x313236323635383638333730352e6a7067, 'Gorfu Alemu', 'Grade 11', 20, 'M', 'Dc', '50', '443', 911151214, 'Basso', '3.98', 'Natural Science', ' Very intelligent student', 'User123', 5),
(14, 0x7265672e6a7067, 'belte', 'Grade11', 23, 'M', 'add', '08', '567', 932232548, 'basso', '4.0', 'Natural Science', ' hgkcfewkugfcyuylkgrfciylg', 'tlahun', 6),
(15, 0x323031323039353731302e4a5047, 'goraw', 'Grade 11', 32, 'M', 'dbu', '7', '232', 9000, 'wew', '34', 'Natural Science', ' dfrsefs', 'gorfu', 7),
(16, 0x64736330303634352e6a7067, 'Bereket', 'Grade 11', 9, 'M', 'sdf', '5', '43', 3435345, 'rter', '34', 'Natural Science', 'sdasfs', 'ssdfsd', 8),
(17, 0x323031323039353635372e4a5047, 'dsgs', 'Grade 11', 9, 'M', 'dsa', '10', '34', 898787, 'dg', '5', 'Natural Science', ' ryter', 'tefera', 9),
(18, 0x323031323039353635372e4a5047, 'dsgs', 'Grade 11', 9, 'M', 'dsa', '10', '34', 898787, 'dg', '5', 'Natural Science', ' ryter', 'tefera', 10);

-- --------------------------------------------------------

--
-- Table structure for table `students_document`
--

CREATE TABLE IF NOT EXISTS `students_document` (
  `doc_id` int(11) NOT NULL AUTO_INCREMENT,
  `stud_id` int(11) NOT NULL,
  `student_document1` blob NOT NULL,
  `student_document2` blob NOT NULL,
  `student_document3` blob NOT NULL,
  `student_document4` blob NOT NULL,
  `student_document5` blob NOT NULL,
  PRIMARY KEY (`doc_id`),
  KEY `stud_id` (`stud_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Dumping data for table `students_document`
--

INSERT INTO `students_document` (`doc_id`, `stud_id`, `student_document1`, `student_document2`, `student_document3`, `student_document4`, `student_document5`) VALUES
(8, 13, 0x313236323635383733313031322e6a7067, '', '', '', ''),
(9, 14, 0x64736330303634352e6a7067, 0x323031323039353636322e4a5047, 0x64736330303634352e6a7067, 0x656475636174696f6e2e6a7067, 0x323031323039353635372e4a5047),
(10, 15, 0x64736330303634352e6a7067, '', '', '', ''),
(11, 16, '', '', '', '', ''),
(12, 17, 0x323031323039353731302e4a5047, 0x64736330303634352e6a7067, 0x66726f6e74676174652e6a7067, 0x696d616d6d6f2e6a7067, 0x323031323039353731302e4a5047),
(13, 18, 0x323031323039353731302e4a5047, 0x64736330303634352e6a7067, 0x66726f6e74676174652e6a7067, 0x696d616d6d6f2e6a7067, 0x323031323039353731302e4a5047);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=27 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `password`, `role`) VALUES
(26, 'yoditt', '123', 'officer');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `employees`
--
ALTER TABLE `employees`
  ADD CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `students`
--
ALTER TABLE `students`
  ADD CONSTRAINT `students_ibfk_1` FOREIGN KEY (`parent_id`) REFERENCES `parents` (`parent_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `students_document`
--
ALTER TABLE `students_document`
  ADD CONSTRAINT `students_document_ibfk_1` FOREIGN KEY (`stud_id`) REFERENCES `students` (`stud_id`) ON DELETE CASCADE ON UPDATE CASCADE;
