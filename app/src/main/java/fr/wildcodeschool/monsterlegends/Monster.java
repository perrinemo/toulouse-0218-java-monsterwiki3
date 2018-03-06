package fr.wildcodeschool.monsterlegends;

public class Monster {

    /** Un monstre est définit par son nom, son image,
     * ses stats (life, power, stamina, speed)
     */
    private String name;
    private int image;
    private int life;
    private int power;
    private int stamina;
    private int speed;
    private int element1;
    private int element2;

    /** Constructeur d'un monstre */

    public Monster(String name, int image, int life, int power, int stamine, int speed, int element1) {
        this.name = name;
        this.image = image;
        this.life = life;
        this.power = power;
        this.stamina = stamine;
        this.speed = speed;
        this.element1 = element1;
    }

    public Monster(String name, int image, int life, int power, int stamine, int speed, int element1, int element2) {
        this.name = name;
        this.image = image;
        this.life = life;
        this.power = power;
        this.stamina = stamine;
        this.speed = speed;
        this.element1 = element1;
        this.element2 = element2;
    }

    /** Setters */

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setElement1(int element1) {
        this.element1 = element1;
    }

    public void setElement2(int element2) {
        this.element2 = element2;
    }

    /** Méthodes permettant de définir les attributs d'un monstre */

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
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
}