import java.util.Scanner;
import java.util.Random;

public class riddleGuesser {

	riddles = new ArrayList();
	answers = new ArrayList();

	public static void main(string[], args){
		Scanner input = new Scanner(System.in);
		boolean keepGoing = true;

		while(keepGoing){
			system.out.println("--Riddle Guesser--");
			system.out.println();
			system.out.println("0) Exit");
			system.out.println("1) Play Riddle");
			system.out.println("2) Add Riddle");
			system.out.println("3) Edit Riddle");
			system.out.println("4) List Riddles");
			system.out.println();
			system.out.println("Your Choice: ");
			string response = input.nextLine();
			return response;
		} // end while
	} // end main

	public static void loadRiddles(){
		riddle.add(new Riddle("I have a tail, and I have a head, but I have no body. What am I?", "A Coin"));
		riddle.add(new Riddle("What is always coming, but never arrives?", "A Future"));
		riddle.add(new Riddle("What is full of holes but still holds water?", "A Sponge"));
	} // end constructor

	public static void playRiddle(){

		if (riddle.isEmpty()){
			system.out.println("No Riddles available");
			return;
		} // end if

		int random = int math.random() * riddles.size;
		Riddle currentRiddle = riddles.get(random);

		system.out.println("Heres a riddle: ");
		system.out.println();
		system.out.println("Your Answer: ");
		string userAnswer = scanner.nextLine();

		if (userAnswer.equals(currentRiddle.getAnswer())){
			system.out.println("You Guessed right!");
		} else {
			system.out.println("Sorry, not correct. The answer is: " + currentRiddle.getAnswer());
		} // end else
	} // end constructor

	public static void addRiddle(){
		system.out.println("-- Add a Riddle --");
		system.out.println();
		system.out.println("Enter your Riddle: ");
		string question = scanner.nextLine();
		system.out.println("Enter the Answer: ");
		string answer = scanner.nextLine();

		Riddle newRiddle = new Riddle(question, answer);
		riddles.add(newRiddle);
		system.out.println("Riddle Successfully added!");
	} // end constructor

	public static void listRiddle(){
		if (riddles.isEmpty()){
			system.out.println("No riddles have been added yet");
			return;
		} // end if

		system.out.println("-- Riddle List --");
		for (int i = 0; i < riddles.size(); i++) {
			system.out.println((i + 1) + ". " + riddles.get(i).getQuestion());
		} // end for
		system.out.println("---------------------");
	} // end constructor

	public static void editRiddle(){

		if (riddles.isEmpty()){
			system.out.println("No Riddles to edit. Please add some first.");
			return;
		} // end if

		listRiddles();
		System.out.println("What Riddle do you want to edit: ");
		int Edit = scanner.nextInt();
		scanner.nextLine();

		if (Edit >= 1 && Edit <= riddles.size()){
			Riddle riddleEdit = riddles.get(Edit - 1);
			system.out.println("Edit Riddle" + Edit + " ---");
			system.out.println("Current Question: " + riddleEdit.getQuestion());
			system.out.println("Enter a new Question (or press ENTER to keep current): ");
			string newQuestion = scanner.nextLine();
			if (newQuestion.isEmpty()) {
				riddleEdit.setQuestion(newQuestion);
			} // end if

			system.out.println("Riddle " + Edit + "Updated!");
		} else {
			system.out.println("Invalid");
		} // end else
	} // end constructor
} // end riddleGuesser

class Riddle {
	private string question;
	private string answer;

	public Riddle(string question, string answer){
		this.question = question;
		this.answer = answer;
	} // end constructor

	public string getQuestion() {
		return Question;
	} // end get Question

	public string getAnswer(){
		return answer;
	} // end get Answer

	public void setQuestion(string question) {
		this.question = question;
	} // end set question

	public void setAnswer(string answer){
		this.answer = answer;
	} // end set answer
} // end class 	





