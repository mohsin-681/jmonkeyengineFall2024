<<<<<<< HEAD
package com.jme3.system.jopenvr;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.LongByReference;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1833</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VR_IVRTrackedCamera_FnTable extends Structure {
	/** C type : GetCameraErrorNameFromEnum_callback* */
	public VR_IVRTrackedCamera_FnTable.GetCameraErrorNameFromEnum_callback GetCameraErrorNameFromEnum;
	/** C type : HasCamera_callback* */
	public VR_IVRTrackedCamera_FnTable.HasCamera_callback HasCamera;
	/** C type : GetCameraFrameSize_callback* */
	public VR_IVRTrackedCamera_FnTable.GetCameraFrameSize_callback GetCameraFrameSize;
	/** C type : GetCameraIntrinsics_callback* */
	public VR_IVRTrackedCamera_FnTable.GetCameraIntrinsics_callback GetCameraIntrinsics;
	/** C type : GetCameraProjection_callback* */
	public VR_IVRTrackedCamera_FnTable.GetCameraProjection_callback GetCameraProjection;
	/** C type : AcquireVideoStreamingService_callback* */
	public VR_IVRTrackedCamera_FnTable.AcquireVideoStreamingService_callback AcquireVideoStreamingService;
	/** C type : ReleaseVideoStreamingService_callback* */
	public VR_IVRTrackedCamera_FnTable.ReleaseVideoStreamingService_callback ReleaseVideoStreamingService;
	/** C type : GetVideoStreamFrameBuffer_callback* */
	public VR_IVRTrackedCamera_FnTable.GetVideoStreamFrameBuffer_callback GetVideoStreamFrameBuffer;
	/** C type : GetVideoStreamTextureSize_callback* */
	public VR_IVRTrackedCamera_FnTable.GetVideoStreamTextureSize_callback GetVideoStreamTextureSize;
	/** C type : GetVideoStreamTextureD3D11_callback* */
	public VR_IVRTrackedCamera_FnTable.GetVideoStreamTextureD3D11_callback GetVideoStreamTextureD3D11;
	/** C type : GetVideoStreamTextureGL_callback* */
	public VR_IVRTrackedCamera_FnTable.GetVideoStreamTextureGL_callback GetVideoStreamTextureGL;
	/** C type : ReleaseVideoStreamTextureGL_callback* */
	public VR_IVRTrackedCamera_FnTable.ReleaseVideoStreamTextureGL_callback ReleaseVideoStreamTextureGL;
	/** <i>native declaration : headers\openvr_capi.h:1821</i> */
	public interface GetCameraErrorNameFromEnum_callback extends Callback {
		Pointer apply(int eCameraError);
	};
	/** <i>native declaration : headers\openvr_capi.h:1822</i> */
	public interface HasCamera_callback extends Callback {
		int apply(int nDeviceIndex, Pointer pHasCamera);
	};
	/** <i>native declaration : headers\openvr_capi.h:1823</i> */
	public interface GetCameraFrameSize_callback extends Callback {
		int apply(int nDeviceIndex, int eFrameType, IntByReference pnWidth, IntByReference pnHeight, IntByReference pnFrameBufferSize);
	};
	/** <i>native declaration : headers\openvr_capi.h:1824</i> */
	public interface GetCameraIntrinsics_callback extends Callback {
		int apply(int nDeviceIndex, int eFrameType, HmdVector2_t pFocalLength, HmdVector2_t pCenter);
	};
	/** <i>native declaration : headers\openvr_capi.h:1825</i> */
	public interface GetCameraProjection_callback extends Callback {
		int apply(int nDeviceIndex, int eFrameType, float flZNear, float flZFar, HmdMatrix44_t pProjection);
	};
	/** <i>native declaration : headers\openvr_capi.h:1826</i> */
	public interface AcquireVideoStreamingService_callback extends Callback {
		int apply(int nDeviceIndex, LongByReference pHandle);
	};
	/** <i>native declaration : headers\openvr_capi.h:1827</i> */
	public interface ReleaseVideoStreamingService_callback extends Callback {
		int apply(long hTrackedCamera);
	};
	/** <i>native declaration : headers\openvr_capi.h:1828</i> */
	public interface GetVideoStreamFrameBuffer_callback extends Callback {
		int apply(long hTrackedCamera, int eFrameType, Pointer pFrameBuffer, int nFrameBufferSize, CameraVideoStreamFrameHeader_t pFrameHeader, int nFrameHeaderSize);
	};
	/** <i>native declaration : headers\openvr_capi.h:1829</i> */
	public interface GetVideoStreamTextureSize_callback extends Callback {
		int apply(int nDeviceIndex, int eFrameType, VRTextureBounds_t pTextureBounds, IntByReference pnWidth, IntByReference pnHeight);
	};
	/** <i>native declaration : headers\openvr_capi.h:1830</i> */
	public interface GetVideoStreamTextureD3D11_callback extends Callback {
		int apply(long hTrackedCamera, int eFrameType, Pointer pD3D11DeviceOrResource, PointerByReference ppD3D11ShaderResourceView, CameraVideoStreamFrameHeader_t pFrameHeader, int nFrameHeaderSize);
	};
	/** <i>native declaration : headers\openvr_capi.h:1831</i> */
	public interface GetVideoStreamTextureGL_callback extends Callback {
		int apply(long hTrackedCamera, int eFrameType, IntByReference pglTextureId, CameraVideoStreamFrameHeader_t pFrameHeader, int nFrameHeaderSize);
	};
	/** <i>native declaration : headers\openvr_capi.h:1832</i> */
	public interface ReleaseVideoStreamTextureGL_callback extends Callback {
		int apply(long hTrackedCamera, int glTextureId);
	};
	public VR_IVRTrackedCamera_FnTable() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("GetCameraErrorNameFromEnum", "HasCamera", "GetCameraFrameSize", "GetCameraIntrinsics", "GetCameraProjection", "AcquireVideoStreamingService", "ReleaseVideoStreamingService", "GetVideoStreamFrameBuffer", "GetVideoStreamTextureSize", "GetVideoStreamTextureD3D11", "GetVideoStreamTextureGL", "ReleaseVideoStreamTextureGL");
	}
	public VR_IVRTrackedCamera_FnTable(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VR_IVRTrackedCamera_FnTable implements Structure.ByReference {
		
	};
	public static class ByValue extends VR_IVRTrackedCamera_FnTable implements Structure.ByValue {
		
	};
}
=======
package com.jme3.system.jopenvr;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.LongByReference;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1833</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VR_IVRTrackedCamera_FnTable extends Structure {
	/** C type : GetCameraErrorNameFromEnum_callback* */
	public VR_IVRTrackedCamera_FnTable.GetCameraErrorNameFromEnum_callback GetCameraErrorNameFromEnum;
	/** C type : HasCamera_callback* */
	public VR_IVRTrackedCamera_FnTable.HasCamera_callback HasCamera;
	/** C type : GetCameraFrameSize_callback* */
	public VR_IVRTrackedCamera_FnTable.GetCameraFrameSize_callback GetCameraFrameSize;
	/** C type : GetCameraIntrinsics_callback* */
	public VR_IVRTrackedCamera_FnTable.GetCameraIntrinsics_callback GetCameraIntrinsics;
	/** C type : GetCameraProjection_callback* */
	public VR_IVRTrackedCamera_FnTable.GetCameraProjection_callback GetCameraProjection;
	/** C type : AcquireVideoStreamingService_callback* */
	public VR_IVRTrackedCamera_FnTable.AcquireVideoStreamingService_callback AcquireVideoStreamingService;
	/** C type : ReleaseVideoStreamingService_callback* */
	public VR_IVRTrackedCamera_FnTable.ReleaseVideoStreamingService_callback ReleaseVideoStreamingService;
	/** C type : GetVideoStreamFrameBuffer_callback* */
	public VR_IVRTrackedCamera_FnTable.GetVideoStreamFrameBuffer_callback GetVideoStreamFrameBuffer;
	/** C type : GetVideoStreamTextureSize_callback* */
	public VR_IVRTrackedCamera_FnTable.GetVideoStreamTextureSize_callback GetVideoStreamTextureSize;
	/** C type : GetVideoStreamTextureD3D11_callback* */
	public VR_IVRTrackedCamera_FnTable.GetVideoStreamTextureD3D11_callback GetVideoStreamTextureD3D11;
	/** C type : GetVideoStreamTextureGL_callback* */
	public VR_IVRTrackedCamera_FnTable.GetVideoStreamTextureGL_callback GetVideoStreamTextureGL;
	/** C type : ReleaseVideoStreamTextureGL_callback* */
	public VR_IVRTrackedCamera_FnTable.ReleaseVideoStreamTextureGL_callback ReleaseVideoStreamTextureGL;
	/** <i>native declaration : headers\openvr_capi.h:1821</i> */
	public interface GetCameraErrorNameFromEnum_callback extends Callback {
		Pointer apply(int eCameraError);
	};
	/** <i>native declaration : headers\openvr_capi.h:1822</i> */
	public interface HasCamera_callback extends Callback {
		int apply(int nDeviceIndex, Pointer pHasCamera);
	};
	/** <i>native declaration : headers\openvr_capi.h:1823</i> */
	public interface GetCameraFrameSize_callback extends Callback {
		int apply(int nDeviceIndex, int eFrameType, IntByReference pnWidth, IntByReference pnHeight, IntByReference pnFrameBufferSize);
	};
	/** <i>native declaration : headers\openvr_capi.h:1824</i> */
	public interface GetCameraIntrinsics_callback extends Callback {
		int apply(int nDeviceIndex, int eFrameType, HmdVector2_t pFocalLength, HmdVector2_t pCenter);
	};
	/** <i>native declaration : headers\openvr_capi.h:1825</i> */
	public interface GetCameraProjection_callback extends Callback {
		int apply(int nDeviceIndex, int eFrameType, float flZNear, float flZFar, HmdMatrix44_t pProjection);
	};
	/** <i>native declaration : headers\openvr_capi.h:1826</i> */
	public interface AcquireVideoStreamingService_callback extends Callback {
		int apply(int nDeviceIndex, LongByReference pHandle);
	};
	/** <i>native declaration : headers\openvr_capi.h:1827</i> */
	public interface ReleaseVideoStreamingService_callback extends Callback {
		int apply(long hTrackedCamera);
	};
	/** <i>native declaration : headers\openvr_capi.h:1828</i> */
	public interface GetVideoStreamFrameBuffer_callback extends Callback {
		int apply(long hTrackedCamera, int eFrameType, Pointer pFrameBuffer, int nFrameBufferSize, CameraVideoStreamFrameHeader_t pFrameHeader, int nFrameHeaderSize);
	};
	/** <i>native declaration : headers\openvr_capi.h:1829</i> */
	public interface GetVideoStreamTextureSize_callback extends Callback {
		int apply(int nDeviceIndex, int eFrameType, VRTextureBounds_t pTextureBounds, IntByReference pnWidth, IntByReference pnHeight);
	};
	/** <i>native declaration : headers\openvr_capi.h:1830</i> */
	public interface GetVideoStreamTextureD3D11_callback extends Callback {
		int apply(long hTrackedCamera, int eFrameType, Pointer pD3D11DeviceOrResource, PointerByReference ppD3D11ShaderResourceView, CameraVideoStreamFrameHeader_t pFrameHeader, int nFrameHeaderSize);
	};
	/** <i>native declaration : headers\openvr_capi.h:1831</i> */
	public interface GetVideoStreamTextureGL_callback extends Callback {
		int apply(long hTrackedCamera, int eFrameType, IntByReference pglTextureId, CameraVideoStreamFrameHeader_t pFrameHeader, int nFrameHeaderSize);
	};
	/** <i>native declaration : headers\openvr_capi.h:1832</i> */
	public interface ReleaseVideoStreamTextureGL_callback extends Callback {
		int apply(long hTrackedCamera, int glTextureId);
	};
	public VR_IVRTrackedCamera_FnTable() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("GetCameraErrorNameFromEnum", "HasCamera", "GetCameraFrameSize", "GetCameraIntrinsics", "GetCameraProjection", "AcquireVideoStreamingService", "ReleaseVideoStreamingService", "GetVideoStreamFrameBuffer", "GetVideoStreamTextureSize", "GetVideoStreamTextureD3D11", "GetVideoStreamTextureGL", "ReleaseVideoStreamTextureGL");
	}
	public VR_IVRTrackedCamera_FnTable(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VR_IVRTrackedCamera_FnTable implements Structure.ByReference {
		
	};
	public static class ByValue extends VR_IVRTrackedCamera_FnTable implements Structure.ByValue {
		
	};
}
>>>>>>> 77fd70f68c102373aaa58758a341154d80c3c175
