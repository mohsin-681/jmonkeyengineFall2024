<<<<<<< HEAD
package com.jme3.system.jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1362</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VREvent_SeatedZeroPoseReset_t extends Structure {
	public byte bResetBySystemMenu;
	public VREvent_SeatedZeroPoseReset_t() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("bResetBySystemMenu");
	}
	public VREvent_SeatedZeroPoseReset_t(byte bResetBySystemMenu) {
		super();
		this.bResetBySystemMenu = bResetBySystemMenu;
	}
	public VREvent_SeatedZeroPoseReset_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VREvent_SeatedZeroPoseReset_t implements Structure.ByReference {
		
	};
	public static class ByValue extends VREvent_SeatedZeroPoseReset_t implements Structure.ByValue {
		
	};
}
=======
package com.jme3.system.jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1362</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VREvent_SeatedZeroPoseReset_t extends Structure {
	public byte bResetBySystemMenu;
	public VREvent_SeatedZeroPoseReset_t() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("bResetBySystemMenu");
	}
	public VREvent_SeatedZeroPoseReset_t(byte bResetBySystemMenu) {
		super();
		this.bResetBySystemMenu = bResetBySystemMenu;
	}
	public VREvent_SeatedZeroPoseReset_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VREvent_SeatedZeroPoseReset_t implements Structure.ByReference {
		
	};
	public static class ByValue extends VREvent_SeatedZeroPoseReset_t implements Structure.ByValue {
		
	};
}
>>>>>>> 77fd70f68c102373aaa58758a341154d80c3c175
