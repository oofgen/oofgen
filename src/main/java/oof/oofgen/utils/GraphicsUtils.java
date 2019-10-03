package oof.oofgen.utils;

import org.lwjgl.opengl.*;

public class GraphicsUtils {
    private void Render() {
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glLoadIdentity();

        GL11.glTranslatef(0f,0.0f,-7f);
        GL11.glRotatef(45f,0.0f,1.0f,0.0f);
        GL11.glColor3f(0.5f,0.5f,1.0f);

        GL11.glBegin(GL11.GL_QUADS);
        GL11.glColor3f(1.0f,1.0f,0.0f);
        GL11.glVertex3f( 1.0f, 1.0f,-1.0f);
        GL11.glVertex3f(-1.0f, 1.0f,-1.0f);
        GL11.glVertex3f(-1.0f, 1.0f, 1.0f);
        GL11.glVertex3f( 1.0f, 1.0f, 1.0f);
        GL11.glColor3f(1.0f,0.5f,0.0f);
        GL11.glVertex3f( 1.0f,-1.0f, 1.0f);
        GL11.glVertex3f(-1.0f,-1.0f, 1.0f);
        GL11.glVertex3f(-1.0f,-1.0f,-1.0f);
        GL11.glVertex3f( 1.0f,-1.0f,-1.0f);
        GL11.glColor3f(1.0f,0.0f,0.0f);
        GL11.glVertex3f( 1.0f, 1.0f, 1.0f);
        GL11.glVertex3f(-1.0f, 1.0f, 1.0f);
        GL11.glVertex3f(-1.0f,-1.0f, 1.0f);
        GL11.glVertex3f( 1.0f,-1.0f, 1.0f);
        GL11.glColor3f(1.0f,1.0f,0.0f);
        GL11.glVertex3f( 1.0f,-1.0f,-1.0f);
        GL11.glVertex3f(-1.0f,-1.0f,-1.0f);
        GL11.glVertex3f(-1.0f, 1.0f,-1.0f);
        GL11.glVertex3f( 1.0f, 1.0f,-1.0f);
        GL11.glColor3f(0.0f,0.0f,1.0f);
        GL11.glVertex3f(-1.0f, 1.0f, 1.0f);
        GL11.glVertex3f(-1.0f, 1.0f,-1.0f);
        GL11.glVertex3f(-1.0f,-1.0f,-1.0f);
        GL11.glVertex3f(-1.0f,-1.0f, 1.0f);
        GL11.glColor3f(1.0f,0.0f,1.0f);
        GL11.glVertex3f( 1.0f, 1.0f,-1.0f);
        GL11.glVertex3f( 1.0f, 1.0f, 1.0f);
        GL11.glVertex3f( 1.0f,-1.0f, 1.0f);
        GL11.glVertex3f( 1.0f,-1.0f,-1.0f);
        GL11.glEnd();

    }

}
