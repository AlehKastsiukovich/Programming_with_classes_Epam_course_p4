package by.etc.smplclassobj.student;


public class StudentLogic {

    public int[] initPerformance() {
        int[] performance = new int[5];

        for (int i = 0; i < performance.length; i++) {
            performance[i] = (int) (Math.random() * 10 + 1);
        }

        return performance;
    }

    public static boolean isExcellent(Student student) {
        for (int i = 0; i < student.getPerformance().length; i++) {

            if (student.getPerformance()[i] < 8) {
                return false;
            }
        }

        return true;
    }
}
