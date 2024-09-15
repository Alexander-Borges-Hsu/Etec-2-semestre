<?php

    include('../../vendor/autoload.php');

    use APP\models\Usuario;


    $usuarioNome = $_POST['usuario'];
    $usuarioSenha = $_POST['senha'];

    $NovoUsuario = new Usuario($usuarioNome, $usuarioSenha);

    var_dump($NovoUsuario);


?>