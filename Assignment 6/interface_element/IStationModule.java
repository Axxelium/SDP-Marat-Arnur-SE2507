package interface_element;

import interface_visitor.IStationModuleVisitor;

public interface IStationModule {
    void accept(IStationModuleVisitor visitor);
}