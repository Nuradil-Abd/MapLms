package studentGrades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentGrades {

    private Map<String, List<Integer>> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    public void addStudent(String name){
        studentGrades.put(name,new ArrayList<>());
    }

    public void addGrades(String name,int grade){
        studentGrades.get(name).add(grade);
    }

    public double averageGrade(String name){
        List<Integer> grades = studentGrades.get(name);
        if(grades == null || grades.isEmpty()) {return  0.0;}

        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;

        }
        return (double) sum / grades.size();
    }


    @Override
    public String toString() {
        return "StudentGrades{" +
                "studentGrades=" + studentGrades +
                '}';
    }
}
