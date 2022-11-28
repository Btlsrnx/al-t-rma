
public class nitelik {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public nitelik(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }
    public double workHours() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }else{
            return 0;
        }
    }
    public double raiseSalary(){
        if (hireYear<=0||hireYear>2021){
            System.out.println("Yıla göre zam hesabı yapılıyor,lütfen bekleyiniz.");
        }else {
            int interest=2021-hireYear;
            if (interest<10) return salary*0.05;
            if(interest > 9 && interest < 20) return salary * 0.10;
            if(interest > 19) return salary * 0.15;

        }
        return 0;
    }
     public String btl(){
         double total = salary -tax() + workHours() + raiseSalary();
         double tot = salary +workHours() - tax();
         System.out.println("Adı : "+name);
         System.out.println("Maaşı : "+ salary);
         System.out.println("Çalışma saati:"+workHours);
         System.out.println("Başlama yılı:"+hireYear);
         System.out.println("Vergi : "+tax());
         System.out.println("Bonus : "+workHours());
         System.out.println("Maaş zammı:"+raiseSalary());
         System.out.println("Vergiler ve primlerle maaş:"+tot);
         System.out.println("Toplam Maaş : "+total);


         return null;
     }
}