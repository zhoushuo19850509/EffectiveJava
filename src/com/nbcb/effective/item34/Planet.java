package com.nbcb.effective.item34;

public enum Planet {
    EARTH(5.975e+24,6.378e6),
    MARS(5.975e+24,6.378e6),
    MERCURY(5.975e+24,6.378e6),
    VENUS(5.975e+24,6.378e6),
    JUPITER(5.975e+24,6.378e6),
    SATURN(5.975e+24,6.378e6),
    URANUS(5.975e+24,6.378e6),
    NEPTUME(5.975e+24,6.378e6);


    // constructor
    Planet(double mass, double radius){
        this.mass = mass;
        this.radius = radius;
    }


    // attributes
    private final double mass;
    private final double radius;

}
