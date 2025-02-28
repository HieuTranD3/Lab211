
package week4;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManagement {
   private List<Student> studentList = new ArrayList<>();
   
   private boolean checkStudent(Student st){ 
       for (Student student : studentList) {  
            if (student.getID().equals(st.getID())) {  
                return false; // Student already exists  
            }  
        }  //kiem tra sv da co trong list chua? neu chua co thi tra ve true, co roi thi ve false
       return true;
   }
    public boolean addStudent(Student st) {  
        if (checkStudent(st)) {  
            studentList.add(st);  
            return true;    
        }  
        return false; // Student could not be added  
    }  
   public void showStudent(){
       for(Student st: studentList){
           System.out.println(st.toString());
       }
   }
   public List<Student> findStudent(String name) {  
        List<Student> ListSV = new ArrayList<>();  
        for (Student st : studentList) {  
            if (st.getStudentName().equalsIgnoreCase(name)) {  
                ListSV.add(st);  
            }  
        }  
        return ListSV;
    }  

   public int deleteStudent(String id) {  
        for (int i = 0; i < studentList.size(); i++) {  
            if (studentList.get(i).getID().equals(id)) {  
                studentList.remove(i);  
                return 1;
            }  
        }  
        return 0; 
    }  
   public int updateStudent (Student st){
       return 0;
   }
   public void sortStudent() {  
        Collections.sort(studentList, new Comparator<Student>() {  
            @Override  
            public int compare(Student st1, Student st2) {  
                return st1.getStudentName().compareTo(st2.getStudentName()); 
            }  
        });  
   }
   public void reportStudent(){
       Map<String, Integer> report = new HashMap<>();
       for(Student st: studentList){
           String key = st.getID() + "|" +st.getStudentName() + st.getCourseName();
           report.put(key, report.getOrDefault(key, 0)+1);
       }
       for(Map.Entry<String,Integer> entry : report.entrySet()){
           System.out.println(entry.getKey()+"|"+entry.getValue());
       }
   }
}

