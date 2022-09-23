package school.lesson4.park_task7;

import java.util.ArrayList;

public class Park {
    private final String parkName;
    private final ArrayList<Attraction> attractions;

    public Park(String parkName, ArrayList<Attraction> attractions) {
        this.parkName = parkName;
        this.attractions = attractions;
    }

    public void printParkInfo() {
        System.out.println("Park name " + parkName + " imcludes following attractions:");
        for (Attraction attraction : attractions) {
            attraction.printAttractionInfo();
        }
    }

    public void addAttractionToPark(Attraction attraction) {
        attractions.add(attraction);
    }

    public boolean isParkContainsAttractionName(String attractionName) {
        for (Attraction attraction : attractions) {
            if (attraction.attractionName.equals(attractionName)) {
                return true;
            }
        }
        return false;
    }

    public Attraction getAttractionByName(String attractionName) {
        for (Attraction attraction : attractions) {
            if (attraction.attractionName.equals(attractionName)) {
                return attraction;
            }
        }
        return null;
    }

    public static class Attraction {
        private final String attractionName;
        private String openTime;
        private String closeTime;
        private int attractionPrice;

        public Attraction(String attractionName, String openTime, String closeTime, int attractionCost) {
            this.attractionName = attractionName;
            this.openTime = openTime;
            this.closeTime = closeTime;
            this.attractionPrice = attractionCost;
        }

        public void printAttractionInfo() {
            System.out.println(attractionName + " работает с " + openTime + " по " + closeTime
                    + ", стоимость " + attractionPrice);
        }

        public void changeWorkingHours(String openTime, String closeTime) {
            this.openTime = openTime;
            this.closeTime = closeTime;
            System.out.println("Время работы аттракциона " + this.attractionName + " изменено: с "
                    + this.openTime + " по " + closeTime);
        }

        public void changeAttractionPrice(int newPrice) {
            this.attractionPrice = newPrice;
            System.out.println("Новая цена аттракциона " + this.attractionName + " составляет  "
                    + this.attractionPrice);
        }
    }
}
