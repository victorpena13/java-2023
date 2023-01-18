public class HelloWorld {
    public static void main(String[] args){

        System.out.println("Hello, World!");
        System.out.println("code inside of curly braces should be indented");
        System.out.println("with four spaces");

        // I am a single line comment
        /* i take up one line */
        /**
         * i take up
         * multiple
         * lines
         */

        int id;

        // byte 1 byte
        byte byteRangeFrom = -128;
        byte byteRangeTo = 127;
        // short 2 bytes
        short shortRangeFrom = -32768;
        short shortRangeTo = 32767;
        //int 4 bytes
        int intRangeFrom = -2147483648;
        int intRangeTo = 2147483647;
        //long 8 bytes
        long longRangeFrom = -9223372036854775;
        long longRangeTo = 9223372036854775807;
        // float - 4 bytes - single-precision, floating-point numbers from -3.4e38 to 3.4e38 with up to 7 signifigant digits.
        // double - 8 bytes - double-precision, floating-point numbers from -1.7e308 to 1.7e308 with up to 16 significant digits.
        // char - 2 bytes - a single unicode character that's stored in two bytes
        // boolean - 1 byte - a true or false value
        

        System.out.println("byte range from " + byteRangeFrom + " to " + byteRangeTo);
        System.out.println("short range from " + shortRangeFrom + " to " + shortRangeTo);
        System.out.println("int range from " + intRangeFrom + " to " + intRangeTo);
        System.out.println("long range from " + longRangeFrom + " to " + longRangeTo);

/* you can always assign a value of lesser precision to a type of greater precision, but
not the other way around.  for example, the value 128 could be a short
or an int, but not a byte.
 */

 // only single characters can be saved in single quotations
 // multiple characters can be saved in double qoutations

 final int SIDES_OF_A_DICE = 6;
 final String API_KEY = "b75b703d8195f6f433ca";
 final String GITHUB_API_BASE_URL = "https://api.github.com";

    }

}
