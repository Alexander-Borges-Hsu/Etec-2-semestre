<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aprendendo php</title>

    <script src="./src/views/script.js"></script>
    <link rel="stylesheet" href="./src/views/style.css">

</head>
<body>
    <main>
        
    </main>
</body>
</html>
<?php
    include('./src/models/Pessoa.php');

    $pessoa1 = new Pessoa("João");
    var_dump($pessoa1->nome);
?>