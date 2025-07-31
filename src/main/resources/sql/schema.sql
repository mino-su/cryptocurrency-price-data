CREATE TABLE `crypto-automation`.`report_histories`
(
    `id`          int         NOT NULL,
    `market`      varchar(45) NOT NULL,
    `price`       varchar(45) NOT NULL,
    `reported_at` datetime    NOT NULL,
    PRIMARY KEY (`id`)
);

ALTER TABLE `crypto-automation`.`report_histories`
    CHANGE COLUMN `id` `id` INT NOT NULL AUTO_INCREMENT;