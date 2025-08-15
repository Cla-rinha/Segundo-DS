<?php

require 'Aluno.class.php';
$aluno = new Aluno();

$con = $aluno->conectar();

if( $con ){
    $al = $aluno->consultar("email.com");
    if($al == 0){
    // cadastrar
    $aluno->cadastrar("email.com", 543534534,  00011122233 , "maria",);
    }
    else{
        echo"<script>alert('Esse aluno ja esta cadastrado!!')</script>";   
    }
}else{
    echo"<script>alert('Sem conexao com o banco. Tente mais tarde!')</script>";
}