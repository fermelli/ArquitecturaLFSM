@extends('layouts.app')

@section('title', 'Lista de Tareas')

@section('content')
    <h1>Lista de tareas</h1>
    @if (count($tareas) != 0)
        <table class="table">
            <thead>
                <tr>
                    <th>Titulo</th>
                    <th>Tarea</th>
                    <th>Fecha inicio</th>
                    <th>Fecha conclusión</th>
                    <th>Estado</th>
                </tr>
            </thead>
            <tbody>
                @foreach ($tareas as $tarea)
                    <tr>
                        <td>{{ $tarea->titulo }}</td>
                        <td>{{ $tarea->tarea }}</td>
                        <td>{{ $tarea->fecha_inicio }}</td>
                        <td>{{ $tarea->fecha_conclusion }}</td>
                        <td>{{ $tarea->estado }}</td>
                        <td><a class="btn btn-success" href="{{ route('edit', ['id' => $tarea->id]) }}">Editar</a></td>
                    </tr>
                @endforeach
            </tbody>
        </table>
    @else
        <p>No hay tareas registradas</p>
    @endif
@endsection