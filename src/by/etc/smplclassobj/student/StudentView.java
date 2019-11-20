package by.etc.smplclassobj.student;

public class StudentView {

    public void printExcellentStudent(Student[] students) {
        for (int i = 0; i < students.length; i++) {

            if (StudentLogic.isExcellent(students[i])) {
                System.out.println(students[i].getSurnameInitials() + " " + students[i].getGroupNumber());
            }
        }
    }

    public void printAll(Student[] students) {
        for (Student student: students) {
            System.out.println(student.getSurnameInitials() + " " + student.getGroupNumber());
        }
    }
}
