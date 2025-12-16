/*
 * PRAKTIKUM 02 "IN234 Paradigma Pemrograman" - SOAL 2
 * Nama Program : PandaStory
 * Deskripsi    : Class yang akan menjalankan ekosistem program dari pelatihan Panda dan kawan-kawan hewannya.
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
*/

import java.util.Random;
import java.util.Scanner;


public class PandaStory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Panda panda = new Panda("Po");

        /* TRAINERS */
        Tiger tiger = new Tiger("Tigress");
        Grasshopper grasshopper = new Grasshopper("Mantis");
        Snake snake = new Snake("Viper");
        Monkey monkey = new Monkey("Monkey");
        Crane crane = new Crane("Crane");
        Turtle turtle = new Turtle("Turtle");

        System.out.println("Panda Current Stats:");
        System.out.printf("Strength: %d" + " | ", panda.getStrength());
        System.out.printf("Agility: %d" + " | ", panda.getAgility());
        System.out.printf("Energy: %d%n", panda.getEnergy());
        System.out.println();

        System.out.printf("Input days for %s to train: ", panda.getName());
        int days = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < days; i++) {
            Random rand = new Random();
            double dragonScroll = 0.1; // Probability of dragon scroll
            boolean noE;

            System.out.println("\nDay " + (i+1));
            do {
                System.out.println("1. Training with Tigress");
                System.out.println("2. Training with Mantis");
                System.out.println("3. Training with Viper");
                System.out.println("4. Training with Monkey");
                System.out.println("5. Training with Crane");
                System.out.print("Choose wisely: ");
                int choice = sc.nextInt();
                sc.nextLine();

                noE = true;

                switch (choice) {
                    case 1:
                        panda.training(tiger);
                        break;
                    case 2:
                        panda.training(grasshopper);
                        break;
                    case 3:
                        panda.training(snake);
                        break;
                    case 4:
                        panda.training(monkey);
                        break;
                    case 5:
                        panda.training(crane);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        noE = false;
                        break;
                }
            } while (!noE);

            if (rand.nextDouble() < dragonScroll) {
                panda.training(turtle);
            }
            System.out.println();
        }
        panda.showMyStatus();
    }
}
