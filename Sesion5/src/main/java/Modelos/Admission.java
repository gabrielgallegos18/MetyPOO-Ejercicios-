package Modelos;

public class Admission {
    public Admission(){

    }

    /**
     * Calcula si el estudiante tiene derecho a beca
     * @param student
     */
    public void calcScholarship(Student student){
        student.setScholarship(student.getAverage() >= 80);
    }
}//end Admission

