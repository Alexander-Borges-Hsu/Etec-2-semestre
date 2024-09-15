<?php
    namespace APP\models;

    class Usuario{
        private $usuario;
        private $senha;

        public function __construct($usuario, $senha){
            $this->senha = $senha;
            $this->usuario = $usuario;
        }


    }
?>