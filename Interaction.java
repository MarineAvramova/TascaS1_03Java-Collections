import java.util.Scanner;

public class Interaction {

	private CountriesHash list;
	private int point;
	
	public Interaction(CountriesHash list) {
		this.list = list;
	}

	public CountriesHash getList() {
		return list;
	}

	public int getPoint() {
		return point;
	}

    public void setPoint(int point) {
		this.point = point;
	}
    
    public void startGame() {
    	Scanner sc = new Scanner(System.in);
    	String name;
    	
        System.out.println("Please enter your name:");
        name = sc.nextLine();
        
        for (int i = 0; i < 10; i++) {
            String country = list.getRandomCountry();
            System.out.println("What is the capital of " + country + "?");
            String userAnswer = sc.nextLine();
          
            if(	list.getCapital(country).equals(userAnswer)) {
                System.out.println("Correct answer!");
                point++;
                
            } else {
                System.out.println("Wrong answer!");
                System.out.println("The correct answer is: " + list.getCapital(country));
            }
            System.out.println();
        }
        
        System.out.println(name + ", your points is: " + point);
        Pointboard.savePoint(name, point);
        sc.close();
    }	
   
}


