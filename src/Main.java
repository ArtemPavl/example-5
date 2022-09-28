public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнии задания к уроку 5");
        //Домашняя работа 2
        // Задание 1
        System.out.println("Домашняя работа 2");
        System.out.println("Задание 1");
        int age = 18;
        if(age >= 18){
            System.out.println("Поздравляем с совершенолетием!!!");
        } else {
            System.out.println("Ваше совершенолетие еще не наступило!");
        }
        // Задание 2
        System.out.println("Задание 2");
        if (age >= 24){
            System.out.println("Вы закончили институт. Вам пора искать первую работу.");
        } else if(age >= 18 && age < 24){
            System.out.println("Вы учитесь в институте");
        } else if (age >= 7 && age < 18){
            System.out.println("Вы учитесь в школе");
        }
        // Задание 3
        System.out.println("Задание 3");
        int passengers = 61;
        if (passengers >= 60){
            System.out.println("В вагоне нет сидячих мест");
        } else{
            System.out.println("В вагоне есть сидячие места");
        }
    }
}