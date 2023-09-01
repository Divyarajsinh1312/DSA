package Array;
/**
 * basic
 */
public class basic {
    public static void update(int num[]){
        for (int i = 0; i < num.length; i++) {
            num[i] = num[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = new int[50];
        int numbers[] = {1,2,3};
        update(numbers);
        System.out.println("Elements of Number array which is update by update function:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
    }
}