<<<<<<< HEAD
#import "Common/ShaderLib/GLSLCompat.glsllib"
#import "Common/ShaderLib/Instancing.glsllib"

attribute vec3 inPosition;
attribute vec3 inNormal;

varying vec3 normal;

void main(){
    gl_Position = TransformWorldViewProjection(vec4(inPosition,1.0));
    normal = inNormal;
}
=======
#import "Common/ShaderLib/GLSLCompat.glsllib"
#import "Common/ShaderLib/Instancing.glsllib"

attribute vec3 inPosition;
attribute vec3 inNormal;

varying vec3 normal;

void main(){
    gl_Position = TransformWorldViewProjection(vec4(inPosition,1.0));
    normal = inNormal;
}
>>>>>>> 77fd70f68c102373aaa58758a341154d80c3c175
