package ua.hudyma.ship;

import java.util.Random;

public abstract class Ship {
    protected int shipLength;

    public int getQuantityOfClass() {
        return quantityOfClass;
    }

    protected int quantityOfClass;
    protected boolean verticalAlignment;
    boolean getRandomAlignment (){
        return new Random().nextBoolean();
    }

    abstract void randomizeLocation();
}
