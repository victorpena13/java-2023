package abstract_notes;

//abstract class:
// serves as a superclass.
// cannot be directly instantiated.
// class is defined as abastract by using the 'abstract' keyword.
// abstract class is used to represent something that needs to be extended.

abstract class Employee {

    protected String name;
    protected String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // can define abstract methods:
    // no body. only provide information about the method name, return type, and parameters.
    // any class that inherits from an abstract class must define all abstract methods. or itself be abstract.  

    public abstract String work();

}


