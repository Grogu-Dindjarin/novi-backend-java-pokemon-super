package main.java;

public class GrassPokemon extends Pokemon {
    private boolean canPhotosynthesize;
    private int leafEnergy;
    private String habitat;
    private int defenseBonus;
    private double growthRate;
    private double rootStrength;
    private int temperatureTolerance;
    private String habitatPreferences;

    public GrassPokemon(String name, int level, int hp, int baseExp, int defence, int attack, String food, String sound, int special, double accuracy) {
        super(name, level, hp, baseExp, defence, attack, food, sound, special, accuracy);
        this.canPhotosynthesize = true;
        this.leafEnergy = 200;
        this.habitat = "Verdant forests, shaded woodlands, and lush meadows with ample sunlight";
        this.defenseBonus = 10;
        this.growthRate = 0.5;
        this.rootStrength = 50.0;
        this.temperatureTolerance = 70;
        this.habitatPreferences = "Grassy areas with moderate rainfall";
    }

    @Override
    public void speak(String speech) {
        System.out.printf("%s says %s %n",this.getName() , speech);
    }

    public GrassPokemon(String name) {
        super.setName(name);
    }

    public void razorLeaf() {
        System.out.println(this.getName() + "'s razorLeaf deals physical damage and increased critical hit ratio 1⁄8 !!! SHHhhhZzzz\n");
    }
}
