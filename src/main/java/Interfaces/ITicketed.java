package Interfaces;

import ThemePark.Visitor;

public interface ITicketed {

    double defaultPrice();

    double priceFor(Visitor visitor);
}
