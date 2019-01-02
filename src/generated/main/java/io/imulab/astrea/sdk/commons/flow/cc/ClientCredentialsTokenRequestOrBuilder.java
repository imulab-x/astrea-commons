// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientCredentialsFlowService.proto

package io.imulab.astrea.sdk.commons.flow.cc;

public interface ClientCredentialsTokenRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:flow.ClientCredentialsTokenRequest)
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
   * <code>repeated string scopes = 4;</code>
   */
  java.util.List<java.lang.String>
      getScopesList();
  /**
   * <code>repeated string scopes = 4;</code>
   */
  int getScopesCount();
  /**
   * <code>repeated string scopes = 4;</code>
   */
  java.lang.String getScopes(int index);
  /**
   * <code>repeated string scopes = 4;</code>
   */
  com.google.protobuf.ByteString
      getScopesBytes(int index);

  /**
   * <code>.flow.ClientCredentialsTokenRequest.Client client = 5;</code>
   */
  boolean hasClient();
  /**
   * <code>.flow.ClientCredentialsTokenRequest.Client client = 5;</code>
   */
  io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenRequest.Client getClient();
  /**
   * <code>.flow.ClientCredentialsTokenRequest.Client client = 5;</code>
   */
  io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenRequest.ClientOrBuilder getClientOrBuilder();
}