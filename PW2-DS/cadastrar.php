<?php
require "Usuario.class.php";

$connection = $usuario = new Usuario();

if ($connection) {
    echo "('Erro de conexão!')";
    exit();
}else{
    $user = $usuario->chkUser("maria@gmail.com");
    if( $user ){
        echo "Usuario já cadastrado! Faça o login";
    }else{
        $usuario->cadastrar("Maria", "maria@gmail.com", "12345");
    }
}
