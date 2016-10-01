package libraryola.akademiakodu.pl.libraryola;

/**
 * Created by Ale on 2016-10-01.
 */

public class Book {


        private String link,name, author, category;
        private int pageCount;

        public Book() {}

        public Book(String link,String name, String author, String category, int pageCount) {
            this.link=link;
            this.name = name;
            this.author = author;
            this.category = category;
            this.pageCount = pageCount;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }
    }

