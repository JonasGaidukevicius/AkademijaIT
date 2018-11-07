package lt.vtvpmc.ems.akademijait.autobusas;

public class Passenger {
    private String passengerType;
    private int busStopNumberGotOn;
    private int busStopNumberGotOff;

    //Constructor
    public Passenger (String passengerType, int busStopNumberGotOn, int busStopNumberGotOff){
        this.passengerType = passengerType;
        this.busStopNumberGotOn = busStopNumberGotOn;
        this.busStopNumberGotOff = busStopNumberGotOff;
    }

    //getters and setters
    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    public int getBusStopNumberGotOn() {
        return busStopNumberGotOn;
    }

    public void setBusStopNumberGotOn(int busStopNumberGotOn) {
        this.busStopNumberGotOn = busStopNumberGotOn;
    }

    public int getBusStopNumberGotOff() {
        return busStopNumberGotOff;
    }

    public void setBusStopNumberGotOff(int busStopNumberGotOff) {
        this.busStopNumberGotOff = busStopNumberGotOff;
    }

}
