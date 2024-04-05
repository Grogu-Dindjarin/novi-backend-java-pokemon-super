package main.java;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WaterPokemon extends Pokemon {
    private boolean canSwim;
    private int hydrationLevel;
    private String aquaticHabitat;
    private int waterResistance;
    private double evaporationRate;
    private double swimmingSpeed;
    private int temperatureSensitivity;
    private String habitatRequirements;

    public WaterPokemon(String name,
                        int level,
                        int hp,
                        int baseExp,
                        int defence,
                        int attack,
                        String food,
                        String sound,
                        int special,
                        double accuracy) {
        super(name, level, hp, baseExp, defence, attack, food, sound, special, accuracy);
        this.canSwim = true;
        this.hydrationLevel = 300;
        this.aquaticHabitat = "Lakes, rivers and ponds";
        this.waterResistance = 300;
        this.evaporationRate = 100.00;
        this.swimmingSpeed = 5.0;
        this.temperatureSensitivity = 10;
        this.habitatRequirements = "Fresh water";
    }

    @Override
    public void speak(String speech) {
        System.out.printf("apparently %s is speaking, %s", this.getName(), speech);
    }

    public void speak(String speech, int duration) {
        if (duration <= 5) {
            System.out.printf("%s is speaking shortly, %s %n", this.getName(), speech);
        }  else if (duration < 10) {
            System.out.printf("%s is explaining something important to the other Pokemon, %s %n", this.getName(), speech);
        } else {
            System.out.printf("%s is telling an exiting story and all the other pokemon are listening, %s %n", this.getName(), speech);
        }
    }

    public WaterPokemon(String name) {
        super.setName(name);
    }

    public void bubble() {
        System.out.println(this.getName() + " utilizes Bubble move to attack it's opponent! BUBBLE! BUBBLE! Swoosh! Pop! Swoosh!\n");
    }

    public void hydroCanon() {
        System.out.println(this.getName() + " is attacking with a Hydrocanon move! SPLASH!!! BLAST! BOOM!!!\n");
    }
}
