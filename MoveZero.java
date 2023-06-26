import java.util.Scanner;

public class MoveZero {
    public void moveZeroes(int[] nums) {
        int nonZeroPointer = 0;
        
        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                int temp = nums[nonZeroPointer];
                nums[nonZeroPointer] = nums[current];
                nums[current] = temp;
                nonZeroPointer++;
            }
        }
        
        for (int i = nonZeroPointer; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        MoveZero solution = new MoveZero();
        solution.moveZeroes(nums);
        
        System.out.println("Modified array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
