import java.util.Scanner;
import java.util.Random;

public class riddleGuesser {
	
	List list = new ArrayList();

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean keepGoing = true;

		while(keepGoing){
			System.out.println("--Riddle Guesser--");
			System.out.println();
			System.out.println("0) Exit");
			System.out.println("1) Play Riddle");
			System.out.println("2) Add Riddle");
			System.out.println("3) Edit Riddle");
			System.out.println("4) List Riddles");
			System.out.println();
			System.out.println("Your Choice: ");
			String response = input.nextLine();
			return response;
		} // end while
	} // end main

	public static void loadRiddles(){
		Scanner input = new Scanner(System.in);
		Riddle.add(new Riddle("I have a tail, and I have a head, but I have no body. What am I?", "A Coin"));
		Riddle.add(new Riddle("What is always coming, but never arrives?", "A Future"));
		Riddle.add(new Riddle("What is full of holes but still holds water?", "A Sponge"));
	} // end constructor

	public void playRiddle(){

		if (Riddle.isEmpty()){
			System.out.println("No Riddles available");
			return;
		} // end if

		int random = Math.random() * Riddles.size;
		Riddle currentRiddle = Riddle.get(random);

		System.out.println("Heres a riddle: ");
		System.out.println();
		System.out.println("Your Answer: ");
		String userAnswer = Scanner.nextLine();

		if (userAnswer.equals(currentRiddle.getAnswer())){
			System.out.println("You Guessed right!");
		} else {
			System.out.println("Sorry, not correct. The answer is: " + currentRiddle.getAnswer());
		} // end else
	} // end constructor

	public void addRiddle(){
		System.out.println("-- Add a Riddle --");
		System.out.println();
		System.out.println("Enter your Riddle: ");
		String question = Scanner.nextLine();
		System.out.println("Enter the Answer: ");
		String answer = Scanner.nextLine();

		Riddle newRiddle = new Riddle(question, answer);
		Riddles.add(newRiddle);
		System.out.println("Riddle Successfully added!");
	} // end constructor

	public void listRiddle(){
		if (Riddles.isEmpty()){
			System.out.println("No riddles have been added yet");
			return;
		} // end if

		System.out.println("-- Riddle List --");
		for (int i = 0; i < Riddle.size(); i++) {
			System.out.println((i + 1) + ". " + Riddles.get(i).getQuestion());
		} // end for
		System.out.println("---------------------");
	} // end constructor

	public void editRiddle(){
	
		if (Riddles.isEmpty()){
			System.out.println("No Riddles to edit. Please add some first.");
			return;
		} // end if

		System.out.println("What Riddle do you want to edit: ");
		String Edit = Scanner.nextLine();

		if (Edit >= 1 && Edit <= Riddles.size()){
			Riddle riddleEdit = Riddle.get(Edit - 1);
			System.out.println("Edit Riddle" + Edit + " ---");
			System.out.println("Current Question: " + riddleEdit.getQuestion());
			System.out.println("Enter a new Question (or press ENTER to keep current): ");
			String newQuestion = Scanner.nextLine();
			if (newQuestion.isEmpty()) {
				riddleEdit.setQuestion(newQuestion);
			} // end if

			System.out.println("Riddle " + Edit + "Updated!");
		} else {
			System.out.println("Invalid");
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
		return question;
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
} // end class riddle





