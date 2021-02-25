package classes;

import java.util.ArrayList;

public class Intersection {
    private int id;
    private String isGreen;

    public Intersection(int _id){
        id = _id;


    }
    public ArrayList<Street> inStreets = new ArrayList<Street>();
    public ArrayList<Street> outStreets = new ArrayList<Street>();
    

}
