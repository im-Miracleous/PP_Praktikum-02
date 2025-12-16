package PandaStoryApp;/*
 * PRAKTIKUM 02 "IN234 Paradigma Pemrograman" - SOAL 2
 * Nama Program : PandaStoryApp.Crane
 * Deskripsi    : Class dari karakter 'PandaStoryApp.Crane', yang akan melakukan sparring dengan 'PandaStoryApp.Panda'.
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
*/

public class Crane {
    private String name;

    public Crane(String name) {
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
        System.out.println("Ok. Let's begin the training.");
        strength += 3;
        energy += 11;

        /* POST the new stats */
        panda.setStrength(strength);
        panda.setAgility(agility);
        panda.setEnergy(energy);
    }
}
