package DesignPartten.AbsertFactoryDesignPattern;

public class WebDeveloperFactory extends EmplyoeeAbsertFactory{
    @Override
    Employee createEmployee() {
        return new WebDeveloper();
    }
}
