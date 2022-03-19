public class Course {
    //Ders bilgileri
    Teacher teacher;  // referans ürettik  sınıflar birbirlerinin niteliği olabilir öğretmen bilgileri için nesen ürettik
    String name;
    String code;
    String prefix; // branch ile doğrulama için
    int note;
    int verbalNote; //sözlü notu
    double generalNote; // not ve sözlü notun etkisiyle oluşan not

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int verbalNote = 0;
        double generalNote = 0;
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor!");
        }
    }
    void printTeacher(){
        this.teacher.print();
    }
}
