import java.util.*;

public class FamilyTree implements Iterable<Person> {
    private List<Person> familyMembers;

    @Override
    public Iterator<Person> iterator() {
        return new FamilyTreeIterator(familyMembers);
    }
    public void sortByName() {
        familyMembers.sort(Comparator.comparing(Person::getName));
    }

    public void sortByBirthDate() {
       .sort(Comparator.comparing(Person::getBirthDate));
    }

    private class FamilyTreeIterator implements Iterator<Person> {
        private final List<Person> sortedMembers;
        private int index;

        public FamilyTreeIterator(List<Person> members) {
            sortedMembers = new ArrayList<>(members);
            sortByName(); // или sortByBirthDate();
        }

        @Override
        public boolean hasNext() {
            return index < sortedMembers.size();
        }

        @Override
        public Person next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return sortedMembers.get(index++);
        }
    }
}
