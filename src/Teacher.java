public class Teacher extends People {
    Teacher(String nameP, String lastnameP, int ageP) {
        super(nameP, lastnameP, ageP);
    }

    @Override
    void voice() {
        System.out.println(name + " общается со студентами");
    }

    void teach() {
        System.out.println(name + " учит класс");
    }
}