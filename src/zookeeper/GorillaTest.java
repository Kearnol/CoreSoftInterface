package zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla g = new Gorilla();
		g.throwSomething("rock").throwSomething("coconut").throwSomething("pebble");
		g.eatBananas().eatBananas();
		g.climb();
	}

}
