package ua.hudyma;

import ua.hudyma.grid.Grid;
import ua.hudyma.ship.Cater;
import ua.hudyma.ship.Ship;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var grid = new Grid();
        List<Ship> shipList= new ArrayList<>();

        for (int i = 0; i < 4; i++){
            var cater = new Cater();
            cater.randomizeLocation();
            shipList.add(cater);
        }


        Grid.viewGridArray();
    }
}
