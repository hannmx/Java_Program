
import java.util.List;
import java.util.Scanner;

public class j_main {
    public static void main(String[] args) {
        Notebook ChuwiAH401 = new Notebook("Chuwi", "AH-401", "Black", 15.6, "LCD", 8, 256, "SSD");
        Notebook SamsungS101 = new Notebook("Samsung", "S-101", "Black", 15.6, "LCD", 8, 512, "SSD");
        Notebook SamsungS150 = new Notebook("Samsung", "S-150", "Green", 17.0, "TFT", 16, 512, "SSD");
        Notebook AsusTUF504 = new Notebook("ASUS", "TUF-504", "Red", 15.6, "OLED", 32, 2048, "HDD 2.0");
        Notebook AsusTUF555 = new Notebook("ASUS", "TUF-555", "White", 15.6, "TFT", 16, 1024, "SSD");

        List<Notebook> notebookList = List.of(ChuwiAH401, SamsungS101, SamsungS150, AsusTUF504, AsusTUF555);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        int choiceUserSearch = scannerUser.nextInt();
        Scanner scannerRequestUserForSearch = new Scanner(System.in);
        System.out.println("Напишите интересующий цвет или бренд: ");
        String requestUserForSearch = scannerRequestUserForSearch.nextLine();

        if (choiceUserSearch == 1) {
            for (Notebook color : notebookList) {
                if (color.getColor().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(color.printInfo());
                }
            }

        } else if (choiceUserSearch == 2){
            for (Notebook brand : notebookList) {
                if (brand.getBrand().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(brand.printInfo());
                }
            }
        } else {
            System.out.println("Ошибка.\nВыберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        }

        scannerUser.close();

    }


}