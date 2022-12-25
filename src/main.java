public class main {

        public static void main(String[] args) {
            int amountTicket = 300; // количество рублей потраченных на билеты
            int milePerAmount = 20; // количество рублей для одной бонусной мили

            int miles; // новая переменная
            miles = amountTicket / milePerAmount; // подсчет кол-ва миль
            System.out.println("Ваше количество миль: " + miles); // вывод результата
        }
}
