// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DiscoveryService.proto

package io.imulab.astrea.sdk.commons.discovery;

/**
 * Protobuf type {@code discovery.DiscoveryRequest}
 */
public  final class DiscoveryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:discovery.DiscoveryRequest)
    DiscoveryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DiscoveryRequest.newBuilder() to construct.
  private DiscoveryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DiscoveryRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DiscoveryRequest(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.imulab.astrea.sdk.commons.discovery.DiscoveryServiceProto.internal_static_discovery_DiscoveryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.imulab.astrea.sdk.commons.discovery.DiscoveryServiceProto.internal_static_discovery_DiscoveryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest.class, io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest.Builder.class);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest)) {
      return super.equals(obj);
    }
    io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest other = (io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest) obj;

    boolean result = true;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code discovery.DiscoveryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:discovery.DiscoveryRequest)
      io.imulab.astrea.sdk.commons.discovery.DiscoveryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.imulab.astrea.sdk.commons.discovery.DiscoveryServiceProto.internal_static_discovery_DiscoveryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.imulab.astrea.sdk.commons.discovery.DiscoveryServiceProto.internal_static_discovery_DiscoveryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest.class, io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest.Builder.class);
    }

    // Construct using io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.imulab.astrea.sdk.commons.discovery.DiscoveryServiceProto.internal_static_discovery_DiscoveryRequest_descriptor;
    }

    @java.lang.Override
    public io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest getDefaultInstanceForType() {
      return io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest build() {
      io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest buildPartial() {
      io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest result = new io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest) {
        return mergeFrom((io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest other) {
      if (other == io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest.getDefaultInstance()) return this;
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
      io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:discovery.DiscoveryRequest)
  }

  // @@protoc_insertion_point(class_scope:discovery.DiscoveryRequest)
  private static final io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest();
  }

  public static io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiscoveryRequest>
      PARSER = new com.google.protobuf.AbstractParser<DiscoveryRequest>() {
    @java.lang.Override
    public DiscoveryRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DiscoveryRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DiscoveryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiscoveryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
