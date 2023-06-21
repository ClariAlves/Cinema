CREATE DATABASE cinema;

CREATE USER 'jhennyf'@'localhost' IDENTIFIED BY '123';
GRANT ALL PRIVILEGES ON *.* TO 'jhennyf'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;

USE cinema;

CREATE TABLE Cliente (
  cpf VARCHAR(11) PRIMARY KEY,
  senha VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  nome VARCHAR(255) NOT NULL,
  idade INT,
  celular VARCHAR(20)
);

CREATE TABLE Pagamento (
  id INT PRIMARY KEY AUTO_INCREMENT,
  numCartao VARCHAR(16) NOT NULL,
  cvv VARCHAR(4) NOT NULL,
  nomeCartao VARCHAR(255) NOT NULL,
  dataExp DATE NOT NULL,
  dataPag DATE NOT NULL,
  cpfCliente VARCHAR(11),
  FOREIGN KEY (cpfCliente) REFERENCES Cliente(cpf)
);

CREATE TABLE Filme (
  id INT PRIMARY KEY AUTO_INCREMENT,
  titulo VARCHAR(255) NOT NULL,
  linkImagem VARCHAR(255),
  sinopse TEXT,
  duracao INT,
  genero VARCHAR(255),
  classeIdade VARCHAR(10)
);

CREATE TABLE Sessao (
  id INT PRIMARY KEY AUTO_INCREMENT,
  horario TIME NOT NULL,
  tipo VARCHAR(255),
  data DATE,
  idFilme INT,
  FOREIGN KEY (idFilme) REFERENCES Filme(id)
);

CREATE TABLE Assento (
  nDoAssento INT PRIMARY KEY,
  status VARCHAR(20)
);

CREATE TABLE Reserva (
  id INT PRIMARY KEY AUTO_INCREMENT,
  cpfCliente VARCHAR(11),
  idSessao INT,
  nDoAssento INT,
  FOREIGN KEY (cpfCliente) REFERENCES Cliente(cpf),
  FOREIGN KEY (idSessao) REFERENCES Sessao(id),
  FOREIGN KEY (nDoAssento) REFERENCES Assento(nDoAssento)
);
