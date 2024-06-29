import java.io.*;

class BRDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter String:");
        String str = br.readLine();

        System.out.println("Enter char:");
        char ch = (char) br.read();

        // Skip the newline character
        long val = br.skip(1);
        System.out.println("Skipped Value chars are: " + val);

        System.out.println("Enter Int:");
        int num = Integer.parseInt(br.readLine());

        System.out.println("str Is : " + str);
        System.out.println("ch Is: " + ch);
        System.out.println("num Is: " + num);

    }
}
