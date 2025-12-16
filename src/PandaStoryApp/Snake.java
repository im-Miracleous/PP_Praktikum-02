package PandaStoryApp;/*
 * PRAKTIKUM 02 "IN234 Paradigma Pemrograman" - SOAL 2
 * Nama Program : PandaStoryApp.Snake
 * Deskripsi    : Class dari karakter 'PandaStoryApp.Snake', yang akan melakukan sparring dengan 'PandaStoryApp.Panda'.
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
*/

public class Snake {
    private String name;

    public Snake(String name) {
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
        System.out.printf("Ok %s. Are you ready?", name);
        strength += 8;
        energy += 6 ;

        /* POST the new stats */
        panda.setStrength(strength);
        panda.setAgility(agility);
        panda.setEnergy(energy);
    }
}
