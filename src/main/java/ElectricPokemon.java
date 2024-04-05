package main.java;

public class ElectricPokemon extends Pokemon {
    private int voltageLevel;
    private int speed;
    private boolean canParalyze;
    private String[] weaknesses;
    private String[] resistances;
    private String[] electricMovesEffectiveAgainst;
    private String[] electricMovesNoEffect;
    private String[] electricMovesNotEffectiveAgainst;
    private int shockResistance;
    private int chargeCapacity;
    private boolean hasStaticAbility;

    public ElectricPokemon(String name, int level, int hp, int baseExp, int defence, int attack, String food, String sound, int special, double accuracy) {
        super(name, level, hp, baseExp, defence, attack, food, sound, special, accuracy);
        this.voltageLevel = 80;
        this.speed = 70;
        this.canParalyze = true;
        this.weaknesses = new String[]{"Ground"};
        this.resistances = new String[]{"Electric", "Flying", "Steel"};
        this.electricMovesEffectiveAgainst = new String[]{"Thunderbolt", "Spark", "Thunder"};
        this.electricMovesNotEffectiveAgainst = new String[]{"Electric", "Dragon", "Grass"};
        this.electricMovesNoEffect = new String[]{"Ground"};
        this.shockResistance = 50;
        this.chargeCapacity = 100;
        this.hasStaticAbility = true;
    }

    public int getVoltageLevel() {
        return voltageLevel;
    }

    public void setVoltageLevel(int voltageLevel) {
        this.voltageLevel = voltageLevel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isCanParalyze() {
        return canParalyze;
    }

    public void setCanParalyze(boolean canParalyze) {
        this.canParalyze = canParalyze;
    }

    public String[] getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(String[] weaknesses) {
        this.weaknesses = weaknesses;
    }

    public String[] getResistances() {
        return resistances;
    }

    public void setResistances(String[] resistances) {
        this.resistances = resistances;
    }

    public String[] getElectricMovesEffectiveAgainst() {
        return electricMovesEffectiveAgainst;
    }

    public void setElectricMovesEffectiveAgainst(String[] electricMovesEffectiveAgainst) {
        this.electricMovesEffectiveAgainst = electricMovesEffectiveAgainst;
    }

    public String[] getElectricMovesNoEffect() {
        return electricMovesNoEffect;
    }

    public void setElectricMovesNoEffect(String[] electricMovesNoEffect) {
        this.electricMovesNoEffect = electricMovesNoEffect;
    }

    public String[] getElectricMovesNotEffectiveAgainst() {
        return electricMovesNotEffectiveAgainst;
    }

    public void setElectricMovesNotEffectiveAgainst(String[] electricMovesNotEffectiveAgainst) {
        this.electricMovesNotEffectiveAgainst = electricMovesNotEffectiveAgainst;
    }

    public int getShockResistance() {
        return shockResistance;
    }

    public void setShockResistance(int shockResistance) {
        this.shockResistance = shockResistance;
    }

    public int getChargeCapacity() {
        return chargeCapacity;
    }

    public void setChargeCapacity(int chargeCapacity) {
        this.chargeCapacity = chargeCapacity;
    }

    public boolean isHasStaticAbility() {
        return hasStaticAbility;
    }

    public void setHasStaticAbility(boolean hasStaticAbility) {
        this.hasStaticAbility = hasStaticAbility;
    }

    public ElectricPokemon(String name, String speech) {
        super.setName(name);
    }

    @Override
    public void speak(String speech) {
        System.out.println(speech);
    }

    public void spark() {
        System.out.printf("%s unleashes Spark, crackling with energy, aiming to paralyze the target with a sharp ZAP." +
                " electrifying the air and leaving a TINGLING sensation with its %d%% chance to paralyze. %n", this.getName(), 30);
    }

    public void thunder() {
        System.out.printf("With a fierce roar %s summons lightning, " +
                "crackling and booming with the force of a thunderstorm," +
                " as it unleashes its electrifying Thunder move with a resounding CRACK!!! and BOOM!!! %n", this.getName());
    }

    public void thunderbolt() {
        System.out.printf("%s unleashes a Thunderbolt move, electrifying the air with a resounding CRACK upon impact paralyzing the target %n", this.getName());
    }
}
