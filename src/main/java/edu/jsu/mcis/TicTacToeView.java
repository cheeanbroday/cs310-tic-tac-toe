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
		
		System.out.println("  012\n");
		System.out.println("0 " + model.getMark(0,0).toString() + model.getMark(0,1).toString() + model.getMark(0,2).toString());
		System.out.println("1 " + model.getMark(1,0).toString() + model.getMark(1,1).toString() + model.getMark(1,2).toString());
		System.out.println("2 " + model.getMark(2,0).toString() + model.getMark(2,1).toString() + model.getMark(2,2).toString());

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