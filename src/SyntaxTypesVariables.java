public class SyntaxTypesVariables {
    public static void main(String[] args) {
        int myFavoriteNumber = 13; 
        System.out.println(myFavoriteNumber);

        String myString = "this is a string value";
        System.out.println(myString);
        // myString = 'a'; // mismatch: cannot convert from char to string. 
        myString = "a";
        System.out.println(myString);
        // myString = 3.14159; //mismatch: required string gave double
        float myNumber;
        // System.out.println(myNumber); // has not been intitialized.
        myNumber = 123L;
        myNumber = 123; 
        System.out.println(myNumber);
        myNumber = 3.14F;
        System.out.println(myNumber);

        int a = 5;
        System.out.println(a++);
        System.out.println(a);
        

        

    }
}
