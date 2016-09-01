-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: mobile_schema
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
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-09-02  0:33:02
