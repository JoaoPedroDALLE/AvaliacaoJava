-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 25, 2021 at 09:57 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bdpoo`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbagenda`
--

DROP TABLE IF EXISTS `tbagenda`;
CREATE TABLE IF NOT EXISTS `tbagenda` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(80) NOT NULL,
  `email` varchar(200) NOT NULL,
  `senha` varchar(80) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `recado` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbagenda`
--

INSERT INTO `tbagenda` (`id`, `nome`, `email`, `senha`, `telefone`, `recado`) VALUES
(1, 'Diogo', 'diogo@gmail.com', '1', '4002-8922', 'Seu zeeeeeeeeeeeee'),
(2, 'Jorge', 'jorge@hotmail.com', '42767516990368493138776584305024125808', '77777=77777', 'Comprar butijao');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
