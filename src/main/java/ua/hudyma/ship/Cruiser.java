package ua.hudyma.ship;

public class Cruiser extends Ship {
    public Cruiser() {
        super.quantityOfClass = 2;
        super.verticalAlignment = getRandomAlignment();
        super.shipLength = 3;
    }

    @Override
    public void randomizeLocation() {
    }
}
