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
        if (o1.getSurname().length() > maxSurnameLehgth && o2.getSurname().length() > maxSurnameLehgth) {
            return 0 - Integer.compare(o1.getAge(), o2.getAge());
        } else {
            int result = 0 - Integer.compare(o1.getSurname().length(), o2.getSurname().length());
            return result == 0 ? (0 - Integer.compare(o1.getAge(), o2.getAge())) : result;
        }
    }
}


