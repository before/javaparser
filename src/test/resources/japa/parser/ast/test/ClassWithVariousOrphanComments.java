package japa.parser.ast.test;

/**Javadoc associated with the class*/
public class ClassWithVariousOrphanComments {
    //a first comment floating in the class

    //comment associated to the method
    void foo(){
        /*comment floating inside the method*/
    }

    //a second comment floating in the class
}

//Orphan comment inside the CompilationUnit
