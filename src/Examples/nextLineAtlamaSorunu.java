package Examples;

import java.util.Scanner;

    public class nextLineAtlamaSorunu {
        public static void main(String[] args) {
            Scanner mb = new Scanner(System.in);
            System.out.print("Adınızı ve Soyadınızı Giriniz: ");
            String name = mb.nextLine();

            System.out.print("Lütfen Yaşınızı Giriniz: ");
            int age = mb.nextInt();

            //satır sonu sonu arabbellekte kalan bosluk kullanılmalıdır. Bunun için boş bir nextline kullanarak sorun çözülüyor.
            mb.nextLine();

            System.out.print("Lütfen Mesleğinizi Giriniz: ");
            String job = mb.nextLine();

        }
    }

