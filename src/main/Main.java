package main;

import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        List<Patient> patients = new ArrayList<>(Arrays.asList(
            new Patient(1, "Anbrov", "Anton", "Antonievich", "Nikolaev", 1111, 1, "Grip"),
            new Patient(2, "Stepanov", "Stepan", "Stepanov", "Kiev", 2221, 2, "ORV"),
                new Patient(3, "Valeria", "Anna", "Antonov", "Odessa", 3332, 3, "Glaza"),
                new Patient(4, "Bobin", "Viktor", "Fedorovich", "Kiev", 4441, 4, "Grip"),
                new Patient(5, "Semenova", "Maria", "Olegovna", "Nikolaev", 5552, 5, "ORV")


        ));
        Scanner scan = new Scanner(System.in);
        int m = 0;
        menu:
        do{
            System.out.println("1.Вивести хворих з ORV");
            System.out.println("2.Номер картки з 2 до 4");
            System.out.println("3.Номер телефона, які закінчуються на 1");
            System.out.println("0.EXIT");


        m = scan.nextInt();
    switch (m){
        case 1: showDiagnos(patients); break;
        case 2: showCard(patients); break ;
        case 3: showTelephone(patients); break ;
        case 0: break menu;
    }
            System.out.println("-------------------------");
    }while (m!=0);
    }
    private void showAllWithFilters(List<Patient> patients, Predicate <Patient> predicate){
        patients.stream().filter(predicate).forEach(p-> System.out.println(p));
    }
    private void showWithFilters(List<Patient> patients, Predicate <Patient> predicate){
        patients.stream().filter(predicate).forEach(p->p.getTelephone());
        //filter(predicate).forEach(p-> System.out.println(p));
    }
    private void showDiagnos(List<Patient> patients) {
        showAllWithFilters(patients, p->p.getDiagnos()=="ORV");
    }

    private void showCard(List<Patient> patients) {
        showAllWithFilters(patients, ((Predicate<Patient>) (Patient p) -> p.getMedKart()>=2).and(p->p.getMedKart()<=4));
    }

    private void showTelephone(List<Patient> patients) {
        showAllWithFilters(patients.lastIndexOf(1), p->showTelephone(System.out.println(patients)));
    }


}
