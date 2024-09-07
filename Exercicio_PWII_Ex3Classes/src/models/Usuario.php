<?php
    namespace APP\models;

    class Usuario{
        private $nome;
        private $senha;

        public function __construct($nome, $senha){
            $this->nome = $_POST['nome'];
            $this->senha = $_POST['senha'];
        }
    }
    

    
?>