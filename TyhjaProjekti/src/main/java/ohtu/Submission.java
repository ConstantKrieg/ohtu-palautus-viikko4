package ohtu;

import java.util.ArrayList;
import java.util.List;


public class Submission {
    private String student_number;
    private int week, hours;
    private boolean a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14, a15, a16, a17, a18, a19, a20, a21;
    private final List<Integer> doneTasks;
    private  Course couse;
    
    public Submission(){
        doneTasks = new ArrayList();
    }
    
   
    public void initTasks(){
        Boolean[] arrayTasks = {a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14, a15, a16, a17, a18, a19, a20, a21};

        int i = 1;
        for (Boolean task : arrayTasks) {
            if(task == true) {
                doneTasks.add(i);
                i++;
            }
        }
      
    }
    
    public String getStudent_number() {
        return student_number;
    }

    public Course getCouse() {
        return couse;
    }

    public void setCouse(Course couse) {
        this.couse = couse;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    @Override
    public String toString() {
        String wrap = "Viikko " + this.week + ": tehtyjä tehtäviä "  + this.doneTasks.size() + " (maksimi " +  this.couse.getWeeksAsList().get(week) + ")" + " aikaa kului " + this.hours + ", tehdyt tehtävät: ";
        for (Integer task : doneTasks) {
            wrap += " " + task;
        }
        return wrap;
    }
    
}