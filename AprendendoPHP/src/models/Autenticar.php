<?php
    include('C:\Users\Admin\Etec-2-semestre\AprendendoPHP\vendor\autoload.php');
    
    use APP\models\Usuario;

    $nome = $_POST['nome']; 
    $senha = $_POST['senha'];

    $Usuario = new Usuario($nome, $senha);

    var_dump($Usuario);

    if($nome == "admin" && $senha == "admin123"){
        echo '<script>alert("Login com sucesso!")</script>';
    }else{
        echo '<script>alert("Login com falha")</script>';
    }

?>
