create table `cards`(
`card_id` int AUTO_INCREMENT PRIMARY KEY,
`customer_id` int NOT NULL,
`card_number` int NOT NULL,

`card_type` varchar(100)  NOT NULL,
`expire_date` date DEFAULT NULL
);

INSERT INTO `cards`(`card_id`,`customer_id` ,`card_number`,`card_type`,`expire_date`)
VALUES(1,987564,'debit card',CURDATE());

INSERT INTO `cards`(`card_id`,`customer_id` ,`card_number`,`card_type`,`expire_date`)
VALUES(2,987564,'DEBIT card',CURDATE());


INSERT INTO `cards`(`card_id`,`customer_id` ,`card_number`,`card_type`,`expire_date`)
VALUES(3,786542,'CREDIT card',CURDATE());


INSERT INTO `cards`(`card_id`,`customer_id` ,`card_number`,`card_type`,`expire_date`)
VALUES(2,86542,'CREDIT card',CURDATE());

INSERT INTO `cards`(`card_id`,`customer_id` ,`card_number`,`card_type`,`expire_date`)
VALUES(3,76542,'CREDIT card',CURDATE());


