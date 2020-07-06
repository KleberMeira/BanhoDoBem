<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

class ModelUsuario extends Model
{
    protected $table='usuario';
    protected $fillable=['nome', 'data_nasc', 'aposentadoria', 'estado_civil', 'tem_filho', 'telefone', 'cidade_nasc', 'responsavel_recado', 'cidade_nasc', 'responsavel_recado', 'cidade_nasc', 'cep', 'rua', 'bairro', 'cidade', 'estado'   ];

    public function relUsers(){
        return $this->hasOne('App\User','id', 'id_user');
    }
}

