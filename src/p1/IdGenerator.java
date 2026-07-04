package p1;

import java.util.StringJoiner;

public class IdGenerator {
    //Fake ID!?!?!
    public String createId(String matriculationNumber, String name, String fieldOfStudy){
        StringBuilder sb = new StringBuilder();
        sb.append("========== Student ID ========== \n");
        sb.append("================================ \n");
        sb.insert(sb.indexOf("================================ \n"),"Matriculation number: " + matriculationNumber + "\n");
        sb.insert(sb.indexOf("================================ \n"),"Name: " + name + "\n");
        sb.insert(sb.indexOf("================================ \n"),"Field of Study: " + fieldOfStudy + "\n");
        return sb.toString();
    }
    public String createCourseList(String... courses){
        StringJoiner sj = new StringJoiner(", ","Course List: [" ,"]");
        for(String course : courses){
            sj.add(course);
        }
        return sj.toString();
    }
}
