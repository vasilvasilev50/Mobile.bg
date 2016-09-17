CREATE DATABASE  IF NOT EXISTS `mobile_schema2` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `mobile_schema2`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: mobile_schema2
-- ------------------------------------------------------
-- Server version	5.7.14-log

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
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account` (
  `username` varchar(14) NOT NULL,
  `email` varchar(40) NOT NULL,
  `phone_number` varchar(10) NOT NULL,
  `password` varchar(15) NOT NULL,
  `access` char(1) NOT NULL DEFAULT 'U',
  PRIMARY KEY (`username`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `phone_number_UNIQUE` (`phone_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES ('admin','stoyanov.zdr@gmail.com','0877372716','1234563','1');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `adverts`
--

DROP TABLE IF EXISTS `adverts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adverts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(14) NOT NULL,
  `price` int(11) NOT NULL DEFAULT '0',
  `first_registration` year(4) NOT NULL,
  `engine_type` varchar(10) DEFAULT NULL,
  `mileage` int(11) DEFAULT NULL,
  `hp` int(11) DEFAULT NULL,
  `region` varchar(20) DEFAULT NULL,
  `is_new_imported` tinyint(1) DEFAULT NULL,
  `has_gas_system` tinyint(1) DEFAULT NULL,
  `is_4x4` tinyint(1) DEFAULT NULL,
  `is_metalic` tinyint(1) DEFAULT NULL,
  `has_alloy_wheels` tinyint(1) DEFAULT NULL,
  `is_with_right_steering` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `registered_user_UNIQUE` (`id`),
  KEY `fk_acount_idx` (`username`),
  CONSTRAINT `fk_acount` FOREIGN KEY (`username`) REFERENCES `account` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1000000002 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adverts`
--

