import java.util.Scanner;
import java.util.Random;

public class riddleGuesser {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
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
			String response = scanner.nextLine();
			return response;
		} // end while
	} // end main

	public static void loadRiddles(){
		
		Riddle.add(new Riddle("I have a tail, and I have a head, but I have no body. What am I?", "A Coin"));
		Riddle.add(new Riddle("What is always coming, but never arrives?", "A Future"));
		Riddle.add(new Riddle("What is full of holes but still holds water?", "A Sponge"));
	} // end constructor

	public void playRiddle(){
		Scanner scanner = new Scanner(System.in);
		if (Riddle.isEmpty()){
			System.out.println("No Riddles available");
			return;
		} // end if

		int random = Math.random() * Riddle.size;
		Riddle currentRiddle = Riddle.get(random);

		System.out.println("Heres a riddle: ");
		System.out.println();
		System.out.println("Your Answer: ");
		String userAnswer = scanner.nextLine();

		if (userAnswer.equals(currentRiddle.getAnswer())){
			System.out.println("You Guessed right!");
		} else {
			System.out.println("Sorry, not correct. The answer is: " + currentRiddle.getAnswer());
		} // end else
	} // end constructor
		

	public void addRiddle(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("-- Add a Riddle --");
		System.out.println();
		System.out.println("Enter your Riddle: ");
		String question = scanner.nextLine();
		System.out.println("Enter the Answer: ");
		String answer = scanner.nextLine();

		Riddle newRiddle = new Riddle(question, answer);
		Riddle.add(newRiddle);
		System.out.println("Riddle Successfully added!");
	} // end constructor

	public void listRiddle(){
		if (Riddle.isEmpty()){
			System.out.println("No riddles have been added yet");
			return;
		} // end if

		System.out.println("-- Riddle List --");
		for (int i = 0; i < Riddle.size(); i++) {
			System.out.println((i + 1) + ". " + Riddle.get(i).getQuestion());
		} // end for
		System.out.println("---------------------");
	} // end constructor

	public void editRiddle(){
	
		if (Riddle.isEmpty()){
			System.out.println("No Riddles to edit. Please add some first.");
			return;
		} // end if
		Scanner scanner = new Scanner(System.in);
		System.out.println("What Riddle do you want to edit: ");
		String edit = scanner.nextLine();
		int edit; 
		if (edit = 1 && edit <= Riddle.size()){
			Riddle riddleEdit = Riddle.get(edit - 1);
			System.out.println("Edit Riddle" + edit + " ---");
			System.out.println("Current Question: " + riddleEdit.getQuestion());
			System.out.println("Enter a new Question (or press ENTER to keep current): ");
			String newQuestion = scanner.nextLine();
			if (newQuestion.isEmpty()) {
				riddleEdit.setQuestion(newQuestion);
			} // end if

			System.out.println("Riddle " + edit + "Updated!");
		} else {
			System.out.println("Invalid");
		} // end else
	} // end constructor
} // end riddleGuesser

class Riddle {
	private String question;
	private String answer;

	public Riddle(String question, String answer){
		this.question = question;
		this.answer = answer;
	} // end constructor

	public String getQuestion(){
		return question;
	} // end get Question

	public String getAnswer(){
		return answer;
	} // end get Answer

	public void setQuestion(String question) {
		this.question = question;
	} // end set question

	public void setAnswer(String answer){
		this.answer = answer;
	} // end set answer
} // end class riddle





