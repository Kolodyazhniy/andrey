package com.company;



class Andrey {

    int sexuality = 0;
    int speed = 0;
    int strength = 1;

    void changeSexuality(int newValue) {
        sexuality = newValue;
    }

    void changeStrenght(int newValue) {
        strength = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void freeEn(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("Andrey sex:" +
                sexuality + " speed:" +
                speed + " power:" + strength);

    }
    interface AndreyStatus  {
        void moveSpeed (int newValue );
        void rapidPickUpMasterLvl (int incremet);
        void freeEnergy (int decrement);



    }
}

abstract class Andr implements Andrey.AndreyStatus {


}

class AndreyDemo {
    public static void main(String[] args) {

        // Create two different
        // objects
        Andrey fuckFatLady1 = new Andrey();
        Andrey trainsDumbbells2 = new Andrey();

        // Invoke methods

        fuckFatLady1.changeSexuality(50);
        fuckFatLady1.speedUp(10);
        fuckFatLady1.changeStrenght(2);
        fuckFatLady1.printStates();

        trainsDumbbells2.changeSexuality(50);
        trainsDumbbells2.speedUp(10);
        trainsDumbbells2.changeStrenght(2);
        trainsDumbbells2.changeSexuality(40);
        trainsDumbbells2.speedUp(10);
        trainsDumbbells2.changeStrenght(3);
        trainsDumbbells2.printStates();
    }
}