import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import classes.*;

import javax.sound.midi.SysexMessage;
public class GoogleHashCode2021
{
	public static void main(String[] args) {
		BufferedReader reader;
        List<String> input;
		int simTime = 0;
		int numOfInt = 0;
		int numOfStreet = 0;
		int numOfCars = 0;
		int ff = 0;

		Intersection intersections[];

        try{
            reader = new BufferedReader(new FileReader("input/d.txt"));
            input = new ArrayList<String>();

            String line = reader.readLine();

            //System.out.println(input);
			
			String splitline[] = line.split(" ");
			
			simTime = Integer.parseInt(splitline[0]);
			numOfInt = Integer.parseInt(splitline[1]);
			numOfStreet = Integer.parseInt(splitline[2]);
			numOfCars = Integer.parseInt(splitline[3]);
			ff = Integer.parseInt(splitline[4]);

			intersections = new Intersection[numOfInt];

			for (int i = 0; i < numOfInt; i++) {
				intersections[i] = new Intersection(i);
			}


			for (int i = 0; i < numOfStreet; i++) {
				line = reader.readLine();
				splitline = line.split(" ");
				

				
				int start = Integer.parseInt(splitline[0]);
				int end = Integer.parseInt(splitline[1]);
				
				Street street = new Street(start, end);
				
				intersections[start].outStreets.add(street);
				intersections[end].inStreets.add(street);
			}
			
			for (int i = 0; i < numOfInt; i++) {
				if (intersections[i].inStreets.size() > 10) {
					System.out.println(intersections[i].inStreets.size());	
				}
			}

        } catch (IOException e){
            e.printStackTrace();
        }
	}
}
