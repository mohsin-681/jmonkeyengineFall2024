package com.jme3.system.jopenvr;
import com.jme3.system.jopenvr.JOpenVRLibrary.ID3D12CommandQueue;
import com.jme3.system.jopenvr.JOpenVRLibrary.ID3D12Resource;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1003</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class D3D12TextureData_t extends Structure {
	/**
	 * struct ID3D12Resource *<br>
	 * C type : ID3D12Resource*
	 */
	public ID3D12Resource m_pResource;
	/**
	 * struct ID3D12CommandQueue *<br>
	 * C type : ID3D12CommandQueue*
	 */
	public ID3D12CommandQueue m_pCommandQueue;
	public int m_nNodeMask;
	public D3D12TextureData_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("m_pResource", "m_pCommandQueue", "m_nNodeMask");
	}
	/**
	 * @param m_pResource struct ID3D12Resource *<br>
	 * C type : ID3D12Resource*<br>
	 * @param m_pCommandQueue struct ID3D12CommandQueue *<br>
	 * C type : ID3D12CommandQueue*
	 */
	public D3D12TextureData_t(ID3D12Resource m_pResource, ID3D12CommandQueue m_pCommandQueue, int m_nNodeMask) {
		super();
		this.m_pResource = m_pResource;
		this.m_pCommandQueue = m_pCommandQueue;
		this.m_nNodeMask = m_nNodeMask;
	}
	public D3D12TextureData_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends D3D12TextureData_t implements Structure.ByReference {
		
	};
	public static class ByValue extends D3D12TextureData_t implements Structure.ByValue {
		
	};
}
