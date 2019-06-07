import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("Size should not exceed 20");
        }while (size > 10);

        array = new int[size];
        int i = 0;
        while (i<array.length){
            System.out.println("Enter element" + (i+1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Property list: ");
        for (int j=0;j<array.length;j++){
            System.out.println(array[j] + "\t");
        }
        int min = array[0];
        int index = 1;
        for(int j=0;j<array.length;j++){
            if(array[i]<min){
                min = array[i];
                index = j+1;
            }
        }
        System.out.println("The minimum property value in the list is " + min + " ,at position " + index);
    }
}