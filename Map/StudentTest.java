package Map;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("a", 1, "HN");
        Student student3 = new Student("b", 2, "QN");
        Student student2 = new Student("c", 3, "NĐ");
//        List<Student> list = new ArrayList<Student>(); // sắp xếp
//        list.add(student1);
//        list.add(student2);
//        list.add(student3);
//        Collections.sort(list);
//        for (Student s1 : list
//        ) {
//            System.out.println(s1.toString());
//
//        }
//        AgeComparetor ageComparetor = new AgeComparetor(); // sắp xếp
//        Collections.sort(list, ageComparetor);
//        for (Student s1 : list
//        ) {
//            System.out.println(s1.toString());
//            }
        Map<Integer, Student> map = new HashMap<>();
        map.put(1, student1);
        map.put(2, student2);
        map.put(3, student3);
        for (Map.Entry<Integer, Student> student : map.entrySet()) {
            System.out.println(student.toString());
        }
        Set set = map.keySet();
        for (Object s:set
             ) {
            System.out.println(map.get(s));

        }

            //       Set<Student> newset = new HashSet<Student>();//đảo ngược
//        newset.add(student1);
//        newset.add(student2);
//        newset.add(student3);
//        for (Student student:newset
//             ) {
//            System.out.println(student.toString());
//
//        }


    }
}
