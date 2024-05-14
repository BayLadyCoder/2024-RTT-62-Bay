package org.example.GLABS.GL_303_11_generic_type_collection_classes.glab_303_11_3;

import java.util.ArrayList;

public class ShowData {
    public static void main(String[] args) {
        // instantiation to class AddDataToArrayList
        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> mybooklist = b.bookdetails();
        for(Book showValue: mybooklist)
        {
            // ---- invoking getter method for geting Data---------
            System.out.println(showValue.getNumber() + " " + showValue.getName() +" "+ showValue.getCategory() +" "+ showValue.getAuthor());
        }
    }
}
