CREATE DATABASE `ssmbuild`;

USE `ssmbuild`;

DROP TABLE IF EXISTS `phone`;

CREATE TABLE `phone` (
`phoneID` INT(10) NOT NULL AUTO_INCREMENT COMMENT '手机id',
`phoneName` VARCHAR(100) NOT NULL COMMENT '手机名',
`phoneCounts` INT(11) NOT NULL COMMENT '数量',
`detail` VARCHAR(200) NOT NULL COMMENT '描述',
KEY `phoneID` (`phoneID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8

INSERT  INTO 
`phone`(`phoneID`,`phoneName`,`phoneCounts`,`detail`)VALUES
(1,'华为',1,'国产牛'),
(2,'小米',10,'国产好'),
(3,'苹果',5,'华而不实');