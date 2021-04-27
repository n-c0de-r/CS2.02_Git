import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Logic2 {

	public static void main(String args[]) {
		
	}
	
	public boolean evenlySpaced(int a, int b, int c) {
		int[] nums = {a, b, c};
		Arrays.sort(nums);
		
		int lowDiff = nums[1] - nums[0];
		int highDiff = nums[2] - nums[1];
		
		if(lowDiff != highDiff) {
			return false;
		}
		
		else return true;
		}
}