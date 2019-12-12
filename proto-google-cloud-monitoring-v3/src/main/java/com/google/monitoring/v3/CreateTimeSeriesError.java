/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/metric_service.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * DEPRECATED. Used to hold per-time-series error status.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.CreateTimeSeriesError}
 */
public final class CreateTimeSeriesError extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.CreateTimeSeriesError)
    CreateTimeSeriesErrorOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateTimeSeriesError.newBuilder() to construct.
  private CreateTimeSeriesError(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateTimeSeriesError() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateTimeSeriesError();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateTimeSeriesError(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.monitoring.v3.TimeSeries.Builder subBuilder = null;
              if (timeSeries_ != null) {
                subBuilder = timeSeries_.toBuilder();
              }
              timeSeries_ =
                  input.readMessage(
                      com.google.monitoring.v3.TimeSeries.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(timeSeries_);
                timeSeries_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.rpc.Status.Builder subBuilder = null;
              if (status_ != null) {
                subBuilder = status_.toBuilder();
              }
              status_ = input.readMessage(com.google.rpc.Status.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(status_);
                status_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.MetricServiceProto
        .internal_static_google_monitoring_v3_CreateTimeSeriesError_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.MetricServiceProto
        .internal_static_google_monitoring_v3_CreateTimeSeriesError_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.CreateTimeSeriesError.class,
            com.google.monitoring.v3.CreateTimeSeriesError.Builder.class);
  }

  public static final int TIME_SERIES_FIELD_NUMBER = 1;
  private com.google.monitoring.v3.TimeSeries timeSeries_;
  /**
   *
   *
   * <pre>
   * DEPRECATED. Time series ID that resulted in the `status` error.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
   *
   * @return Whether the timeSeries field is set.
   */
  @java.lang.Deprecated
  public boolean hasTimeSeries() {
    return timeSeries_ != null;
  }
  /**
   *
   *
   * <pre>
   * DEPRECATED. Time series ID that resulted in the `status` error.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
   *
   * @return The timeSeries.
   */
  @java.lang.Deprecated
  public com.google.monitoring.v3.TimeSeries getTimeSeries() {
    return timeSeries_ == null
        ? com.google.monitoring.v3.TimeSeries.getDefaultInstance()
        : timeSeries_;
  }
  /**
   *
   *
   * <pre>
   * DEPRECATED. Time series ID that resulted in the `status` error.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  public com.google.monitoring.v3.TimeSeriesOrBuilder getTimeSeriesOrBuilder() {
    return getTimeSeries();
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private com.google.rpc.Status status_;
  /**
   *
   *
   * <pre>
   * DEPRECATED. The status of the requested write operation for `time_series`.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
   *
   * @return Whether the status field is set.
   */
  @java.lang.Deprecated
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   *
   *
   * <pre>
   * DEPRECATED. The status of the requested write operation for `time_series`.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
   *
   * @return The status.
   */
  @java.lang.Deprecated
  public com.google.rpc.Status getStatus() {
    return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
  }
  /**
   *
   *
   * <pre>
   * DEPRECATED. The status of the requested write operation for `time_series`.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (timeSeries_ != null) {
      output.writeMessage(1, getTimeSeries());
    }
    if (status_ != null) {
      output.writeMessage(2, getStatus());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timeSeries_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTimeSeries());
    }
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getStatus());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.monitoring.v3.CreateTimeSeriesError)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.CreateTimeSeriesError other =
        (com.google.monitoring.v3.CreateTimeSeriesError) obj;

    if (hasTimeSeries() != other.hasTimeSeries()) return false;
    if (hasTimeSeries()) {
      if (!getTimeSeries().equals(other.getTimeSeries())) return false;
    }
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus().equals(other.getStatus())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTimeSeries()) {
      hash = (37 * hash) + TIME_SERIES_FIELD_NUMBER;
      hash = (53 * hash) + getTimeSeries().hashCode();
    }
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.monitoring.v3.CreateTimeSeriesError prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * DEPRECATED. Used to hold per-time-series error status.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.CreateTimeSeriesError}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.CreateTimeSeriesError)
      com.google.monitoring.v3.CreateTimeSeriesErrorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.MetricServiceProto
          .internal_static_google_monitoring_v3_CreateTimeSeriesError_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.MetricServiceProto
          .internal_static_google_monitoring_v3_CreateTimeSeriesError_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.CreateTimeSeriesError.class,
              com.google.monitoring.v3.CreateTimeSeriesError.Builder.class);
    }

    // Construct using com.google.monitoring.v3.CreateTimeSeriesError.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (timeSeriesBuilder_ == null) {
        timeSeries_ = null;
      } else {
        timeSeries_ = null;
        timeSeriesBuilder_ = null;
      }
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.MetricServiceProto
          .internal_static_google_monitoring_v3_CreateTimeSeriesError_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateTimeSeriesError getDefaultInstanceForType() {
      return com.google.monitoring.v3.CreateTimeSeriesError.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateTimeSeriesError build() {
      com.google.monitoring.v3.CreateTimeSeriesError result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateTimeSeriesError buildPartial() {
      com.google.monitoring.v3.CreateTimeSeriesError result =
          new com.google.monitoring.v3.CreateTimeSeriesError(this);
      if (timeSeriesBuilder_ == null) {
        result.timeSeries_ = timeSeries_;
      } else {
        result.timeSeries_ = timeSeriesBuilder_.build();
      }
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.CreateTimeSeriesError) {
        return mergeFrom((com.google.monitoring.v3.CreateTimeSeriesError) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.CreateTimeSeriesError other) {
      if (other == com.google.monitoring.v3.CreateTimeSeriesError.getDefaultInstance()) return this;
      if (other.hasTimeSeries()) {
        mergeTimeSeries(other.getTimeSeries());
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.monitoring.v3.CreateTimeSeriesError parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.CreateTimeSeriesError) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.monitoring.v3.TimeSeries timeSeries_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.TimeSeries,
            com.google.monitoring.v3.TimeSeries.Builder,
            com.google.monitoring.v3.TimeSeriesOrBuilder>
        timeSeriesBuilder_;
    /**
     *
     *
     * <pre>
     * DEPRECATED. Time series ID that resulted in the `status` error.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
     *
     * @return Whether the timeSeries field is set.
     */
    @java.lang.Deprecated
    public boolean hasTimeSeries() {
      return timeSeriesBuilder_ != null || timeSeries_ != null;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. Time series ID that resulted in the `status` error.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
     *
     * @return The timeSeries.
     */
    @java.lang.Deprecated
    public com.google.monitoring.v3.TimeSeries getTimeSeries() {
      if (timeSeriesBuilder_ == null) {
        return timeSeries_ == null
            ? com.google.monitoring.v3.TimeSeries.getDefaultInstance()
            : timeSeries_;
      } else {
        return timeSeriesBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. Time series ID that resulted in the `status` error.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public Builder setTimeSeries(com.google.monitoring.v3.TimeSeries value) {
      if (timeSeriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeSeries_ = value;
        onChanged();
      } else {
        timeSeriesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. Time series ID that resulted in the `status` error.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public Builder setTimeSeries(com.google.monitoring.v3.TimeSeries.Builder builderForValue) {
      if (timeSeriesBuilder_ == null) {
        timeSeries_ = builderForValue.build();
        onChanged();
      } else {
        timeSeriesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. Time series ID that resulted in the `status` error.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public Builder mergeTimeSeries(com.google.monitoring.v3.TimeSeries value) {
      if (timeSeriesBuilder_ == null) {
        if (timeSeries_ != null) {
          timeSeries_ =
              com.google.monitoring.v3.TimeSeries.newBuilder(timeSeries_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          timeSeries_ = value;
        }
        onChanged();
      } else {
        timeSeriesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. Time series ID that resulted in the `status` error.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public Builder clearTimeSeries() {
      if (timeSeriesBuilder_ == null) {
        timeSeries_ = null;
        onChanged();
      } else {
        timeSeries_ = null;
        timeSeriesBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. Time series ID that resulted in the `status` error.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public com.google.monitoring.v3.TimeSeries.Builder getTimeSeriesBuilder() {

      onChanged();
      return getTimeSeriesFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. Time series ID that resulted in the `status` error.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public com.google.monitoring.v3.TimeSeriesOrBuilder getTimeSeriesOrBuilder() {
      if (timeSeriesBuilder_ != null) {
        return timeSeriesBuilder_.getMessageOrBuilder();
      } else {
        return timeSeries_ == null
            ? com.google.monitoring.v3.TimeSeries.getDefaultInstance()
            : timeSeries_;
      }
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. Time series ID that resulted in the `status` error.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeSeries time_series = 1 [deprecated = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.TimeSeries,
            com.google.monitoring.v3.TimeSeries.Builder,
            com.google.monitoring.v3.TimeSeriesOrBuilder>
        getTimeSeriesFieldBuilder() {
      if (timeSeriesBuilder_ == null) {
        timeSeriesBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.monitoring.v3.TimeSeries,
                com.google.monitoring.v3.TimeSeries.Builder,
                com.google.monitoring.v3.TimeSeriesOrBuilder>(
                getTimeSeries(), getParentForChildren(), isClean());
        timeSeries_ = null;
      }
      return timeSeriesBuilder_;
    }

    private com.google.rpc.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        statusBuilder_;
    /**
     *
     *
     * <pre>
     * DEPRECATED. The status of the requested write operation for `time_series`.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
     *
     * @return Whether the status field is set.
     */
    @java.lang.Deprecated
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. The status of the requested write operation for `time_series`.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
     *
     * @return The status.
     */
    @java.lang.Deprecated
    public com.google.rpc.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. The status of the requested write operation for `time_series`.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public Builder setStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. The status of the requested write operation for `time_series`.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public Builder setStatus(com.google.rpc.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. The status of the requested write operation for `time_series`.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public Builder mergeStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ = com.google.rpc.Status.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. The status of the requested write operation for `time_series`.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. The status of the requested write operation for `time_series`.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public com.google.rpc.Status.Builder getStatusBuilder() {

      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. The status of the requested write operation for `time_series`.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
      }
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED. The status of the requested write operation for `time_series`.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2 [deprecated = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.rpc.Status,
                com.google.rpc.Status.Builder,
                com.google.rpc.StatusOrBuilder>(getStatus(), getParentForChildren(), isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.CreateTimeSeriesError)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.CreateTimeSeriesError)
  private static final com.google.monitoring.v3.CreateTimeSeriesError DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.CreateTimeSeriesError();
  }

  public static com.google.monitoring.v3.CreateTimeSeriesError getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTimeSeriesError> PARSER =
      new com.google.protobuf.AbstractParser<CreateTimeSeriesError>() {
        @java.lang.Override
        public CreateTimeSeriesError parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateTimeSeriesError(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateTimeSeriesError> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTimeSeriesError> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.CreateTimeSeriesError getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
