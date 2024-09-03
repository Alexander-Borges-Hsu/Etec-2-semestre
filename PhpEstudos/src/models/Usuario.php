<?php
    namespace APP\models;

    class Usuario{
        private $usuario;
        private $senha;

        public function __constructor($usuario, $senha){
            $this->$senha = $senha;
            $this->$usuario = $usuario;
        }


    }
?>