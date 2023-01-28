import java.util.Arrays;

public class ArraysLesson {

    //arrays - an object that contain zero or more items called elements.
    //       - array elements can be any valid type(including a custom class that i defined myself).
    //       - all elements must of the same type. 

    public static void main(String[] args) {
        // square brackes '[]' define arrays. 
        
        // variable named prices whose type is an array where each element is a double: 
        double[] prices;
        //arrays have a fixed length. // accessed with the '.length' property.
        // length must be defined when 
        prices = new double[4];

        // final int NUMBER_OF_BEATLES = 4;
        // BandMember[] theBeatles = new BandMember[NUMBER_OF_BEATLES];

        // int numberOfBugs = (int) Math.floor(Math.random() * 100);
        // Bug[] myCode = new Bug[numberOfBugs];

        // elements of an array are defined by their index.
        // their position in the array, starting at 0
        // elements that have not been intitialized will have that type's default value
        // integer number types = 0
        // decimal number types = 0.0
        // boolean = false
        // character = \0(zero)
        // object = null

        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;

        System.out.println(nums[0]); //1
        System.out.println(nums[1]); //2
        System.out.println(nums[2]); //0 - default value
        // System.out.println(nums[3]); // ArrayIndexOutOfBoundsException

        // array's size and elements can both be defined when it is created with 'array initalizer syntax'.

        //array initializer syntax:
        String[] beatles = {"john", "paul", "ringo"};

        System.out.println(beatles.length); //3
        System.out.println(beatles[0]); // john
        System.out.println(beatles[1]); // paul
        System.out.println(beatles[2]); // ringo

        // iterating: 

        String[] languages = {"html", "css", "javascript", "java"};
        String[] languagesTwo = {"html", "css", "javascript", "java"};
        // traditional for loop:
        for(int i=0; i < languages.length; i+=1) {
            System.out.println(languages[i]);
        }

        // 'for each' - for loop: 
        for(String language : languages) {
            System.out.println(language);
        }
        
        int[] numbers = {1,2,3,4,5};
        int[] numbersTwo = {1,2,3,4,5};
        for (int n: numbers) {
            System.out.println(n);
        }

        //java.util.Arrays - methods: 
        Arrays.fill(numbers, 1);
        for(int n: numbers) {
            System.out.println(n);
        }
        // result: 
        // 1
        // 1
        // 1
        System.out.println(Arrays.equals(languages, languagesTwo)); // true

        System.out.println(languages.length); // 4
        System.out.println(Arrays.copyOf(languages, 6));

        int[] original = new int[] {1,2,3};
        System.out.println("original array: ");
        for(int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }

        int[] copy = Arrays.copyOf(original, 5);
        System.out.println("\nNew array copy of original: ");
        for(int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }

        String test = Arrays.toString(numbers);
        System.out.println(test);
        
        // two-dimensional arrays: 
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };


        // access the first element in the second row
        System.out.println(matrix[1][0]); // 4
        // the last element in the first row
        System.out.println(matrix[0][2]); //3
        // the first element in the last row
        System.out.println(matrix[2][0]);

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");
        
            System.out.print("| ");
        
            for (int n : row) {
                System.out.print(n + " | ");
            }
        
            System.out.println();
        }
        
        System.out.println("+---+---+---+");
    }
}
