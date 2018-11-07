package lt.vtvpmc.ems.akademijait.autobusas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bus {
    private static final int SEATS_NUMBER = 20;
    private static final int BUS_STOPS = 10;
    List<Passenger> numberOfPassengers = new ArrayList<>();
    private int currentFreeSeats;

    //Constructor
    public Bus(){
        this.currentFreeSeats = SEATS_NUMBER;
    }





    public void goingItinerary(){
        Random rand = new Random();
        //paleidziu autobusa i marsruta
        for(int busStop = 1; busStop <= BUS_STOPS; busStop++){
            System.out.println("Dabar stotele - " + busStop);
            //System.out.println("Laisvu vietu iki islipusiu keleiviu " + this.currentFreeSeats);
            if(busStop == 10){
                this.currentFreeSeats = SEATS_NUMBER;
                System.out.println("Visi keleiviai islipo");
            } else {
                //is pradziu reikia patikrinti kiek keleiviu cia islipa
                if(busStop != 1){
                    int counter = 0;
                    for (Passenger checkingPassenger: this.numberOfPassengers) {
                        if(checkingPassenger.getBusStopNumberGotOff() == busStop){
                            this.currentFreeSeats++;
                            counter++;
                        }
                    }
                    System.out.println("Stoteleje islipo " + counter + " keleiviu.");
                }
                //System.out.println("Laisvu vietu po islipusiu keleiviu " + this.currentFreeSeats);

                //atsitiktiniu budu nustatau, kiek toje stoteleje yra laukianciu zmoniu
                int waitingPeople = rand.nextInt(10) + 1;
                int passengers;
                //ar laukianciu zmoniu yra daugiau nei laisvu vietu?
                if(waitingPeople > this.currentFreeSeats){
                    passengers = this.currentFreeSeats;
                } else {
                    passengers = waitingPeople;
                }
                System.out.println("Keleiviu skaicius - " + passengers);

                //Visiems keleiviams sukuriu objektus
                for(int i = 1; i <= passengers; i++){

                    int passengerTypeNumber = rand.nextInt(4) + 1;

                    String passengerType;
                    int busStopDestination = 0;
                    while (busStop >= busStopDestination){
                        busStopDestination = rand.nextInt(10) + 1;
                    }
                    

                    //System.out.println("Kurioje stoteleje islips " + busStopDestination);
                    switch (passengerTypeNumber){
                        case 1:
                            passengerType = "Moteris";
                            break;
                        case 2:
                            passengerType = "Vyras";
                            break;
                        case 3:
                            passengerType = "Vaikas";
                            break;
                        case 4:
                            passengerType = "Suo";
                            break;
                        default:
                            passengerType = "Karve";
                            break;
                    }
                    //System.out.println(passengerType);
                    this.numberOfPassengers.add(new Passenger(passengerType, i, busStopDestination));

                }
                //Minusuoju laisvas vietas pagal tai, kiek ilipo keleiviu
                this.currentFreeSeats -= passengers;
                System.out.println("Sulipus keleiviams, liko laisvu vietu - " + this.currentFreeSeats);
            }

        }
    }

    public int countNumberOfPassengers(){
        return this.numberOfPassengers.size();
    }

    public int calculateAverageOfTraveledBusStopsByOnePassenger(){
        int averageBusStopsTraveled;
        int busStopsTraveled = 0;
        for (Passenger checkingPassenger: this.numberOfPassengers) {
            busStopsTraveled += (checkingPassenger.getBusStopNumberGotOff() - checkingPassenger.getBusStopNumberGotOn());
        }
        averageBusStopsTraveled = busStopsTraveled / this.countNumberOfPassengers();

        return averageBusStopsTraveled;
    }


}
