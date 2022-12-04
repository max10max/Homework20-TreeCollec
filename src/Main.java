import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Person> compar = (o1, o2) -> {
            int quantityWords1 = o1.getSurname().split("(?U)\\W").length;
            int quantityWords2 = o2.getSurname().split("(?U)\\W").length;
            int maxSurnameLehgth = 4;
            if (quantityWords1 > maxSurnameLehgth && quantityWords2 > maxSurnameLehgth) {
                return 0 - Integer.compare(o1.getAge(), o2.getAge());
            } else {
                int result = 0 - Integer.compare(quantityWords1, quantityWords2);
                return result == 0 ? (0 - Integer.compare(o1.getAge(), o2.getAge())) : result;
            }
        };
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Victor", "Li", 25));
        people.add(new Person("Tonny", "Trinande De Vilen", 22));
        people.add(new Person("Olya", "Ews", 32));
        people.add(new Person("Kate", "Ivanova", 15));
        people.add(new Person("Max", "Van Dayk", 75));
        people.add(new Person("Vika", "Konstantinovna", 5));
        System.out.println(people);
        System.out.println();
        Collections.sort(people, compar);
        System.out.println(people.toString());
    }
}
