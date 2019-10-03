package oof.oofgen.utils;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class GraphicsUtilsTest {


    private final GraphicsUtils graphicsUtils = new GraphicsUtils();

    @Test
    public void render() {
        graphicsUtils.render();
    }
}