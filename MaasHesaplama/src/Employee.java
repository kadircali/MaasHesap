
public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double vergi;
    int bonus;
    double raiseSalary;
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        vergi = 0.0;
        bonus = 0;
        raiseSalary=0.0;
    }

    void tax() {
        if (this.salary >= 1000) {
            vergi = this.salary * 0.03;
        }
    }

    void bonus() {
        if (workHours >= 40) {
            bonus = (workHours - 40)*30;
          //  this.salary += bonus * 30;
        }
    }

    void raiseSalary() {
        if (2021 - this.hireYear < 10) {
            this.raiseSalary = this.salary * 0.05;
        } else if (this.salary >= 10 && this.salary < 20) {
            this.raiseSalary = this.salary * 0.10;
        } else if (this.salary >= 20) {
            this.raiseSalary = this.salary * 0.15;
        }
    }

    @Override
    public String toString() {
        return "Ad: " + this.name + " Maaş: " + this.salary + " Çalışma Saati: " + this.workHours + " Başlangıç Yılı: " + this.hireYear + " Vergi:" + this.vergi + " bonus:"+this.bonus+" maaş artışı:"+this.raiseSalary
                +" vergi ve bonuslarla maaş: "+(this.salary-this.vergi+this.bonus+this.raiseSalary);
    }

}
