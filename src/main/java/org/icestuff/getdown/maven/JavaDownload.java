package org.icestuff.getdown.maven;

import org.apache.maven.plugins.annotations.Parameter;

public class JavaDownload implements OsSpecific {

	/**
	 * One of 'linux', 'windows' or 'mac os x'
	 */
	@Parameter(property = "download.os")
	String os;

	/**
	 * One of 'linux', 'windows' or 'mac os x'
	 */
	@Parameter(property = "download.arch")
	String arch;

	/**
	 * Resource path. May be a full URL, relative to the root of the appbase, or relative to
	 * the appbase
	 */
	@Parameter(property = "download.path")
	String path;

	public String getOs() {
		return os;
	}

	public String getArch() {
		return arch;
	}
}
