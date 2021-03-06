// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HybridFlowService.proto

package io.imulab.astrea.sdk.commons.flow.hybrid;

/**
 * Protobuf type {@code flow.HybridTokenRequest}
 */
public  final class HybridTokenRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:flow.HybridTokenRequest)
    HybridTokenRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HybridTokenRequest.newBuilder() to construct.
  private HybridTokenRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HybridTokenRequest() {
    id_ = "";
    requestTime_ = 0L;
    grantType_ = "";
    code_ = "";
    redirectUri_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HybridTokenRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 16: {

            requestTime_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            grantType_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            code_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            redirectUri_ = s;
            break;
          }
          case 50: {
            io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient.Builder subBuilder = null;
            if (client_ != null) {
              subBuilder = client_.toBuilder();
            }
            client_ = input.readMessage(io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(client_);
              client_ = subBuilder.buildPartial();
            }

            break;
          }
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
    return io.imulab.astrea.sdk.commons.flow.hybrid.HybridFlowServiceProto.internal_static_flow_HybridTokenRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.imulab.astrea.sdk.commons.flow.hybrid.HybridFlowServiceProto.internal_static_flow_HybridTokenRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest.class, io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUESTTIME_FIELD_NUMBER = 2;
  private long requestTime_;
  /**
   * <code>int64 requestTime = 2;</code>
   */
  public long getRequestTime() {
    return requestTime_;
  }

  public static final int GRANTTYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object grantType_;
  /**
   * <code>string grantType = 3;</code>
   */
  public java.lang.String getGrantType() {
    java.lang.Object ref = grantType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      grantType_ = s;
      return s;
    }
  }
  /**
   * <code>string grantType = 3;</code>
   */
  public com.google.protobuf.ByteString
      getGrantTypeBytes() {
    java.lang.Object ref = grantType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      grantType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CODE_FIELD_NUMBER = 4;
  private volatile java.lang.Object code_;
  /**
   * <code>string code = 4;</code>
   */
  public java.lang.String getCode() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      code_ = s;
      return s;
    }
  }
  /**
   * <code>string code = 4;</code>
   */
  public com.google.protobuf.ByteString
      getCodeBytes() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      code_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REDIRECTURI_FIELD_NUMBER = 5;
  private volatile java.lang.Object redirectUri_;
  /**
   * <code>string redirectUri = 5;</code>
   */
  public java.lang.String getRedirectUri() {
    java.lang.Object ref = redirectUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      redirectUri_ = s;
      return s;
    }
  }
  /**
   * <code>string redirectUri = 5;</code>
   */
  public com.google.protobuf.ByteString
      getRedirectUriBytes() {
    java.lang.Object ref = redirectUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      redirectUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLIENT_FIELD_NUMBER = 6;
  private io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient client_;
  /**
   * <code>.flow.HybridClient client = 6;</code>
   */
  public boolean hasClient() {
    return client_ != null;
  }
  /**
   * <code>.flow.HybridClient client = 6;</code>
   */
  public io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient getClient() {
    return client_ == null ? io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient.getDefaultInstance() : client_;
  }
  /**
   * <code>.flow.HybridClient client = 6;</code>
   */
  public io.imulab.astrea.sdk.commons.flow.hybrid.HybridClientOrBuilder getClientOrBuilder() {
    return getClient();
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (requestTime_ != 0L) {
      output.writeInt64(2, requestTime_);
    }
    if (!getGrantTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, grantType_);
    }
    if (!getCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, code_);
    }
    if (!getRedirectUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, redirectUri_);
    }
    if (client_ != null) {
      output.writeMessage(6, getClient());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (requestTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, requestTime_);
    }
    if (!getGrantTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, grantType_);
    }
    if (!getCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, code_);
    }
    if (!getRedirectUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, redirectUri_);
    }
    if (client_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getClient());
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
    if (!(obj instanceof io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest)) {
      return super.equals(obj);
    }
    io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest other = (io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest) obj;

    boolean result = true;
    result = result && getId()
        .equals(other.getId());
    result = result && (getRequestTime()
        == other.getRequestTime());
    result = result && getGrantType()
        .equals(other.getGrantType());
    result = result && getCode()
        .equals(other.getCode());
    result = result && getRedirectUri()
        .equals(other.getRedirectUri());
    result = result && (hasClient() == other.hasClient());
    if (hasClient()) {
      result = result && getClient()
          .equals(other.getClient());
    }
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + REQUESTTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRequestTime());
    hash = (37 * hash) + GRANTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getGrantType().hashCode();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode().hashCode();
    hash = (37 * hash) + REDIRECTURI_FIELD_NUMBER;
    hash = (53 * hash) + getRedirectUri().hashCode();
    if (hasClient()) {
      hash = (37 * hash) + CLIENT_FIELD_NUMBER;
      hash = (53 * hash) + getClient().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest parseFrom(
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
  public static Builder newBuilder(io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest prototype) {
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
   * Protobuf type {@code flow.HybridTokenRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:flow.HybridTokenRequest)
      io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.imulab.astrea.sdk.commons.flow.hybrid.HybridFlowServiceProto.internal_static_flow_HybridTokenRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.imulab.astrea.sdk.commons.flow.hybrid.HybridFlowServiceProto.internal_static_flow_HybridTokenRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest.class, io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest.Builder.class);
    }

    // Construct using io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest.newBuilder()
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
      id_ = "";

      requestTime_ = 0L;

      grantType_ = "";

      code_ = "";

      redirectUri_ = "";

      if (clientBuilder_ == null) {
        client_ = null;
      } else {
        client_ = null;
        clientBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.imulab.astrea.sdk.commons.flow.hybrid.HybridFlowServiceProto.internal_static_flow_HybridTokenRequest_descriptor;
    }

    @java.lang.Override
    public io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest getDefaultInstanceForType() {
      return io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest build() {
      io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest buildPartial() {
      io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest result = new io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest(this);
      result.id_ = id_;
      result.requestTime_ = requestTime_;
      result.grantType_ = grantType_;
      result.code_ = code_;
      result.redirectUri_ = redirectUri_;
      if (clientBuilder_ == null) {
        result.client_ = client_;
      } else {
        result.client_ = clientBuilder_.build();
      }
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
      if (other instanceof io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest) {
        return mergeFrom((io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest other) {
      if (other == io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.getRequestTime() != 0L) {
        setRequestTime(other.getRequestTime());
      }
      if (!other.getGrantType().isEmpty()) {
        grantType_ = other.grantType_;
        onChanged();
      }
      if (!other.getCode().isEmpty()) {
        code_ = other.code_;
        onChanged();
      }
      if (!other.getRedirectUri().isEmpty()) {
        redirectUri_ = other.redirectUri_;
        onChanged();
      }
      if (other.hasClient()) {
        mergeClient(other.getClient());
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
      io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private long requestTime_ ;
    /**
     * <code>int64 requestTime = 2;</code>
     */
    public long getRequestTime() {
      return requestTime_;
    }
    /**
     * <code>int64 requestTime = 2;</code>
     */
    public Builder setRequestTime(long value) {
      
      requestTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 requestTime = 2;</code>
     */
    public Builder clearRequestTime() {
      
      requestTime_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object grantType_ = "";
    /**
     * <code>string grantType = 3;</code>
     */
    public java.lang.String getGrantType() {
      java.lang.Object ref = grantType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        grantType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string grantType = 3;</code>
     */
    public com.google.protobuf.ByteString
        getGrantTypeBytes() {
      java.lang.Object ref = grantType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        grantType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string grantType = 3;</code>
     */
    public Builder setGrantType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      grantType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string grantType = 3;</code>
     */
    public Builder clearGrantType() {
      
      grantType_ = getDefaultInstance().getGrantType();
      onChanged();
      return this;
    }
    /**
     * <code>string grantType = 3;</code>
     */
    public Builder setGrantTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      grantType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object code_ = "";
    /**
     * <code>string code = 4;</code>
     */
    public java.lang.String getCode() {
      java.lang.Object ref = code_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        code_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string code = 4;</code>
     */
    public com.google.protobuf.ByteString
        getCodeBytes() {
      java.lang.Object ref = code_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        code_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string code = 4;</code>
     */
    public Builder setCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string code = 4;</code>
     */
    public Builder clearCode() {
      
      code_ = getDefaultInstance().getCode();
      onChanged();
      return this;
    }
    /**
     * <code>string code = 4;</code>
     */
    public Builder setCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      code_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object redirectUri_ = "";
    /**
     * <code>string redirectUri = 5;</code>
     */
    public java.lang.String getRedirectUri() {
      java.lang.Object ref = redirectUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        redirectUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string redirectUri = 5;</code>
     */
    public com.google.protobuf.ByteString
        getRedirectUriBytes() {
      java.lang.Object ref = redirectUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        redirectUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string redirectUri = 5;</code>
     */
    public Builder setRedirectUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      redirectUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string redirectUri = 5;</code>
     */
    public Builder clearRedirectUri() {
      
      redirectUri_ = getDefaultInstance().getRedirectUri();
      onChanged();
      return this;
    }
    /**
     * <code>string redirectUri = 5;</code>
     */
    public Builder setRedirectUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      redirectUri_ = value;
      onChanged();
      return this;
    }

    private io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient client_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient, io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient.Builder, io.imulab.astrea.sdk.commons.flow.hybrid.HybridClientOrBuilder> clientBuilder_;
    /**
     * <code>.flow.HybridClient client = 6;</code>
     */
    public boolean hasClient() {
      return clientBuilder_ != null || client_ != null;
    }
    /**
     * <code>.flow.HybridClient client = 6;</code>
     */
    public io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient getClient() {
      if (clientBuilder_ == null) {
        return client_ == null ? io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient.getDefaultInstance() : client_;
      } else {
        return clientBuilder_.getMessage();
      }
    }
    /**
     * <code>.flow.HybridClient client = 6;</code>
     */
    public Builder setClient(io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient value) {
      if (clientBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        client_ = value;
        onChanged();
      } else {
        clientBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.flow.HybridClient client = 6;</code>
     */
    public Builder setClient(
        io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient.Builder builderForValue) {
      if (clientBuilder_ == null) {
        client_ = builderForValue.build();
        onChanged();
      } else {
        clientBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.flow.HybridClient client = 6;</code>
     */
    public Builder mergeClient(io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient value) {
      if (clientBuilder_ == null) {
        if (client_ != null) {
          client_ =
            io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient.newBuilder(client_).mergeFrom(value).buildPartial();
        } else {
          client_ = value;
        }
        onChanged();
      } else {
        clientBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.flow.HybridClient client = 6;</code>
     */
    public Builder clearClient() {
      if (clientBuilder_ == null) {
        client_ = null;
        onChanged();
      } else {
        client_ = null;
        clientBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.flow.HybridClient client = 6;</code>
     */
    public io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient.Builder getClientBuilder() {
      
      onChanged();
      return getClientFieldBuilder().getBuilder();
    }
    /**
     * <code>.flow.HybridClient client = 6;</code>
     */
    public io.imulab.astrea.sdk.commons.flow.hybrid.HybridClientOrBuilder getClientOrBuilder() {
      if (clientBuilder_ != null) {
        return clientBuilder_.getMessageOrBuilder();
      } else {
        return client_ == null ?
            io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient.getDefaultInstance() : client_;
      }
    }
    /**
     * <code>.flow.HybridClient client = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient, io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient.Builder, io.imulab.astrea.sdk.commons.flow.hybrid.HybridClientOrBuilder> 
        getClientFieldBuilder() {
      if (clientBuilder_ == null) {
        clientBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient, io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient.Builder, io.imulab.astrea.sdk.commons.flow.hybrid.HybridClientOrBuilder>(
                getClient(),
                getParentForChildren(),
                isClean());
        client_ = null;
      }
      return clientBuilder_;
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


    // @@protoc_insertion_point(builder_scope:flow.HybridTokenRequest)
  }

  // @@protoc_insertion_point(class_scope:flow.HybridTokenRequest)
  private static final io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest();
  }

  public static io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HybridTokenRequest>
      PARSER = new com.google.protobuf.AbstractParser<HybridTokenRequest>() {
    @java.lang.Override
    public HybridTokenRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HybridTokenRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HybridTokenRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HybridTokenRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.imulab.astrea.sdk.commons.flow.hybrid.HybridTokenRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

