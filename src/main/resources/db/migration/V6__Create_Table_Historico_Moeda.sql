create table `historico_moeda`(
	`id_Moeda` int primary key auto_increment,
    `nome` varchar(12) not null,
    `dt_mov_moeda` date not null,
    `pu_moeda` decimal(15,8) not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8;