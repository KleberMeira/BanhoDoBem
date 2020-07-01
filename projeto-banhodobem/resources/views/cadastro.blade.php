

@extends('master.layout')
    @section('content')

    <div class="text-center mt-3 mb-4">
            <button class="btn btn-success">Cadastrar</button>
    </div>

    <div class="col-8 m-auto">

        <!DOCTYPE html>
        <html>
        <style>
        input[type=text], select {
          width: 100%;
          padding: 12px 20px;
          margin: 8px 0;
          display: inline-block;
          border: 1px solid #ccc;
          border-radius: 4px;
          box-sizing: border-box;
        }
        
        input[type=submit] {
          width: 100%;
          background-color: #4CAF50;
          color: white;
          padding: 14px 20px;
          margin: 8px 0;
          border: none;
          border-radius: 4px;
          cursor: pointer;
        }
        
        input[type=submit]:hover {
          background-color: #45a049;
        }
        
        div {
          border-radius: 5px;
          background-color: #f2f2f2;
          padding: 20px;
        }
        </style>
        <body>
        
        <div style="text-align: center">
        <h3>Cadastro da Familia</h3>
        </div>
        <h5>Identificação: </h4>
        <div>
          <form action="/action_page.php">
            <label for="fname">Nome Completo: </label>
            <input type="text" id="fname" name="firstname" placeholder="Nome do integrante">
            <br>
            <br>
            <label for="lname">Data Nascimento: </label>
            <input type="date" id="date" name="lastname" value="2017-06-01"> <br>
            <br>
            <label for="lname">Aposentadoria: </label>
            <form>
                <INPUT type="radio" name="sim" value="op1" > Sim
                <INPUT type="radio" name="nao" value="op2"> Não
            </form> 
            <br>
            <label for="country">Estado Civil</label>
            <select id="country" name="country">
              <option value="australia">Solteiro(a)</option>
              <option value="canada">Casado(a)</option>
              <option value="usa">Divorciado(a)</option>
              <option value="usa">Viúvo(a)</option>
              <option value="usa">Separado(a) Judicialmente</option>
            </select>
            <br>
            <br>
            <label for="lname">Tem filho(s)?: </label>
            <form>
                <INPUT type="radio" name="sim" value="op1" > Sim
                <INPUT type="radio" name="nao" value="op2"> Não
            </form> 
            <br>
            <label for="lname">Telefone: </label>
            <input type="text" id="lname" name="lastname" placeholder="Telefone">
            <br>
            <br>
            <label for="country">Estado de Nascimento: </label>
            <select>
                <option value="">Selecione</option>
                <option value="AC">Acre</option>
                <option value="AL">Alagoas</option>
                <option value="AP">Amapá</option>
                <option value="AM">Amazonas</option>
                <option value="BA">Bahia</option>
                <option value="CE">Ceará</option>
                <option value="DF">Distrito Federal</option>
                <option value="ES">Espirito Santo</option>
                <option value="GO">Goiás</option>
                <option value="MA">Maranhão</option>
                <option value="MS">Mato Grosso do Sul</option>
                <option value="MT">Mato Grosso</option>
                <option value="MG">Minas Gerais</option>
                <option value="PA">Pará</option>
                <option value="PB">Paraíba</option>
                <option value="PR">Paraná</option>
                <option value="PE">Pernambuco</option>
                <option value="PI">Piauí</option>
                <option value="RJ">Rio de Janeiro</option>
                <option value="RN">Rio Grande do Norte</option>
                <option value="RS">Rio Grande do Sul</option>
                <option value="RO">Rondônia</option>
                <option value="RR">Roraima</option>
                <option value="SC">Santa Catarina</option>
                <option value="SP">São Paulo</option>
                <option value="SE">Sergipe</option>
                <option value="TO">Tocantins</option>
            </select>
            <br>
            <br>
            <label for="lname">Falar com: </label>
            <input type="text" id="lname" name="lastname" placeholder="Com quem devo falar?">
            <br>
            <br>
            <label for="country">Country</label>
            <select id="country" name="country">
              <option value="australia">Australia</option>
              <option value="canada">Canada</option>
              <option value="usa">USA</option>
            </select>
            <br>
            <br>
            <h5>Moradia: </h4>
            <br>
            <label for="fname">Cep: </label>
            <input type="text" id="fname" name="firstname" placeholder="Nome do integrante">
            <br>
            <br>
            <label for="fname">Rua: </label>
            <input type="text" id="fname" name="firstname" placeholder="Nome do integrante">
            <br>
            <label for="fname">Bairro: </label>
            <input type="text" id="fname" name="firstname" placeholder="Nome do integrante">
            <br>
            <label for="fname">Cidade: </label>
            <input type="text" id="fname" name="firstname" placeholder="Nome do integrante">
            <br>
            <label for="fname">Estado: </label>
            <input type="text" id="fname" name="firstname" placeholder="Nome do integrante">
            <br>

            <input type="submit" value="Cadastrar">
          </form>



        </div>
        
        </body>
        </html>

    </div>


 

    @endsection

