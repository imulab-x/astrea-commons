// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HybridFlowService.proto

package io.imulab.astrea.sdk.commons.flow.hybrid;

public interface HybridCodeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:flow.HybridCodeRequest)
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
   * <code>repeated string responseTypes = 3;</code>
   */
  java.util.List<java.lang.String>
      getResponseTypesList();
  /**
   * <code>repeated string responseTypes = 3;</code>
   */
  int getResponseTypesCount();
  /**
   * <code>repeated string responseTypes = 3;</code>
   */
  java.lang.String getResponseTypes(int index);
  /**
   * <code>repeated string responseTypes = 3;</code>
   */
  com.google.protobuf.ByteString
      getResponseTypesBytes(int index);

  /**
   * <code>string redirectUri = 4;</code>
   */
  java.lang.String getRedirectUri();
  /**
   * <code>string redirectUri = 4;</code>
   */
  com.google.protobuf.ByteString
      getRedirectUriBytes();

  /**
   * <code>string state = 5;</code>
   */
  java.lang.String getState();
  /**
   * <code>string state = 5;</code>
   */
  com.google.protobuf.ByteString
      getStateBytes();

  /**
   * <code>repeated string scopes = 6;</code>
   */
  java.util.List<java.lang.String>
      getScopesList();
  /**
   * <code>repeated string scopes = 6;</code>
   */
  int getScopesCount();
  /**
   * <code>repeated string scopes = 6;</code>
   */
  java.lang.String getScopes(int index);
  /**
   * <code>repeated string scopes = 6;</code>
   */
  com.google.protobuf.ByteString
      getScopesBytes(int index);

  /**
   * <code>.flow.HybridClient client = 7;</code>
   */
  boolean hasClient();
  /**
   * <code>.flow.HybridClient client = 7;</code>
   */
  io.imulab.astrea.sdk.commons.flow.hybrid.HybridClient getClient();
  /**
   * <code>.flow.HybridClient client = 7;</code>
   */
  io.imulab.astrea.sdk.commons.flow.hybrid.HybridClientOrBuilder getClientOrBuilder();

  /**
   * <code>.flow.HybridCodeRequest.Session session = 8;</code>
   */
  boolean hasSession();
  /**
   * <code>.flow.HybridCodeRequest.Session session = 8;</code>
   */
  io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeRequest.Session getSession();
  /**
   * <code>.flow.HybridCodeRequest.Session session = 8;</code>
   */
  io.imulab.astrea.sdk.commons.flow.hybrid.HybridCodeRequest.SessionOrBuilder getSessionOrBuilder();
}
