CREATE TABLE `tbl_student` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) NOT NULL,
  `BRANCH` varchar(255) NOT NULL,
  `PERCENTAGE` int(3) NOT NULL,
  `PHONE` int(10) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `tbl_student` (`ID`, `NAME`, `BRANCH`, `PERCENTAGE`, `PHONE`, `EMAIL`)
VALUES
    (1,'naruto','it',20,1211232,'naruto@test.com'),
    (2,'sasuke','dev',30,333,'sasuke@test.com'),
    (3,'sakura','dev',2,444,'sakura@test.com'),
    (4,'kakashi','dev',23,788,'kakashi@test.com'),
    (5,'neji','it',32,2423,'neji@test.com');