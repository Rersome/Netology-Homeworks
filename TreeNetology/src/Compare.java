import java.util.Comparator;

class SpacePersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getExperience() > o2.getExperience()) {
            return -1;
        } else if (o1.getExperience() < o2.getExperience()) {
            return 1;
        }
        if (o1.getName().toLowerCase().chars().filter(c -> c == 's').count() >
                o2.getName().toLowerCase().chars().filter(c -> c == 's').count()) {
            return -1;
        } else if (o1.getName().toLowerCase().chars().filter(c -> c == 's').count() <
                o2.getName().toLowerCase().chars().filter(c -> c == 's').count()){
            return 1;
        }
        return o1.getName().length() - o2.getName().length();
    }
}