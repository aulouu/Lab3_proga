package Persons;

public class Owl extends Person{
    public Owl(String name){
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
        System.out.print(getName() + ", ");
    }
}
