import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Pointboard {

	public static void savePoint(String name, int point) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("classificacio.txt", true))) {
            bw.write(name + " - " + point);
            bw.newLine();
           
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
