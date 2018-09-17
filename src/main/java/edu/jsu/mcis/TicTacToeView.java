package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        /* INSERT YOUR CODE HERE */
		
		
		String topRow = "  ";
		for(int i = 0; i < model.getWidth(); i++){
			topRow += i;
		}
		System.out.println(topRow + "\n");
		
		String rows = "";
		for(int i = 0; i < model.getWidth(); i++){
			rows = rows + i + " ";
			for(int j = 0; j < model.getWidth(); j++){
				rows += model.getMark(i, j);
			}
			System.out.println(rows);
			rows = "";
		}
		
		
    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */
		
		if(model.isXTurn()){
			System.out.println("Player 1 (X) Move:");
		}
		else{
			System.out.println("Player 2 (O) Move:");
		}
		
		System.out.println("Enter the row and column numbers, separated by a space: ");
    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */
		System.out.println("Input Error!");

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}