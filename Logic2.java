import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Logic2 {

	public static void main(String args[]) {
	}
	
	public boolean evenlySpaced(int a, int b, int c) {
		return  Math.abs(a-b) == Math.abs(b-c) ||
				Math.abs(a-b) == Math.abs(a-c) ||
				Math.abs(b-c) == Math.abs(a-c);
		//Test cases return wrong... this method doesn't work right.
	}
}