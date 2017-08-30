package org.launchcode;

import org.launchcode.comparators.AreaComparator;
import org.launchcode.comparators.NameComparator;

import org.launchcode.comparators.PopulationComparator;
import org.launchcode.comparators.StateComparator;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.reverseOrder;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        NameComparator comparator = new NameComparator();
        cities.sort(comparator);
        printCities(cities);


        StateComparator stateCompare = new StateComparator();
        cities.sort(stateCompare);
        printCities(cities);


        PopulationComparator popCompare = new PopulationComparator();
        cities.sort(reverseOrder(popCompare));
        printCities(cities);

        AreaComparator areaCompare = new AreaComparator();
        cities.sort(reverseOrder(areaCompare));
        printCities(cities);


    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
