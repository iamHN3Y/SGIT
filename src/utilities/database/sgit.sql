-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: sgit
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `control_log`
--

DROP TABLE IF EXISTS `control_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `control_log` (
  `id_usuario` int NOT NULL,
  `actividad` varchar(255) DEFAULT NULL,
  `fecha` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `control_log_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`cuenta`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `control_log`
--

LOCK TABLES `control_log` WRITE;
/*!40000 ALTER TABLE `control_log` DISABLE KEYS */;
INSERT INTO `control_log` VALUES (1644600728,'Creó un proveedor','2023-12-07 00:08:23'),(1644600728,'Creó un proveedor','2023-12-07 00:08:54'),(1644600728,'Creo un producto','2023-12-07 00:15:02'),(1644600728,'Creo un producto','2023-12-07 01:41:12'),(1644600728,'Creo un producto','2023-12-07 01:42:34'),(1644600728,'Creo un producto','2023-12-07 01:43:17'),(1644600728,'Creo un producto','2023-12-07 01:43:52'),(1644600728,'Creo un producto','2023-12-07 01:44:20'),(1644600728,'Creo un producto','2023-12-07 01:46:53'),(1644600728,'Actualizo un producto','2023-12-07 01:48:03'),(1644600728,'Creó un proveedor','2023-12-07 01:48:38'),(1644600728,'Creo un producto','2023-12-07 01:52:31'),(1644600728,'Creo un producto','2023-12-07 01:55:01'),(1644600728,'Eliminó un usuario','2023-12-07 02:13:15'),(1644600728,'Eliminó un usuario','2023-12-07 02:13:20'),(1644600728,'Actualizó un usuario','2023-12-07 02:13:32'),(1644600728,'Creo un usuario','2023-12-07 02:16:21'),(1644600728,'Creó una transacción','2023-12-07 03:20:20'),(1644600728,'Creó una transacción','2023-12-07 03:33:48'),(1644600728,'Creó una transacción','2023-12-07 03:37:36'),(1644600728,'Creó una transacción','2023-12-07 03:37:36'),(1644600728,'Creó una transacción','2023-12-07 03:37:36'),(1644600728,'Creó una transacción','2023-12-07 03:39:31'),(1644600728,'Creó un proveedor','2023-12-07 03:40:58'),(1644600728,'Hizo una venta','2023-12-07 03:41:45'),(1644600728,'Hizo una venta','2023-12-07 03:41:46'),(1644600728,'Hizo una venta','2023-12-07 03:41:46'),(1644600728,'Hizo una venta','2023-12-07 03:41:46'),(1644600728,'Hizo una venta','2023-12-07 03:41:46'),(1644600728,'Actualizo un producto','2023-12-07 03:56:19'),(1644600728,'Actualizo un producto','2023-12-07 04:04:31'),(1644600728,'Actualizo un producto','2023-12-07 04:04:42'),(1644600728,'Actualizo un producto','2023-12-07 04:04:52'),(1644600728,'Actualizo un producto','2023-12-07 04:05:45'),(1644600728,'Actualizo un producto','2023-12-07 04:07:02'),(1644600728,'Hizo una venta','2023-12-07 04:16:45'),(1644600728,'Hizo una venta','2023-12-07 04:17:48'),(1644600728,'Hizo una venta','2023-12-07 04:17:48'),(1644600728,'Hizo una venta','2023-12-07 04:17:48'),(1644600728,'Hizo una venta','2023-12-07 04:17:48'),(1644600728,'Hizo una venta','2023-12-07 04:17:48'),(1644600728,'Hizo una venta','2023-12-07 04:18:38'),(1644600728,'Hizo una venta','2023-12-07 04:18:38'),(1644600728,'Hizo una venta','2023-12-07 04:18:38'),(1644600728,'Hizo una venta','2023-12-07 04:18:38'),(1644600728,'Actualizo un producto','2023-12-07 04:19:53'),(1644600728,'Actualizo un producto','2023-12-07 04:20:51'),(1644600728,'Actualizo un producto','2023-12-07 04:20:59'),(1644600728,'Actualizo un producto','2023-12-07 04:21:08'),(1644600728,'Hizo una venta','2023-12-07 04:21:26'),(1644600728,'Hizo una venta','2023-12-07 04:21:26'),(1644600728,'Actualizo un producto','2023-12-07 04:22:35'),(1644600728,'Hizo una venta','2023-12-07 04:22:52'),(1644600728,'Hizo una venta','2023-12-07 04:22:52'),(1644600728,'Hizo una venta','2023-12-07 04:22:52'),(1644600728,'Creo un producto','2023-12-07 16:20:06'),(1644600728,'Creó una transacción','2023-12-07 16:21:30'),(1644600728,'Creó una transacción','2023-12-07 16:21:30'),(1644600728,'Hizo una venta','2023-12-07 16:58:37'),(1644600728,'Hizo una venta','2023-12-07 16:58:37'),(1644600728,'Hizo una venta','2023-12-07 16:58:37'),(1644600728,'Hizo una venta','2023-12-07 19:58:55'),(1644600728,'Hizo una venta','2023-12-07 19:58:55'),(1644600728,'Hizo una venta','2023-12-07 19:58:55'),(1644600728,'Hizo una venta','2023-12-07 20:26:48'),(1644600728,'Hizo una venta','2023-12-07 20:26:48'),(1644600728,'Hizo una venta','2023-12-07 20:26:48'),(1644600728,'Hizo una venta','2023-12-07 20:26:48'),(1644600728,'Hizo una venta','2023-12-07 20:26:48'),(1644600728,'Hizo una venta','2023-12-07 20:30:36'),(1644600728,'Hizo una venta','2023-12-07 20:30:36'),(1644600728,'Hizo una venta','2023-12-07 20:30:36'),(1644600728,'Hizo una venta','2023-12-07 20:30:37'),(1644600728,'Hizo una venta','2023-12-07 20:35:55'),(1644600728,'Hizo una venta','2023-12-07 20:35:55'),(1644600728,'Hizo una venta','2023-12-07 20:35:55'),(1644600728,'Hizo una venta','2023-12-07 20:35:55'),(1644600728,'Hizo una venta','2023-12-07 20:35:56'),(1644600728,'Hizo una venta','2023-12-07 20:44:05'),(1644600728,'Hizo una venta','2023-12-07 20:44:05'),(1644600728,'Hizo una venta','2023-12-07 20:44:05'),(1644600728,'Hizo una venta','2023-12-07 20:44:05'),(1644600728,'Hizo una venta','2023-12-07 20:44:05'),(1644600728,'Hizo una venta','2023-12-07 20:47:11'),(1644600728,'Hizo una venta','2023-12-07 20:47:11'),(1644600728,'Hizo una venta','2023-12-07 20:47:11'),(1644600728,'Hizo una venta','2023-12-07 20:51:56'),(1644600728,'Hizo una venta','2023-12-07 20:51:57'),(1644600728,'Hizo una venta','2023-12-07 20:51:57'),(1644600728,'Hizo una venta','2023-12-07 20:51:57'),(1644600728,'Hizo una venta','2023-12-07 20:55:35'),(1644600728,'Hizo una venta','2023-12-07 20:55:35'),(1644600728,'Hizo una venta','2023-12-07 20:55:35'),(1644600728,'Hizo una venta','2023-12-07 20:55:35'),(1644600728,'Hizo una venta','2023-12-07 20:55:36'),(1644600728,'Hizo una venta','2023-12-07 20:55:36'),(1644600728,'Hizo una venta','2023-12-07 20:55:36'),(1644600728,'Actualizo un producto','2023-12-08 14:31:15'),(1644600728,'Elimino un producto','2023-12-08 14:31:27'),(1644600728,'Creó una transacción','2023-12-08 14:32:59'),(1644600728,'Creó una transacción','2023-12-08 14:32:59'),(1644600728,'Hizo una venta','2023-12-08 14:34:52'),(1644600728,'Hizo una venta','2023-12-08 14:34:52'),(1644600728,'Hizo una venta','2023-12-08 14:34:53'),(1644600728,'Hizo una venta','2023-12-08 14:34:53'),(1644600728,'Hizo una venta','2023-12-08 14:35:31'),(1644600728,'Hizo una venta','2023-12-08 14:35:31'),(1644600728,'Hizo una venta','2023-12-08 14:37:07'),(1644600728,'Hizo una venta','2023-12-08 14:37:07'),(1644600728,'Hizo una venta','2023-12-08 14:37:07'),(1644600728,'Hizo una venta','2023-12-08 14:37:07'),(1644600728,'Hizo una venta','2023-12-08 14:37:07');
/*!40000 ALTER TABLE `control_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `fecha_creacion` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `borrado` tinyint(1) DEFAULT NULL,
  `fecha_modificacion` timestamp NULL DEFAULT NULL,
  `id_proveedor` int NOT NULL,
  `preciocom` float NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_proveedor` (`id_proveedor`),
  CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'Cheetos bolita','70gr',13,'2023-12-07 00:15:02',0,'2023-12-07 04:21:08',1,11),(2,'Papas Naturales','Papas 70gr',17,'2023-12-07 01:41:12',0,'2023-12-08 14:31:15',1,15),(3,'Papas Adobadas','papas 70gr',17,'2023-12-07 01:42:34',0,'2023-12-07 01:42:34',1,15),(4,'Rancheritos','70gr',13,'2023-12-07 01:43:17',0,'2023-12-07 01:43:17',1,11),(5,'Coca cola','600ml',17,'2023-12-07 01:43:52',0,'2023-12-07 01:43:52',2,16),(6,'delaware punch','600ml',15,'2023-12-07 01:44:20',0,'2023-12-07 04:20:51',2,13),(7,'sprite','600ml',16,'2023-12-07 01:46:53',0,'2023-12-07 04:20:59',2,14),(8,'Caribe cooler','325ml',22,'2023-12-07 01:52:31',0,'2023-12-07 04:04:51',3,18),(9,'Maruchan chile piquin','vaso',17,'2023-12-07 01:55:01',1,'2023-12-07 04:07:02',3,15),(10,'Mantecadas','8pz',22,'2023-12-07 16:20:06',0,'2023-12-07 16:20:06',4,19);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `borrado` tinyint(1) DEFAULT NULL,
  `fecha_creacion` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES (1,'Sabritas','1894894512','Av. Falsa #123',0,'2023-12-07 00:08:23','2023-12-07 00:08:23'),(2,'Coca Cola','8798486549','Av. Muy Falsa #S/N',0,'2023-12-07 00:08:54','2023-12-07 00:08:54'),(3,'Dizory','2845165818','alguna direccion de toluca',0,'2023-12-07 01:48:38','2023-12-07 01:48:38'),(4,'Bimbo','1998489451','alguna direccion',0,'2023-12-07 03:40:58','2023-12-07 03:40:58');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stock` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_producto` int NOT NULL,
  `cantidad` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_producto` (`id_producto`),
  CONSTRAINT `stock_ibfk_1` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` VALUES (1,1,10),(2,2,0),(3,3,6),(4,4,19),(5,5,23),(6,6,11),(7,7,6),(8,8,20),(9,9,0),(10,10,26);
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transacciones`
--

DROP TABLE IF EXISTS `transacciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transacciones` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_proveedor` int NOT NULL,
  `id_producto` int NOT NULL,
  `cantidad` int NOT NULL,
  `fecha` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `total` float DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_proveedor` (`id_proveedor`),
  KEY `id_producto` (`id_producto`),
  CONSTRAINT `transacciones_ibfk_1` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `transacciones_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transacciones`
--

LOCK TABLES `transacciones` WRITE;
/*!40000 ALTER TABLE `transacciones` DISABLE KEYS */;
INSERT INTO `transacciones` VALUES (1,1,2,7,'2023-12-07 03:20:20',105),(2,2,6,30,'2023-12-07 03:33:48',390),(3,2,7,20,'2023-12-07 03:37:36',280),(4,3,9,10,'2023-12-07 03:37:36',150),(5,1,4,20,'2023-12-07 03:37:36',220),(6,2,5,20,'2023-12-07 03:39:31',320),(7,4,10,20,'2023-12-07 16:21:30',380),(8,3,8,19,'2023-12-07 16:21:30',342),(9,2,6,5,'2023-12-08 14:32:59',65),(10,1,1,5,'2023-12-08 14:32:59',55);
/*!40000 ALTER TABLE `transacciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `nombre` varchar(50) NOT NULL,
  `cuenta` int NOT NULL,
  `contraseña` varchar(100) DEFAULT NULL,
  `tipo_admin` tinyint(1) DEFAULT NULL,
  `borrado` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`cuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES ('Jessica Mariela',269335899,'E1tZxdFdBXOiFJL2oST1/A==',0,1),('Raul Garcia',484251843,'KfrMil+8rXPe/OwHXKlkBg==',0,1),('Jovana Diaz',719537435,'CaHGtaak/yvS7Bb4U2z1cQ==',0,1),('Jovana Diaz Garduño',929771870,'/arl5h5gAdef8OEc5++1nA==',0,0),('Luis Manuel Rosales',1303894590,'/k9eStCbPi7QnhsnoLf9cw==',0,0),('Isaac Rosales',1644600728,'M20T0Dq+/uq8L7OsrG2A1w==',1,0),('Jaime Ortega',1893986628,'IdpNCImwmgr7h9V/jadxcw==',0,0),('temporalisimo',1898731615,'Db50aKcX9HOLjEvuoZeGww==',1,1),('prueba',1926305839,'x6GKrKvPxCG4kBcAptxgTQ==',0,1),('Karina',2085236608,'wmifNlyww0YuAzUuJoxeFA==',1,1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_producto` int NOT NULL,
  `cantidad` int DEFAULT NULL,
  `total` float DEFAULT NULL,
  `id_usuario` int NOT NULL,
  `fecha` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `borrado` tinyint(1) DEFAULT NULL,
  `fecha_modificacion` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_producto` (`id_producto`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ventas_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`cuenta`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` VALUES (1,4,1,13,1644600728,'2023-12-07 03:41:45',0,'2023-12-07 03:41:45'),(2,3,1,17,1644600728,'2023-12-07 03:41:45',0,'2023-12-07 03:41:45'),(3,2,1,17,1644600728,'2023-12-07 03:41:46',0,'2023-12-07 03:41:46'),(4,1,1,13,1644600728,'2023-12-07 03:41:46',0,'2023-12-07 03:41:46'),(5,9,1,17,1644600728,'2023-12-07 03:41:46',0,'2023-12-07 03:41:46'),(6,1,1,13,1644600728,'2023-12-07 04:16:45',0,'2023-12-07 04:16:45'),(7,6,1,15,1644600728,'2023-12-07 04:17:48',0,'2023-12-07 04:17:48'),(8,6,1,15,1644600728,'2023-12-07 04:17:48',0,'2023-12-07 04:17:48'),(9,6,1,15,1644600728,'2023-12-07 04:17:48',0,'2023-12-07 04:17:48'),(10,6,1,15,1644600728,'2023-12-07 04:17:48',0,'2023-12-07 04:17:48'),(11,6,1,15,1644600728,'2023-12-07 04:17:48',0,'2023-12-07 04:17:48'),(12,7,1,16,1644600728,'2023-12-07 04:18:38',0,'2023-12-07 04:18:38'),(13,7,1,16,1644600728,'2023-12-07 04:18:38',0,'2023-12-07 04:18:38'),(14,7,1,16,1644600728,'2023-12-07 04:18:38',0,'2023-12-07 04:18:38'),(15,7,1,16,1644600728,'2023-12-07 04:18:38',0,'2023-12-07 04:18:38'),(16,9,1,17,1644600728,'2023-12-07 04:21:26',0,'2023-12-07 04:21:26'),(17,9,1,17,1644600728,'2023-12-07 04:21:26',0,'2023-12-07 04:21:26'),(18,2,1,17,1644600728,'2023-12-07 04:22:51',0,'2023-12-07 04:22:51'),(19,2,1,17,1644600728,'2023-12-07 04:22:52',0,'2023-12-07 04:22:52'),(20,2,1,17,1644600728,'2023-12-07 04:22:52',0,'2023-12-07 04:22:52'),(21,1,1,13,1644600728,'2023-12-07 16:58:37',0,'2023-12-07 16:58:37'),(22,3,1,17,1644600728,'2023-12-07 16:58:37',0,'2023-12-07 16:58:37'),(23,7,1,16,1644600728,'2023-12-07 16:58:37',0,'2023-12-07 16:58:37'),(24,5,1,17,1644600728,'2023-12-07 19:58:55',0,'2023-12-07 19:58:55'),(25,4,1,13,1644600728,'2023-12-07 19:58:55',0,'2023-12-07 19:58:55'),(26,5,1,17,1644600728,'2023-12-07 19:58:55',0,'2023-12-07 19:58:55'),(27,1,1,13,1644600728,'2023-12-07 20:26:48',0,'2023-12-07 20:26:48'),(28,3,1,17,1644600728,'2023-12-07 20:26:48',0,'2023-12-07 20:26:48'),(29,8,1,22,1644600728,'2023-12-07 20:26:48',0,'2023-12-07 20:26:48'),(30,8,1,22,1644600728,'2023-12-07 20:26:48',0,'2023-12-07 20:26:48'),(31,8,1,22,1644600728,'2023-12-07 20:26:48',0,'2023-12-07 20:26:48'),(32,1,1,13,1644600728,'2023-12-07 20:30:36',0,'2023-12-07 20:30:36'),(33,6,1,15,1644600728,'2023-12-07 20:30:36',0,'2023-12-07 20:30:36'),(34,8,1,22,1644600728,'2023-12-07 20:30:36',0,'2023-12-07 20:30:36'),(35,7,1,16,1644600728,'2023-12-07 20:30:37',0,'2023-12-07 20:30:37'),(36,4,1,13,1644600728,'2023-12-07 20:35:55',0,'2023-12-07 20:35:55'),(37,4,1,13,1644600728,'2023-12-07 20:35:55',0,'2023-12-07 20:35:55'),(38,4,1,13,1644600728,'2023-12-07 20:35:55',0,'2023-12-07 20:35:55'),(39,4,1,13,1644600728,'2023-12-07 20:35:55',0,'2023-12-07 20:35:55'),(40,4,1,13,1644600728,'2023-12-07 20:35:55',0,'2023-12-07 20:35:55'),(41,3,1,17,1644600728,'2023-12-07 20:44:05',0,'2023-12-07 20:44:05'),(42,4,1,13,1644600728,'2023-12-07 20:44:05',0,'2023-12-07 20:44:05'),(43,5,1,17,1644600728,'2023-12-07 20:44:05',0,'2023-12-07 20:44:05'),(44,10,1,22,1644600728,'2023-12-07 20:44:05',0,'2023-12-07 20:44:05'),(45,6,1,15,1644600728,'2023-12-07 20:44:05',0,'2023-12-07 20:44:05'),(46,10,1,22,1644600728,'2023-12-07 20:47:11',0,'2023-12-07 20:47:11'),(47,8,1,22,1644600728,'2023-12-07 20:47:11',0,'2023-12-07 20:47:11'),(48,7,1,16,1644600728,'2023-12-07 20:47:11',0,'2023-12-07 20:47:11'),(49,1,1,13,1644600728,'2023-12-07 20:51:56',0,'2023-12-07 20:51:56'),(50,6,1,15,1644600728,'2023-12-07 20:51:56',0,'2023-12-07 20:51:56'),(51,8,1,22,1644600728,'2023-12-07 20:51:57',0,'2023-12-07 20:51:57'),(52,5,1,17,1644600728,'2023-12-07 20:51:57',0,'2023-12-07 20:51:57'),(53,1,1,13,1644600728,'2023-12-07 20:55:35',0,'2023-12-07 20:55:35'),(54,6,1,15,1644600728,'2023-12-07 20:55:35',0,'2023-12-07 20:55:35'),(55,10,1,22,1644600728,'2023-12-07 20:55:35',0,'2023-12-07 20:55:35'),(56,4,1,13,1644600728,'2023-12-07 20:55:35',0,'2023-12-07 20:55:35'),(57,5,1,17,1644600728,'2023-12-07 20:55:36',0,'2023-12-07 20:55:36'),(58,8,1,22,1644600728,'2023-12-07 20:55:36',0,'2023-12-07 20:55:36'),(59,7,1,16,1644600728,'2023-12-07 20:55:36',0,'2023-12-07 20:55:36'),(60,4,1,13,1644600728,'2023-12-08 14:34:52',0,'2023-12-08 14:34:52'),(61,4,1,13,1644600728,'2023-12-08 14:34:52',0,'2023-12-08 14:34:52'),(62,5,1,17,1644600728,'2023-12-08 14:34:52',0,'2023-12-08 14:34:52'),(63,5,1,17,1644600728,'2023-12-08 14:34:53',0,'2023-12-08 14:34:53'),(64,10,1,22,1644600728,'2023-12-08 14:35:31',0,'2023-12-08 14:35:31'),(65,8,1,22,1644600728,'2023-12-08 14:35:31',0,'2023-12-08 14:35:31'),(66,2,1,17,1644600728,'2023-12-08 14:37:07',0,'2023-12-08 14:37:07'),(67,2,1,17,1644600728,'2023-12-08 14:37:07',0,'2023-12-08 14:37:07'),(68,2,1,17,1644600728,'2023-12-08 14:37:07',0,'2023-12-08 14:37:07'),(69,2,1,17,1644600728,'2023-12-08 14:37:07',0,'2023-12-08 14:37:07'),(70,2,1,17,1644600728,'2023-12-08 14:37:07',0,'2023-12-08 14:37:07');
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `vista_listproductos`
--

DROP TABLE IF EXISTS `vista_listproductos`;
/*!50001 DROP VIEW IF EXISTS `vista_listproductos`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vista_listproductos` AS SELECT 
 1 AS `id`,
 1 AS `nombre`,
 1 AS `descripcion`,
 1 AS `precio`,
 1 AS `fecha_creacion`,
 1 AS `borrado`,
 1 AS `cantidad`,
 1 AS `proveedor`,
 1 AS `precio_compra`,
 1 AS `id_proveedor`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vista_listtransaccion`
--

DROP TABLE IF EXISTS `vista_listtransaccion`;
/*!50001 DROP VIEW IF EXISTS `vista_listtransaccion`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vista_listtransaccion` AS SELECT 
 1 AS `id_transaccion`,
 1 AS `nombre_proveedor`,
 1 AS `nombre_producto`,
 1 AS `cantidad`,
 1 AS `fecha`,
 1 AS `total`,
 1 AS `id_producto`,
 1 AS `id_proveedor`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vista_producto_critico`
--

DROP TABLE IF EXISTS `vista_producto_critico`;
/*!50001 DROP VIEW IF EXISTS `vista_producto_critico`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vista_producto_critico` AS SELECT 
 1 AS `id_producto`,
 1 AS `nombre_producto`,
 1 AS `stock_actual`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vista_producto_mas_vendido`
--

DROP TABLE IF EXISTS `vista_producto_mas_vendido`;
/*!50001 DROP VIEW IF EXISTS `vista_producto_mas_vendido`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vista_producto_mas_vendido` AS SELECT 
 1 AS `id_producto`,
 1 AS `nombre_producto`,
 1 AS `descripcion_producto`,
 1 AS `precio_producto`,
 1 AS `total_vendido`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vista_producto_menos_vendido`
--

DROP TABLE IF EXISTS `vista_producto_menos_vendido`;
/*!50001 DROP VIEW IF EXISTS `vista_producto_menos_vendido`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vista_producto_menos_vendido` AS SELECT 
 1 AS `id_producto`,
 1 AS `nombre_producto`,
 1 AS `descripcion_producto`,
 1 AS `precio_producto`,
 1 AS `total_vendido`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vista_producto_recomendable`
--

DROP TABLE IF EXISTS `vista_producto_recomendable`;
/*!50001 DROP VIEW IF EXISTS `vista_producto_recomendable`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vista_producto_recomendable` AS SELECT 
 1 AS `id_producto`,
 1 AS `nombre_producto`,
 1 AS `stock_actual`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `vista_listproductos`
--

/*!50001 DROP VIEW IF EXISTS `vista_listproductos`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vista_listproductos` AS select `p`.`id` AS `id`,`p`.`nombre` AS `nombre`,`p`.`descripcion` AS `descripcion`,`p`.`precio` AS `precio`,`p`.`fecha_creacion` AS `fecha_creacion`,`p`.`borrado` AS `borrado`,`s`.`cantidad` AS `cantidad`,`prov`.`nombre` AS `proveedor`,`p`.`preciocom` AS `precio_compra`,`prov`.`id` AS `id_proveedor` from ((`producto` `p` left join `stock` `s` on((`p`.`id` = `s`.`id_producto`))) left join `proveedor` `prov` on((`p`.`id_proveedor` = `prov`.`id`))) where (`p`.`borrado` = false) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vista_listtransaccion`
--

/*!50001 DROP VIEW IF EXISTS `vista_listtransaccion`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vista_listtransaccion` AS select `t`.`id` AS `id_transaccion`,`pr`.`nombre` AS `nombre_proveedor`,`p`.`nombre` AS `nombre_producto`,`t`.`cantidad` AS `cantidad`,`t`.`fecha` AS `fecha`,`t`.`total` AS `total`,`t`.`id_producto` AS `id_producto`,`t`.`id_proveedor` AS `id_proveedor` from ((`transacciones` `t` left join `producto` `p` on((`t`.`id_producto` = `p`.`id`))) left join `proveedor` `pr` on((`t`.`id_proveedor` = `pr`.`id`))) order by `t`.`fecha` desc */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vista_producto_critico`
--

/*!50001 DROP VIEW IF EXISTS `vista_producto_critico`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vista_producto_critico` AS select `p`.`id` AS `id_producto`,`p`.`nombre` AS `nombre_producto`,`s`.`cantidad` AS `stock_actual` from (`producto` `p` join `stock` `s` on((`p`.`id` = `s`.`id_producto`))) where (`s`.`cantidad` < 5) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vista_producto_mas_vendido`
--

/*!50001 DROP VIEW IF EXISTS `vista_producto_mas_vendido`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vista_producto_mas_vendido` AS select `p`.`id` AS `id_producto`,`p`.`nombre` AS `nombre_producto`,`p`.`descripcion` AS `descripcion_producto`,`p`.`precio` AS `precio_producto`,sum(`v`.`cantidad`) AS `total_vendido` from (`producto` `p` join `ventas` `v` on((`p`.`id` = `v`.`id_producto`))) group by `p`.`id`,`p`.`nombre`,`p`.`descripcion`,`p`.`precio` order by `total_vendido` desc limit 1 */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vista_producto_menos_vendido`
--

/*!50001 DROP VIEW IF EXISTS `vista_producto_menos_vendido`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vista_producto_menos_vendido` AS select `p`.`id` AS `id_producto`,`p`.`nombre` AS `nombre_producto`,`p`.`descripcion` AS `descripcion_producto`,`p`.`precio` AS `precio_producto`,sum(`v`.`cantidad`) AS `total_vendido` from (`ventas` `v` left join `producto` `p` on((`p`.`id` = `v`.`id_producto`))) group by `p`.`id`,`p`.`nombre`,`p`.`descripcion`,`p`.`precio` order by `total_vendido` limit 1 */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vista_producto_recomendable`
--

/*!50001 DROP VIEW IF EXISTS `vista_producto_recomendable`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vista_producto_recomendable` AS select `p`.`id` AS `id_producto`,`p`.`nombre` AS `nombre_producto`,`s`.`cantidad` AS `stock_actual` from (`producto` `p` join `stock` `s` on((`p`.`id` = `s`.`id_producto`))) where ((`s`.`cantidad` >= 5) and (`s`.`cantidad` < 10)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-12  9:21:43
