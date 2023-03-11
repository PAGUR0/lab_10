package com.company;

abstract class human{
    String full_name;
    String data;
    int salary;
    abstract void printName();
    abstract void printData();
    abstract void printSalary();
}

class direct extends human{
    direct(String full_name, String data, int salary){
        this.full_name = full_name;
        this.data = data;
        this.salary = salary;
    }

    @Override
    void printName() {
        System.out.println(full_name);
    }

    @Override
    void printData() {
        System.out.println(data);
    }

    @Override
    void printSalary() {
        System.out.println(salary);
    }
}


class head extends human{
    head(String full_name, String data, int salary){
        this.full_name = full_name;
        this.data = data;
        this.salary = salary;
    }

    @Override
    void printName() {
        System.out.println(full_name);
    }

    @Override
    void printData() {
        System.out.println(data);
    }

    @Override
    void printSalary() {
        System.out.println(salary);
    }
}

class worker extends human {
    worker(String full_name, String data, int salary) {
        this.full_name = full_name;
        this.data = data;
        this.salary = salary;
    }

    @Override
    void printName() {
        System.out.println(full_name);
    }

    @Override
    void printData() {
        System.out.println(data);
    }

    @Override
    void printSalary() {
        System.out.println(salary);
    }
}

public class Main {

    public static void main(String[] args) {
        direct ivan = new direct("Косаев Иван Васильевич", "29.03.2006", 500000);
        head denis = new head("Денис Амитров Дмитриевич", "16.01.2005", 50000);
        worker dasha = new worker("Полуэктова Дарья Сергеевна", "31.03.2005", 5000);
    }
}
