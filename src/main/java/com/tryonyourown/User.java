package com.tryonyourown;

import com.tryonyourown.memento.MSEditor;

/**
 * Hello Memento!
 *
 */
public class User
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Memento!" );

        MSEditor msEditor = new MSEditor();

        msEditor.setContent("Version 1");
        msEditor.setFontName("Arial");
        msEditor.setFontSize(12);
        msEditor.save();

        msEditor.setContent("Version 2");
        msEditor.setFontName("Vardana");
        msEditor.setFontSize(10);
        msEditor.save();

        msEditor.setContent("Version 3");
        msEditor.setFontName("Consolas");
        msEditor.setFontSize(9);
        msEditor.save();

        msEditor.setContent("Version 4");
        msEditor.setFontName("Roman");
        msEditor.setFontSize(8);
        // don not save here

        msEditor.restore();
        System.out.println(msEditor.getContent());

        msEditor.restore();
        System.out.println(msEditor.getContent());

        msEditor.restore();
        System.out.println(msEditor.getContent());

    }
}
