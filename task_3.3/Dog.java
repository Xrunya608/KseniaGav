/*
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Dog должна быть переменная name с типом String.
•	У класса Dog должна быть переменная age с типом int.
•	У класса должен быть сеттер для переменной name.
•	У класса должен быть геттер для переменной name.
•	У класса должен быть сеттер для переменной age.
•	У класса должен быть геттер для переменной age.
*/
public class dog {
    public static void main(String[] args){
        dog dog = new dog();
        dog.setAge(5);
        dog.setName("Lucky");
        //dog.getInfo(); //можно сделать через этот метод
        System.out.println(dog.name+", "+dog.age);
    }
    String name;
    int age;

    public void setName(String name){
        this.name = name;
        }
     public void setAge(int age){
        this.age = age;
     }
     public String getName(){
        return name;
     }
     public int getAge(){
        return age;
