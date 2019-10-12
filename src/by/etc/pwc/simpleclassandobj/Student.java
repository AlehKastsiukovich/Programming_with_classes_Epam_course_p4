package by.etc.pwc.simpleclassandobj;

/**
 * Создать класс с именем Student, содержащий поля Фамилия и инициалы, номер группы, успеваемость
 * (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность
 * вывода фамилий и номеров групп студентов, имеющих оценки, равные  9 или 10.
 */

public class Student {
    private String surnameAndInitials;
    private int  groupNumber;
    private int[] academPerf;

    public int [] initAcademPerf() {
        academPerf = new int[5];
        for (int i = 0; i < academPerf.length; i++) {
            academPerf[i] = (int)(Math.random() * 10 + 1);
        }
        return academPerf;
    }

    public void setSurnameAndInitials(String surnameAndInitials) {
        this.surnameAndInitials = surnameAndInitials;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public static void findExcellentStudent(Student [] students) {
        for(int i = 0; i < students.length; i++) {
           if (students[i].isExcellent()) {
               System.out.println(students[i].surnameAndInitials +"//"+students[i].groupNumber);
           }
        }
    }

    public  boolean  isExcellent() {
        int count = 0;
        for(int i = 0; i < academPerf.length; i++) {
            if(academPerf[i]>8) {
                count++;
            }
        }

        if(count == 5) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Student[] studentsArray = new Student[10];

        for (int i = 0; i < studentsArray.length; i++) {
            studentsArray[i] = new Student();
            studentsArray[i].initAcademPerf();
            studentsArray[i].setGroupNumber(i);
            studentsArray[i].setSurnameAndInitials("Student + " + i);
        }

        findExcellentStudent(studentsArray);
    }
}
