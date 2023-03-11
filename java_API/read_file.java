//Код для задачи с запросом БД select * from where {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package java_API;

import java.io.*;
public class read_file {
    public static String[] ReadLineFromFile(String pathway) throws Exception {
        BufferedReader buff = new BufferedReader(new FileReader(pathway));
        String str;
        int size = 0;
        while ((str = buff.readLine()) != null) {
            size +=1;
            }
        buff.close();
        
        String[] listData = new String[size];

        int i = 0;
        BufferedReader buff1 = new BufferedReader(new FileReader(pathway));
        while ((str = buff1.readLine()) != null) {
            listData[i] = str;
            i += 1;
            }
        buff1.close();

        return listData;
    }    
}