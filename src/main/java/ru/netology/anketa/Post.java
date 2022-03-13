package ru.netology.anketa;

public class Post {
    public String name; // поле для имени
    public String passport;
    public String patronymic;
    public String phone;
    public String surname;
    public boolean subscription;
    public FormDate birthday;

    public static class Main {
        public static void main(String[] args) {
            Post post = new Post();
            post.name = "Иван";
            post.passport = "4444 № 44444444";
            post.patronymic = "Иванович";
            post.phone = "+7 (999)-999-99-99";
            post.surname = "Иванов";
            post.subscription = true;
            post.birthday = new FormDate();
            post.birthday.day = 13;
            post.birthday.month = 6;
            post.birthday.year = 1999;
        }
    }
}
