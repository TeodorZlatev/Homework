/*
SQLyog Community v12.2.1 (64 bit)
MySQL - 5.7.11-log : Database - forums
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`forums` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `forums`;

/*Table structure for table `forums` */

DROP TABLE IF EXISTS `forums`;

CREATE TABLE `forums` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `date_created` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `forums` */

insert  into `forums`(`id`,`title`,`date_created`) values 
(3,'cars','2016-04-24 13:21:58'),
(4,'books','2016-04-24 13:25:39'),
(5,'theatres','2016-04-24 20:30:28'),
(6,'sport','2016-04-24 20:30:36'),
(7,'clubs','2016-04-24 20:30:47'),
(8,'nature','2016-04-24 22:21:08'),
(9,'health','2016-04-24 22:35:04'),
(15,'animals','2016-04-27 00:47:26'),
(16,'museum','2016-04-27 13:42:36'),
(17,'accomodation','2016-04-27 14:49:06'),
(18,'university','2016-04-27 16:00:08'),
(19,'Easter','2016-04-27 16:19:25');

/*Table structure for table `replies` */

DROP TABLE IF EXISTS `replies`;

CREATE TABLE `replies` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `message` text NOT NULL,
  `date_created` datetime NOT NULL,
  `date_modified` datetime DEFAULT NULL,
  `topic_id` int(10) unsigned NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  KEY `topic_id` (`topic_id`),
  KEY `user_id` (`user_id`),
  KEY `id` (`id`),
  CONSTRAINT `replies_ibfk_1` FOREIGN KEY (`topic_id`) REFERENCES `topics` (`id`),
  CONSTRAINT `replies_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

/*Data for the table `replies` */

insert  into `replies`(`id`,`message`,`date_created`,`date_modified`,`topic_id`,`user_id`) values 
(1,'it\'s beautiful','2016-04-27 13:41:06',NULL,1,2),
(2,'avocado','2016-04-27 14:40:19',NULL,20,1),
(3,'grapes lemons','2016-04-27 14:47:13','2016-04-27 22:10:45',20,1),
(4,'Hala Madrid','2016-04-27 14:47:58',NULL,21,2),
(5,'boring','2016-04-27 14:56:03',NULL,7,1),
(6,'cool','2016-04-27 14:56:12',NULL,19,1),
(7,'so expensive','2016-04-27 14:56:27',NULL,22,1),
(8,'Miami Heat ','2016-04-27 15:00:37',NULL,23,1),
(9,'cardio','2016-04-27 15:01:13',NULL,24,1),
(10,'disgusting','2016-04-27 15:01:47',NULL,25,1),
(11,'ddsadsa','2016-04-27 15:53:11',NULL,20,2),
(12,'very good university ','2016-04-27 16:19:13','2016-04-27 22:04:33',28,1),
(14,'all season','2016-04-27 16:23:55',NULL,30,2),
(15,'japanese cars','2016-04-27 18:25:27',NULL,14,1),
(16,'boil 7 minutes','2016-04-27 18:26:10',NULL,31,2),
(17,'volks wagen','2016-04-27 19:56:27',NULL,1,4),
(18,'trash','2016-04-27 20:18:49',NULL,2,1),
(19,'it\'s not so expensive\r\n ','2016-04-27 21:48:51','2016-04-27 21:49:01',1,1),
(21,'it\'s \r\n  ','2016-04-27 22:03:58','2016-04-27 22:04:21',29,1),
(22,'japanese cheap cars ','2016-04-27 22:08:59','2016-04-27 22:09:27',32,1);

/*Table structure for table `topics` */

DROP TABLE IF EXISTS `topics`;

CREATE TABLE `topics` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `date_created` datetime NOT NULL,
  `date_modified` datetime DEFAULT NULL,
  `forum_id` int(10) unsigned NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `forum_id` (`forum_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `topics_ibfk_1` FOREIGN KEY (`forum_id`) REFERENCES `forums` (`id`),
  CONSTRAINT `topics_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

/*Data for the table `topics` */

insert  into `topics`(`id`,`title`,`date_created`,`date_modified`,`forum_id`,`user_id`) values 
(1,'golf','2016-04-25 14:04:40',NULL,3,1),
(2,'opel','2016-04-25 14:04:57',NULL,3,2),
(4,'bmw','2016-04-25 16:23:20',NULL,3,1),
(5,'harry potter','2016-04-26 17:38:55',NULL,4,1),
(6,'hell','2016-04-26 17:42:07',NULL,4,1),
(7,'war and peace','2016-04-26 17:49:24',NULL,4,1),
(12,'dogs','2016-04-27 00:47:38',NULL,15,1),
(13,'mercedes','2016-04-27 13:27:20',NULL,3,1),
(14,'lexus','2016-04-27 13:29:59',NULL,3,1),
(15,'Romeo and Juliet','2016-04-27 13:32:47',NULL,5,1),
(16,'Bacho Kiro cave','2016-04-27 13:39:58',NULL,8,2),
(17,'Uhluvica cave','2016-04-27 13:40:42',NULL,8,2),
(18,'National history museum','2016-04-27 13:43:53',NULL,16,2),
(19,'Il mondo','2016-04-27 13:56:29',NULL,7,1),
(20,'super foods','2016-04-27 14:31:59',NULL,9,2),
(21,'football','2016-04-27 14:47:43',NULL,6,2),
(22,'Bedroom','2016-04-27 14:56:20',NULL,7,1),
(23,'basketball','2016-04-27 15:00:29',NULL,6,1),
(24,'running','2016-04-27 15:00:58',NULL,9,1),
(25,'cats','2016-04-27 15:01:35',NULL,15,1),
(28,'TU-Sofia','2016-04-27 16:18:51',NULL,18,1),
(29,'vacation','2016-04-27 16:19:38',NULL,19,1),
(30,'is it hot there in winter?','2016-04-27 16:22:48',NULL,17,2),
(31,'eggs','2016-04-27 18:25:41',NULL,19,1),
(32,'toyota\r\n','2016-04-27 22:08:48',NULL,3,1);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(40) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `names` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `gender` enum('male','female') NOT NULL,
  `age` varchar(11) NOT NULL,
  `date_registered` datetime NOT NULL,
  `date_modified` datetime DEFAULT NULL,
  `current_status` enum('online','invisible') DEFAULT NULL,
  `registered_status` enum('new','activated') DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`password`,`names`,`email`,`gender`,`age`,`date_registered`,`date_modified`,`current_status`,`registered_status`) values 
(1,'tee0','841952','Teodor Zlatev','tee0@abv.bg','male','22','2016-04-22 17:05:38','2016-04-27 18:42:45','online','new'),
(2,'violina','123456','Violina Georgieva','violina@abv.bg','female','21','2016-04-23 18:00:52','2016-04-27 19:44:55','online','new'),
(4,'georgi','123456','Georgi Ivanov','georgi@gmail','male','42','2016-04-27 14:48:27','2016-04-27 19:58:50','online','new');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
