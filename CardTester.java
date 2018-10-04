/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card a = new Card("king", "hearts", 13);
		System.out.println(a.suit());
		System.out.println(a.rank());
		System.out.println(a.pointValue());
		System.out.println(a.toString());
		Card b = new Card("ace", "spades", 1);
		System.out.println(b.suit());
		System.out.println(b.rank());
		System.out.println(b.pointValue());
		System.out.println(b.toString());
		Card c = new Card("ace", "spades", 1);
		System.out.println(a.matches(b));
		System.out.println(b.matches(c));

	}
}
