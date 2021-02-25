import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import classes.*;

public class GoogleHashCode2021 {
	static BufferedReader reader;
	static List<String> input;
	static int simulationTime = 0;
	static int numberOfIntersections = 0;
	static int numberOfStreets = 0;
	static int numberOfCars = 0;
	static int ff = 0;

	public static void main(String[] args) {

		Intersection intersections[];

		try {
			reader = new BufferedReader(new FileReader("input/d.txt"));
			input = new ArrayList<String>();

			String line = reader.readLine();

			String splitline[] = line.split(" ");

			simulationTime = Integer.parseInt(splitline[0]);
			numberOfIntersections = Integer.parseInt(splitline[1]);
			numberOfStreets = Integer.parseInt(splitline[2]);
			numberOfCars = Integer.parseInt(splitline[3]);
			ff = Integer.parseInt(splitline[4]);

			intersections = new Intersection[numberOfIntersections];

			for (int i = 0; i < numberOfIntersections; i++) {
				intersections[i] = new Intersection(i);
			}

			for (int i = 0; i < numberOfStreets; i++) {
				line = reader.readLine();
				splitline = line.split(" ");

				int startingAt = Integer.parseInt(splitline[0]);
				int endingAt = Integer.parseInt(splitline[1]);
				String name = splitline[2];
				int length = Integer.parseInt(splitline[3]);

				Street street = new Street(startingAt, endingAt, name, length);

				intersections[startingAt].outStreets.add(street);
				intersections[endingAt].inStreets.add(street);
			}

			for (int i = 0; i < numberOfIntersections; i++) {
				if (intersections[i].inStreets.size() > 10) {
					System.out.println(intersections[i].inStreets.size());
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
