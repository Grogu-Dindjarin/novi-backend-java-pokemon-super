package main.java;

public class FirePokemon extends Pokemon {
    private int temperatureResistance;
    private String habitat;
    private int highAttack;
    private int specialAttack;
    private int lowDefense;
    private String[] weaknesses;
    private String[] resistances;
    private String[] fireMoves;
    private boolean strongOffensivePresence;
    private String preferredHabitat;


    public FirePokemon(String name, int level, int hp, int baseExp, int defence, int attack, String food, String sound, int special, double accuracy) {
        super(name, level, hp, baseExp, defence, attack, food, sound, special, accuracy);
        this.temperatureResistance = 200;
        this.habitat = "volcanic regions, deserts";
        this.highAttack = 80; // Default value for high attack
        this.specialAttack = 80; // Default value for special attack
        this.lowDefense = 60; // Default value for low defense
        this.weaknesses = new String[]{"Water", "Rock"}; // Default weaknesses
        this.resistances = new String[]{"Ice", "Bug", "Grass", "Steel"}; // Default resistances
        this.strongOffensivePresence = true; // Default value for offensive presence
        this.preferredHabitat = "Volcanic areas"; // Default preferred habitat
    }

    @Override
    public void speak(String speech) {
        System.out.printf("%s is very exited!, %s %n", this.getName(), speech);
    }

    public void ember() {
        System.out.println(this.getName() + "'s ember move is dealing damage and possible burned the target!!!\n");
    }

    public void fireFang() {
        System.out.println(this.getName() + " performing the Fire Fang move dealing burned damage and causing the target to flinch!!! \nSssssshhhh... CRACKLE! ROAR!\n");
    }
}
