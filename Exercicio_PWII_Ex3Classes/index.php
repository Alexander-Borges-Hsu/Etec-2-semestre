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
        <form action="./src/models/Autenticar.php" method="post">
            <p>Faça o Login</p>
            <label for="nome">Usuário: </label><input type="text" id="nome" name="nome"><br>
            <br>
            <label for="senha">Senha: </label><input type="password" id="senha" name="senha"><br>
            <br>
            <button type="submit">Enviar</button><button type="reset">Reiniciar</button>
        </form>
    </main>
</body>
</html>
