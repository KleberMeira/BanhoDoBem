<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

class ModelUsuario extends Model
{
    protected $table='usuario';

    public function relUsers(){
        return $this->hasOne('App\User','id', 'id_user');
    }
}

