import java.util.Comparator;

public class PersonSurnameLengthComparator implements Comparator<Person> {
    int maxSurnameLehgth;

    public PersonSurnameLengthComparator(int surnameLehgth) {
        this.maxSurnameLehgth = surnameLehgth;
    }

    public PersonSurnameLengthComparator() {

    }

    @Override
    public int compare(Person o1, Person o2) {
        int quantityWords1 = o1.getSurname().split("(?U)\\W").length;
        int quantityWords2 = o2.getSurname().split("(?U)\\W").length;
        if (quantityWords1 > maxSurnameLehgth && quantityWords2 > maxSurnameLehgth) {
            return 0 - Integer.compare(o1.getAge(), o2.getAge());
        } else {
            int result = 0 - Integer.compare(quantityWords1, quantityWords2);
            return result == 0 ? (0 -Integer.compare(o1.getAge(), o2.getAge())) : result;
        }
    }
}


