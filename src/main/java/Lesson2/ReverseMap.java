package Lesson2;

import java.util.HashMap;
import java.util.Map;

public class ReverseMap {

        public static void main(String[] args) {
            HashMap<String,String> myFamily = new HashMap<>();
            myFamily.put("Павел","Важнов");
            myFamily.put("Анастасия","Важнова");

            ReverseMap reverseMap = new ReverseMap();
            reverseMap.printHashMapValues(myFamily);
            reverseMap.reverseHashMap(myFamily);
            reverseMap.printHashMapValues(myFamily);
        }

    public void printHashMapValues(HashMap<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }

        public void reverseHashMap(HashMap<String,String> myFamily){
            HashMap<String, String> reversedMap = new HashMap<>();

            for (Map.Entry<String, String> entry : myFamily.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                reversedMap.put(value, key);
            }
            // Очищаем исходную мапу
            myFamily.clear();
            // Заменяем её на перевёрнутую мапу
            myFamily.putAll(reversedMap);
        }
    }





