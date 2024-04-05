package main.java;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DualTypePokemon extends Pokemon{
    public Pokemon primaryType;
    public Pokemon secondaryType;
    public String speech;

    public DualTypePokemon(String name, int level, int hp, int baseExp, int defence, int attack, String food, String sound, int special, double accuracy, Pokemon primaryType, Pokemon secondaryType, String speech) {
        super(name, level, hp, baseExp, defence, attack, food, sound, special, accuracy);
        this.primaryType = primaryType;
        this.secondaryType = secondaryType;
        this.speech = speech;
    }

    public void speak() {
        System.out.printf("%s is telling a something %s %n", this.getName(), this.getSpeech());
    }

    public void speak(String speech, int volume) {
        if (volume > 5) {
            System.out.printf("%s is shouting loudly, %s!%n", this.getName(), speech);
        } else {
            System.out.printf("%s speaks softly, %s.%n", this.getName(), speech);
        }
    }

    @Override
    public void speak(String speech) {
        System.out.printf("%s is over exited and says loudly, %s %n", this.getName(), speech);
    }
}
