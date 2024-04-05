package main.java;

public class Main {
    public static void main(String[] args) {

        WaterPokemon squirtle = new WaterPokemon("Squirtle", 1, 44, 63, 65, 48, "lots and lots of of fish", "Squirtle...squirtle.", 50, 60);
        DualTypePokemon bulbasaur = new DualTypePokemon("Bulbasaur", 1, 45, 64 , 49, 49, "berries", "Bul..basaur...saur.", 50, 60, new GrassPokemon("Bulbasaur"), new PoisonPokemon("Bulbasaur"), "Bulba-saur! Bulba-saur-saur! Bulba-SAUUUR!" );
        GrassPokemon turtwig = new GrassPokemon("Turtwig", 1, 55, 64, 64, 68, "a variety of plants, leaves, grasses, fruits and berries", "Turtwig-gwig-gwig!", 50, 60);
        FirePokemon charmander = new FirePokemon("Charmander", 1, 55, 64, 64, 68, " a flame-grilled steak, savoring the fiery flavors with each bite.", "Charrrr! Char-char-mander!", 50, 100);
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 1, 35, 112, 40, 55, "lots of ketchup", "Pika pika!", 50, 100);

        squirtle.eats();
        squirtle.hydroCanon();
        squirtle.bubble();
        squirtle.speak("SQUIRTLE, Squirtle! Squirtle..", 1);
        squirtle.speak("SQUIRTLE, Squirtle! Squirtle, Squirtle...", 9);
        squirtle.speak("SQUIRTLE, Squirtle! Squirtle, Squirtle, squirtle squirtle. Squirtle, Squirtle! Squirtle!", 19);

        ((GrassPokemon)bulbasaur.primaryType).razorLeaf();
        ((PoisonPokemon)bulbasaur.secondaryType).acidSpray();
        bulbasaur.speak("Bulba-saur! Bulba-saur, bulba-saur-saur! Bulbasaur bulba-saur, saur bulbasaur. Saur bulba-saur, bulba-saur!");
        bulbasaur.speak("Bulba-saur...", 3);
        bulbasaur.eats();
        bulbasaur.speak();

        pikachu.setSpeech("Pika pika! Pikachu! Pika-chuuu! Pika-pi! Pikaaa!");
        System.out.println(pikachu.getSpeech());
        pikachu.eats();
        pikachu.speak("Pika pika! Pikachu!");
        pikachu.thunder();
        pikachu.spark();
        pikachu.thunderbolt();

        turtwig.eats();
        turtwig.razorLeaf();

        charmander.eats();
        charmander.ember();
        charmander.fireFang();

    }
}
