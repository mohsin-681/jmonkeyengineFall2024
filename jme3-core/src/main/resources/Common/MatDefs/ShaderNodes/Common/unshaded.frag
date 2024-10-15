<<<<<<< HEAD
void main(){
    #ifdef colorMap
        color *= texture2D(colorMap, texCoord);
    #endif

    #ifdef vertColor
        color *= vertColor;
    #endif

    #ifdef matColor
        color *= matColor;
    #endif

=======
void main(){
    #ifdef colorMap
        color *= texture2D(colorMap, texCoord);
    #endif

    #ifdef vertColor
        color *= vertColor;
    #endif

    #ifdef matColor
        color *= matColor;
    #endif

>>>>>>> 77fd70f68c102373aaa58758a341154d80c3c175
}