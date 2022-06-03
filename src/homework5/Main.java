package homework5;

public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Сергей Сидоров", "Водитель", "ccv@ccv.net", "123123123", 45, 25000);
        persArray[1] = new Person("Иван Иванов", "Инженер", "iii@ccv.net", "321852852", 36, 30000);
        persArray[2] = new Person("Аманда Ли", "Дизайнер", "ali@ccv.net", "654852987", 24, 50000);
        persArray[3] = new Person("Виктор Александрович", "Директор", "vai@ccv.net", "999666555", 52, 77000);
        persArray[4] = new Person("Марина Петрова", "Бухгалтер", "mpi@ccv.net", "555222111", 48, 60000);

        for (Person item : persArray) {
            if (item.getAge() > 40) item.printInfo();
        }
    }
}
