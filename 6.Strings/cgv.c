#include <GL/glut.h>
#include<stdio.h>
#include<stdlib.h>
void init() {
    glClearColor(1.0, 1.0, 1.0, 0.0); // Set background color to white
    glColor3f(0.0, 0.0, 0.0); // Set drawing color to black
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(0.0, 500.0, 0.0, 500.0);
    glMatrixMode(GL_MODELVIEW);
}

void display() {
    glClear(GL_COLOR_BUFFER_BIT);

    // Draw the central square
    glBegin(GL_QUADS);
    glVertex2f(200.0, 200.0);
    glVertex2f(300.0, 200.0);
    glVertex2f(300.0, 300.0);
    glVertex2f(200.0, 300.0);
    glEnd();

    // Draw the four outer squares using GL_QUADS_STRIP
    glBegin(GL_QUADS_STRIP);
    glVertex2f(100.0, 100.0);
    glVertex2f(200.0, 100.0);
    glVertex2f(100.0, 200.0);
    glVertex2f(200.0, 200.0);
    glVertex2f(100.0, 300.0);
    glVertex2f(200.0, 300.0);
    glVertex2f(100.0, 400.0);
    glVertex2f(200.0, 400.0);

    glVertex2f(300.0, 100.0);
    glVertex2f(400.0, 100.0);
    glVertex2f(300.0, 200.0);
    glVertex2f(400.0, 200.0);
    glVertex2f(300.0, 300.0);
    glVertex2f(400.0, 300.0);
    glVertex2f(300.0, 400.0);
    glVertex2f(400.0, 400.0);

    glVertex2f(200.0, 100.0);
    glVertex2f(300.0, 100.0);
    glVertex2f(200.0, 0.0);
    glVertex2f(300.0, 0.0);
    glVertex2f(200.0, 100.0);
    glVertex2f(300.0, 100.0);

    glVertex2f(200.0, 400.0);
    glVertex2f(300.0, 400.0);
    glVertex2f(200.0, 500.0);
    glVertex2f(300.0, 500.0);
    glVertex2f(200.0, 400.0);
    glVertex2f(300.0, 400.0);
    glEnd();

    glFlush();
}

int main(int argc, char** argv) {
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(500, 500);
    glutInitWindowPosition(100, 100);
    glutCreateWindow("Plus Symbol");
    init();
    glutDisplayFunc(display);
    glutMainLoop();
    return 0;
}