package main.java;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private int baseExp;
    private int defence;
    private int attack;
    private String food;
    private String sound;
    private int special;
    private double accuracy;
    private String speech;

    public Pokemon() {
    }

    public Pokemon(String name,
                   int level,
                   int hp,
                   int baseExp,
                   int defence,
                   int attack,
                   String food,
                   String sound,
                   int special,
                   double accuracy) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.baseExp = baseExp;
        this.defence = defence;
        this.attack = attack;
        this.food = food;
        this.sound = sound;
        this.special = special;
        this.accuracy = accuracy;
    }

    public void eats() {
        System.out.println(this.getName() + " is eating " + this.getFood() + " sounds like " + this.getName() + " is really enjoying this! " + this.getSound() + "\n");
    }

    public abstract void speak(String speech);
}
