public class Person{
    //Eigenschaften
    private String name;
    private int alter;
    
    //konstruktoren
    public Person(String n, int a){
        name = n;
        alter = a;
    }
    
    //Funktion
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public int getAlter(){
        return alter;
    }
    
    public void setAlter(int a){
        alter = a;
    }
}