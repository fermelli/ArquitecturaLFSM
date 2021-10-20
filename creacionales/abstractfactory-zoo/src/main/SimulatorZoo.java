package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import zoo.Cage;
import zoo.FactoryCreator;
import zoo.AbstractFactory;
import zoo.Animal;
import zoo.Zoo;

public class SimulatorZoo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Zoo zoo = Zoo.getInstance();
        zoo.setName("Zoolandia");
        zoo.setAddress("Av. Simon Bolivar # 1234");
        zoo.setPhone("64-12345");

        List<Cage> cages = new ArrayList<>();
        cages.add(new Cage(5, 5, 4));
        cages.add(new Cage(5, 5, 4));
        cages.add(new Cage(5, 5, 4));
        cages.add(new Cage(5, 5, 4));
        cages.add(new Cage(5, 4, 4));
        cages.add(new Cage(5, 4, 4));
        cages.add(new Cage(5, 6, 4));
        cages.add(new Cage(5, 6, 4));

        zoo.setCages(cages);
        int index;

        do {
            int i = 0;
            System.out.println("--- AGREGAR ANIMALES A LAS JAULAS ---");
            for (Cage cage : cages) {
                System.out.println((i + 1) + ".- " + cage.toString());
                i++;
            }
            System.out.println((cages.size() + 1) + ".- SALIR");

            System.out.print("Ingrese una opcion: ");
            index = Integer.parseInt(scanner.nextLine()) - 1;

            if (index == cages.size()) {
                System.out.println("Saliendo...");
            } else if (index + 1 > cages.size()) {
                System.out.println("¡Opcion no valida!");
            } else {
                System.out.println("\t--- AGREGAR ANIMAL ---");
                System.out.println("\t\t1. Mamifero");
                System.out.println("\t\t2. Ave");
                System.out.println("\t\t3. Pez");
                System.out.print("\tIngrese una opcion: ");

                int option = Integer.parseInt(scanner.nextLine());
                AbstractFactory factory = null;
                Animal animal = null;
                int type;

                switch (option) {
                    case 1:
                        factory = FactoryCreator.geFactory("Mammal");
                        System.out.println("\t--- AGREGAR MAMIFERO ---");
                        System.out.println("\t\t1. Leon");
                        System.out.println("\t\t2. Oso");
                        System.out.println("\t\t3. Mono");
                        System.out.print("\tIngrese una opcion: ");
                        type = Integer.parseInt(scanner.nextLine());

                        System.out.println("\t\tDATOS MAMIFERO");
                        System.out.print("\t\t\tNombre: ");
                        String name = scanner.nextLine();
                        System.out.print("\t\t\tTemperatura: ");
                        float temperature = Float.parseFloat(scanner.nextLine());
                        System.out.print("\t\t\tNumero de patas: ");
                        int numberOfLegs = Integer.parseInt(scanner.nextLine());
                        System.out.print("\t\t\tColor: ");
                        String color = scanner.nextLine();

                        if (type == 1) {
                            animal = factory.createMammal("Lion", name, temperature, numberOfLegs, color);
                        } else if (type == 2) {
                            animal = factory.createMammal("Bear", name, temperature, numberOfLegs, color);
                        } else if (type == 3) {
                            animal = factory.createMammal("Monkey", name, temperature, numberOfLegs, color);
                        } else {
                            animal = null;
                        }

                        break;
                    case 2:
                        factory = FactoryCreator.geFactory("Bird");
                        System.out.println("\t--- AGREGAR AVE ---");
                        System.out.println("\t\t1. Loro");
                        System.out.println("\t\t2. Aguila");
                        System.out.println("\t\t3. Condor");
                        System.out.print("\tIngrese una opcion: ");
                        type = Integer.parseInt(scanner.nextLine());

                        System.out.println("\t\tDATOS AVE");
                        System.out.print("\t\t\tNombre: ");
                        String nameBird = scanner.nextLine();
                        System.out.print("\t\t\tPeso: ");
                        float weight = Float.parseFloat(scanner.nextLine());
                        System.out.print("\t\t\tEnvergadura: ");
                        float wingspan = Integer.parseInt(scanner.nextLine());

                        if (type == 1) {
                            animal = factory.createBird("Parrot", nameBird, weight, wingspan);
                        } else if (type == 2) {
                            animal = factory.createBird("Eagle", nameBird, weight, wingspan);
                        } else if (type == 3) {
                            animal = factory.createBird("Condor", nameBird, weight, wingspan);
                        } else {
                            animal = null;
                        }

                        break;
                    case 3:
                        factory = FactoryCreator.geFactory("Fish");
                        System.out.println("\t--- AGREGAR PEZ ---");
                        System.out.println("\t\t1. Sabalo");
                        System.out.println("\t\t2. Pacu");
                        System.out.print("\tIngrese una opcion: ");
                        type = Integer.parseInt(scanner.nextLine());

                        System.out.println("\t\tDATOS PEZ");
                        System.out.print("\t\t\tNombre: ");
                        String nameFish = scanner.nextLine();
                        System.out.print("\t\t\tPeso: ");
                        float length = Float.parseFloat(scanner.nextLine());

                        if (type == 1) {
                            animal = factory.createFish("Shad", nameFish, length);
                        } else if (type == 2) {
                            animal = factory.createFish("Pacu", nameFish, length);
                        } else {
                            animal = null;
                        }
                        break;

                    default:
                        animal = null;
                        break;
                }

                if (animal != null) {
                    cages.get(index).setAnimal(animal);
                    System.out.println("ANIMAL AGREGADO");
                }
            }

            System.out.println("--- VER ZOOLOGICO ---");
            System.out.println(zoo.toString());
            System.out.println("Enter para continuar...");
            scanner.nextLine();
        } while (index != cages.size());

        scanner.close();

    }
}
