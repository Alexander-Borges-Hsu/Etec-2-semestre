<?php
    include('C:\Users\Admin\Etec-2-semestre\PhpEstudos\vendor\autoload.php');

    use APP\models\Usuario;

    $usuario = $_POST['usuario'];
    $senha = $_POST['senha'];

    $NovoUsuario = new Usuario($usuario, $senha);

?>