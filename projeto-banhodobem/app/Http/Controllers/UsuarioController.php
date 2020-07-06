<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\ModelUsuario;
use App\User;

class UsuarioController extends Controller
{
    
    private $objUser;
    private $objUsuario;

    public function __construct(){
        $this->objUser=new User();
        $this->objUsuario=new ModelUsuario();

    }

    public function index(){

        //dd($this->objUser->find(1)->relUsuarios);
        $usuario=$this->objUsuario->all()->sortBy('id');
        return view('listagem', compact('usuario'));
    }

    public function create(){

        $users=$this->objUser->all();

        return view('cadastro', compact('users'));
    }

    public function store(Request $request){
        $this->objUsuario->create([
            'nome'=>$request->nome,
            'date'=>$request->data_nasc,
            'aposentadoria'=>$request->aposentadoria,
            'estadocivi'=>$request->estado_civil,
            'temfilho'=>$request->tem_filho,
            'telefone'=>$request->telefone,
            'cidadenasc'=>$request->cidade_nasc,
            'falarcom'=>$request->responsavel_recado,
            'cidadenasc'=>$request->cidade_nasc,
            'cep'=>$request->cep,
            'rua'=>$request->rua,
            'bairro'=>$request->bairro,
            'cidade'=>$request->cidade,
            'estado'=>$request->estado,

        ]);
    }

    public function show($id){
        //echo $id;
        $usuario=$this->objUsuario->find($id);
        return view('show', compact('usuario'));
    }

}
