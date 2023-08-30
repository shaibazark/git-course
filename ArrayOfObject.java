
class Student{

    int id;
    String name;
    int marks;
    
}

public class ArrayOfObject {
    public static void main(String[] args) {
       
        Student s1 = new Student();
        s1.id=1;
        s1.name="AAA";
        s1.marks=98;

        Student s2 = new Student();
        s2.id=1;
        s2.name="BBB";
        s2.marks=91;

        Student s3 = new Student();
        s3.id=3;
        s3.name="CCC";
        s3.marks=89;


        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
       
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].id+ " " +students[i].name+ " " +students[i].marks);
        }

        for(Student s : students){
            System.out.println(s.id+ " " +s.name+ " " +s.marks);
        }

    

    }
}
