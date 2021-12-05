package NoteBook;

import java.util.ArrayList;

class NoteBook {
    private ArrayList<String> notes = new ArrayList<String>();

    public void add(String s) {

    }

    public int getSize() {
        return 0;
    }

    public String getNote(int index) {
        return "";
    }

    public boolean removeNote(int index) {
        return true;
    }

    public String[] list() {
        return new String[10];
    }

    public static void main(String[] args) {
        System.out.println("hello world");
    }

    public static void test(String[] args){
        System.out.println("hello world bailing");
    }
}
