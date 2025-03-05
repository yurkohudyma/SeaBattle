package ua.hudyma.ship;

import ua.hudyma.grid.Grid;

import java.util.Random;

import static ua.hudyma.grid.Grid.gridArray;

public class Cater extends Ship {
    public Cater() {
        super.quantityOfClass = 4;
        super.shipLength = 1;
    }

    @Override
    public void randomizeLocation() {
        int x = new Random().nextInt(Grid.size);
        int y = new Random().nextInt(Grid.size);
        if (gridArray[x][y] != '.') {
            randomizeLocation();
        }
        gridArray[x][y] = 'X';
    }

    int getRandomSlot (){
        return new Random().nextInt(Grid.size);
    }
}
