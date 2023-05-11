-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: loja2020
-- ------------------------------------------------------
-- Server version	5.7.21-log

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
-- Table structure for table `cidade`
--

DROP TABLE IF EXISTS `cidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cidade` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `Uf` varchar(2) NOT NULL,
  `Pais` varchar(3) NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `fk_Cidade_Pais` (`Pais`),
  CONSTRAINT `fk_Cidade_Pais` FOREIGN KEY (`Pais`) REFERENCES `pais` (`sigla`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cidade`
--

LOCK TABLES `cidade` WRITE;
/*!40000 ALTER TABLE `cidade` DISABLE KEYS */;
INSERT INTO `cidade` VALUES (1,'João Pessoa','PB','BRA'),(2,'Campina Grande','PB','BRA'),(3,'Recife','PE','BRA'),(4,'Buenos Aires','BA','ARG'),(5,'Santiago','ST','CHI'),(6,'Hamburgo','HB','ALE'),(7,'Rio de Janeiro','RJ','BRA');
/*!40000 ALTER TABLE `cidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(40) NOT NULL,
  `tipo` char(2) NOT NULL,
  `contato` varchar(30) DEFAULT NULL,
  `cargo` varchar(30) DEFAULT NULL,
  `endereco` varchar(50) NOT NULL,
  `cidade` int(11) NOT NULL,
  `cep` varchar(10) DEFAULT NULL,
  `fone` varchar(16) DEFAULT NULL,
  `fax` varchar(16) DEFAULT NULL,
  `obs` text,
  PRIMARY KEY (`codigo`),
  KEY `fk_Cliente_Cidade` (`cidade`),
  CONSTRAINT `fk_Cliente_Cidade` FOREIGN KEY (`cidade`) REFERENCES `cidade` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Maria Helena Ferreira','PF','Helena','Medica','R. das Flores, 33, Manaira',1,'58.045-002','3225-6987',NULL,NULL),(2,'João Paulo Correia','PF','Paulo','Advogado','R. das Acacias, 920, Bessa',1,'58.037-255','3245-8999',NULL,NULL),(3,'Larissa Maia','PF','Larissa','Estudante','R. das Flores, 95, Manaira',1,'58.045-002','3227-9622',NULL,NULL),(4,'Marcos Andrade','PF','Marcos','Analista de Sistemas','Av. Juruá, 95',2,'58.000-00','3338-2100',NULL,NULL),(5,'LT Comércio','PJ',NULL,NULL,'Av. Ingá, 97',3,'56.000-00','3256-9981',NULL,NULL),(6,'JR Representações','PJ',NULL,NULL,'Av. Maracatu, 665',7,'21.654-00','5841-9871',NULL,NULL);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcao`
--

DROP TABLE IF EXISTS `funcao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcao` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `gratific` decimal(5,2) NOT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `un_Nome_Funcao` (`nome`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcao`
--

LOCK TABLES `funcao` WRITE;
/*!40000 ALTER TABLE `funcao` DISABLE KEYS */;
INSERT INTO `funcao` VALUES (1,'Vendedor',200.00),(2,'Auxiliar de Caixa',126.00),(3,'Gerente',500.00),(4,'Segurança',300.00);
/*!40000 ALTER TABLE `funcao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionario` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(40) NOT NULL,
  `sexo` char(1) NOT NULL,
  `estcivil` char(1) NOT NULL,
  `rg` varchar(15) NOT NULL,
  `cpf` varchar(12) NOT NULL,
  `datanasc` datetime NOT NULL,
  `naturalidade` int(11) NOT NULL,
  `dataadm` datetime NOT NULL,
  `endereco` varchar(40) NOT NULL,
  `complemento` varchar(20) DEFAULT NULL,
  `bairro` varchar(20) DEFAULT NULL,
  `cidade` int(11) NOT NULL,
  `cep` varchar(10) DEFAULT NULL,
  `fone` varchar(10) DEFAULT NULL,
  `celular` varchar(10) DEFAULT NULL,
  `funcao` int(11) NOT NULL,
  `setor` char(3) NOT NULL,
  `salario` decimal(6,2) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `Obs` text,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `un_Funcionario_Rg` (`rg`),
  UNIQUE KEY `un_Funcionario_Cpf` (`cpf`),
  KEY `fk_Funcionario_Natural_Cidade` (`naturalidade`),
  KEY `fk_Funcionario_Cidade` (`cidade`),
  KEY `fk_Funcionario_Funcao` (`funcao`),
  KEY `fk_Funcionario_Setor` (`setor`),
  CONSTRAINT `fk_Funcionario_Cidade` FOREIGN KEY (`cidade`) REFERENCES `cidade` (`codigo`),
  CONSTRAINT `fk_Funcionario_Funcao` FOREIGN KEY (`funcao`) REFERENCES `funcao` (`codigo`),
  CONSTRAINT `fk_Funcionario_Natural_Cidade` FOREIGN KEY (`naturalidade`) REFERENCES `cidade` (`codigo`),
  CONSTRAINT `fk_Funcionario_Setor` FOREIGN KEY (`setor`) REFERENCES `setor` (`sigla`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES (1,'João da Silva','M','S','2541399','04598722354','1978-02-05 00:00:00',1,'2005-06-09 00:00:00','R. Uire, 98',NULL,'Tambaú',1,NULL,NULL,NULL,1,'COV',250.00,NULL,NULL),(2,'Maria de Souza','F','C','0145687','24598711200','1970-01-01 00:00:00',3,'2000-09-08 00:00:00','R. Umbuzeiro, 12',NULL,'Manaíra',1,NULL,NULL,NULL,2,'MKT',300.00,NULL,NULL),(3,'Luiza Costa','F','C','2185411','36574100296','1980-04-04 00:00:00',7,'1998-05-01 00:00:00','A. Esperança, 91',NULL,'Bessa',1,NULL,NULL,NULL,3,'ADM',950.00,NULL,NULL),(4,'Francisco da Silva','M','D','0584132','01487933587','1970-06-03 00:00:00',6,'2002-08-05 00:00:00','Av. Fagundes, 05',NULL,'Mangabeira',1,NULL,NULL,NULL,4,'SEG',390.00,'franc@uol.com.br',NULL),(5,'Carla Tavares','F','C','2987411','36544800298','1969-01-08 00:00:00',5,'1992-03-01 00:00:00','R. Uire, 154',NULL,'Tambaú',1,NULL,NULL,NULL,2,'COV',290.00,'carla@gmail.com',NULL);
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itens`
--

DROP TABLE IF EXISTS `itens`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `itens` (
  `pedido` int(11) NOT NULL,
  `produto` int(11) NOT NULL,
  `preco` decimal(8,2) DEFAULT NULL,
  `quant` int(11) NOT NULL,
  `desconto` decimal(4,1) NOT NULL,
  PRIMARY KEY (`pedido`,`produto`),
  KEY `fk_Itens_Produto` (`produto`),
  CONSTRAINT `fk_Itens_Pedido` FOREIGN KEY (`pedido`) REFERENCES `pedido` (`codigo`),
  CONSTRAINT `fk_Itens_Produto` FOREIGN KEY (`produto`) REFERENCES `produto` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itens`
--

LOCK TABLES `itens` WRITE;
/*!40000 ALTER TABLE `itens` DISABLE KEYS */;
INSERT INTO `itens` VALUES (1,2,32.00,10,0.2),(3,5,92.00,1,0.1),(4,7,20.70,3,12.6),(6,4,3.65,1,0.2),(7,4,7.31,2,0.2),(8,2,3.20,1,1.3),(8,7,6.90,1,1.3),(11,5,92.00,1,0.0),(13,7,13.80,2,0.0),(14,7,6.90,1,0.0),(15,4,3.65,1,0.2),(16,7,3.90,1,0.2),(18,2,2845.00,2,0.0),(19,7,58.95,3,0.0),(20,4,956.00,5,1.0),(21,4,956.00,5,1.0),(22,7,6.90,1,0.0),(24,7,20.70,3,12.6),(25,2,32.00,10,0.2);
/*!40000 ALTER TABLE `itens` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pais`
--

DROP TABLE IF EXISTS `pais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pais` (
  `sigla` varchar(3) NOT NULL,
  `nome` varchar(15) NOT NULL,
  PRIMARY KEY (`sigla`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pais`
--

LOCK TABLES `pais` WRITE;
/*!40000 ALTER TABLE `pais` DISABLE KEYS */;
INSERT INTO `pais` VALUES ('ALE','Alemanha'),('ARG','Argentina'),('BRA','Brasil'),('CHI','Chile');
/*!40000 ALTER TABLE `pais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedido` (
  `codigo` int(11) NOT NULL,
  `cliente` int(11) NOT NULL,
  `vendedor` int(11) NOT NULL,
  `dataPedido` datetime NOT NULL,
  `dataFatura` datetime DEFAULT NULL,
  `via` char(1) DEFAULT NULL,
  `frete` decimal(8,2) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `fk_Pedido_Cliente` (`cliente`),
  KEY `fk_Pedido_Funcionario` (`vendedor`),
  CONSTRAINT `fk_Pedido_Cliente` FOREIGN KEY (`cliente`) REFERENCES `cliente` (`codigo`),
  CONSTRAINT `fk_Pedido_Funcionario` FOREIGN KEY (`vendedor`) REFERENCES `funcionario` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
INSERT INTO `pedido` VALUES (1,2,1,'2007-05-09 00:00:00','2005-06-01 00:00:00','T',1200.00),(2,5,1,'2007-01-12 00:00:00','2005-02-12 00:00:00','A',100.00),(3,6,2,'2006-10-02 00:00:00','2006-11-11 00:00:00','A',254.00),(4,3,2,'2007-01-01 00:00:00','2006-01-01 00:00:00','A',569.00),(5,1,2,'2006-12-05 00:00:00','2006-12-05 00:00:00','M',0.00),(6,4,3,'2006-03-09 00:00:00','2006-03-09 00:00:00','M',0.00),(7,1,2,'2006-08-08 00:00:00','2006-09-09 00:00:00','T',169.00),(8,6,4,'2007-03-02 00:00:00','2007-03-09 00:00:00','M',0.00),(9,1,3,'2006-07-07 00:00:00','2007-07-08 00:00:00','A',950.00),(10,1,2,'2007-06-02 00:00:00','2007-06-02 00:00:00','M',0.00),(11,6,3,'2007-12-02 00:00:00','2007-12-03 00:00:00','T',0.00),(12,1,2,'2007-10-10 00:00:00','2007-11-01 00:00:00','M',658.00),(13,4,1,'2007-11-11 00:00:00','2007-11-11 00:00:00','M',0.00),(14,4,2,'2008-01-12 00:00:00','2008-01-01 00:00:00','T',126.00),(15,6,2,'2008-01-10 00:00:00','2008-02-01 00:00:00','A',1500.00),(16,1,4,'2008-08-05 00:00:00','2008-08-05 00:00:00','T',0.00),(17,6,4,'2008-07-10 00:00:00','2008-07-10 00:00:00','T',0.00),(18,2,3,'2008-07-01 00:00:00','2008-07-01 00:00:00','T',0.00),(19,6,2,'2008-06-12 00:00:00','2008-06-12 00:00:00','T',0.00),(20,5,1,'2008-08-01 00:00:00','2008-08-02 00:00:00','T',0.00),(21,3,3,'2008-11-05 00:00:00','2009-11-05 00:00:00','M',147.00),(22,3,2,'2008-12-10 00:00:00','2009-12-10 00:00:00','A',1900.00),(23,1,2,'2009-01-03 00:00:00','2010-01-03 00:00:00','T',0.00),(24,6,2,'2009-01-01 00:00:00','2010-10-01 00:00:00','T',0.00),(25,4,1,'2009-02-02 00:00:00','2010-10-10 00:00:00','A',120.00);
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produto` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(40) NOT NULL,
  `descricao` varchar(45) NOT NULL,
  `apresent` varchar(30) DEFAULT NULL,
  `venda` decimal(5,2) NOT NULL,
  `custo` decimal(5,3) NOT NULL,
  `quantest` int(11) NOT NULL,
  `estmin` int(11) DEFAULT NULL,
  `tipo` int(11) NOT NULL,
  `situacao` char(1) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `un_Nome_Produto` (`nome`),
  KEY `fk_Produto_Tipo` (`tipo`),
  CONSTRAINT `fk_Produto_Tipo` FOREIGN KEY (`tipo`) REFERENCES `tipo` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (2,'Iogurte Nestle','Conjunto com 6 potes de Iogurte','Danoninho',3.20,1.350,200,150,1,'N'),(4,'TV Plasma','TV de Plasma 42 polegadas','TV Plasma',3.65,2.650,12,9,6,'N'),(5,'Liquidificador','Liquidificador Arno 6 posições','Liquidificador Dmais',92.00,58.000,150,100,6,'S'),(6,'Computador Positivo','Computador Pentium IV','Positivo PIV',1.98,1.600,24,13,6,'D'),(7,'Pizza Sadia','Pizza tamanho médio Sadia','Pizza Sadia',6.90,4.100,541,200,3,'N');
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setor`
--

DROP TABLE IF EXISTS `setor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `setor` (
  `sigla` char(3) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `ramal` int(11) DEFAULT NULL,
  `chefe` int(11) DEFAULT NULL,
  PRIMARY KEY (`sigla`),
  UNIQUE KEY `un_Nome_Setor` (`nome`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setor`
--

LOCK TABLES `setor` WRITE;
/*!40000 ALTER TABLE `setor` DISABLE KEYS */;
INSERT INTO `setor` VALUES ('ADM','Administração',NULL,NULL),('COV','Compra e Venda',NULL,NULL),('MKT','Marketing',NULL,NULL),('SEG','Segurança',NULL,NULL);
/*!40000 ALTER TABLE `setor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo`
--

DROP TABLE IF EXISTS `tipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(15) NOT NULL,
  `descricao` text,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo`
--

LOCK TABLES `tipo` WRITE;
/*!40000 ALTER TABLE `tipo` DISABLE KEYS */;
INSERT INTO `tipo` VALUES (1,'Lacticínios',NULL),(2,'Tecidos',NULL),(3,'Alimentação',NULL),(4,'Cama',NULL),(5,'Decoração',NULL),(6,'Eletro',NULL);
/*!40000 ALTER TABLE `tipo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-11 15:22:33
