create table cdt_produto (
    id      text primary key unique not null,
    nome    text not null,
    preco   float not null
);