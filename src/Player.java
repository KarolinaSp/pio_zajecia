import java.util.Random;

public class Player {

	private String name = "Player";

	public Player() {
	}

	public Player(String name) {
		this.setName(name);
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty()) { // !"".equals(name) &&
												// !name.isEmpty() for objects
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	private Random rand = new Random();

	public int guess() {
		int value = 0;

		value = rand.nextInt(6) + 1;

		return value;

	}
}
