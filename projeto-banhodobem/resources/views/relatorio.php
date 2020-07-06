
@extends('master.layout')

@section('content')


  <div class="text-center mt-3 mb-4">

    <h2>Listagem</h2>

  </div>
  <label>Data Nascimento: </label>
            <input type="date" id="datanasc" name="datanascimento" value="2017-06-01"> <br>
            <br>
            <label>Aposentadoria: </label>
            <form>
                <INPUT type="radio" name="sim" value="op1" > Sim
                <INPUT type="radio" name="nao" value="op2"> Não
            </form> 
            <br>
            <label>Estado Civil</label>
            <select id="estadocivil" name="estadocivil">
              <option value="solteiro">Solteiro(a)</option>
              <option value="casado">Casado(a)</option>
              <option value="divorciado">Divorciado(a)</option>
              <option value="viuvo">Viúvo(a)</option>
              <option value="separado">Separado(a) Judicialmente</option>
            </select>
            <br>
            <br>
            <label>Tem filho(s)?: </label>
            <form>
                <INPUT type="radio" name="sim" value="op1" > Sim
                <INPUT type="radio" name="nao" value="op2"> Não
            </form> 
            <br>
            <label>Telefone: </label>
            <input type="text" id="telefone" name="telefone" placeholder="Telefone">
            <br>
            <br>
            <label>Cidade Nascimento: </label>
            <input class="form-control" type="text" id="cidadenasc" name="cidadenasc" placeholder="Cidade de Nascimento">
            <br>
            <br>
            <label>Falar com: </label>
            <input type="text" id="falarcom" name="falarcom" placeholder="Com quem devo falar?">
            <br>
            <br>
            <h5>Moradia: </h4>
            <br>
            <label>Cep: </label>
            <input type="text" id="cep" name="cep" placeholder="Cep">
            <br>
            <br>
            <label>Avenida/Rua: </label>
            <input type="text" id="rua" name="rua" placeholder="Rua/Avenida">
            <br>
            <label>Bairro: </label>
            <input type="text" id="bairro" name="bairro" placeholder="Bairro">
            <br>
            <label>Cidade: </label>
            <input type="text" id="cidade" name="cidade" placeholder="Cidade">
            <br>
            <label>Estado: </label>
            <input type="text" id="estado" name="estado" placeholder="Estado">
            <br>

 
@endsection
    
