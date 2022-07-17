-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: sofkaspaceship
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `maneed`
--

DROP TABLE IF EXISTS `maneed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `maneed` (
  `idmaneed` int NOT NULL AUTO_INCREMENT,
  `spaceshipname` varchar(45) DEFAULT NULL,
  `weight` int DEFAULT NULL,
  `author` varchar(180) DEFAULT NULL,
  `gas` varchar(100) DEFAULT NULL,
  `velocityofdisplacement` double DEFAULT NULL,
  `pushingforce` double DEFAULT NULL,
  `orbitaldisplacementspeed` double DEFAULT NULL,
  `missionobjetive` varchar(180) DEFAULT NULL,
  `humancapacity` int DEFAULT NULL,
  `date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`idmaneed`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maneed`
--

LOCK TABLES `maneed` WRITE;
/*!40000 ALTER TABLE `maneed` DISABLE KEYS */;
INSERT INTO `maneed` VALUES (14,'Skylab',7700,'Usa','hidracina',300,200,50,'Mision Lunar',5,'2022-07-17 11:59:42'),(15,'Salyut',19800,'Rusia','hidracina',300,60,248.9,'Mision lunar',6,'2022-07-17 12:00:48'),(16,'Estacion Espacial Internacional',4200000,'NASA','Undefined',0,0,386,'Exploracion espacial',7,'2022-07-17 12:02:11');
/*!40000 ALTER TABLE `maneed` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nottripulated`
--

DROP TABLE IF EXISTS `nottripulated`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nottripulated` (
  `idnottripulated` int NOT NULL AUTO_INCREMENT,
  `spacheshipname` varchar(100) DEFAULT NULL,
  `weight` int DEFAULT NULL,
  `author` varchar(85) DEFAULT NULL,
  `gas` varchar(60) DEFAULT NULL,
  `velocityofdisplacement` double DEFAULT NULL,
  `pushingforce` double DEFAULT NULL,
  `orbitaldisplacementspeed` double DEFAULT NULL,
  `geostationed` varchar(80) DEFAULT NULL,
  `objectofstudy` varchar(45) DEFAULT NULL,
  `date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`idnottripulated`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nottripulated`
--

LOCK TABLES `nottripulated` WRITE;
/*!40000 ALTER TABLE `nottripulated` DISABLE KEYS */;
INSERT INTO `nottripulated` VALUES (4,'Mercurio',1093,'Mariner x','orbita',0,65.79,40,'yes','enviar imagenes de planetas','2022-07-17 12:05:59'),(5,'Pluton',0,'Usa','Orbita',15,0.44,0.08,'no','viaje infinito','2022-07-17 12:07:21'),(6,'sol',0,'Helios','undefined',70.4,0,0,'yes','estudiar el sol','2022-07-17 12:08:17');
/*!40000 ALTER TABLE `nottripulated` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shuttle`
--

DROP TABLE IF EXISTS `shuttle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shuttle` (
  `idshuttle` int NOT NULL AUTO_INCREMENT,
  `spaceshipname` varchar(45) DEFAULT NULL,
  `weight` int DEFAULT NULL,
  `author` varchar(45) DEFAULT NULL,
  `gas` varchar(45) DEFAULT NULL,
  `velocityofdisplacement` double DEFAULT NULL,
  `pushingforce` double DEFAULT NULL,
  `orbitaldisplacementspeed` double DEFAULT NULL,
  `takeofftype` varchar(80) DEFAULT NULL,
  `transportcapacity` int DEFAULT NULL,
  `date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`idshuttle`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shuttle`
--

LOCK TABLES `shuttle` WRITE;
/*!40000 ALTER TABLE `shuttle` DISABLE KEYS */;
INSERT INTO `shuttle` VALUES (2,'Saturno',350000,'Usa','combustible quimico',0,0,0,'undefined',1180000,'2022-07-17 12:09:54'),(3,'saturno v',2400,'','petroleo refinado',60,3060,0,'0',100,'2022-07-17 12:11:10'),(4,'Delta lv',300,'NASA','Combustible quimico',300,50,0,'autopropulsado',200,'2022-07-17 12:12:58');
/*!40000 ALTER TABLE `shuttle` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-17  7:36:51
