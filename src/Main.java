import java.util.ArrayList;
import  java.util.List;

public class Main {
    public static void main(String[] args){

        List<String> tags = new ArrayList<>();
        tags.add("Семья");
        tags.add("Работа");
        tags.add("Друзья");

        Contact user1 = new Contact("Елена","8-924-562-14-50","elena1986@gmail.com",tags);
        Contact user2 = new Contact("Анна","8-756-560-00-50","anna19@gmail.com", tags);

        tags.add("Соседи"); //меняем внешний список
        System.out.println("Список тегов: " + user2.getTags()); //проверяем изменился ли список тегов
                                                                //ожидаемый результат: список тегов - [Семья, Работа, Друзья]

        List<String> newTags = user1.getTags();//получили новый список через геттер
        newTags.add("Школа"); //меняем его
        System.out.println("Теги после изменения через геттер: " + user1.getTags());//ожидаемый результат:
                                                                                    // теги после изменения - [Семья, Работа, Друзья]

        Contact newContact = user1.withAddTags("Соседи"); //проверяем добавился ли тег в список нового контакта
        System.out.println("Новый список тегов: " + newContact.getTags() + "\n" + "Старый список тегов: " + user1.getTags()); //ожидаемый результат:
                                                                                                            //новый список тегов - [Семья, Работа, Друзья, Соседи]
                                                                                                            //старый спосок тегов - [Семья, Работа, Друзья]
        Contact newPhone = user1.withPhoneNumber("8-324-548-54-00"); //создаем новый контакт с новым номером
        System.out.println("Старый номер: " + user1.getPhoneNumber()); // ожидаемый результат: старый номер - 8-924-562-14-50
        System.out.println("Новый номер: " + newPhone.getPhoneNumber() ); // ожидаемый результат: новый номер - 8-324-548-54-00

        System.out.println(user1.toString()); //проверка метода toString
    }
}
