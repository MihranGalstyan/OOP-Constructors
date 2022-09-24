/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Monster {
    int eyes;
    int legs;
    int arms;

    public Monster() {
        eyes = 2;
        legs = 2;
        arms = 2;
    }

    public Monster(final int eyes) {
        this.eyes = eyes;
        legs = 2;
        arms = 2;
    }

    public Monster(final int eyes, final int legs) {
        this.eyes = eyes;
        this.legs = legs;
        arms = 2;
    }

    public Monster(final int eyes, final int legs, final int arms) {
        this.eyes = eyes;
        this.legs = legs;
        this.arms = arms;
    }

    void voice() {
        System.out.println("Voice");
    }

    void voice(int i) {
//        for (int j = 1; j <= i; j++) {
//            System.out.print("Voice ");
//        }
        voice(i, "Voice ");
    }

    void voice(int i, String word) {
        for (int j = 1; j <= i; j++) {
            System.out.print(word + " ");
        }
    }
}
