

@extends('master.layout')
    @section('content')



      <h1 class="text-center">Cadastrar</h1><hr>


      <div class="col-8 m-auto">
      <form name="formCad" id="formCad" method="post" action="{{url('listagem')}}">
          @csrf
            <input class="form-control" type="text" id="nome" name="Nome" placeholder="Nome do integrante">
            <br>

            <input class="form-control" type="text" id="date" name="Data" placeholder="Data de Nascimento">
            <br>
            <input class="form-control" type="text" id="aposentadoria" name="Aposentadoria" placeholder="Aposentadoria">
            <br>
            <input class="form-control" type="text" id="estadocivil" name="Civil" placeholder="Estado Civil">
            <br>
            <input class="form-control" type="text" id="temfilho" name="filho" placeholder="Tem Filho">
            <br>
            <input class="form-control" type="text" id="telefone" name="telefone" placeholder="Telefone">
            <br>
            <input class="form-control" type="text" id="cidadenasc" name="nasccidade" placeholder="Cidade de Nascimento">
            <br>
            <input class="form-control" type="text" id="cep" name="cep" placeholder="Cep">
            <br>
            <input class="form-control" type="text" id="rua" name="rua" placeholder="Rua">
            <br>
            <input class="form-control" type="text" id="bairro" name="bairro" placeholder="Bairro">
            <br>
            <input class="form-control" type="text" id="cidade" name="cidade" placeholder="Cidade">
            <br>
            <input class="form-control" type="text" id="estado" name="estado" placeholder="Estado">
            <br>
            <input class="btn btn-primary" type="submit" value="Cadastrar">
          </form>



        </div>
        
        </body>
        </html>

    </div>


 

    @endsection

