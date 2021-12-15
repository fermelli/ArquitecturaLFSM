<?php

use App\Http\Controllers\TareaController;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', [TareaController::class, 'index'])->name('index');
Route::get('/edit/{id}', [TareaController::class, 'edit'])->name('edit');
Route::put('/update/{id}', [TareaController::class, 'update'])->name('update');
