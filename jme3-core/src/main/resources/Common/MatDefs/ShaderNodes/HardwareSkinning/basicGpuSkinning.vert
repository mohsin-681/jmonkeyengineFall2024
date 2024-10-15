<<<<<<< HEAD

void main(){        
        modModelPosition = (mat4(0.0) +
            boneMatrices[int(boneIndex.x)] * boneWeight.x +
            boneMatrices[int(boneIndex.y)] * boneWeight.y +
            boneMatrices[int(boneIndex.z)] * boneWeight.z +
            boneMatrices[int(boneIndex.w)] * boneWeight.w) * vec4(modelPosition.xyz,1.0);
=======

void main(){        
        modModelPosition = (mat4(0.0) +
            boneMatrices[int(boneIndex.x)] * boneWeight.x +
            boneMatrices[int(boneIndex.y)] * boneWeight.y +
            boneMatrices[int(boneIndex.z)] * boneWeight.z +
            boneMatrices[int(boneIndex.w)] * boneWeight.w) * vec4(modelPosition.xyz,1.0);
>>>>>>> 77fd70f68c102373aaa58758a341154d80c3c175
}