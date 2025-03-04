package ua.hudyma.ship;

public class Frigate extends Ship {
    public Frigate() {
        super.quantityOfClass = 3;
        super.shipLength = 2;
        super.verticalAlignment = getRandomAlignment();
    }

    @Override
    void randomizeLocation() {

    }
}
