CREATE TABLE autores (
    id_autor INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE
);

insert into autores(nome, data_nascimento) values ("Machado de Assis", '1839-06-21'), ('Stephen King', '1947-09-21'), ('Júlio Verne', '1828-02-08');

CREATE TABLE livros (
    id_livro INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    ano_publicacao INT,
    id_autor INT,
    FOREIGN KEY (id_autor) REFERENCES autores(id_autor)
);

insert into livros(titulo, ano_publicacao, id_autor) values ("Memórias Póstumas de Brás Cubas", 1881, 1), ("It", 1986, 2), ("Vinte mil léguas submarinas", 1870, 3);

CREATE TABLE clientes (
    id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);

insert into clientes(nome, email) values("Carlos", "carlos22@gmail.com"), ("Alexander", "alexanderborgeshsu@gmail.com"), ("Berry", "berryalensupreme@gmailc.com"), ("Kaka", "kaka@gmail.com"), ("Diego", "diegosantos@gmail.com");

CREATE TABLE pedidos (
    id_pedido INT PRIMARY KEY AUTO_INCREMENT,
    data_pedido DATE NOT NULL,
    id_cliente INT,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
);

insert into pedidos(data_pedido, id_cliente) values("2025-02-06", 1), ("2025-02-13", 2), ("2023-04-10", 3), ("2025-02-03", 4), ("2025-02-14", 5);