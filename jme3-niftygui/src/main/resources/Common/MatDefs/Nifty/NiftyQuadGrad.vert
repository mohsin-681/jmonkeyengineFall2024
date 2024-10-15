<<<<<<< HEAD
#import "Common/ShaderLib/GLSLCompat.glsllib"
uniform mat4 g_WorldViewProjectionMatrix;

attribute vec4 inPosition;
attribute vec4 inColor;
attribute vec4 inIndex;

varying vec4 color;

void main() {
    vec2 pos = (g_WorldViewProjectionMatrix * inPosition).xy;
    gl_Position = vec4(pos, 0.0, 1.0);

    color = inColor;
=======
#import "Common/ShaderLib/GLSLCompat.glsllib"
uniform mat4 g_WorldViewProjectionMatrix;

attribute vec4 inPosition;
attribute vec4 inColor;
attribute vec4 inIndex;

varying vec4 color;

void main() {
    vec2 pos = (g_WorldViewProjectionMatrix * inPosition).xy;
    gl_Position = vec4(pos, 0.0, 1.0);

    color = inColor;
>>>>>>> 77fd70f68c102373aaa58758a341154d80c3c175
}