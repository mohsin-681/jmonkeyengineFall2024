<<<<<<< HEAD
#import "Common/ShaderLib/GLSLCompat.glsllib"

uniform mat4 g_WorldViewProjectionMatrix;

attribute vec3 inTexCoord;
attribute vec3 inPosition;

varying vec3 texCoord;

void main(){
    gl_Position = g_WorldViewProjectionMatrix * vec4(inPosition,1.0);
    texCoord=inTexCoord;
}
=======
#import "Common/ShaderLib/GLSLCompat.glsllib"

uniform mat4 g_WorldViewProjectionMatrix;

attribute vec3 inTexCoord;
attribute vec3 inPosition;

varying vec3 texCoord;

void main(){
    gl_Position = g_WorldViewProjectionMatrix * vec4(inPosition,1.0);
    texCoord=inTexCoord;
}
>>>>>>> 77fd70f68c102373aaa58758a341154d80c3c175
