
public class obs {
    public static void main(String[] args) {
        Course mat=new Course("Matematik","mat");
        Course fiz=new Course("Fizik","fiz");
        Course bio=new Course("Biyoloji","bio");

        Teacher t1=new Teacher("Ferit keser","mat");
        Teacher t2=new Teacher("Ayşe tutum","fiz");
        Teacher t3=new Teacher("Biyolojici","bio");

        mat.addTeacher(t1);
        fiz.addTeacher(t2);
        bio.addTeacher(t3);


        Student s1=new Student("hürrem sekiz",mat,fiz,bio);
        s1.addExamNote(10,80,60);
        s1.addVerbalNote(50,10,70);
        s1.isPass();

        Student s2=new Student("kenan kesin",mat,fiz,bio);
        s2.addExamNote(10,50,5);
        s2.addVerbalNote(78,20,3);
        s2.isPass();

        Student s3=new Student("şeker atil",mat,fiz,bio);
        s3.addExamNote(99,100,98);
        s3.addVerbalNote(100,100,100);
        s3.isPass();
    }
}
