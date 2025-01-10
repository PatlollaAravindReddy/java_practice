package coreJavaPractice.abstractpractice;

public abstract class lenovo implements laptop {
    @Override
    public void copy() {
        System.out.println("cut");
    }

    @Override
    public void paste() {
        System.out.println("paste");
    }

    public abstract void cut();

    public abstract void keyboard();
}
