package sg.edu.rp.c346.exercise2;

public class EmployeeInfo {
    private String eName;
    private String eTitle;
    private double eSalary;

    public EmployeeInfo(String eName, String eTitle, double eSalary) {
        this.eName = eName;
        this.eTitle = eTitle;
        this.eSalary = eSalary;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteTitle() {
        return eTitle;
    }

    public void seteTitle(String eTitle) {
        this.eTitle = eTitle;
    }

    public double geteSalary() {
        return eSalary;
    }

    public void seteSalary(double eSalary) {
        this.eSalary = eSalary;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "eName='" + eName + '\'' +
                ", eTitle='" + eTitle + '\'' +
                ", eSalary=" + eSalary +
                '}';
    }
}
