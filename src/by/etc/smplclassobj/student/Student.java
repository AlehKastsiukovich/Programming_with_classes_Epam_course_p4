package by.etc.smplclassobj.student;


public class Student {
    private String surnameInitials;
    private int groupNumber;
    private int[] performance = new int[5];

    public Student(String sur, int groupNumber) {
        surnameInitials = sur;
        this.groupNumber = groupNumber;
    }

    public void setSurnameInitials(String surnameInitials) {
        this.surnameInitials = surnameInitials;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setPerformance(int[] performance) {
        this.performance = performance;
    }

    public String getSurnameInitials() {
        return surnameInitials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getPerformance() {
        return performance;
    }
}
