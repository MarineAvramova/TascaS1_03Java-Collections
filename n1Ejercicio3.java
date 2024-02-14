
public class n1Ejercicio3 {

	public static void main(String[] args) {
		
		final  String filePath = "countries.txt";
		try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
		 CountriesHash countriesHash = new CountriesHash(filePath);
		    Interaction interaction = new Interaction(countriesHash);
		    interaction.startGame();
		}
}


