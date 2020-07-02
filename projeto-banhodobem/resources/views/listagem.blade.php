
@extends('master.layout')

@section('content')


  <div class="text-center mt-3 mb-4">

    <h2>Listagem</h2>

  </div>

  <div class="col-8 m-auto">

    <table class="table text-center mt-3 mb-4">
        <thead class="thead-dark">
          <tr>
            <th scope="col">Id</th>
            <th scope="col">Nome</th>
            <th scope="col">Telefone</th>
            <th scope="col">Email</th>
            <th scope="col">Bairro</th>
            <th scope="col">Ação</th>
          </tr>
        </thead>
        <tbody>

        @foreach ($usuario as $usuarios)

            <tr>
              <th scope="row"> {{$usuarios->id}}</th>
              <td> {{$usuarios->nome}}</td>
              <td> {{$usuarios->telefone}}</td>
              <td> {{$usuarios->email}}</td>
              <td> {{$usuarios->bairro}}</td>
              <td> 
              <a href="{{url("listagem/$usuarios->id")}}">
                      <button class="btn btn-dark">Visualizar</button>
                </a>

                <a href="">
                  <button class="btn btn-primary">Editar</button>
                </a>

                <a href="">
                  <button class="btn btn-danger">Deletar</button>
            </a>
              </td>
            </tr>
        @endforeach  
      </table>
      
     

    </div>
  
@endsection
    
