import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] list, Person person){
        list = Arrays.copyOf(list, list.length+1);
        list[list.length-1] = person;
        return list;
    }
    

    public static void main(String[] args) {

        int[] numbers={1,2,3,4,5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        // why is 'Arrays.toString' necessary?
        // because they are reference types and java treats arrays as objects

        int[] numericals = new int[3];
        numericals[0] = 1;

        System.out.println(numbers[0]);

        Person[] people = new Person[3];

        people[0] = new Person("victor");
        people[1] = new Person("javier");
        people[2] = new Person("celeste");
        
        for(int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }
        Person[] updatedList;


        updatedList = addPerson(people, new Person("test"));

        for(int i = 0; i < updatedList.length; i++) {
            System.out.println(updatedList[i].getName());
        }













    
    }
}
