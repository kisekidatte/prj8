public class Student extends People{
    Student(String nameP, String lastnameP, int ageP){
        super(nameP,lastnameP,ageP);
    }

    @Override
    void walk(){
        System.out.println(name + " Ходит");
    }
    void learn(){
        System.out.println(name + " грызёт гранит науки");
    }
}