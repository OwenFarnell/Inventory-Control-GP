import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IVRunner {

	static Scanner file;
	
	public static void main(String[] args) throws IOException, FileNotFoundException
		{	
			file = new Scanner(new File("Items.txt"));
			Menu.startMenu();
		}
}
