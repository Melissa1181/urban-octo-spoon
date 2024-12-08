/*
 * Copyright 2018 the original author or authors.
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

package org.gradle.internal.fingerprint.impl;

import org.gradle.internal.execution.FileCollectionSnapshotter;
import org.gradle.internal.execution.model.InputNormalizer;
import org.gradle.internal.fingerprint.DirectorySensitivity;
import org.gradle.internal.fingerprint.FileNormalizer;
import org.gradle.internal.fingerprint.hashing.FileSystemLocationSnapshotHasher;
import org.gradle.internal.service.scopes.Scope;
import org.gradle.internal.service.scopes.ServiceScope;

@ServiceScope(Scope.BuildSession.class)
public class AbsolutePathFileCollectionFingerprinter extends AbstractFileCollectionFingerprinter {

    public AbsolutePathFileCollectionFingerprinter(DirectorySensitivity directorySensitivity, FileCollectionSnapshotter fileCollectionSnapshotter, FileSystemLocationSnapshotHasher normalizedContentHasher) {
        super(new AbsolutePathFingerprintingStrategy(directorySensitivity, normalizedContentHasher), fileCollectionSnapshotter);
    }

    @Override
    public FileNormalizer getNormalizer() {
        return InputNormalizer.ABSOLUTE_PATH;
    }
}
