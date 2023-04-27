import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> people = new LinkedList<>();
        people.add(new Human("Василий", "Иван", "Федорович"));
        people.add(new Human("Иванов", "Иван", "Иванович"));
        people.add(new Human("Аркадьев", "Аркадий", "Арсеньевич"));
        people.add(new Human("Карапетян", "Саркис", "Иванович"));
        people.add(new Human("Петров", "Иван", "Иванович"));
        people.add(new Human("Андреев", "Максим", "Викторович"));

        System.out.println(people.get(0).compareTo(people.get(0)));
        System.out.println(people.get(1).compareTo(people.get(2)));
        System.out.println(people.get(2).compareTo(people.get(1)));
        System.out.println();

        Collections.sort(people);
        System.out.println(people);
    }
}
