import java.util.*;

public class Main {
    public static void main(String[] args) {
        PersonSurnameLengthComparator pcomp = new PersonSurnameLengthComparator(6); //Кто первый в списке тот более "знатен"
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Victor", "Li", 25));
        people.add(new Person("Ivan", "Pi", 13));
        people.add(new Person("Olya", "Ews", 32));
        people.add(new Person("Kate", "Ivanova", 15));
        people.add(new Person("Petya", "Ivanov", 17));
        people.add(new Person("Max", "Van Dayk", 75));
        people.add(new Person("Vika", "Konstantinovna", 5));
        System.out.println(people);
        System.out.println();
        Collections.sort(people, pcomp);
        System.out.println(people.toString());
    }
}
