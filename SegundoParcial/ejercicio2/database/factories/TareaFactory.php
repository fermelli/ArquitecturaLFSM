<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;

class TareaFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array
     */
    public function definition()
    {
        return [
            'titulo'            => $this->faker->sentence(4),
            'tarea'             => $this->faker->text(100),
            'fecha_inicio'      => $this->faker->date(),
            'fecha_conclusion'  => $this->faker->date(),
            'estado'            => $this->faker->randomElement(['creada', 'en ejecucion', 'completada']),
        ];
    }
}
