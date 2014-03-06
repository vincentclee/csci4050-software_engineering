-- MySQL dump 10.13  Distrib 5.1.69, for redhat-linux-gnu (x86_64)
--
-- Host: localhost    Database: stocks
-- ------------------------------------------------------
-- Server version	5.1.69

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
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `company` (
  `name` varchar(255) NOT NULL,
  `exchange` varchar(255) NOT NULL,
  `symbol` varchar(255) NOT NULL,
  `industry` varchar(255) NOT NULL,
  `addedOn` date NOT NULL,
  PRIMARY KEY (`symbol`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
INSERT INTO `company` VALUES ('American Express','NYSE','AXP','Consumer finance','1982-08-30'),('AT&T','NYSE','T','Telecommunication','1939-03-04'),('Boeing','NYSE','BA','Aerospace and defense','1987-03-12'),('Caterpillar','NYSE','CAT','Construction and mining equipment','1991-05-06'),('Chevron','NYSE','CVX','Oil & gas','2008-02-19'),('Cisco Systems','NASDAQ','CSCO','Computer networking','2009-06-08'),('Coca-Cola','NYSE','KO','Beverages','1987-03-12'),('DuPont','NYSE','DD','Chemical industry','1935-11-20'),('ExxonMobil','NYSE','XOM','Oil & gas','1928-10-01'),('General Electric','NYSE','GE','Conglomerate','2007-11-07'),('Goldman Sachs','NYSE','GS','Banking, Financial services','2013-09-20'),('The Home Depot','NYSE','HD','Home improvementretailer','1999-11-01'),('Intel','NASDAQ','INTC','Semiconductors','1999-11-01'),('IBM','NYSE','IBM','Computers and technology','1979-06-29'),('Johnson & Johnson','NYSE','JNJ','Pharmaceuticals','1997-03-17'),('JPMorgan Chase','NYSE','JPM','Banking','1991-05-06'),('McDonald\'s','NYSE','MCD','Fast food','1985-10-30'),('Merck','NYSE','MRK','Pharmaceuticals','1979-06-29'),('Microsoft','NASDAQ','MSFT','Software','1999-11-01'),('Nike','NYSE','NKE','Apparel','2013-09-20'),('Pfizer','NYSE','PFE','Pharmaceuticals','2004-04-08'),('Procter & Gamble','NYSE','PG','Consumer goods','1932-05-26'),('Travelers','NYSE','TRV','Insurance','2009-06-08'),('UnitedHealth Group','NYSE','UNH','Managed health care','2012-09-24'),('United Technologies','NYSE','UTX','Conglomerate','1939-03-14'),('Verizon','NYSE','VZ','Telecommunication','2004-04-08'),('Visa','NYSE','V','Consumer banking','2013-09-20'),('Wal-Mart','NYSE','WMT','Retail','1997-03-17'),('Walt Disney','NYSE','DIS','Broadcasting and entertainment','1991-05-06');
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock_price`
--

DROP TABLE IF EXISTS `stock_price`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stock_price` (
  `symbol` varchar(255) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`symbol`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock_price`
--

LOCK TABLES `stock_price` WRITE;
/*!40000 ALTER TABLE `stock_price` DISABLE KEYS */;
INSERT INTO `stock_price` VALUES ('MMM',120.94),('AXP',76.32),('T',34.2),('BA',120.34),('CAT',86.27),('CVX',119.16),('CSCO',23),('DD',59.06),('XOM',87.31),('GE',24.36),('GS',162.25),('HD',74.94),('INTC',23.7),('IBM',186.73),('JNJ',91.11),('JPM',54),('MCD',95.22),('MRK',47.17),('MSFT',34.64),('NKE',74.52),('PFE',29.8),('PG',78.34),('KO',38),('TRV',86.08),('UTX',106.43),('UNH',75.19),('VZ',47.25),('V',195.63),('WMT',75.6),('DIS',66.35);
/*!40000 ALTER TABLE `stock_price` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-10-17 12:16:21
