# Spring_JPA_Rest_MySQL
Only testting Spring Boot<BR>
-- Dumping database structure for concretepage<BR>
CREATE DATABASE IF NOT EXISTS `concretepage`;<BR>
USE `concretepage`;<BR>
-- Dumping structure for table concretepage.articles<BR>
CREATE TABLE IF NOT EXISTS `articles` (<BR>
  `article_id` int(5) NOT NULL AUTO_INCREMENT,<BR>
  `title` varchar(200) NOT NULL,<BR>
  `category` varchar(100) NOT NULL,<BR>
  PRIMARY KEY (`article_id`)<BR>
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;<BR>
-- Dumping data for table concretepage.articles: ~3 rows (approximately)<BR>
INSERT INTO `articles` (`article_id`, `title`, `category`) VALUES<BR>
	(1, 'Java Concurrency', 'Java'),<BR>
	(2, 'Hibernate HQL ', 'Hibernate'),<BR>
	(3, 'Spring MVC with Hibernate', 'Spring'); <BR>
