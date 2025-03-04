package ua.hudyma.ship;

public class Carrier extends Ship {
    public Carrier() {
        super.shipLength = 4;
        super.verticalAlignment = getRandomAlignment();
        super.quantityOfClass = 1;
    }

    @Override
    void randomizeLocation() {

    }
}
