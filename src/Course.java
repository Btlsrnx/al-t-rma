public class Course {

    String name;
    String prefix;
    int exNote;
    int verbNote;
    Teacher teachy;



    Course(String name, String prefix){
        this.name=name;
        this.prefix=prefix;


    }

    void addTeacher(Teacher t){
        if (t.branch.equals(this.prefix)){
            this.teachy=t;

        }
        else {
            System.out.println("Bu branşın hocası değil");
        }

    }
    void printTeacher(){
        if (this.teachy!=null){
            System.out.println(this.name+ " dersinin  hocası :"+teachy.name);
        }
        else
            System.out.println("la "+this.name+" dersinin hocası yok!");
    }
}
