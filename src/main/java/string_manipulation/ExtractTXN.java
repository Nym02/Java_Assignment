//1. Extract the transaction ID from the HTML body
//<html>
//<title>Test</title>
//<body>
//Your trnx is successful. Trnx Id is: TXN123456
//</body>
//</html>
//        Output: TXN123456


package string_manipulation;

public class ExtractTXN {
    public static void main(String[] args) {
        String html = "<html>\n" +
                "<title>Test</title>\n" +
                "<body>\n" +
                "Your trnx is successful. Trnx Id is: TXN123456\n" +
                "</body>\n" +
                "</html>";
        String arr[] = html.split("<body>");

        String newArr[] = arr[1].split("</body>");

        String TXN[] = newArr[0].split(":");
        System.out.println("Output: " + TXN[1].trim());
    }
}
