-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-08-2017 a las 19:14:48
-- Versión del servidor: 5.6.17
-- Versión de PHP: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `java_procedimientos`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarPersona`(IN id_persona INT)
BEGIN 
SELECT idpersona, nombre, edad FROM persona WHERE idpersona = id_persona;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listarPersonas`()
BEGIN
SELECT idpersona, nombre, edad FROM persona;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE IF NOT EXISTS `alumno` (
  `idalumno` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `correo` varchar(45) NOT NULL,
  PRIMARY KEY (`idalumno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno_curso`
--

CREATE TABLE IF NOT EXISTS `alumno_curso` (
  `idalumno` int(11) NOT NULL,
  `idcurso` int(11) NOT NULL,
  PRIMARY KEY (`idalumno`,`idcurso`),
  KEY `fk_alumno_has_curso_curso1_idx` (`idcurso`),
  KEY `fk_alumno_has_curso_alumno1_idx` (`idalumno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `idcliente` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `telefono` bigint(20) NOT NULL,
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso`
--

CREATE TABLE IF NOT EXISTS `curso` (
  `idcurso` int(11) NOT NULL,
  `materia` varchar(45) NOT NULL,
  `docente` varchar(45) NOT NULL,
  `horas` int(11) NOT NULL,
  PRIMARY KEY (`idcurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

CREATE TABLE IF NOT EXISTS `departamento` (
  `iddepartamento` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  PRIMARY KEY (`iddepartamento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `direccion`
--

CREATE TABLE IF NOT EXISTS `direccion` (
  `idpersona` int(11) NOT NULL,
  `estado` varchar(45) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  PRIMARY KEY (`idpersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE IF NOT EXISTS `empleado` (
  `idempleado` int(11) NOT NULL,
  `iddepartamento` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `edad` int(11) NOT NULL,
  PRIMARY KEY (`idempleado`,`iddepartamento`),
  KEY `fk_empleado_departamento1_idx` (`iddepartamento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `informacion`
--

CREATE TABLE IF NOT EXISTS `informacion` (
  `idpersona` int(11) NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `correo` varchar(45) NOT NULL,
  PRIMARY KEY (`idpersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE IF NOT EXISTS `pedido` (
  `idpedido` int(11) NOT NULL,
  `idcliente` int(11) NOT NULL,
  `producto` varchar(45) NOT NULL,
  `precio` decimal(6,2) NOT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`idpedido`,`idcliente`),
  KEY `fk_pedido_cliente1_idx` (`idcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE IF NOT EXISTS `persona` (
  `idpersona` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `edad` int(11) NOT NULL,
  PRIMARY KEY (`idpersona`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`idpersona`, `nombre`, `edad`) VALUES
(1, 'Abi', 30),
(2, 'Beatriz', 28);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alumno_curso`
--
ALTER TABLE `alumno_curso`
  ADD CONSTRAINT `fk_alumno_has_curso_alumno1` FOREIGN KEY (`idalumno`) REFERENCES `alumno` (`idalumno`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_alumno_has_curso_curso1` FOREIGN KEY (`idcurso`) REFERENCES `curso` (`idcurso`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `direccion`
--
ALTER TABLE `direccion`
  ADD CONSTRAINT `fk_direccion_persona` FOREIGN KEY (`idpersona`) REFERENCES `persona` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `fk_empleado_departamento1` FOREIGN KEY (`iddepartamento`) REFERENCES `departamento` (`iddepartamento`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `informacion`
--
ALTER TABLE `informacion`
  ADD CONSTRAINT `fk_informacion_persona` FOREIGN KEY (`idpersona`) REFERENCES `persona` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `fk_pedido_cliente1` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
