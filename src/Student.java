public class Student {
    String name;
    Course mat;
    Course fiz;
    Course bio;
    double average;

    Student(String name, Course mat, Course fiz, Course bio){
        this.name=name;
        this.mat=mat;
        this.fiz=fiz;
        this.bio=bio;
    }

    void addExamNote(int mat, int fiz, int bio){

            this.mat.exNote=mat;


        if (fiz>=0&&fiz<=100){
            this.fiz.exNote=fiz;
        }
        if (bio>=0&&bio<=100){
            this.bio.exNote=bio;
        }
    }

    void addVerbalNote(int mat, int fiz, int bio){
        if (mat>=0&&mat<=100){
            this.mat.verbNote=mat;

        }
        if (fiz>=0&&fiz<=100){
            this.fiz.verbNote=fiz;
        }
        if (bio>=0&&bio<=100){
            this.bio.verbNote=bio;
        }
    }
    void calcAverage(){



        this.average=(((this.mat.exNote*0.8)+(this.mat.verbNote*0.2))+((this.fiz.exNote*0.8)+(this.fiz.verbNote*0.2))+((this.bio.exNote*0.8)+(this.bio.verbNote*0.2)))/3.0;
    }

    void isPass(){
        calcAverage();
        if (this.average>=55){
            System.out.println("============");
            System.out.println(this.name);

            System.out.println("ortalama :"+this.average+" geçtiniz");
            System.out.println("matematik öğretmeni"+mat.teachy.name);
        }
        else{
            System.out.println("============");
            System.out.println(this.name);
            System.out.println("ortalama :"+this.average+" kaldınız");
        }

    }
}
