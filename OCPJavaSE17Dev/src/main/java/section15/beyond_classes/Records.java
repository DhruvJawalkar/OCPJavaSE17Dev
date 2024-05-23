package section15.beyond_classes;

public class Records {
    //record Student (int id, String firstName, String lastName){};
    record Student(int id, String firstName, String lastName){
        public Student{
            if(id < 10 || id > 100_000)
                throw new IllegalArgumentException();

            firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
            lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        }
    }

    public static void main(String[] args) {
        /*
        Student student1 = new Student(1, "Luka", "Popov");
        Student student2 = new Student(1, "Luka", "Popov");

        System.out.println(student1.id());
        System.out.println(student1.firstName());
        System.out.println(student1.lastName());

        System.out.println(student1==student2);
        System.out.println(student1.equals(student2));
         */

        //Student s1 = new Student(10, "Luka", "Popov");
        Student s1 = new Student(10, "LUKA", "POPOV");
        System.out.println(s1.firstName());
        System.out.println(s1.lastName());
        System.out.println(s1.toString());
    }
}
