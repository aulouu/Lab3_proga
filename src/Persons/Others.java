package Persons;

public class Others extends Person{
    public Others(String name){
        super(name);
    }
    @Override
    public void getLocation(){
        super.getLocation();
    }
    @Override
    public void setLocation(boolean location){
        super.setLocation(location);
    }
    public void go(){
        System.out.print("а в самом конце, растянувшись длинной цепочкой, шли " + getName() + ".");
    }
}
