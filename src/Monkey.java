/*
 * PRAKTIKUM 02 "IN234 Paradigma Pemrograman" - SOAL 2
 * Nama Program : Monkey
 * Deskripsi    : Class dari karakter 'Monkey', yang akan melakukan sparring dengan 'Panda'.
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
*/

public class Monkey {
    private String name;

    public Monkey(String name) {
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
        System.out.printf("So %s. Let's get started", name);
        strength += 5;
        agility += 9;

        /* POST the new stats */
        panda.setStrength(strength);
        panda.setAgility(agility);
        panda.setEnergy(energy);
    }
}
