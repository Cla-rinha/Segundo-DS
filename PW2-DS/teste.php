<?php
$nome  = $_POST['nome'];
$email = $_POST['email'];
$senha = $_POST['senha'];

require "Usuario.class.php";

$conecta = $usuario = new Usuario();

if ($conecta){

    $usuario -> cadastrar ($nome, $email, $senha);
}else {
    echo "<h1>Banco Indisponivel</h1>";
}