LOCK TABLES `adverts` WRITE;
/*!40000 ALTER TABLE `adverts` DISABLE KEYS */;
INSERT INTO `adverts` VALUES (1000000000,'admin',5000,2003,'2',206184,131,'София',1,0,0,1,1,0),(1000000001,'admin',10000,2006,'1',285749,170,'Пловдив',0,1,0,1,1,0);
/*!40000 ALTER TABLE `adverts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `brands`
--

DROP TABLE IF EXISTS `brands`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `brands` (
  `id` int(11) NOT NULL,
  `brand_name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `brands`
--

LOCK TABLES `brands` WRITE;
/*!40000 ALTER TABLE `brands` DISABLE KEYS */;
INSERT INTO `brands` VALUES (1,'Audi'),(2,'BMW'),(3,'Citroen'),(4,'Ford'),(5,'Mazda'),(6,'Mercedes'),(7,'Opel'),(8,'DAF'),(9,'Iveco'),(10,'Kamaz'),(11,'Man'),(12,'Mercedes'),(13,'Scania'),(14,'Volvo'),(15,'Ducati'),(16,'Harley-Davidson'),(17,'Honda'),(18,'Kawasaki'),(19,'Suzuki'),(20,'Yamaha');
/*!40000 ALTER TABLE `brands` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car adverts`
--

DROP TABLE IF EXISTS `car adverts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car adverts` (
  `Adverts_id` int(11) NOT NULL,
  `model_id` int(11) NOT NULL,
  `photo_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`Adverts_id`),
  KEY `fk_CarModel_idx` (`model_id`),
  KEY `fk_photo_id_idx` (`photo_id`),
  CONSTRAINT `fk_Car Adverts_Adverts1` FOREIGN KEY (`Adverts_id`) REFERENCES `adverts` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_photo_id` FOREIGN KEY (`photo_id`) REFERENCES `photos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car adverts`
--

LOCK TABLES `car adverts` WRITE;
/*!40000 ALTER TABLE `car adverts` DISABLE KEYS */;
INSERT INTO `car adverts` VALUES (1000000000,1,NULL),(1000000001,7,NULL);
/*!40000 ALTER TABLE `car adverts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car brand`
--

DROP TABLE IF EXISTS `car brand`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car brand` (
  `Brand_id` int(11) NOT NULL,
  `Car_advert_id` int(11) NOT NULL,
  PRIMARY KEY (`Brand_id`),
  UNIQUE KEY `Car Adverts_Adverts_id_UNIQUE` (`Car_advert_id`),
  CONSTRAINT `car_adverts` FOREIGN KEY (`Car_advert_id`) REFERENCES `car adverts` (`Adverts_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Car brand_Brands1` FOREIGN KEY (`Brand_id`) REFERENCES `brands` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car brand`
--

LOCK TABLES `car brand` WRITE;
/*!40000 ALTER TABLE `car brand` DISABLE KEYS */;
INSERT INTO `car brand` VALUES (1,1000000000),(2,1000000001);
/*!40000 ALTER TABLE `car brand` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `models`
--

DROP TABLE IF EXISTS `models`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `models` (
  `id` int(11) NOT NULL,
  `brand_id` int(11) NOT NULL,
  `model_name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `Brand` (`brand_id`),
  CONSTRAINT `Brand` FOREIGN KEY (`brand_id`) REFERENCES `brands` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `models`
--

LOCK TABLES `models` WRITE;
/*!40000 ALTER TABLE `models` DISABLE KEYS */;
INSERT INTO `models` VALUES (1,1,'80'),(2,1,'A3'),(3,1,'A4'),(4,1,'A6'),(5,1,'A8'),(6,2,'1er - series'),(7,2,'3er - series'),(8,2,'5er - series'),(9,2,'6er - series'),(10,2,'7er - series'),(11,3,'C1'),(12,3,'C2'),(13,3,'C3'),(14,3,'C4'),(15,3,'C5'),(16,4,'Capri'),(17,4,'Escort'),(18,4,'Fiesta'),(19,4,'Focus'),(20,4,'Mondeo'),(21,5,'121'),(22,5,'323'),(23,5,'626'),(24,5,'Mx-3'),(25,5,'Rx-8'),(26,6,'A-class'),(27,6,'B-class'),(28,6,'C-class'),(29,6,'E-class'),(30,6,'S-class'),(31,7,'Astra'),(32,7,'Corsa'),(33,7,'Insignia'),(34,7,'Meriva'),(35,7,'Vectra'),(36,8,'CF'),(37,8,'Fa'),(38,8,'Ginaf'),(39,8,'Lf'),(40,8,'Xf'),(41,9,'Cargo'),(42,9,'Daily'),(43,9,'Eurotech'),(44,9,'Magerus'),(45,9,'Trakker'),(46,10,'5210'),(47,10,'53221'),(48,10,'54112'),(49,10,'55111'),(50,10,'6520'),(51,11,'Henger'),(52,11,'Koffer'),(53,11,'Sr'),(54,11,'Tga'),(55,11,'Tgm'),(56,12,'814'),(57,12,'1117'),(58,12,'Actros'),(59,12,'Atego'),(60,12,'Unimok'),(61,13,'Kuter'),(62,13,'R620'),(63,13,'T112'),(64,13,'Tir'),(65,13,'Topline'),(66,14,'F12'),(67,14,'Fh'),(68,14,'Fl'),(69,14,'Fm'),(70,14,'Fs'),(71,15,'GT 1000'),(72,15,'Hypermotard'),(73,15,'Monster'),(74,15,'Multistrada'),(75,15,'Streetfighter'),(76,16,'Bad Boy'),(77,16,'Dyna'),(78,16,'Sportster'),(79,16,'Trike'),(80,16,'V-Rod'),(81,17,'Aviator'),(82,17,'Camino'),(83,17,'Cbr'),(84,17,'Gorilla'),(85,17,'Shadow'),(86,18,'Brute Force'),(87,18,'Coyote'),(88,18,'Eliminator'),(89,18,'Ninja'),(90,18,'Versys'),(91,19,'Bandit'),(92,19,'Gladius'),(93,19,'Impulse'),(94,19,'Katana'),(95,19,'Shogun'),(96,20,'GTS'),(97,20,'Gladiator'),(98,20,'Majesty'),(99,20,'Warrior'),(100,20,'Zuma');
/*!40000 ALTER TABLE `models` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `motorcycle adverts`
--

DROP TABLE IF EXISTS `motorcycle adverts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `motorcycle adverts` (
  `Adverts_id` int(11) NOT NULL,
  PRIMARY KEY (`Adverts_id`),
  KEY `fk_Motorcycle Adverts_Adverts1_idx` (`Adverts_id`),
  CONSTRAINT `fk_Motorcycle Adverts_Adverts1` FOREIGN KEY (`Adverts_id`) REFERENCES `adverts` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `motorcycle adverts`
--

LOCK TABLES `motorcycle adverts` WRITE;
/*!40000 ALTER TABLE `motorcycle adverts` DISABLE KEYS */;
/*!40000 ALTER TABLE `motorcycle adverts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `motorcycle brand`
--

DROP TABLE IF EXISTS `motorcycle brand`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `motorcycle brand` (
  `Brands_id` int(11) NOT NULL,
  `Motorcycle_adverts_id` int(11) NOT NULL,
  PRIMARY KEY (`Brands_id`),
  UNIQUE KEY `Motorcycle_adverts_id_UNIQUE` (`Motorcycle_adverts_id`),
  KEY `fk_Motorcycle brand_Brands1_idx` (`Brands_id`),
  CONSTRAINT `Motorcycle_adverts` FOREIGN KEY (`Motorcycle_adverts_id`) REFERENCES `motorcycle adverts` (`Adverts_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Motorcycle brand_Brands1` FOREIGN KEY (`Brands_id`) REFERENCES `brands` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `motorcycle brand`
--

LOCK TABLES `motorcycle brand` WRITE;
/*!40000 ALTER TABLE `motorcycle brand` DISABLE KEYS */;
/*!40000 ALTER TABLE `motorcycle brand` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `photos`
--

DROP TABLE IF EXISTS `photos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `photos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Advert` int(11) NOT NULL,
  `photo_url` varchar(300) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idPhotos_UNIQUE` (`id`),
  UNIQUE KEY `photo_url_UNIQUE` (`photo_url`),
  KEY `fk_adverts_idx` (`Advert`),
  CONSTRAINT `fk_adverts` FOREIGN KEY (`Advert`) REFERENCES `adverts` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `photos`
--

LOCK TABLES `photos` WRITE;
/*!40000 ALTER TABLE `photos` DISABLE KEYS */;
INSERT INTO `photos` VALUES (1,1000000000,'http://starmoz.com/images/audi-a3-2003-21.jpg'),(2,1000000001,'https://upload.wikimedia.org/wikipedia/commons/9/99/BMW_3er_(E90)_Facelift_20090720_front.JPG');
/*!40000 ALTER TABLE `photos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `truck adverts`
--

DROP TABLE IF EXISTS `truck adverts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `truck adverts` (
  `Adverts_id` int(11) NOT NULL,
  PRIMARY KEY (`Adverts_id`),
  KEY `fk_Truck Adverts_Adverts1_idx` (`Adverts_id`),
  CONSTRAINT `fk_Truck Adverts_Adverts1` FOREIGN KEY (`Adverts_id`) REFERENCES `adverts` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `truck adverts`
--

LOCK TABLES `truck adverts` WRITE;
/*!40000 ALTER TABLE `truck adverts` DISABLE KEYS */;
/*!40000 ALTER TABLE `truck adverts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `truck brand`
--

DROP TABLE IF EXISTS `truck brand`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `truck brand` (
  `Brands_id` int(11) NOT NULL,
  `Truck_adverts_id` int(11) NOT NULL,
  PRIMARY KEY (`Brands_id`),
  UNIQUE KEY `Truck_adverts_id_UNIQUE` (`Truck_adverts_id`),
  KEY `fk_Truck brand_Brands1_idx` (`Brands_id`),
  CONSTRAINT `fk_Truck brand_Brands1` FOREIGN KEY (`Brands_id`) REFERENCES `brands` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `truck_adverts` FOREIGN KEY (`Truck_adverts_id`) REFERENCES `truck adverts` (`Adverts_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `truck brand`
--

LOCK TABLES `truck brand` WRITE;
/*!40000 ALTER TABLE `truck brand` DISABLE KEYS */;
/*!40000 ALTER TABLE `truck brand` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-09-17 16:22:27
