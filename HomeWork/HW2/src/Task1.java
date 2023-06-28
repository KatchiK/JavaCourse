import javax.management.Query;

public class Task1 {
    public static void startTask1() {
        /*
         * Дана строка sql-запроса "select * from students where ". Сформируйте часть
         * WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены
         * ниже в виде json-строки.
         * Если значение null, то параметр не должен попадать в запрос.
         * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia",
         * "city":"Moscow", "age":"null"}
         */

         //1) Создание строки
         //2) Добавление фильтров
         //3) Деление строки фильтра по запятой         
         //4) Деление фильтра по двоеточию
         // пример строки: use db.main select * from students where name='Ivanov' and country='Russia'
         Task1.сreatingQueryString();


    }

    public static String сreatingQueryString() {
        StringBuilder queryString = new StringBuilder();
        queryString.append("use db.main select * from students where");
        

        return queryString.toString();

    }
}
