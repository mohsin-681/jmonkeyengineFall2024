package com.jme3.system.jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1191</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class HmdVector3_t extends Structure {
	/**
	 * float[3]<br>
	 * C type : float[3]
	 */
	public float[] v = new float[3];
	public HmdVector3_t() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("v");
	}
	/**
	 * @param v float[3]<br>
	 * C type : float[3]
	 */
	public HmdVector3_t(float v[]) {
		super();
		if ((v.length != this.v.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.v = v;
	}
	public HmdVector3_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends HmdVector3_t implements Structure.ByReference {
		
	};
	public static class ByValue extends HmdVector3_t implements Structure.ByValue {
		
	};
}
