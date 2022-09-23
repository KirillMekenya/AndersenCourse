package school.lesson4.park_task7;

import school.lesson4.park_task7.Park.Attraction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Park park = new Park("Energylandia", new ArrayList<>());

        String attractionName1 = "Crazy mountains";
        String attractionName2 = "Funny bunny";
        String attractionName3 = "Death eight";

        park.addAttractionToPark(new Attraction(attractionName1, "10:00",
                "18:00", 100));
        park.addAttractionToPark(new Attraction(attractionName2, "08:00",
                "16:00", 50));
        park.addAttractionToPark(new Attraction(attractionName3, "16:00",
                "22:00", 200));
        park.printParkInfo();
        System.out.println();

        if (park.isParkContainsAttractionName(attractionName1)) {
            park.getAttractionByName(attractionName1).changeWorkingHours("12:00", "17:00");
        } else {
            System.out.println("Такого аттракциона нет в парке");
        }

        if (park.isParkContainsAttractionName(attractionName2)) {
            park.getAttractionByName(attractionName2).changeAttractionPrice(70);
        } else {
            System.out.println("Такого аттракциона нет в парке");
        }

        if (park.isParkContainsAttractionName("Wet rings")) {
            park.getAttractionByName("Wet rings").printAttractionInfo();
        } else {
            System.out.println("Такого аттракциона нет в парке");
        }
        System.out.println();

        park.printParkInfo();
    }
}
