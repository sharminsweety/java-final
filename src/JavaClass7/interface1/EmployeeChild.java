package JavaClass7.interface1;

public class EmployeeChild implements Employee{
    @Override
    public void EmployeeDetail(int id) {
        System.out.println("ID is"+id);
    }

    @Override
    public void CompanyName() {
        System.out.println("Company name X");
    }
}
