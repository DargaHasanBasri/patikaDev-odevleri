public class Employee {
    String name;
    double salary; //çalışan maaşı
    int work_hours; //haftalık çalışma saati
    int hire_year; //işe başlangıç yılı

    Employee(String name,double salary,int work_hours,int hire_year){
        this.name = name;
        this.salary = salary;
        this.work_hours = work_hours;
        this.hire_year = hire_year;
    }
    double tax() { // maaşa uygulanan vergiyi hesaplayacak
        if (this.salary >= 1000) {
            return (salary * 0.03);
        } else {
            return 0;
        }
    }
     double bonus() {
        if (this.work_hours > 40) {
            return ((this.work_hours - 40) * 30.0);
        } else {
            return 0;
        }
    }
    double raiseSalary() {
        if ((2021 - this.hire_year) < 10) {
            return (salary * 0.05);
        } else if ((2021 - this.hire_year) > 9 && (2021 - this.hire_year) < 20) {
            return (salary * 0.10);
        } else if ((2021 - this.hire_year) > 19) {
            return (salary * 0.15);
        } else {
            return 0;
        }
    }
    void worker_info() {
        double artis = (bonus() + raiseSalary() - tax());
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalısma Saati : " + this.work_hours);
        System.out.println("Baslangıç Yılı : " + this.hire_year);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile maaş : " + (salary + bonus() - tax()));
        System.out.println("Toplam Maaş : " + (salary + raiseSalary()));
    }
}