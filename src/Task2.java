//class CSVGenerator {
//    public static String generateCSV(String[] headers, String[][] data) {
//        StringBuilder csv = new StringBuilder();
//        csv.append(String.join(",", headers)).append("\n");
//        for (int i = 0; i < data.length; i++) {
//            csv.append(String.join(",", data[i])).append("\n");
//        }
//        return csv.toString();
//    }
//}
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Task2 {
//    public static void main(String[] args) {
//        String[] headers = {};
//        String[][] data = {};
//        if (args.length == 0) {
//// При отправке кода на Выполнение, вы можете варьировать эти параметры
//                    headers = new String[]{"Name", "Age", "City"};
//            data = new String[][] {
//                    {"John", "30", "New York"},
//                    {"Alice", "25", "Los Angeles"},
//                    {"Bob", "35", "Chicago"}
//            };
//        } else {
//// Преобразование строковых параметров в массивы
//// Пример обработки данных можно дополнить в зависимости от формата args
//        }
//        CSVGenerator ans = new CSVGenerator();
//        System.out.println(ans.generateCSV(headers, data));
//    }
//}
