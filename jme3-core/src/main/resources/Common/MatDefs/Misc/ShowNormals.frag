<<<<<<< HEAD
#import "Common/ShaderLib/GLSLCompat.glsllib"
varying vec3 normal;

void main(){
   gl_FragColor = vec4((normal * vec3(0.5)) + vec3(0.5), 1.0);
=======
#import "Common/ShaderLib/GLSLCompat.glsllib"
varying vec3 normal;

void main(){
   gl_FragColor = vec4((normal * vec3(0.5)) + vec3(0.5), 1.0);
>>>>>>> 77fd70f68c102373aaa58758a341154d80c3c175
}