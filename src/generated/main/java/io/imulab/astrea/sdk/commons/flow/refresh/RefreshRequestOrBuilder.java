// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RefreshFlowService.proto

package io.imulab.astrea.sdk.commons.flow.refresh;

public interface RefreshRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:flow.RefreshRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>int64 requestTime = 2;</code>
   */
  long getRequestTime();

  /**
   * <code>repeated string grantTypes = 3;</code>
   */
  java.util.List<java.lang.String>
      getGrantTypesList();
  /**
   * <code>repeated string grantTypes = 3;</code>
   */
  int getGrantTypesCount();
  /**
   * <code>repeated string grantTypes = 3;</code>
   */
  java.lang.String getGrantTypes(int index);
  /**
   * <code>repeated string grantTypes = 3;</code>
   */
  com.google.protobuf.ByteString
      getGrantTypesBytes(int index);

  /**
   * <code>string refreshToken = 4;</code>
   */
  java.lang.String getRefreshToken();
  /**
   * <code>string refreshToken = 4;</code>
   */
  com.google.protobuf.ByteString
      getRefreshTokenBytes();

  /**
   * <code>.flow.RefreshRequest.Client client = 5;</code>
   */
  boolean hasClient();
  /**
   * <code>.flow.RefreshRequest.Client client = 5;</code>
   */
  io.imulab.astrea.sdk.commons.flow.refresh.RefreshRequest.Client getClient();
  /**
   * <code>.flow.RefreshRequest.Client client = 5;</code>
   */
  io.imulab.astrea.sdk.commons.flow.refresh.RefreshRequest.ClientOrBuilder getClientOrBuilder();
}