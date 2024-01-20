public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();

        e1.setId(101);
        e1.setName("Rohit");
        e1.setPreviousCompany("ABC");



        System.out.print(e1.getId() + " ");
        System.out.print(e1.getName() + " ");
        System.out.print(e1.getPreviousCompany() + " ");


    }
}
