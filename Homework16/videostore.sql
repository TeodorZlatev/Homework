/*
SQLyog Community v12.2.1 (64 bit)
MySQL - 5.7.11-log : Database - videostore
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`videostore` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `videostore`;

/*Table structure for table `clients` */

DROP TABLE IF EXISTS `clients`;

CREATE TABLE `clients` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT,
  `fullName` varchar(40) DEFAULT NULL,
  `filmsCounter` tinyint(10) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `clients` */

insert  into `clients`(`id`,`fullName`,`filmsCounter`) values 
(1,'Теодор Златев',0),
(2,'Георги Иванов',1),
(3,'Слави Трифонов',1),
(4,'Габриела Стоилова',0),
(5,'Албена Иванова',1);

/*Table structure for table `information` */

DROP TABLE IF EXISTS `information`;

CREATE TABLE `information` (
  `client_id` int(10) unsigned NOT NULL,
  `film_id` int(10) unsigned NOT NULL,
  `dateTaken` date DEFAULT NULL,
  `dateReturn` date DEFAULT NULL,
  KEY `film_id` (`film_id`),
  KEY `client_id` (`client_id`),
  CONSTRAINT `client_id` FOREIGN KEY (`client_id`) REFERENCES `clients` (`id`),
  CONSTRAINT `film_id` FOREIGN KEY (`film_id`) REFERENCES `videos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `information` */

insert  into `information`(`client_id`,`film_id`,`dateTaken`,`dateReturn`) values 
(3,3,'2016-04-16','2016-04-07'),
(5,4,'2016-04-16','2016-03-30'),
(2,2,'2016-04-16','2016-04-13');

/*Table structure for table `videos` */

DROP TABLE IF EXISTS `videos`;

CREATE TABLE `videos` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(40) DEFAULT NULL,
  `quantity` tinyint(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `videos` */

insert  into `videos`(`id`,`title`,`quantity`) values 
(1,'Титаник',3),
(2,'Изкуплението Шоушенк',2),
(3,'Хвани ме, ако можеш',4),
(4,'Спасителен отряд',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
