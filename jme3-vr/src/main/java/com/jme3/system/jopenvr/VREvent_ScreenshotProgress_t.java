package com.jme3.system.jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1068</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VREvent_ScreenshotProgress_t extends Structure {
	public float progress;
	public VREvent_ScreenshotProgress_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("progress");
	}
	public VREvent_ScreenshotProgress_t(float progress) {
		super();
		this.progress = progress;
	}
	public VREvent_ScreenshotProgress_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VREvent_ScreenshotProgress_t implements Structure.ByReference {
		
	};
	public static class ByValue extends VREvent_ScreenshotProgress_t implements Structure.ByValue {
		
	};
}
