//enum перечисления
//узнать сколько слов в перечислении начинается с "STAR"
package different;

public class diff_5 {
    public static void main(String[] args) {
    Secret[] secrets = Secret.values();
    int i = 0;
        for(Secret secret: secrets) {
            System.out.println(secret);
            if (("" + secret).startsWith("STAR") == true) {
                i++;
            }
        }
        System.out.print(i);
    }

    public enum Secret {
    STAR, CRASH, START
    }

       /* System.out.println(Direction.NORTH.getShortCode());
        System.out.println(Direction.NORTH.name());
        System.out.println(Direction.NORTH.toString());
        System.out.println(Direction.valueOf("NORTH"));
    }
        enum Direction{
            EAST("E"),
            WEST("W"),
            NORTH("N"),
            SOUTH("S");

            private String shortCode;

            Direction(String code) {
                this.shortCode = code;
            }

            public String getShortCode() {
                return this.shortCode;
            }
        }*/

}

