-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1
-- Létrehozás ideje: 2019. Nov 10. 15:26
-- Kiszolgáló verziója: 10.4.6-MariaDB
-- PHP verzió: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `csiga`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `goods`
--

CREATE TABLE `goods` (
  `number` int(64) NOT NULL,
  `name` varchar(32) NOT NULL,
  `price` int(6) NOT NULL,
  `quantity` int(4) NOT NULL,
  `rating` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- A tábla adatainak kiíratása `goods`
--

INSERT INTO `goods` (`number`, `name`, `price`, `quantity`, `rating`) VALUES
(1, 'test', 1, 1, 5),
(2, 'test2', 10, 10, 5);

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `orders`
--

CREATE TABLE `orders` (
  `trackingNumber` int(6) NOT NULL,
  `name` varchar(64) NOT NULL,
  `username` varchar(64) NOT NULL,
  `phone` int(11) NOT NULL,
  `address` varchar(64) NOT NULL,
  `email` varchar(64) NOT NULL,
  `paymentMethod` varchar(32) NOT NULL,
  `shipmentMethod` varchar(32) NOT NULL,
  `goods` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `users`
--

CREATE TABLE `users` (
  `username` varchar(64) NOT NULL,
  `email` varchar(64) NOT NULL,
  `password` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- A tábla adatainak kiíratása `users`
--

INSERT INTO `users` (`username`, `email`, `password`) VALUES
('test', 'test', 'test');

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `goods`
--
ALTER TABLE `goods`
  ADD PRIMARY KEY (`number`),
  ADD UNIQUE KEY `name` (`name`);

--
-- A tábla indexei `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`trackingNumber`),
  ADD KEY `fk` (`username`);

--
-- A tábla indexei `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`username`),
  ADD UNIQUE KEY `email` (`email`);

--
-- A kiírt táblák AUTO_INCREMENT értéke
--

--
-- AUTO_INCREMENT a táblához `goods`
--
ALTER TABLE `goods`
  MODIFY `number` int(64) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Megkötések a kiírt táblákhoz
--

--
-- Megkötések a táblához `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `fk` FOREIGN KEY (`username`) REFERENCES `users` (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
