package java_Toys;

public class ToyShopProgram {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        // Добавляем игрушки
        toyStore.addToy(1, "Кукла", 5, 20);
        toyStore.addToy(2, "Мяч", 10, 30);
        toyStore.addToy(3, "Конструктор", 8, 50);

        // Изменяем вес игрушки
        toyStore.updateWeight(3, 15);

        // Организуем розыгрыш игрушки
        toyStore.drawPrizeToy();

        // Получаем призовую игрушку
        Toy prizeToy = toyStore.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Призовая игрушка: " + prizeToy.getName());
        }
    }
}
