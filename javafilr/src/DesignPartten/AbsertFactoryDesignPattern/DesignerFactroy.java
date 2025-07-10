package DesignPartten.AbsertFactoryDesignPattern;

public class DesignerFactroy extends EmplyoeeAbsertFactory{
    @Override
    Employee createEmployee() {
        return new Designer();
    }
}
