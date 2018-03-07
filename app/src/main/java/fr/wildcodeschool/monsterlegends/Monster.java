package fr.wildcodeschool.monsterlegends;

public class Monster {

    /** Un monstre est définit par son nom, son image,
     * ses stats (life, power, stamina, speed)
     */
    private String name;
    private int image0;
    private int image1;
    private int image4;
    private int image25;

    private int life0;
    private int life1;
    private int life4;
    private int life25;

    private int power0;
    private int power1;
    private int power4;
    private int power25;

    private int stamina;

    private int speed0;
    private int speed1;
    private int speed4;
    private int speed25;

    private int element1;
    private int element2;
    private int element3;

    public Monster(String name, int image0, int image1, int image4, int image25,
                   int power0, int life0, int speed0, int stamina,
                   int power1, int life1, int speed1,
                   int power4, int life4, int speed4,
                   int power25, int life25, int speed25,
                   int element1, int element3) {
        this.name = name;
        this.image0 = image0;
        this.image1 = image1;
        this.image4 = image4;
        this.image25 = image25;
        this.life0 = life0;
        this.life1 = life1;
        this.life4 = life4;
        this.life25 = life25;
        this.power0 = power0;
        this.power1 = power1;
        this.power4 = power4;
        this.power25 = power25;
        this.stamina = stamina;
        this.speed0 = speed0;
        this.speed1 = speed1;
        this.speed4 = speed4;
        this.speed25 = speed25;
        this.element1 = element1;
        this.element3 = element3;
    }

    public Monster(String name, int image0, int image1, int image4, int image25,
                   int power0, int life0, int speed0, int stamina,
                   int power1, int life1, int speed1,
                   int power4, int life4, int speed4,
                   int power25, int life25, int speed25,
                   int element2) {
        this.name = name;
        this.image0 = image0;
        this.image1 = image1;
        this.image4 = image4;
        this.image25 = image25;
        this.life0 = life0;
        this.life1 = life1;
        this.life4 = life4;
        this.life25 = life25;
        this.power0 = power0;
        this.power1 = power1;
        this.power4 = power4;
        this.power25 = power25;
        this.stamina = stamina;
        this.speed0 = speed0;
        this.speed1 = speed1;
        this.speed4 = speed4;
        this.speed25 = speed25;
        this.element2 = element2;
    }

    public String getName() {
        return name;
    }

    /** Getters Avatar */

    public int getImage0() {
        return image0;
    }

    public int getImage1() {
        return image1;
    }

    public int getImage4() {
        return image4;
    }

    public int getImage25() {
        return image25;
    }

    /** Getters Elements */

    public int getElement1() {
        return element1;
    }

    public int getElement2() {
        return element2;
    }

    public int getElement3() {
        return element3;
    }

    /** Getters stats */

    public int getLife0() {
        return life0;
    }

    public int getLife1() {
        return life1;
    }

    public int getLife4() {
        return life4;
    }

    public int getLife25() {
        return life25;
    }

    public int getPower0() {
        return power0;
    }

    public int getPower1() {
        return power1;
    }

    public int getPower4() {
        return power4;
    }

    public int getPower25() {
        return power25;
    }

    public int getStamina() {
        return stamina;
    }


    public int getSpeed0() {
        return speed0;
    }

    public int getSpeed1() {
        return speed1;
    }

    public int getSpeed4() {
        return speed4;
    }

    public int getSpeed25() {
        return speed25;
    }
}
