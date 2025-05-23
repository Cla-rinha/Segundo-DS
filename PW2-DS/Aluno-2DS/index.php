<?php
require 'Aluno.class.php';

$retorno = $aluno = new Aluno();
if( !$retorno){
    echo "<h1>Banco Indisponivel, tente mais tarde</h1>";
    exit;
}else{
    $aluno->setRa("1234");
    $aluno->setCurso("DS");
    $aluno->setNome("Maria Clara");
    $aluno->setPeriodo("Noturno");

    $nome = $aluno->getNome();
    $ra = $aluno->getRa();
    $curso = $aluno->getCurso();
    $periodo = $aluno->getPeriodo();


    echo "Aluno: $nome - RA: $ra - Curso: $curso - Periodo - $periodo";
    
}