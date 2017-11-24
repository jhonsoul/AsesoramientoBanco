-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-11-2017 a las 19:38:42
-- Versión del servidor: 5.7.14
-- Versión de PHP: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `servicios_asesoramiento`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `Antiguedad_Meses` (IN `id_empleado` VARCHAR(20))  NO SQL
BEGIN
    SELECT PERIOD_DIFF((SELECT Date_format(now(), '%Y%m')),(SELECT 	Date_format(e.fecha_contratacion_empleado, '%Y%m') FROM empleado e WHERE e.id_empleado = id_empleado)) AS "meses";
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Lista_Empleado_Cliente` ()  NO SQL
BEGIN
	SELECT e.id_empleado, e.nombre_empleado, c.id_cliente, c.nombre_cliente, c.ciudad_cliente FROM empleado e JOIN clientes c ON c.id_empleado = e.id_empleado;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Lista_subordinados` (IN `id_empleado` VARCHAR(20))  NO SQL
BEGIN
	SELECT e.nombre_empleado FROM empleado e, subordinado s WHERE e.id_empleado = s.id_empleado AND s.id_jefe = id_empleado AND e.eliminar = 0;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id_cliente` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `nombre_cliente` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `calle_cliente` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `ciudad_cliente` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tipo_asesor_personal` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `id_empleado` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `eliminar` tinyint(1) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id_cliente`, `nombre_cliente`, `calle_cliente`, `ciudad_cliente`, `tipo_asesor_personal`, `id_empleado`, `eliminar`) VALUES
('1', 'Carmen', 'La Tebaida', 'Armenia', NULL, '2', 0),
('2', 'Berto', 'Circumvalar', 'Pereira', 'asesor prestamo', '3', 0),
('3', 'Maria', 'Circumvalar', 'Pereira', NULL, NULL, 0),
('4', 'Carmen', 'La Tebaida', 'Armenia', 'asesor prestamo', '1', 0),
('5', 'Oliva', 'Bolivar', 'Cali', NULL, NULL, 0),
('6', 'Susan', 'Principal', 'Pererira', NULL, '2', 0),
('7', 'Jhon', 'Cra', 'Pe', 'asesor prestamo', '', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `id_empleado` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `nombre_empleado` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `teléfono_empleado` varchar(10) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fecha_contratacion_empleado` date DEFAULT NULL,
  `eliminar` tinyint(1) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`id_empleado`, `nombre_empleado`, `teléfono_empleado`, `fecha_contratacion_empleado`, `eliminar`) VALUES
('1', 'Antonio', '31000000', '2000-01-12', 0),
('2', 'Carlos', '51000000', '2015-01-12', 0),
('3', 'Flor', '91000000', '2013-01-12', 0),
('4', 'Jaime', '71000000', '2010-01-12', 0),
('5', 'Armando', '71000012', '2016-01-12', 0),
('6', 'Jhon', '33232', '2017-02-12', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `subordinado`
--

CREATE TABLE `subordinado` (
  `id_jefe` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `id_empleado` varchar(20) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `subordinado`
--

INSERT INTO `subordinado` (`id_jefe`, `id_empleado`) VALUES
('1', '2'),
('1', '3');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`),
  ADD UNIQUE KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_empleado` (`id_empleado`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`id_empleado`);

--
-- Indices de la tabla `subordinado`
--
ALTER TABLE `subordinado`
  ADD KEY `id_empleado` (`id_jefe`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
