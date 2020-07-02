
@extends('master.layout')

@section('content')

    <h2>Visualizar</h2>

  <div class="col-8 m-auto">

    @php
        $user=$usuario->find($usuario->id)->relUsers;
    @endphp

    <br>
    Nome: {{$usuario->nome}}<br>
    Data de Nascimento: {{$usuario->data_nasc}}<br>
    Aposentado(a): {{$usuario->aposentadoria}}<br>
    Email: {{$usuario->email}}<br>
    Estado Civil: {{$usuario->estado_civil}}<br>
    Tem filho?: {{$usuario->tem_filho}}<br>
    Quantidade de Filho: {{$usuario->quant_filho}}<br>
    Cidade de Nascimento: {{$usuario->cidade_nasc}}<br>
    Telefone: {{$usuario->telefone}}<br>
    Deixar recado com: {{$usuario->responsavel_recado}}<br>
    <br>
    Estado: {{$usuario->estado}}<br>
    Cidade: {{$usuario->cidade}}<br>
    Cep: {{$usuario->cep}}<br>
    Bairro: {{$usuario->bairro}}<br>
    Rua: {{$usuario->rua}}<br>
    Numedo da Casa: {{$usuario->numeroCasa}}<br>
    <br>
    Palestra: {{$usuario->palestra}}<br>
    Artesanato: {{$usuario->artesanato}}<br>
    Outro Interesse: {{$usuario->outroInteresse}}<br>
    <br>
    
    Responsável pelo cadastro: {{$user->name}}<br>

   
     

    </div>
  
@endsection
    
