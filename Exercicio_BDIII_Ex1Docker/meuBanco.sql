CREATE TABLE autores (
    id_autor INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE
);

CREATE TABLE livros (
    id_livro INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    ano_publicacao INT,
    id_autor INT,
    FOREIGN KEY (id_autor) REFERENCES autores(id_autor)
);

CREATE TABLE clientes (
    id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);

CREATE TABLE pedidos (
    id_pedido INT PRIMARY KEY AUTO_INCREMENT,
    data_pedido DATE NOT NULL
);

CREATE TABLE compraAprovada(
    id_compra int primary key AUTO_INCREMENT,
    data_compra_aprovada date not null,
    id_cliente int,
    id_pedido int,
    FOREIGN key (id_cliente) REFERENCES clientes (id_cliente),
    FOREIGN key (id_pedido) REFERENCES pedidos (id_pedido)
);

insert into autores(nome, data_nascimento) values ("Machado de Assis", '1839-06-21'), ('Stephen King', '1947-09-21'), ('Júlio Verne', '1828-02-08');

insert into livros(titulo, ano_publicacao, id_autor) values ("Memórias Póstumas de Brás Cubas", 1881, 1), ("It", 1986, 2), ("Vinte mil léguas submarinas", 1870, 3);

insert into clientes(nome, email) values("Carlos", "carlos22@gmail.com"), ("Alexander", "alexanderborgeshsu@gmail.com"), ("Berry", "berryalensupreme@gmailc.com"), ("Kaka", "kaka@gmail.com"), ("Diego", "diegosantos@gmail.com");

insert into pedidos(data_pedido) values("2025-02-06"), ("2025-02-13"), ("2023-04-10"), ("2025-02-03"), ("2025-02-14");

insert into compraAprovada(data_compra_aprovada, id_cliente, id_pedido) values ("2025-02-17", 1, 1), ("2025-02-16", 2, 2), ("2025-02-15", 3, 3), ("2025-02-14", 4, 4), ("2025-02-13", 5, 5);