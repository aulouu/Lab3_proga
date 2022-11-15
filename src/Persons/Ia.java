package Persons;

public class Ia extends Person{
    public Ia(String name){
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
        System.out.println("ещё дальше - " + getName() + ", ");
    }
}
