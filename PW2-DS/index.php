<?php

//importar a classe
require 'Usuario.class.php';

$sucesso = $usuario = new Usuario();

if ( $sucesso ){
    $ff = $usuario->chkUser("Mariaclara@gmail.com");

    if( $ff == 0 ){
        echo "<h1>Cadastrado com sucesso!";
    }else {
        echo "<h1>O usuario já exite.";
    }
}else{
    echo "<h1>Erro ao conectar ao banco";
}
echo"<h1>";
