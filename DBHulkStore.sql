/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

DROP DATABASE IF EXISTS `hulkstore`;
CREATE DATABASE IF NOT EXISTS `hulkstore` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `hulkstore`;

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `Id` varchar(60) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Apellido` varchar(50) NOT NULL,
  `Direccion` varchar(100) NOT NULL,
  `Barrio` varchar(60) NOT NULL,
  `Telefono` varchar(50) NOT NULL,
  `Estado` varchar(30) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `descripventa`;
CREATE TABLE IF NOT EXISTS `descripventa` (
  `Id_Producto` int(60) NOT NULL,
  `Descrip_producto` int(100) NOT NULL,
  `Valor_Unitario` int(100) NOT NULL,
  `Cantidad_producto` int(100) NOT NULL,
  `Sub_Total` int(100) NOT NULL,
  `Total` int(100) NOT NULL,
  PRIMARY KEY (`Id_Producto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `empleados`;
CREATE TABLE IF NOT EXISTS `empleados` (
  `Id` int(60) NOT NULL,
  `Nombre1` varchar(50) NOT NULL,
  `Nombre2` varchar(50) NOT NULL,
  `Apellido1` varchar(50) NOT NULL,
  `Apellido2` varchar(50) NOT NULL,
  `Direccion` varchar(100) NOT NULL,
  `Barrio` varchar(60) NOT NULL,
  `Telefono` varchar(50) NOT NULL,
  `Estado` varchar(30) NOT NULL,
  `Clave` varchar(50) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `encabezadoventa`;
CREATE TABLE IF NOT EXISTS `encabezadoventa` (
  `Id_Venta` int(200) NOT NULL,
  `FechaVenta` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `Id_Empleado` int(60) NOT NULL,
  `Id_Cliente` varchar(60) NOT NULL,
  PRIMARY KEY (`Id_Venta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP PROCEDURE IF EXISTS `Login`;
DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `Login`(
	IN `USUARIO` INT,
	IN `PASSWORD` INT,
	OUT `EXISTE` INT

)
BEGIN
	SET existe=0;
	SELECT Id,Clave,Existe into EXISTE FROM Empleados 
	WHERE STRCMP(Id,USUARIO)=0 
	AND STRCMP(Clave,PASSWORD)=0;
END//
DELIMITER ;

DROP TABLE IF EXISTS `productos`;
CREATE TABLE IF NOT EXISTS `productos` (
  `Id` int(60) NOT NULL,
  `Descrip` varchar(100) NOT NULL,
  `Linea` varchar(60) NOT NULL,
  `Tipo` varchar(60) NOT NULL,
  `Cantidad` int(200) NOT NULL,
  `Valor` int(200) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `tipoproducto`;
CREATE TABLE IF NOT EXISTS `tipoproducto` (
  `Id` int(60) NOT NULL,
  `Descrip` varchar(100) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
