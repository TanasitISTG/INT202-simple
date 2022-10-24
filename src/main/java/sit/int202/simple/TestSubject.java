package sit.int202.simple;

import sit.int202.simple.entities.Subject;

public class TestSubject {
    public static void main(String[] args) {
        Subject s1 = new Subject("INT202", "Server Side", 2.0);
        System.out.printf("Id: %s, Title: %s\n",s1.getId(), s1.getTitle());
        System.out.println(s1);
    }
}
