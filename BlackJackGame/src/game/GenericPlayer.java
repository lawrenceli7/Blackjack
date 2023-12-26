package game;

import java.util.Scanner;

abstract public class GenericPlayer extends Hand {
	
	protected String name;
	protected boolean isBusted = false;

	protected GenericPlayer(String name) {
		super();
		this.name = name;
	}

	public abstract boolean isHitting(Scanner s);

	public boolean isBusted() {
		return this.isBusted;
	}

	public void busted() {
		System.out.printf("%s Busted!%n", name);
		isBusted = true;
	}

	public void wins() {
		System.out.printf("%s: Wins!%n", name);
	}

	public void pushed() {
		System.out.printf("%s: Pushed!%n", name);
	}

	public void lose() {
		System.out.printf("%s: Lost!%n", name);
	}

	@Override
	public String toString() {
		return String.format("%s: %s", name, super.toString());
	}

}
