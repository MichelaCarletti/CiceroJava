-- phpMyAdmin SQL Dump
-- version 4.6.6deb5ubuntu0.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Creato il: Set 02, 2022 alle 17:01
-- Versione del server: 5.7.39-0ubuntu0.18.04.2
-- Versione PHP: 7.2.24-0ubuntu0.18.04.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cicero`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `administrator`
--

CREATE TABLE `administrator` (
  `admin_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `booking`
--

CREATE TABLE `booking` (
  `booking_id` int(11) NOT NULL,
  `book_date` varchar(10) NOT NULL,
  `tourist_id` int(11) NOT NULL,
  `tour_id` int(11) NOT NULL,
  `dicount_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `day`
--

CREATE TABLE `day` (
  `tour_day_id` int(11) NOT NULL,
  `date` varchar(10) NOT NULL,
  `steps_list` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `discount`
--

CREATE TABLE `discount` (
  `discount_id` int(11) NOT NULL,
  `amount` double NOT NULL,
  `category` varchar(10) NOT NULL,
  `discount_type` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `discount_request`
--

CREATE TABLE `discount_request` (
  `discount_request_id` int(11) NOT NULL,
  `sender_id` int(11) NOT NULL,
  `recipient_id` int(11) NOT NULL,
  `status` varchar(10) NOT NULL,
  `date` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `driver`
--

CREATE TABLE `driver` (
  `driver_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `available_vehicles` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `guide`
--

CREATE TABLE `guide` (
  `guide_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `associtation_id` int(11) NOT NULL,
  `reviews` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `guide_association`
--

CREATE TABLE `guide_association` (
  `guide_association_id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `guides` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `instructor`
--

CREATE TABLE `instructor` (
  `instructor_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `qualifications` text NOT NULL,
  `reviews` text NOT NULL,
  `training_courses` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `notification`
--

CREATE TABLE `notification` (
  `notification_id` int(11) NOT NULL,
  `title` varchar(50) NOT NULL,
  `description` text NOT NULL,
  `sender_id` int(11) NOT NULL,
  `recipient_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `review`
--

CREATE TABLE `review` (
  `review_id` int(11) NOT NULL,
  `title` varchar(50) NOT NULL,
  `description` text NOT NULL,
  `vote` int(11) NOT NULL,
  `sender_id` int(11) NOT NULL,
  `recipient_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `shared`
--

CREATE TABLE `shared` (
  `shared_id` int(11) NOT NULL,
  `tourist_id` int(11) NOT NULL,
  `tour_id` int(11) NOT NULL,
  `gallery` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `step`
--

CREATE TABLE `step` (
  `step_id` int(11) NOT NULL,
  `toponyms` text NOT NULL,
  `title` varchar(50) NOT NULL,
  `description` text NOT NULL,
  `start_time` varchar(5) NOT NULL,
  `end_time` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `tag`
--

CREATE TABLE `tag` (
  `tag_id` int(11) NOT NULL,
  `name` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `toponym`
--

CREATE TABLE `toponym` (
  `toponym_id` int(11) NOT NULL,
  `region` varchar(10) NOT NULL,
  `name` varchar(10) NOT NULL,
  `area` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `tour`
--

CREATE TABLE `tour` (
  `tour_id` int(11) NOT NULL,
  `title` varchar(50) NOT NULL,
  `description` text NOT NULL,
  `max_tourists_number` int(11) NOT NULL,
  `min_tourists_number` int(11) NOT NULL,
  `max_guest_reservation_days` int(11) NOT NULL,
  `status` varchar(10) NOT NULL,
  `total_cost` double NOT NULL,
  `costs_list` text NOT NULL,
  `tag_list` text NOT NULL,
  `days_list` text NOT NULL,
  `guide_id` int(11) NOT NULL,
  `reviews` text NOT NULL,
  `training_courses` text NOT NULL,
  `tipology` text NOT NULL,
  `duration` int(11) NOT NULL,
  `tourists` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `tour`
--

INSERT INTO `tour` (`tour_id`, `title`, `description`, `max_tourists_number`, `min_tourists_number`, `max_guest_reservation_days`, `status`, `total_cost`, `costs_list`, `tag_list`, `days_list`, `guide_id`, `reviews`, `training_courses`, `tipology`, `duration`, `tourists`) VALUES
(1, 'Gita a Venezia', 'Visita guidata di Venezia', 10, 2, 2, 'Aperta', 64, 'Guida, Pranzo, Traghetto', 'Citta', '012', 45, '', '', 'Visita citta', 2, ''),
(2, 'Rifugio Capanna di Fassa', 'Escursione al Piz Boè in Val di Fassa', 5, 1, 2, 'Aperta', 20, 'Guida, Pranzo, Funivia', 'Escursioni', '', 32, '', '', '', 3, '');

-- --------------------------------------------------------

--
-- Struttura della tabella `tourist`
--

CREATE TABLE `tourist` (
  `tourist_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `category` varchar(20) NOT NULL,
  `birth_date` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `tourist_experience_invite_guest`
--

CREATE TABLE `tourist_experience_invite_guest` (
  `tourist_experience_invite_guest_id` int(11) NOT NULL,
  `tourist_id` int(11) NOT NULL,
  `tour_id` int(11) NOT NULL,
  `invite_day` varchar(10) NOT NULL,
  `guest_email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `tour_costs`
--

CREATE TABLE `tour_costs` (
  `tour_costs_id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `amount` double NOT NULL,
  `tour_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `training_course`
--

CREATE TABLE `training_course` (
  `training_course_id` int(11) NOT NULL,
  `title` varchar(50) NOT NULL,
  `description` text NOT NULL,
  `cost` double NOT NULL,
  `max_subscribers` int(11) NOT NULL,
  `min_subscribers` int(11) NOT NULL,
  `date` varchar(10) NOT NULL,
  `time` varchar(5) NOT NULL,
  `subscribers` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `user`
--

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `surname` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `user`
--

INSERT INTO `user` (`user_id`, `name`, `surname`, `password`, `email`) VALUES
(1, 'Michela', 'Carletti', 'ciao', 'michelacarletti96@gmail.com');

-- --------------------------------------------------------

--
-- Struttura della tabella `vehicle`
--

CREATE TABLE `vehicle` (
  `vehicle_id` int(11) NOT NULL,
  `name` varchar(10) NOT NULL,
  `sets` tinyint(4) NOT NULL,
  `description` text NOT NULL,
  `plate` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `administrator`
--
ALTER TABLE `administrator`
  ADD PRIMARY KEY (`admin_id`);

--
-- Indici per le tabelle `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`booking_id`);

--
-- Indici per le tabelle `day`
--
ALTER TABLE `day`
  ADD PRIMARY KEY (`tour_day_id`);

--
-- Indici per le tabelle `discount`
--
ALTER TABLE `discount`
  ADD PRIMARY KEY (`discount_id`);

--
-- Indici per le tabelle `discount_request`
--
ALTER TABLE `discount_request`
  ADD PRIMARY KEY (`discount_request_id`);

--
-- Indici per le tabelle `driver`
--
ALTER TABLE `driver`
  ADD PRIMARY KEY (`driver_id`);

--
-- Indici per le tabelle `guide`
--
ALTER TABLE `guide`
  ADD PRIMARY KEY (`guide_id`);

--
-- Indici per le tabelle `guide_association`
--
ALTER TABLE `guide_association`
  ADD PRIMARY KEY (`guide_association_id`);

--
-- Indici per le tabelle `instructor`
--
ALTER TABLE `instructor`
  ADD PRIMARY KEY (`instructor_id`);

--
-- Indici per le tabelle `notification`
--
ALTER TABLE `notification`
  ADD PRIMARY KEY (`notification_id`);

--
-- Indici per le tabelle `review`
--
ALTER TABLE `review`
  ADD PRIMARY KEY (`review_id`);

--
-- Indici per le tabelle `shared`
--
ALTER TABLE `shared`
  ADD PRIMARY KEY (`shared_id`);

--
-- Indici per le tabelle `step`
--
ALTER TABLE `step`
  ADD PRIMARY KEY (`step_id`);

--
-- Indici per le tabelle `tag`
--
ALTER TABLE `tag`
  ADD PRIMARY KEY (`tag_id`);

--
-- Indici per le tabelle `toponym`
--
ALTER TABLE `toponym`
  ADD PRIMARY KEY (`toponym_id`);

--
-- Indici per le tabelle `tour`
--
ALTER TABLE `tour`
  ADD PRIMARY KEY (`tour_id`);

--
-- Indici per le tabelle `tourist`
--
ALTER TABLE `tourist`
  ADD PRIMARY KEY (`tourist_id`);

--
-- Indici per le tabelle `tourist_experience_invite_guest`
--
ALTER TABLE `tourist_experience_invite_guest`
  ADD PRIMARY KEY (`tourist_experience_invite_guest_id`);

--
-- Indici per le tabelle `tour_costs`
--
ALTER TABLE `tour_costs`
  ADD PRIMARY KEY (`tour_costs_id`);

--
-- Indici per le tabelle `training_course`
--
ALTER TABLE `training_course`
  ADD PRIMARY KEY (`training_course_id`);

--
-- Indici per le tabelle `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- Indici per le tabelle `vehicle`
--
ALTER TABLE `vehicle`
  ADD PRIMARY KEY (`vehicle_id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `administrator`
--
ALTER TABLE `administrator`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `booking`
--
ALTER TABLE `booking`
  MODIFY `booking_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `day`
--
ALTER TABLE `day`
  MODIFY `tour_day_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `discount`
--
ALTER TABLE `discount`
  MODIFY `discount_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `discount_request`
--
ALTER TABLE `discount_request`
  MODIFY `discount_request_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `driver`
--
ALTER TABLE `driver`
  MODIFY `driver_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `guide`
--
ALTER TABLE `guide`
  MODIFY `guide_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `guide_association`
--
ALTER TABLE `guide_association`
  MODIFY `guide_association_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `instructor`
--
ALTER TABLE `instructor`
  MODIFY `instructor_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `notification`
--
ALTER TABLE `notification`
  MODIFY `notification_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `review`
--
ALTER TABLE `review`
  MODIFY `review_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `shared`
--
ALTER TABLE `shared`
  MODIFY `shared_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `step`
--
ALTER TABLE `step`
  MODIFY `step_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `tag`
--
ALTER TABLE `tag`
  MODIFY `tag_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `toponym`
--
ALTER TABLE `toponym`
  MODIFY `toponym_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `tour`
--
ALTER TABLE `tour`
  MODIFY `tour_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT per la tabella `tourist`
--
ALTER TABLE `tourist`
  MODIFY `tourist_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `tourist_experience_invite_guest`
--
ALTER TABLE `tourist_experience_invite_guest`
  MODIFY `tourist_experience_invite_guest_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `tour_costs`
--
ALTER TABLE `tour_costs`
  MODIFY `tour_costs_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `training_course`
--
ALTER TABLE `training_course`
  MODIFY `training_course_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT per la tabella `vehicle`
--
ALTER TABLE `vehicle`
  MODIFY `vehicle_id` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
