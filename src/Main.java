import java.util.*;

public class Main {
    public static void main(String[] args) {
        PersonSurnameLengthComparator pcomp = new PersonSurnameLengthComparator(3); //Кто первый в списке тот более "знатен"
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Victor", "Li", 25));
        people.add(new Person("Tonny", "Trinande De Vilen", 22));
        people.add(new Person("Olya", "Ews", 32));
        people.add(new Person("Kate", "Ivanova", 15));
        people.add(new Person("Max", "Van Dayk", 75));
        people.add(new Person("Vika", "Konstantinovna", 5));
        System.out.println(people);
        System.out.println();
        Collections.sort(people, pcomp);
        System.out.println(people.toString());
    }
}
