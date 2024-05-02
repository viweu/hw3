public class Main {
    public static void main(String[] args) {
       
        FamilyTree familyTree = new FamilyTree();
        familyTree.addPerson(new Person("Daniel", new Date()));
        familyTree.addPerson(new Person("Viktoria", new Date()));

        familyTree.sortByName();
        for (Person person : familyTree) {
            System.out.println(person.getName());
        }

        familyTree.sortByBirthDate();
        for (Person person : familyTree) {
            System.out.println(person.getName());
        }
    }
}
