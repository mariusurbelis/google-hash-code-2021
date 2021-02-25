package classes;

import java.util.Queue;

public class Street {
    public int startsAt, endsAt;
    public String streetName;
    public int L;
    public Queue<Car> cQueue;
    public TrafficLights trafficLight;
    
    public Street(int _startsAt, int _endsAt, String _name, int _L){
        startsAt = _startsAt;
        endsAt = _endsAt;
        streetName = _name;
        L = _L;
    }
}
