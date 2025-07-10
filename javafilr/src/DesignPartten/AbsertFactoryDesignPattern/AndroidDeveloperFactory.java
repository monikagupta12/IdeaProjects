package DesignPartten.AbsertFactoryDesignPattern;

public class AndroidDeveloperFactory extends EmplyoeeAbsertFactory{
    @Override
    Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
