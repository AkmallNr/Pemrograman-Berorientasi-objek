public class TestEmployee{
    public static void main (String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2500000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 3000000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 2100000, 1, 11, 1993);
        Sortable2.shell_sort(staff);
        int i;
        for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
        for (i = 0; i < 3; i++) staff[i].print();
    }
}