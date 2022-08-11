public class InheritanceDemo {
  public static void main(String[] args)
  {
    Person p1 = new Person("Sunil", "Negombo", "IT2110");
    p1.getDetails();
    p1.Display();
    Student s1 = new Student("Amal", "Ratnapura", "IT2080");
    s1.getDetails();
  }
}
