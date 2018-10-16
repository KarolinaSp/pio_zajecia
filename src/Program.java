import java.util.Random;

public class Program {
	public static void main(String[] args) {

		Random rand = new Random();

		int cube;
		Player player = new Player();

		player.setName("");
		int guess;
		do {
			cube = rand.nextInt(6) + 1;
			guess = player.guess();

			if (guess != cube)
				System.out.println(
						"Wrong " + player.getName() + "! Value of Cube = " + cube + " and Your guess = " + guess);
			else
				System.out.println("\nWell done " + player.getName() + "! You're right!");

		} while (guess != cube);
	}
}
