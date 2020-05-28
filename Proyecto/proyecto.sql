-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-05-2020 a las 13:44:34
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.2.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `DNI` varchar(9) NOT NULL,
  `Nombre` varchar(25) DEFAULT NULL,
  `Telefono` varchar(9) DEFAULT NULL,
  `Pedidos` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`DNI`, `Nombre`, `Telefono`, `Pedidos`) VALUES
('12345678L', 'alejandro', '666666666', 2),
('12345698P', 'nieves', '685748515', 2),
('63339639T', 'patxi', '965487125', 0),
('66666666L', 'mario', '651815614', 3),
('72855772Y', 'victor', '633371552', 5),
('72866338P', 'vadillo', '688812797', 1),
('88888888P', 'nerea', '658561654', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `CodigoPedido` int(3) NOT NULL,
  `CodigoCliente` varchar(9) NOT NULL,
  `Fecha` date NOT NULL,
  `Hora` time(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`CodigoPedido`, `CodigoCliente`, `Fecha`, `Hora`) VALUES
(1, '72855772Y', '2020-05-25', '16:27:56.00000'),
(2, '12345678L', '2020-05-25', '16:52:05.00000'),
(3, '72866338P', '2020-05-25', '16:55:53.00000'),
(4, '66666666L', '2020-05-25', '16:56:27.00000'),
(5, '66666666L', '2020-05-25', '16:58:20.00000'),
(6, '88888888P', '2020-05-25', '16:59:50.00000'),
(7, '88888888P', '2020-05-25', '17:02:53.00000'),
(8, '72855772Y', '2020-05-25', '17:05:42.00000'),
(9, '66666666L', '2020-05-25', '17:14:12.00000'),
(10, '72855772Y', '2020-05-27', '17:22:23.00000'),
(11, '12345698P', '2020-05-28', '13:33:32.00000'),
(12, '12345698P', '2020-05-28', '13:34:02.00000'),
(13, '72855772Y', '2020-05-28', '13:40:20.00000'),
(14, '72855772Y', '2020-05-28', '13:41:40.00000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `plato`
--

CREATE TABLE `plato` (
  `CodigoPlato` int(3) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Unidades` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `plato`
--

INSERT INTO `plato` (`CodigoPlato`, `Nombre`, `Unidades`) VALUES
(1, 'macarrones', 44),
(2, 'pizza', 20),
(3, 'cous cous', 40),
(4, 'brocoli', 40),
(5, 'cachopo', 30),
(6, 'hamburguesa', 44),
(7, 'lasagna', 54),
(17, 'paella', 90);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `platopedido`
--

CREATE TABLE `platopedido` (
  `CodigoPedido` int(3) NOT NULL,
  `CodigoPlato` int(3) NOT NULL,
  `Unidades` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `platopedido`
--

INSERT INTO `platopedido` (`CodigoPedido`, `CodigoPlato`, `Unidades`) VALUES
(1, 3, 20),
(1, 4, 2),
(1, 6, 23),
(2, 2, 4),
(2, 4, 11),
(2, 5, 6),
(3, 3, 22),
(3, 1, 6),
(4, 6, 6),
(5, 6, 3),
(5, 1, 4),
(5, 3, 4),
(6, 3, 6),
(6, 1, 8),
(7, 2, 5),
(7, 7, 11),
(7, 4, 9),
(8, 2, 5),
(8, 5, 3),
(8, 6, 15),
(8, 1, 6),
(9, 5, 7),
(9, 3, 8),
(9, 1, 1),
(10, 5, 2),
(11, 1, 20),
(12, 3, 20),
(13, 6, 50),
(14, 7, 10),
(14, 17, 10),
(14, 5, 10);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`DNI`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`CodigoPedido`);

--
-- Indices de la tabla `plato`
--
ALTER TABLE `plato`
  ADD PRIMARY KEY (`CodigoPlato`);

--
-- Indices de la tabla `platopedido`
--
ALTER TABLE `platopedido`
  ADD KEY `Pedido` (`CodigoPedido`),
  ADD KEY `Plato` (`CodigoPlato`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `plato`
--
ALTER TABLE `plato`
  MODIFY `CodigoPlato` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `platopedido`
--
ALTER TABLE `platopedido`
  ADD CONSTRAINT `Pedido` FOREIGN KEY (`CodigoPedido`) REFERENCES `pedido` (`CodigoPedido`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Plato` FOREIGN KEY (`CodigoPlato`) REFERENCES `plato` (`CodigoPlato`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
