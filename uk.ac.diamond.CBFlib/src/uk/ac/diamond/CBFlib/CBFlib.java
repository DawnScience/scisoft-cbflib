/*
 * Copyright 2011 Diamond Light Source Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.ac.diamond.CBFlib;

/**
 * Contains code for loading the CBFlib native library.
 * 
 * (NOTE The META-INF declares the same native lib for windows 32 and windows 64
 * This has been tested on windows 64 10/11/2011 and appears to work.)
 */
public class CBFlib {
	
	/**
	 * Loads the CBFlib native library.
	 * 
	 * <p>This class ({@link CBFlib}) must be loaded by the same classloader as the CBFlib Java wrapper classes. In an
	 * OSGi environment, this means that this class and the CBFlib JAR must be in the same bundle.
	 */
	public static void loadLibrary() {
		try {
			System.loadLibrary("libgnurx-0");
		} catch (UnsatisfiedLinkError e) {
			// do nothing as only in Windows (so much for write once...)
		}
		System.loadLibrary("cbf_wrap");
	}

}
