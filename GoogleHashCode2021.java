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
	static ArrayList<Car> cars = new ArrayList<Car>();

	public static void main(String[] args) {

		Intersection intersections[];

		try {
			reader = new BufferedReader(new FileReader("input/a.txt"));
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

			for (int i = 0; i < numberOfCars; i++) {
				line = reader.readLine();
				splitline = line.split(" ");
				Car car = new Car();
				for (int j = 1; j <= Integer.parseInt(splitline[0]); j++) {
					car.path.add(splitline[j]);
				}
				cars.add(car);
			}

			while (cars.isEmpty()) {
				
			}

			for (int i = 0; i < cars.get(5).path.size(); i++) {
				System.out.println(cars.get(5).path.get(i));
			}

			


		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
