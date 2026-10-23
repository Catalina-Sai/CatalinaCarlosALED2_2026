

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


CREATE TABLE `mascotas` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `especie` varchar(50) NOT NULL,
  `raza` varchar(50) NOT NULL,
  `nombre_dueno` varchar(100) NOT NULL,
  `telefono` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;



INSERT INTO `mascotas` (`id`, `nombre`, `especie`, `raza`, `nombre_dueno`, `telefono`) VALUES
(6, 'reina', 'a', 'a', 'a', 'a'),
(7, 'e', 'e', 'e', 'u', 'i');



ALTER TABLE `mascotas`
  ADD PRIMARY KEY (`id`);



ALTER TABLE `mascotas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

