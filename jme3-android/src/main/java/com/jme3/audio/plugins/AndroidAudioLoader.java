<<<<<<< HEAD
package com.jme3.audio.plugins;

import com.jme3.asset.AssetInfo;
import com.jme3.asset.AssetLoader;
import com.jme3.audio.android.AndroidAudioData;
import java.io.IOException;

/**
 * <code>AndroidAudioLoader</code> will create an 
 * {@link AndroidAudioData} object with the specified asset key.
 */
public class AndroidAudioLoader implements AssetLoader {

    @Override
    public Object load(AssetInfo assetInfo) throws IOException {
        AndroidAudioData result = new AndroidAudioData();
        result.setAssetKey(assetInfo.getKey());
        return result;
    }
}
=======
package com.jme3.audio.plugins;

import com.jme3.asset.AssetInfo;
import com.jme3.asset.AssetLoader;
import com.jme3.audio.android.AndroidAudioData;
import java.io.IOException;

/**
 * <code>AndroidAudioLoader</code> will create an 
 * {@link AndroidAudioData} object with the specified asset key.
 */
public class AndroidAudioLoader implements AssetLoader {

    @Override
    public Object load(AssetInfo assetInfo) throws IOException {
        AndroidAudioData result = new AndroidAudioData();
        result.setAssetKey(assetInfo.getKey());
        return result;
    }
}
>>>>>>> 77fd70f68c102373aaa58758a341154d80c3c175
