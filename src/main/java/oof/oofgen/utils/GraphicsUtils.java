package oof.oofgen.utils;

import org.lwjgl.glfw.GLFW;

import java.nio.ByteBuffer;

public class GraphicsUtils {
    public void render() {
        String title = "";
        long monitor = 1000L;
        long share = 1000L;
        GLFW.glfwCreateWindow(400, 400, title, monitor, share);
    }
}
