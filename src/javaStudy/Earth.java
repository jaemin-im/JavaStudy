package javaStudy;

/**
 * Created by dsm2017 on 2017-06-11.
 */
public class Earth {
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;

    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS; // static final 필드는 static 블럭으로 초기화가 가능하다
    }
}
