public class ogrenci_bilgi_sistemi {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ahmet Hoca","TRH","1111");
        Teacher t2 = new Teacher("Sami Hoca","FZK","2222");
        Teacher t3 = new Teacher("İsmet Hoca","BIO","3333");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji","103","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Mehmet","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,78,50,70,80,50);
        s1.isPass();
        Student s2 = new Student("Ali","456","4",tarih,fizik,biyo);
        s2.addBulkExamNote(50,30,70,60,40,90);
        s2.isPass();
    }
}
