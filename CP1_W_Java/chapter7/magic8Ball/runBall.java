package magic8Ball;

import java.io.FileNotFoundException;

public class runBall {

	public static void main(String[] args) throws FileNotFoundException {

		Ball ball = new Ball("H:\\Eclipse Workspace\\ProgrammingChallenges\\chapter7\\magic8Ball\\", 
							 "Responses.txt", 12);
		
		System.out.println(ball.getResponse());
	}

}
