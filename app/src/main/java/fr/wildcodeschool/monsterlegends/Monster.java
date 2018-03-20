package fr.wildcodeschool.monsterlegends;

import android.os.Parcel;
import android.os.Parcelable;

public class Monster implements Parcelable {

    public static final Creator<Monster> CREATOR = new Creator<Monster>() {
        @Override
        public Monster createFromParcel(Parcel in) {
            return new Monster(in);
        }

        @Override
        public Monster[] newArray(int size) {
            return new Monster[size];
        }
    };
    /**
     * Un monstre est définit par son nom, son image,
     * ses stats (life, power, stamina, speed)
     */
    private String name;
    private int image0;
    private int image1;
    private int image4;
    private int image25;
    private int life0;
    private int power0;
    private int stamina;
    private int speed0;
    private int element1;
    private int element2;
    private int element3;

    /**
     * Constructeur d'un Monster qui a 2 éléments
     */

    public Monster(String name, int image0, int image1, int image4, int image25,
                   int power0, int life0, int speed0, int stamina,
                   int element1, int element3) {
        this.name = name;
        this.image0 = image0;
        this.image1 = image1;
        this.image4 = image4;
        this.image25 = image25;
        this.life0 = life0;
        this.power0 = power0;
        this.stamina = stamina;
        this.speed0 = speed0;
        this.element1 = element1;
        this.element3 = element3;
    }

    /**
     * Constructeur d'un Monster qui a 1 élément
     */

    public Monster(String name, int image0, int image1, int image4, int image25,
                   int power0, int life0, int speed0, int stamina,
                   int element2) {
        this.name = name;
        this.image0 = image0;
        this.image1 = image1;
        this.image4 = image4;
        this.image25 = image25;
        this.life0 = life0;
        this.power0 = power0;
        this.stamina = stamina;
        this.speed0 = speed0;
        this.element2 = element2;
    }

    protected Monster(Parcel in) {
        name = in.readString();
        image0 = in.readInt();
        image1 = in.readInt();
        image4 = in.readInt();
        image25 = in.readInt();
        life0 = in.readInt();
        power0 = in.readInt();
        stamina = in.readInt();
        speed0 = in.readInt();
        element1 = in.readInt();
        element2 = in.readInt();
        element3 = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(image0);
        dest.writeInt(image1);
        dest.writeInt(image4);
        dest.writeInt(image25);
        dest.writeInt(life0);
        dest.writeInt(power0);
        dest.writeInt(stamina);
        dest.writeInt(speed0);
        dest.writeInt(element1);
        dest.writeInt(element2);
        dest.writeInt(element3);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return name;
    }

    /**
     * Getters Avatar
     */

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

    /**
     * Getters Elements
     */

    public int getElement1() {
        return element1;
    }

    public int getElement2() {
        return element2;
    }

    public int getElement3() {
        return element3;
    }

    /**
     * Getters stats
     */

    public int getLife0() {
        return life0;
    }

    public int getPower0() {
        return power0;
    }

    public int getStamina() {
        return stamina;
    }


    public int getSpeed0() {
        return speed0;
    }

}
