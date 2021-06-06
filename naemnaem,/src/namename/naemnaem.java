package namename;

public class naemnaem {
	public static void main(String[] args) {
	String[] users = new String[3];
	users[0] = "hansol";
	users[1] = "gkdkd";
	users[2] = "yunsu";
	System.out.println(users[0]);
	System.out.println(users.length);
	
	String[] name = new String[4];
	name[0] = "gksthf";
	System.out.println(name[0]);
	System.out.println(name.length);
	
	int[] scores = {10, 100, 1000};
	System.out.println(scores[0]);
	System.out.println(scores.length);
	for(int i=0; i<scores.length; i++){
		System.out.println(scores[i]+",");
	}
	String[][] user = {{"egoing","1111"}, 
			{"jinhyuck","2222"},
			{"hansol","3333"}};
	String inputId = args[0];
	String inputPass = args[1];
	
	boolean isLogined = false;
	for(int i=0; i< user.length; i++) {
		String[] current = user[i];
		if(current[0].equals(inputId) &&
		current[1].equals(inputPass)){
			isLogined = true;
			break;
		}
		System.out.println("Hi,");
		if(isLogined) {
			System.out.println("Master");
		} else {
			System.out.println("Who are you?");
		}
	}
	
}
}
