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

    private int life;
    private int power;
    private int stamina;
    private int speed;
    private int element1;
    private int element2;
    private int element3;

    public Monster(String name, int image0, int image1, int image4, int image25, int life, int power, int stamina, int speed, int element1, int element3) {
        this.name = name;
        this.image0 = image0;
        this.image1 = image1;
        this.image4 = image4;
        this.image25 = image25;
        this.life = life;
        this.power = power;
        this.stamina = stamina;
        this.speed = speed;
        this.element1 = element1;
        this.element3 = element3;
    }

    public Monster(String name, int image0, int image1, int image4, int image25, int life, int power, int stamina, int speed, int element2) {
        this.name = name;
        this.image0 = image0;
        this.image1 = image1;
        this.image4 = image4;
        this.image25 = image25;
        this.life = life;
        this.power = power;
        this.stamina = stamina;
        this.speed = speed;
        this.element2 = element2;
    }

    public String getName() {
        return name;
    }

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

    public int getLife() {
        return life;
    }

    public int getPower() {
        return power;
    }

    public int getStamina() {
        return stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public int getElement1() {
        return element1;
    }

    public int getElement2() {
        return element2;
    }

    public int getElement3() {
        return element3;
    }
}