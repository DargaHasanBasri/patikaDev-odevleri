public class Student {
    //Öğrenci Bilgileri
    Course c1; //Course sınıfında 3 tane ders aldıklarını varsayarak 3 tane nesne ürettik
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;  // ortalaması
    boolean isPass; //sınıfı geçti mi geçmedi mi kontrolü için

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int note1,int note2,int note3,int vNote1,int vNote2,int vNote3){ // not ve sözlü not değerlerine girdi sağlayan fonksiyon
        if (note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
            this.c1.verbalNote = vNote1;
            this.c1.generalNote = ((this.c1.note*0.8)+(this.c1.verbalNote*0.2));
        }
        if (note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
            this.c2.verbalNote = vNote2;
            this.c2.generalNote = ((this.c2.note*0.7)+(this.c2.verbalNote*0.3));
        }
        if (note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
            this.c3.verbalNote = vNote3;
            this.c3.generalNote = ((this.c3.note*0.6)+(this.c3.verbalNote*0.4));
        }
    }
    void isPass(){
        System.out.println("============================");
        studentInfo();
        this.avarage = (this.c1.generalNote + this.c2.generalNote + this.c3.generalNote) / 3.0;
        printNote();

        if (this.avarage > 55){
            System.out.println("Sınıfı GEÇTİNİZ!");
            this.isPass = true;
        } else {
            System.out.println("Sınıfı GEÇEMEDİNİZ!!!");
            this.isPass = false;
        }
    }
    void studentInfo(){
        System.out.println("Adı      \t\t : " + this.name);
        System.out.println("Numarası    \t : " + this.stuNo);
        System.out.println("Sınıfı   \t\t : " + this.classes);
    }
    void printNote(){
        System.out.println(c1.name + " Notu\t\t : " + this.c1.note);
        System.out.println(c1.name + " Sözlü Notu : " + this.c1.verbalNote);
        System.out.println(c1.name + " Ortalaması : " + this.c1.generalNote);
        System.out.println("--------------------------");
        System.out.println(c2.name + " Notu\t\t : " + this.c2.note);
        System.out.println(c2.name + " Sözlü Notu : " + this.c2.verbalNote);
        System.out.println(c2.name + " Ortalaması : " + this.c2.generalNote);
        System.out.println("--------------------------");
        System.out.println(c3.name + " Notu\t\t: " + this.c3.note);
        System.out.println(c3.name + " Sözlü Notu : " + this.c3.verbalNote);
        System.out.println(c3.name + " Ortalaması : " + this.c3.generalNote);
        System.out.println("--------------------------");
        System.out.println("Not Ortalamanız : " + this.avarage);
    }
}
