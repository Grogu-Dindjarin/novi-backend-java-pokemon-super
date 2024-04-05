package main.java;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PoisonPokemon extends Pokemon {
    private int poisonPower;
    private int venomLevel;
    private String[] resistances;
    private String[] weaknesses;
    private boolean canInflictStatus;

    public PoisonPokemon(String name, int level, int hp, int xp, int defence, int attack, String food, String sound, int special, double accuracy) {
        super(name, level, hp, xp, defence, attack, food, sound, special, accuracy);
        this.poisonPower = 20;
        this.venomLevel = 10;
        this.resistances = new String[]{"Grass", "Bug", "Poison", "Fighting"}; // Default resistances
        this.weaknesses = new String[]{"Ground", "Psychic"}; // Default weaknesses
        this.canInflictStatus = true;
    }

    @Override
    public void speak(String speech) {

    }

    public PoisonPokemon(String name) {
        super.setName(name);
    }

    public void acidSpray() {
        System.out.println(this.getName() + "'s Acid Spray is inflicting damage and lowers the target's Special Defense by two stages!!!\nSssssssssss... Pssshhh!\n");
    }
}
