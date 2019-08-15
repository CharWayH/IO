package testobjectstream;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private long serialVersionUID = 8475827506471258990L;


    public  Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "{"+this.name+","+this.age+"}";
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void eat(){
        System.out.println(this.name+":吃饭");
    }
}
