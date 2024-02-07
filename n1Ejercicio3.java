
public class n1Ejercicio3 {

	public static void main(String[] args) {
		
		final  String filePath = "C:\\Users\\Marine\\Desktop\\Specialization\\countries.txt";
		 CountriesHash countriesHash = new CountriesHash(filePath);
		    Interaction interaction = new Interaction(countriesHash);
		    interaction.startGame();
		}
}


