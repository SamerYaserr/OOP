public class Developer extends Employee{
    private String projectName;

    public Developer(){
        System.out.println("Developer Constructor");
    }

    public Developer(String name, String emailAddress, String phoneNumber, String department, String address, int yearOfBirth, String projectName) {
        super(name, emailAddress, phoneNumber, department, address, yearOfBirth);
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
