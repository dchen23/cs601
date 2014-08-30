import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadText {
	public static void main(String[] args) throws IOException {
		String fileName = args[0];
		FileReader fr = new FileReader(fileName);
		BufferedReader reader = new BufferedReader(fr);
		String line = reader.readLine();
		while (line != null) {
			// Process line
			line = reader.readLine();
		}
	}
}
