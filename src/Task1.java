//class URLBuilder {
//    public static String buildURL(String baseURL, String params) {
//        StringBuilder result = new StringBuilder(baseURL);
//        String[] spliter = params.split("&");
//        for (int i = 0; i < spliter.length; i++) {
//            String[] KeyValue = spliter[i].split("=");
//            if(!"null".equals(KeyValue[1])) {
//                result.append(KeyValue[0]).append('=').append(KeyValue[1]);
//                result.append("&");
//            }
//        }
//        result.deleteCharAt(result.length() - 1);
//        return result.toString();
//    }
//}
//// Не удаляйте этот класс - он нужен для вывода результатов наэкран и проверки
//public class Task1 {
//    public static void main(String[] args) {
//        String baseURL = "";
//        String params = "";
//        if (args.length == 0) {
//// При отправке кода на Выполнение, вы можете варьировать эти параметры
//                    baseURL = "https://example.com/search?";
//            params = "query=java&sort=desc&filter=null";
//        } else {
//            baseURL = args[0];
//            params = args[1];
//        }
//        URLBuilder ans = new URLBuilder();
//        System.out.println(ans.buildURL(baseURL, params));
//    }
//}
