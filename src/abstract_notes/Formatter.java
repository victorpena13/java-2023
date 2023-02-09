package abstract_notes;

interface Formatter {
    // an 'interface' is a special case of an abstract class.
// follows these rules:
// 1. all methods are public and abstract.
// 2. all properties are public static and final.
// 3. no static methods

// interfaces are used to define the behaviour of our objects, and 
// thus are typically only used to define methods.
// and, occasionally class constants (public static properties)
// interfaces allow us to define the way that our objects interact with the rest of our application.

   // the name of the interface usually contains information about what 
   // an object does, or is capable of doing.  
   // a class that implements an interface must provide an implementation for each method defined on the interface.
   // interfaces cannot be directly instantiated,
   // they can be used in most places a class is expected; for example,
   // the type of variable, or the type of a method parameter.  
   // allows our application to be less tightly coupled; 
   // we define the implementation of the code independent of where it is used. 
   // this allows us to easily swap out implementations for an interface 
   // as the business requirements of our application change. 

    String display(Employee e);
    
}
