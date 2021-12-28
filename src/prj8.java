public class prj8 {
    public static void main(String[] args) {
        People people =  new People("Вячеслав","Максимов",19);
        people.walk();
        people.run();
        people.voice();
        Student student = new Student("Роман","Колесников",20);
        student.walk();
        student.learn();
        Teacher teacher = new Teacher("Андрей","Сафонов",45);
        teacher.voice();
        teacher.teach();
    }
}
