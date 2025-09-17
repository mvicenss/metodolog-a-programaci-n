
//ENCAPSULATION - Consists of hiding sensitive information from de user by restricting access to certain components/classes
//In this case, the attributes of the class Animal are private, so they cannot be change from other classes
//The only way to access or modify them is through the public methods (getters and setters) + Objects of the class Animal can be created using the constructor

public class Animal{
    private String name;
    private double weight;
    private int age;

    public Animal(String name, double weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public double getWeight(){
        return weight;
    }

    public int getAge(){
        return age;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "Name: " + name + ", Weight: " + weight + ", Age: " + age;
    }
}

//POLYMORPHISM - The ability of a method to do different things based on the object that it is acting upon
//In this case, the class Lion extends the class Animal, so it inherits all its attributes and methods
//Some methods are overridden to provide a different implementation for the class Lion (adjusting weight and age calculations)

class Lion extends Animal{
    public Lion(String name, double weight, int age){
        super(name, weight, age);
    }

@Override
    public int getAge(){
        return super.getAge() * 7; //Lions age 7 times faster than humans
    }

@Override
    public double getWeight(){
        return super.getWeight() * 1.2;
        } //Lions are 20% heavier than their actual weight

@Override
public void setWeight(double weight){
    super.setWeight(weight * 0.8); //Lions are 20% lighter than their actual weight
}

@Override
public void setAge(int age){
    super.setAge(age / 7); //Lions age 7 times faster than humans
}
}