package lt.vtvpmc.ems.akademijait.autobusas;

public class Main {
    public static void main(String[] args) {
        Bus myBus = new Bus();
        myBus.goingItinerary();
        System.out.println("Buvo pervezta " + myBus.countNumberOfPassengers()+ " keleiviu");
        System.out.println("Vienas keleivis vidutiniskai vaziavo " + myBus.calculateAverageOfTraveledBusStopsByOnePassenger() + " stoteliu");

    }


}
