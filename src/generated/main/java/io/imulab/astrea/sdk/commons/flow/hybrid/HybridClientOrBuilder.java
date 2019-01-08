// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HybridFlowService.proto

package io.imulab.astrea.sdk.commons.flow.hybrid;

public interface HybridClientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:flow.HybridClient)
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
   * <code>repeated string responseTypes = 2;</code>
   */
  java.util.List<java.lang.String>
      getResponseTypesList();
  /**
   * <code>repeated string responseTypes = 2;</code>
   */
  int getResponseTypesCount();
  /**
   * <code>repeated string responseTypes = 2;</code>
   */
  java.lang.String getResponseTypes(int index);
  /**
   * <code>repeated string responseTypes = 2;</code>
   */
  com.google.protobuf.ByteString
      getResponseTypesBytes(int index);

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
   * <code>repeated string redirectUris = 4;</code>
   */
  java.util.List<java.lang.String>
      getRedirectUrisList();
  /**
   * <code>repeated string redirectUris = 4;</code>
   */
  int getRedirectUrisCount();
  /**
   * <code>repeated string redirectUris = 4;</code>
   */
  java.lang.String getRedirectUris(int index);
  /**
   * <code>repeated string redirectUris = 4;</code>
   */
  com.google.protobuf.ByteString
      getRedirectUrisBytes(int index);

  /**
   * <code>repeated string scopes = 5;</code>
   */
  java.util.List<java.lang.String>
      getScopesList();
  /**
   * <code>repeated string scopes = 5;</code>
   */
  int getScopesCount();
  /**
   * <code>repeated string scopes = 5;</code>
   */
  java.lang.String getScopes(int index);
  /**
   * <code>repeated string scopes = 5;</code>
   */
  com.google.protobuf.ByteString
      getScopesBytes(int index);

  /**
   * <code>string jwks = 6;</code>
   */
  java.lang.String getJwks();
  /**
   * <code>string jwks = 6;</code>
   */
  com.google.protobuf.ByteString
      getJwksBytes();

  /**
   * <code>string sectorIdentifierUri = 7;</code>
   */
  java.lang.String getSectorIdentifierUri();
  /**
   * <code>string sectorIdentifierUri = 7;</code>
   */
  com.google.protobuf.ByteString
      getSectorIdentifierUriBytes();

  /**
   * <code>string subjectType = 8;</code>
   */
  java.lang.String getSubjectType();
  /**
   * <code>string subjectType = 8;</code>
   */
  com.google.protobuf.ByteString
      getSubjectTypeBytes();

  /**
   * <code>string idTokenSignedResponseAlgorithm = 9;</code>
   */
  java.lang.String getIdTokenSignedResponseAlgorithm();
  /**
   * <code>string idTokenSignedResponseAlgorithm = 9;</code>
   */
  com.google.protobuf.ByteString
      getIdTokenSignedResponseAlgorithmBytes();

  /**
   * <code>string idTokenEncryptedResponseAlgorithm = 10;</code>
   */
  java.lang.String getIdTokenEncryptedResponseAlgorithm();
  /**
   * <code>string idTokenEncryptedResponseAlgorithm = 10;</code>
   */
  com.google.protobuf.ByteString
      getIdTokenEncryptedResponseAlgorithmBytes();

  /**
   * <code>string idTokenEncryptedResponseEncoding = 11;</code>
   */
  java.lang.String getIdTokenEncryptedResponseEncoding();
  /**
   * <code>string idTokenEncryptedResponseEncoding = 11;</code>
   */
  com.google.protobuf.ByteString
      getIdTokenEncryptedResponseEncodingBytes();
}