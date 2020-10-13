import java.util.Scanner;
public class Larrie {
	public static String areYouLarrie(Beliefs b) {
		if(b.larryDated) {
			if(b.larryStillTogether) {
				if(b.stuntsReal) {
					if(b.babyGate) {
						if(b.haveCheated) {
							return "You are a Larrie.";
						}
						else {
							return "You are not a Larrie.";
						}
					}
					else {
						return "You are not a Larrie.";
					}
				}
				else {
					return "You are not a Larrie.";
				}
			}
			else {
				return "You are not a Larrie.";
			}
		}
		return "You are not a Larrie.";
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("True or False answers only.");
		System.out.println("Louis and Harry dated.");
		boolean dated = in.nextBoolean();
		System.out.println("Louis and Harry are still together.");
		boolean together = in.nextBoolean();
		System.out.println("None of the public relationships were real.");
		boolean relationships = in.nextBoolean();
		System.out.println("Louis is not a father.");
		boolean baby = in.nextBoolean();
		System.out.println("Louis and Harry have been faithful to each other.");
		boolean cheated = in.nextBoolean();
		Beliefs believes = new Beliefs(dated, together, relationships, baby, cheated);
		System.out.println("Are you a Larrie?");
		System.out.println(areYouLarrie(believes));
	}
}
