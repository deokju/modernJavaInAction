package logic;

import domain.Apple;

import static domain.Color.GREEN;

public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return GREEN == apple.getColor();
    }
}
