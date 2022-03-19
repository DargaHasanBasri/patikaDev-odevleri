public class Teacher {
    //Öğretmen bilgileri
    String name;
    String ph_no;
    String branch;

    Teacher(String name, String branch, String ph_no){
        this.name   = name;
        this.ph_no  = ph_no;
        this.branch = branch;
    }
    void print(){
        System.out.println("Adı      \t: " + this.name);
        System.out.println("Telefonu \t: " + this.ph_no);
        System.out.println("Bölümü   \t: " + this.branch);
    }
}
