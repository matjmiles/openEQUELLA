/*
 * Copyright 2017 Apereo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tle.core.filesystem;

import com.tle.common.PathUtils;
import com.tle.common.filesystem.FileHandleUtils;

public class WorkflowMessageFile extends InstitutionFile
{
	private static final long serialVersionUID = 1L;

	protected final String uuid;

	public WorkflowMessageFile(String uuid)
	{
		this.uuid = uuid;
	}

	@Override
	public String createAbsolutePath()
	{
		String filePath = PathUtils.filePath(super.createAbsolutePath(), "WorkflowMessage");
		return PathUtils.filePath(filePath, FileHandleUtils.getHashedPath(uuid));
	}
}