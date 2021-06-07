package com.java;

class Printer{

    public void print(Paper p){
        p.setText ("Get Lost");
    }
}

class Paper{

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
public class CallByValueEx {
    public static void main(String[] args) {
        Paper p = new Paper ();
        p.setText ("Hello World");
        System.out.println (p.getText ());
        Printer pr = new Printer ();
        pr.print (p);
        System.out.println (p.getText ());

    }


}


