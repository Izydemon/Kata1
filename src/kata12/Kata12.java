package kata12;

import java.util.Date;

public class Kata12 {
    public static void main(String[] args) {
        Person Random = new Person("Random",new Date(95,5,4));
        System.out.println(Random.getName());
        System.out.println(Random.getAge());
    }
    
}
