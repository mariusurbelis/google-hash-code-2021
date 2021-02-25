import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class GoogleHashCode2021
{
	public static void main(String[] args) {
		BufferedReader reader;
        List<String> input;

        try{
            reader = new BufferedReader(new FileReader("input/a.txt"));
            input = new ArrayList<String>();

            String line = reader.readLine();

            while (line != null) {
                input.add(line);
                line = reader.readLine();
            }

            System.out.println(input);

        } catch (IOException e){
            e.printStackTrace();
        }
	}
}
