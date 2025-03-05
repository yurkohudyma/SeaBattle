package ua.hudyma.ship;

import java.util.Random;

import static ua.hudyma.grid.Grid.gridArray;
import static ua.hudyma.grid.Grid.size;

public class Frigate extends Ship {
    public Frigate() {
        super.quantityOfClass = 3;
        super.shipLength = 2;
        super.verticalAlignment = getRandomAlignment();
    }

    @Override
    public void randomizeLocation() {
        int[] coordArr = new int[quantityOfClass];
        int x = new Random().nextInt(size),
                y = new Random().nextInt(size);
        if (!verticalAlignment) {
            for (int i = 0; i < quantityOfClass; i++) {
                if (y + shipLength >= size ||
                        gridArray[x][y + i] != '.') {
                    randomizeLocation();
                }
                coordArr[i] = y;
            }
            checkShipForAdjacency(x, coordArr);
            for (int i = 0; i < quantityOfClass; i++) {
                gridArray[x][i] = 'X';
            }
        } else {
            for (int i = 0; i < quantityOfClass; i++) {
                if (x + shipLength >= size ||
                        gridArray[x + i][y] != '.') {
                    randomizeLocation();
                }
                coordArr[i] = x;
            }
            checkShipForAdjacency(y, coordArr);
            for (int i = 0; i < quantityOfClass; i++) {
                gridArray[i][y] = 'X';
            }
        }
    }

    private void checkShipForAdjacency(int var, int[] coordArr) {
        if (!verticalAlignment) {
            for (int j : coordArr) {
                if (gridArray[var][j] != '.') {
                    randomizeLocation(); //todo invokes SOF
                }
            }
        } else {
            for (int j : coordArr) {
                if (gridArray[j][var] != '.') {
                    randomizeLocation(); //todo invokes SOF
                }
            }

        }
    }
}





