-- MySQL dump 10.15  Distrib 10.0.17-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: proyect
-- ------------------------------------------------------
-- Server version	10.0.17-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `proyect`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `proyect` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `proyect`;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `idCategory` int(11) NOT NULL AUTO_INCREMENT,
  `nameCategory` varchar(45) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idCategory`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `idCustomer` int(11) NOT NULL AUTO_INCREMENT,
  `nameCustomer` varchar(30) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `cell_phone` varchar(9) DEFAULT NULL,
  `phone` varchar(7) DEFAULT NULL,
  `birthdate` date NOT NULL,
  `email` varchar(60) DEFAULT NULL,
  `sex` varchar(1) NOT NULL,
  PRIMARY KEY (`idCustomer`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detailsale`
--

DROP TABLE IF EXISTS `detailsale`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detailsale` (
  `idDetailSale` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `price` decimal(10,0) NOT NULL,
  `Sale_idSale` int(11) NOT NULL,
  `Product_idProduct` int(11) NOT NULL,
  KEY `Sale_idSale` (`Sale_idSale`),
  KEY `Product_idProduct` (`Product_idProduct`),
  CONSTRAINT `detailsale_ibfk_1` FOREIGN KEY (`Sale_idSale`) REFERENCES `sale` (`idSale`),
  CONSTRAINT `detailsale_ibfk_2` FOREIGN KEY (`Product_idProduct`) REFERENCES `product` (`idProduct`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detailsale`
--

LOCK TABLES `detailsale` WRITE;
/*!40000 ALTER TABLE `detailsale` DISABLE KEYS */;
/*!40000 ALTER TABLE `detailsale` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `idEmployee` int(11) NOT NULL AUTO_INCREMENT,
  `nameEmployee` varchar(30) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `cell_phone` varchar(9) DEFAULT NULL,
  `phone` varchar(7) DEFAULT NULL,
  `birthdate` date NOT NULL,
  `email` varchar(60) DEFAULT NULL,
  `sex` varchar(1) NOT NULL,
  `Position_idPosition` int(11) NOT NULL,
  PRIMARY KEY (`idEmployee`),
  KEY `Position_idPosition` (`Position_idPosition`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`Position_idPosition`) REFERENCES `position` (`idPosition`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (3,'master','developer','12345678',NULL,NULL,'2016-03-09',NULL,'m',1);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `position`
--

DROP TABLE IF EXISTS `position`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `position` (
  `idPosition` int(11) NOT NULL AUTO_INCREMENT,
  `namePosition` varchar(15) DEFAULT NULL,
  `description` varchar(150) DEFAULT NULL,
  `salary` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`idPosition`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `position`
--

LOCK TABLES `position` WRITE;
/*!40000 ALTER TABLE `position` DISABLE KEYS */;
INSERT INTO `position` VALUES (1,'Administrador','Tiene acceso a todo el sistema',NULL);
/*!40000 ALTER TABLE `position` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `idProduct` int(11) NOT NULL AUTO_INCREMENT,
  `nameProduct` varchar(45) NOT NULL,
  `price` decimal(10,0) NOT NULL,
  `quantity` int(11) NOT NULL,
  `Category_idCategory` int(11) NOT NULL,
  `Provider_idProvider` int(11) NOT NULL,
  PRIMARY KEY (`idProduct`),
  KEY `Category_idCategory` (`Category_idCategory`),
  KEY `Provider_idProvider` (`Provider_idProvider`),
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`Category_idCategory`) REFERENCES `category` (`idCategory`),
  CONSTRAINT `product_ibfk_2` FOREIGN KEY (`Provider_idProvider`) REFERENCES `provider` (`idProvider`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `provider`
--

DROP TABLE IF EXISTS `provider`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `provider` (
  `idProvider` int(11) NOT NULL AUTO_INCREMENT,
  `nameProvider` varchar(45) NOT NULL,
  `addres` varchar(45) DEFAULT NULL,
  `cell_phone` varchar(9) DEFAULT NULL,
  `phone` varchar(7) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idProvider`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `provider`
--

LOCK TABLES `provider` WRITE;
/*!40000 ALTER TABLE `provider` DISABLE KEYS */;
/*!40000 ALTER TABLE `provider` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sale`
--

DROP TABLE IF EXISTS `sale`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sale` (
  `idSale` int(11) NOT NULL AUTO_INCREMENT,
  `payment` decimal(10,0) NOT NULL,
  `date_buy` date DEFAULT NULL,
  `Customer_idCustomer` int(11) NOT NULL,
  `Employee_idEmployee` int(11) NOT NULL,
  PRIMARY KEY (`idSale`),
  KEY `Customer_idCustomer` (`Customer_idCustomer`),
  KEY `Employee_idEmployee` (`Employee_idEmployee`),
  CONSTRAINT `sale_ibfk_1` FOREIGN KEY (`Customer_idCustomer`) REFERENCES `customer` (`idCustomer`),
  CONSTRAINT `sale_ibfk_2` FOREIGN KEY (`Employee_idEmployee`) REFERENCES `employee` (`idEmployee`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sale`
--

LOCK TABLES `sale` WRITE;
/*!40000 ALTER TABLE `sale` DISABLE KEYS */;
/*!40000 ALTER TABLE `sale` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `user` varchar(8) NOT NULL,
  `pass` varchar(32) NOT NULL,
  `Employee_idEmployee` int(11) NOT NULL,
  PRIMARY KEY (`idUser`),
  KEY `Employee_idEmployee` (`Employee_idEmployee`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`Employee_idEmployee`) REFERENCES `employee` (`idEmployee`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (3,'master','21232f297a57a5a743894a0e4a801fc3',3);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-03-09 17:01:15
