package PandaStoryApp;/*
 * PRAKTIKUM 02 "IN234 Paradigma Pemrograman" - SOAL 2
 * Nama Program : PandaStoryApp.Turtle
 * Deskripsi    : Class dari karakter 'PandaStoryApp.Turtle', yang akan melakukan sparring dengan 'PandaStoryApp.Panda'.
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
*/

public class Turtle {
    private String name;

    public Turtle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sparring(Panda panda) {
        /* GET updated stats */
        String name = panda.getName();
        int strength = panda.getStrength();
        int agility = panda.getAgility();
        int energy = panda.getEnergy();

        /* Training or Sparring Session (updating stats) */
        System.out.printf("%nCome %s. I will show you the dragon scroll.", name);
        strength += 8;
        agility += 8;
        energy += 8;

        /* POST the new stats */
        panda.setStrength(strength);
        panda.setAgility(agility);
        panda.setEnergy(energy);
    }
}
