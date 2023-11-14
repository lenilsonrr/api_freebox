
create table lojistas (
    id bigint not null auto_increment,
    email varchar(155) not null unique,
    nome varchar(155) not null,
    telefone varchar(15)  not null,
    cnpj varchar(15) not null unique,
    senha varchar(25) not null,
    ativo tinyint not null,

    primary key(id)
);