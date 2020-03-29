//переопределение метода
package different;

public class diff_31 {
    public static void main(String[] args) {
        Publication pub = new Publication("f");
        pub.getInfo();
        Newspaper pub1 = new Newspaper("d", "a");
        pub1.getInfo();
        Article pub2 = new Article("d", "a");
        pub2.getInfo();
        Announcement pub3 = new Announcement("d", 10);
        pub3.getInfo();

    }
    static class Publication {
        private String title;
        public Publication(String title) {
            this.title = title;
        }
        public final void getInfo() {
            System.out.println(getType() + getDetails());
        }
        public String getType() {
            return "Publication: ";
        }
        public String getDetails() {
            return title;
        }
    }
    static class Newspaper extends Publication {
        private String source;
        public Newspaper(String title, String source) {
            super(title);
            this.source = source;
        }
        @Override
        public String getType() {
            return "Newspaper ";
        }
        @Override
        public String getDetails() {
            return "(source - " + source + "): " + super.getDetails();
        }
    }
    static class Article extends Publication {
        private String author;
        public Article(String title, String author) {
            super(title);
            this.author = author;
        }
        @Override
        public String getType() {
            return "Article ";
        }
        @Override
        public String getDetails() {
            return "(author - " + author + "): " + super.getDetails();
        }
    }
    static class Announcement extends Publication {
        private int daysToExpire;
        public Announcement(String title, int daysToExpire) {
            super(title);
            this.daysToExpire = daysToExpire;
        }
        @Override
        public String getType() {
            return "Announcement ";
        }
        @Override
        public String getDetails() {
            return "(days to expire - " + daysToExpire + "): " + super.getDetails();
        }
    }
}
