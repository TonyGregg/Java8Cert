package org.genil.learning.java8.casting;

/**
 * Created by genil on 12/5/18 at 05 31
 **/
public class Redwood extends Tree{
    public static void main(String[] args) {
        new Redwood().go();

    }
    void go() {
        go2(new Tree(), new Redwood());
        go2((Redwood)new Tree(), new Redwood()); // will give class cast exception because child casted of parent

    }
    void go2(Tree tree, Redwood redwood) {
        Redwood redwood1 = (Redwood)tree; // child = parent; will give classcast exception
        Tree tree1 = (Tree)redwood;

    }
}

class Tree {

}
