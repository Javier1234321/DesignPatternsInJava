package creational.abstract_factory;

public class MacOSCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox");
    }
}
