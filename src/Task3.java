//class TextCleaner {
//    public static String removeEmptyLines(String text) {
//        String[] lines = text.split("\n");
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < lines.length; i++) {
//            if(!lines[i].trim().isEmpty()) {
//                result.append(lines[i].trim()).append("\n");
//            }
//        }
//        return result.toString();
//    }
//}
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Task3 {
//    public static void main(String[] args) {
//        String text = "";
//        if (args.length == 0) {
//// При отправке кода на Выполнение, вы можете варьировать эти параметры
//                    text = "line1\n\nline2\n\nline3";
//        } else {
//            text = args[0];
//        }
//        TextCleaner ans = new TextCleaner();
//        System.out.println(ans.removeEmptyLines(text));
//    }
//}