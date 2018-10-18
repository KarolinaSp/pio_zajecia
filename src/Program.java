import java.util.Random;

public class Program {
	public static void main(String[] args) {

		Random rand = new Random();

		int cube;
		Player player1 = new Player();

		player1.setName("");
		int guess;
		do {
			cube = rand.nextInt(6) + 1;
			guess = player1.guess();

			if (guess != cube)
				System.out.println(
						"Wrong " + player1.getName() + "! Value of Cube = " + cube + " and Your guess = " + guess);
			else
				System.out.println("\nWell done " + player1.getName() + "! You're right!");

		} while (guess != cube);
	}
}
