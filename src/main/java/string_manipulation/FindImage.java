// 7. Find out how many images are in the given array:
// ["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
// Output: 3

package string_manipulation;

public class FindImage {
    public static void main(String[] args) {
        String img[] = {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
        int count = 0;


        for(int i=0; i<img.length; i++){
            String[] newArr = img[i].split("\\.");
            if(newArr[1].equals("jpg") || newArr[1].equals("png")){
                count++;
            }
        }

        System.out.println("Image Count: " + count);

    }
}
