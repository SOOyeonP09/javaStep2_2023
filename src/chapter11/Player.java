package chapter11;

public class Player {

	private PlayLevel level;

	public Player() {
		level = new BeginnerLevel();// PlayLevel level의new BeginnerLevel
		level.showLevelMessage();
	}

	public PlayLevel getlevel() {
		return level;
	}

	public void upgradeLevel(PlayLevel level) {
		this.level = level;
		level.showLevelMessage();

	}

	public void play(int count) {
		level.go(count);
	}
}
