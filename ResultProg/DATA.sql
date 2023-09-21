-- Создание таблиц
CREATE DATABASE `Друзья_человека`;

USE `Друзья_человека`;

CREATE TABLE `Домашние_животные` (
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `имя` VARCHAR(255),
    `команды` VARCHAR(255),
    `дата_рождения` DATE
);

CREATE TABLE `Вьючные_животные` (
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `имя` VARCHAR(255),
    `команды` VARCHAR(255),
    `дата_рождения` DATE
);

-- Вставка данных для собаки
INSERT INTO `Домашние_животные` (`имя`, `команды`, `дата_рождения`) VALUES ('Барон', 'Сидеть, Лежать, Дай лапу', '2018-07-15');

-- Вставка данных для кошки
INSERT INTO `Домашние_животные` (`имя`, `команды`, `дата_рождения`) VALUES ('Мурка', 'Мурлыкать, Лазить', '2019-03-05');

-- Вставка данных для хомяка
INSERT INTO `Домашние_животные` (`имя`, `команды`, `дата_рождения`) VALUES ('Шарик', 'Крутить колесо', '2020-01-20');

-- Вставка данных для лошади
INSERT INTO `Вьючные_животные` (`имя`, `команды`, `дата_рождения`) VALUES ('Буран', 'Тянуть, Бегать', '2017-04-05');

-- Вставка данных для верблюда
INSERT INTO `Вьючные_животные` (`имя`, `команды`, `дата_рождения`) VALUES ('Сахар', 'Переносить грузы', '2018-02-12');

-- Вставка данных для осла
INSERT INTO `Вьючные_животные` (`имя`, `команды`, `дата_рождения`) VALUES ('Иван', 'Пахать, Тянуть', '2019-05-20');


-- Удалить верблюдов и объединить таблицы
DELETE FROM `Вьючные_животные` WHERE `имя` = 'верблюд';

INSERT INTO `Лошади_и_ослы` SELECT * FROM `Лошади` UNION SELECT * FROM `Ослы`;

-- Создание таблицы Молодые животные
CREATE TABLE `молодые_животные` AS
SELECT * FROM `Домашние_животные`
WHERE `дата_рождения` BETWEEN DATE_SUB(NOW(), INTERVAL 3 YEAR) AND DATE_SUB(NOW(), INTERVAL 1 YEAR);

ALTER TABLE `молодые_животные`
ADD COLUMN `возраст_в_месяцах` INT;
