<?php

require 'Aluno.class.php';
$aluno = new Aluno();

$con = $aluno->conectar();

if( $con ){
    $al = $aluno->consultar("maria@gmail.com");
    if( !$al ){
    // cadastrar
    $aluno->cadastrar("maria@gmail.com", 54353,  "000.111.222-33" , "maria",);
    }else{
        echo"<script>alert('Esse aluno ja esta cadastrado!!')</script>";   
    }
}else{
    echo"<script>alert('Sem conexao com o banco. Tente mais tarde!')</script>";
}