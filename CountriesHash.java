import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class CountriesHash {
	
	 private HashMap<String, String> countries = new HashMap<>();
	 private  Random random = new Random();
	 
	 public  CountriesHash(String filePath) {
		 
	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            
	            while ((line = br.readLine()) != null) {
	                String[] parts = line.split(" ", 2);
	                if(parts.length ==2) {
	                	String country = parts[0].replace('_', ' ');
	                	
	                	String capital = parts[1].replace('_', ' ').replace("´", "").replace('-', ' ');
	                	countries.put(country, capital);
	                	
					}
	                
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public String getRandomCountry() {
	        Set<String> keys = countries.keySet();
	        Object[] countries = keys.toArray();
	       
	        int randomIndex = random.nextInt(countries.length);
	        String randomCountry = (String) countries[randomIndex];
	        return randomCountry;
	    }

	    
	    public String getCapital(String country) {
	        return countries.get(country).replace("_", " ");
	    }
	}

