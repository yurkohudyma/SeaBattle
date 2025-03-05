package ua.hudyma;

import ua.hudyma.grid.Grid;
import ua.hudyma.ship.Cater;
import ua.hudyma.ship.Frigate;
import ua.hudyma.ship.Ship;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static int shipsCounter = 4;
    static List<Ship> shipList = new ArrayList<>();
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        var grid = new Grid();



        allocateCaters();
        --shipsCounter;
        allocateFrigates();


        Grid.viewGridArray();
    }

    private static void allocateCaters() {
        for (int i = 0; i < shipsCounter; i++){
            var cater = new Cater();
            cater.randomizeLocation();
            shipList.add(cater);
        }
    }

    private static void allocateFrigates() {
        for (int i = 0; i < shipsCounter; i++) {
            var frigate = new Frigate();
            frigate.randomizeLocation();
            shipList.add(frigate);
        }
    }


}
