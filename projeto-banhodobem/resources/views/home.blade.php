@extends('layouts.app')

@section('content')
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-8">
            <div class="card">
                <div class="card-header">Dashboard</div>
                
                <div class="card-body">
                    @if (session('status'))
                        <div class="alert alert-success" role="alert">
                            {{ session('status') }}
                        </div>
                    @endif

                    
                    <div class="text-center mt-3 mb-4">
                        <a href="">
                            <button class="btn btn-success">Cadastrar Familia</button>
                    </div>

                    <div class="text-center mt-3 mb-4">
                        <a href="">
                            <button class="btn btn-success">Listar Familia</button>
                    </div>

                    <div class="text-center mt-3 mb-4">
                        <a href="">
                            <button class="btn btn-success">Gerar Relatório</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
@endsection
