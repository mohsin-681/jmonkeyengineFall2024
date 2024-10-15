<<<<<<< HEAD
#import "Common/ShaderLib/GLSLCompat.glsllib"
uniform sampler2D m_Texture;
uniform vec4 m_Color; 

varying vec2 texCoord;

void main() {
    vec4 texVal = texture2D(m_Texture, texCoord);
    gl_FragColor = texVal * m_Color ;
}

=======
#import "Common/ShaderLib/GLSLCompat.glsllib"
uniform sampler2D m_Texture;
uniform vec4 m_Color; 

varying vec2 texCoord;

void main() {
    vec4 texVal = texture2D(m_Texture, texCoord);
    gl_FragColor = texVal * m_Color ;
}

>>>>>>> 77fd70f68c102373aaa58758a341154d80c3c175
