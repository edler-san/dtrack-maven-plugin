/*
 * Copyright 2021 Artem Godin.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.fluorumlabs.dtrackmavenplugin;

import lombok.Getter;
import org.apache.maven.plugins.annotations.Parameter;

@Getter
public class ExtraNpmDependency {
	@Parameter
	private String packageName;

	@Parameter
	private String version;

	@Parameter
	private String annotationClassName;

	@Parameter
	private String staticClass;

	@Parameter
	private String staticMethod;

	@Parameter(defaultValue = "MAP_STRING_STRING")
	private Format format;

	public enum Format {
		MAP_STRING_STRING
	}
}
