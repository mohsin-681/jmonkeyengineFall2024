<<<<<<< HEAD
#import "Common/ShaderLib/GLSLCompat.glsllib"

uniform sampler3D m_Texture;

varying vec3 texCoord;

void main(){
    gl_FragColor= texture3D(m_Texture,texCoord);
}
=======
#import "Common/ShaderLib/GLSLCompat.glsllib"

uniform sampler3D m_Texture;

varying vec3 texCoord;

void main(){
    gl_FragColor= texture3D(m_Texture,texCoord);
}
>>>>>>> 77fd70f68c102373aaa58758a341154d80c3c175
