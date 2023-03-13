/* Дана json строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. */

package java_API;

public class j_parse {
    public static void main(String[] args) throws Exception {
        String[] list = read_file.ReadLineFromFile("/Java Prog/java_API/dataForParse.txt");
        for(int i = 0; i < list.length; i++) {
            System.out.println(PrintLine(list[i]));
        }
    }
    public static StringBuilder PrintLine(String line) {
        String line1 = line.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        String line4 = line3.replace("[", "");
        String line5 = line4.replace("]", "");
        StringBuilder result = new StringBuilder("");
        String [] list = line5.split(",");
        String[] res_list = {"Студент ", " получил ", " по предмету "};
        for (int i = 0; i < list.length; i++) {
            String[] arrData = list[i].split(":");
            result.append(res_list[i]);
            result.append(arrData[1]); 
            }
        return result; 
    }

}
