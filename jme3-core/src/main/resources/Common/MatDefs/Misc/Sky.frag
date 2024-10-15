<<<<<<< HEAD
#import "Common/ShaderLib/GLSLCompat.glsllib"
#import "Common/ShaderLib/Optics.glsllib"

uniform ENVMAP m_Texture;

varying vec3 direction;

void main() {
    vec3 dir = normalize(direction);
    gl_FragColor = Optics_GetEnvColor(m_Texture, dir);
}

=======
#import "Common/ShaderLib/GLSLCompat.glsllib"
#import "Common/ShaderLib/Optics.glsllib"

uniform ENVMAP m_Texture;

varying vec3 direction;

void main() {
    vec3 dir = normalize(direction);
    gl_FragColor = Optics_GetEnvColor(m_Texture, dir);
}

>>>>>>> 77fd70f68c102373aaa58758a341154d80c3c175
