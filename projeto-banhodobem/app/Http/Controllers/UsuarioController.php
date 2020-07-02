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

    public function show($id){
        //echo $id;
        $usuario=$this->objUsuario->find($id);
        return view('show', compact('usuario'));
    }

}
