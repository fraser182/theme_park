package Interfaces;


import ThemePark.Visitor;

public interface ISecurity {

    boolean isAllowedTo(Visitor visitor);
}
