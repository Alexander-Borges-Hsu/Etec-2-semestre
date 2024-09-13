<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tela de Login</title>

    <link rel="stylesheet" href="./src/views/style.css">
    <script src="./src/views/script.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

    
</head>
<body>
    <main>
        <h2>Login</h2>
        <div id="CaixaLogin">
            <p>Informe seus dados para <br> para efetuar o login</p>
            <form action="./src/models/Autenticar.php" method="post">
                <label for="usuario">Usuário: </label><input type="text" placeholder= "Usuário"><br><br>
                <label for="senha">Senha: </label><input type="password" placeholder= "Senha"><br><br>

                <button type="submit">Logar</button>
            </form>
        </div>
    </main>
</body>
</html>