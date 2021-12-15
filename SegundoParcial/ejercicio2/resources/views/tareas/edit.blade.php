@extends('layouts.app')

@section('title', 'Editar tarea')

@section('content')
    <h1>Editar tarea</h1>
    @if (isset($tarea))
        <form class="form" action="{{ route('update', ['id' => $tarea->id]) }}" method="post">
            @csrf
            @method('put')
            <div class="form-group my-3">
                <label for="titulo">Titulo</label>
                <input class="form-control" type="text" name="titulo" id="titulo" placeholder="Titulo" value="{{ $tarea->titulo }}">
            </div>
            <div class="form-group my-3">
                <label for="tarea">Tarea</label>
                <textarea class="form-control" id="tarea" rows="3">{{ $tarea->tarea }}</textarea>
            </div>
            <div class="form-group my-3">
                <label for="fecha_inicio">Fecha inicio</label>
                <input class="form-control" type="date" name="fecha_inicio" id="fecha_inicio" placeholder="Fecha inicio" value="{{ $tarea->fecha_inicio }}">
            </div>
            <div class="form-group my-3">
                <label for="fecha_conclusion">Fecha conclusión</label>
                <input class="form-control" type="date" name="fecha_conclusion" id="fecha_conclusion" placeholder="Fecha conclusión" value="{{ $tarea->fecha_conclusion }}">
            </div>
            <div class="form-group my-3">
                <label for="estado">Estado</label>
                <select class="form-control" id="estado">
                  <option {{ $tarea->estado == 'creada' ? 'selected' : '' }} value="creada">Creada</option>
                  <option  {{ $tarea->estado == 'en ejecucion' ? 'selected' : '' }} value="en ejecucion">En ejecución</option>
                  <option {{ $tarea->estado == 'completada' ? 'selected' : '' }} value="completada">Completada</option>
                </select>
              </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    @else
        <p>No hay tarea con ese id</p>
    @endif
@endsection