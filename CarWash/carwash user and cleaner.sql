CREATE SCHEMA IF NOT EXISTS `carwash` DEFAULT CHARACTER SET utf8 ;
USE `carwash` ;

CREATE  TABLE IF NOT EXISTS `carwash`.`user_table` (
  `firstname` VARCHAR(45) NOT NULL ,
  `lastname` VARCHAR(45) NOT NULL ,
  `dateofbirth` VARCHAR(45) NOT NULL ,
  `gender` VARCHAR(45) NOT NULL ,
  `contact_number` VARCHAR(45) NOT NULL ,
  `address` VARCHAR(250) Not NULL, 
  `category` VARCHAR(45) NOT NULL ,
  `username` VARCHAR(45) NOT NULL ,
  `password` VARCHAR(45) NOT NULL ,
  `id` INT(11) NOT NULL AUTO_INCREMENT ,
  PRIMARY KEY (`id`) ,
  UNIQUE INDEX `contact_number_UNIQUE` (`contact_number` ASC) ,
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) )
ENGINE = InnoDB
AUTO_INCREMENT = 16
DEFAULT CHARACTER SET = utf8;

DROP TABLE IF EXISTS `carwash`.`cleaners` ;

CREATE  TABLE IF NOT EXISTS `carwash`.`cleaners` (
  `id` INT(11) NOT NULL AUTO_INCREMENT ,
  `shop_name` VARCHAR(45) NOT NULL ,
  `contact_number` BIGINT(20) NOT NULL ,
  `working_hours` VARCHAR(20) NOT NULL ,
  `available_services` VARCHAR(150) NOT NULL ,
  `user_id` INT(11) NULL DEFAULT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `fk_user_id` (`user_id` ASC) ,
  CONSTRAINT `user_id`
    FOREIGN KEY (`id` )
    REFERENCES `carwash`.`user_table` (`id` )
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;