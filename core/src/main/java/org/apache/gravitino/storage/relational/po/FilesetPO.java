/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.gravitino.storage.relational.po;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.List;

public class FilesetPO {
  private Long filesetId;
  private String filesetName;
  private Long metalakeId;
  private Long catalogId;
  private Long schemaId;
  private String type;
  private String auditInfo;
  private Long currentVersion;
  private Long lastVersion;
  private Long deletedAt;
  private List<FilesetVersionPO> filesetVersionPOs;

  public Long getFilesetId() {
    return filesetId;
  }

  public String getFilesetName() {
    return filesetName;
  }

  public Long getMetalakeId() {
    return metalakeId;
  }

  public Long getCatalogId() {
    return catalogId;
  }

  public Long getSchemaId() {
    return schemaId;
  }

  public String getType() {
    return type;
  }

  public String getAuditInfo() {
    return auditInfo;
  }

  public Long getCurrentVersion() {
    return currentVersion;
  }

  public Long getLastVersion() {
    return lastVersion;
  }

  public Long getDeletedAt() {
    return deletedAt;
  }

  public List<FilesetVersionPO> getFilesetVersionPOs() {
    return filesetVersionPOs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof FilesetPO)) {
      return false;
    }
    FilesetPO filesetPO = (FilesetPO) o;
    return Objects.equal(getFilesetId(), filesetPO.getFilesetId())
        && Objects.equal(getFilesetName(), filesetPO.getFilesetName())
        && Objects.equal(getMetalakeId(), filesetPO.getMetalakeId())
        && Objects.equal(getCatalogId(), filesetPO.getCatalogId())
        && Objects.equal(getSchemaId(), filesetPO.getSchemaId())
        && Objects.equal(getType(), filesetPO.getType())
        && Objects.equal(getAuditInfo(), filesetPO.getAuditInfo())
        && Objects.equal(getCurrentVersion(), filesetPO.getCurrentVersion())
        && Objects.equal(getLastVersion(), filesetPO.getLastVersion())
        && Objects.equal(getDeletedAt(), filesetPO.getDeletedAt())
        && Objects.equal(getFilesetVersionPOs(), filesetPO.getFilesetVersionPOs());
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(
        getFilesetId(),
        getFilesetName(),
        getMetalakeId(),
        getCatalogId(),
        getSchemaId(),
        getType(),
        getAuditInfo(),
        getCurrentVersion(),
        getLastVersion(),
        getDeletedAt(),
        getFilesetVersionPOs());
  }

  public static class Builder {
    private final FilesetPO filesetPO;

    private Builder() {
      filesetPO = new FilesetPO();
    }

    public FilesetPO.Builder withFilesetId(Long filesetId) {
      filesetPO.filesetId = filesetId;
      return this;
    }

    public FilesetPO.Builder withFilesetName(String filesetName) {
      filesetPO.filesetName = filesetName;
      return this;
    }

    public FilesetPO.Builder withMetalakeId(Long metalakeId) {
      filesetPO.metalakeId = metalakeId;
      return this;
    }

    public FilesetPO.Builder withCatalogId(Long catalogId) {
      filesetPO.catalogId = catalogId;
      return this;
    }

    public FilesetPO.Builder withSchemaId(Long schemaId) {
      filesetPO.schemaId = schemaId;
      return this;
    }

    public FilesetPO.Builder withType(String type) {
      filesetPO.type = type;
      return this;
    }

    public FilesetPO.Builder withAuditInfo(String auditInfo) {
      filesetPO.auditInfo = auditInfo;
      return this;
    }

    public FilesetPO.Builder withCurrentVersion(Long currentVersion) {
      filesetPO.currentVersion = currentVersion;
      return this;
    }

    public FilesetPO.Builder withLastVersion(Long lastVersion) {
      filesetPO.lastVersion = lastVersion;
      return this;
    }

    public FilesetPO.Builder withDeletedAt(Long deletedAt) {
      filesetPO.deletedAt = deletedAt;
      return this;
    }

    public FilesetPO.Builder withFilesetVersionPOs(List<FilesetVersionPO> filesetVersionPOs) {
      filesetPO.filesetVersionPOs = filesetVersionPOs;
      return this;
    }

    public Long getFilesetMetalakeId() {
      Preconditions.checkState(filesetPO.getMetalakeId() != null, "Metalake id is null");
      return filesetPO.getMetalakeId();
    }

    public Long getFilesetCatalogId() {
      Preconditions.checkState(filesetPO.getCatalogId() != null, "Catalog id is null");
      return filesetPO.getCatalogId();
    }

    public Long getFilesetSchemaId() {
      Preconditions.checkState(filesetPO.getSchemaId() != null, "Schema id is null");
      return filesetPO.getSchemaId();
    }

    private void validate() {
      Preconditions.checkArgument(filesetPO.filesetId != null, "Fileset id is required");
      Preconditions.checkArgument(filesetPO.filesetName != null, "Fileset name is required");
      Preconditions.checkArgument(filesetPO.metalakeId != null, "Metalake id is required");
      Preconditions.checkArgument(filesetPO.catalogId != null, "Catalog id is required");
      Preconditions.checkArgument(filesetPO.schemaId != null, "Schema id is required");
      Preconditions.checkArgument(filesetPO.auditInfo != null, "Audit info is required");
      Preconditions.checkArgument(filesetPO.currentVersion != null, "Current version is required");
      Preconditions.checkArgument(filesetPO.lastVersion != null, "Last version is required");
      Preconditions.checkArgument(filesetPO.deletedAt != null, "Deleted at is required");
      Preconditions.checkArgument(
          filesetPO.filesetVersionPOs != null && !filesetPO.filesetVersionPOs.isEmpty(),
          "Fileset version is required");
    }

    public FilesetPO build() {
      validate();
      return filesetPO;
    }
  }

  /**
   * Creates a new instance of {@link Builder}.
   *
   * @return The new instance.
   */
  public static Builder builder() {
    return new Builder();
  }
}
