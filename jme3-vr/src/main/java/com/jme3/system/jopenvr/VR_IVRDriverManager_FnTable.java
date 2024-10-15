<<<<<<< HEAD
package com.jme3.system.jopenvr;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:2313</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VR_IVRDriverManager_FnTable extends Structure {
	/** C type : GetDriverCount_callback* */
	public VR_IVRDriverManager_FnTable.GetDriverCount_callback GetDriverCount;
	/** C type : GetDriverName_callback* */
	public VR_IVRDriverManager_FnTable.GetDriverName_callback GetDriverName;
	/** C type : GetDriverHandle_callback* */
	public VR_IVRDriverManager_FnTable.GetDriverHandle_callback GetDriverHandle;
	/** <i>native declaration : headers\openvr_capi.h:2310</i> */
	public interface GetDriverCount_callback extends Callback {
		int apply();
	};
	/** <i>native declaration : headers\openvr_capi.h:2311</i> */
	public interface GetDriverName_callback extends Callback {
		int apply(int nDriver, Pointer pchValue, int unBufferSize);
	};
	/** <i>native declaration : headers\openvr_capi.h:2312</i> */
	public interface GetDriverHandle_callback extends Callback {
		long apply(Pointer pchDriverName);
	};
	public VR_IVRDriverManager_FnTable() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("GetDriverCount", "GetDriverName", "GetDriverHandle");
	}
	/**
	 * @param GetDriverCount C type : GetDriverCount_callback*<br>
	 * @param GetDriverName C type : GetDriverName_callback*<br>
	 * @param GetDriverHandle C type : GetDriverHandle_callback*
	 */
	public VR_IVRDriverManager_FnTable(VR_IVRDriverManager_FnTable.GetDriverCount_callback GetDriverCount, VR_IVRDriverManager_FnTable.GetDriverName_callback GetDriverName, VR_IVRDriverManager_FnTable.GetDriverHandle_callback GetDriverHandle) {
		super();
		this.GetDriverCount = GetDriverCount;
		this.GetDriverName = GetDriverName;
		this.GetDriverHandle = GetDriverHandle;
	}
	public VR_IVRDriverManager_FnTable(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VR_IVRDriverManager_FnTable implements Structure.ByReference {
		
	};
	public static class ByValue extends VR_IVRDriverManager_FnTable implements Structure.ByValue {
		
	};
}
=======
package com.jme3.system.jopenvr;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:2313</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VR_IVRDriverManager_FnTable extends Structure {
	/** C type : GetDriverCount_callback* */
	public VR_IVRDriverManager_FnTable.GetDriverCount_callback GetDriverCount;
	/** C type : GetDriverName_callback* */
	public VR_IVRDriverManager_FnTable.GetDriverName_callback GetDriverName;
	/** C type : GetDriverHandle_callback* */
	public VR_IVRDriverManager_FnTable.GetDriverHandle_callback GetDriverHandle;
	/** <i>native declaration : headers\openvr_capi.h:2310</i> */
	public interface GetDriverCount_callback extends Callback {
		int apply();
	};
	/** <i>native declaration : headers\openvr_capi.h:2311</i> */
	public interface GetDriverName_callback extends Callback {
		int apply(int nDriver, Pointer pchValue, int unBufferSize);
	};
	/** <i>native declaration : headers\openvr_capi.h:2312</i> */
	public interface GetDriverHandle_callback extends Callback {
		long apply(Pointer pchDriverName);
	};
	public VR_IVRDriverManager_FnTable() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("GetDriverCount", "GetDriverName", "GetDriverHandle");
	}
	/**
	 * @param GetDriverCount C type : GetDriverCount_callback*<br>
	 * @param GetDriverName C type : GetDriverName_callback*<br>
	 * @param GetDriverHandle C type : GetDriverHandle_callback*
	 */
	public VR_IVRDriverManager_FnTable(VR_IVRDriverManager_FnTable.GetDriverCount_callback GetDriverCount, VR_IVRDriverManager_FnTable.GetDriverName_callback GetDriverName, VR_IVRDriverManager_FnTable.GetDriverHandle_callback GetDriverHandle) {
		super();
		this.GetDriverCount = GetDriverCount;
		this.GetDriverName = GetDriverName;
		this.GetDriverHandle = GetDriverHandle;
	}
	public VR_IVRDriverManager_FnTable(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VR_IVRDriverManager_FnTable implements Structure.ByReference {
		
	};
	public static class ByValue extends VR_IVRDriverManager_FnTable implements Structure.ByValue {
		
	};
}
>>>>>>> 77fd70f68c102373aaa58758a341154d80c3c175
